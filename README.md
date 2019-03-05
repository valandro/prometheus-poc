[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

# Prometheus POC

It's a POC `(Proof of concept)` using Prometheus to instrument an Spring Boot Application. Micrometer had to be used 
for handling the endpoint, because **Prometheus client libraries** has no longer compatibility with **Spring Boot 2.x**. 

### Micrometer

An application metrics facade for the most popular monitoring tools. Instrument your code with dimensional metrics with a
vendor neutral interface and decide on the monitoring backend at the last minute.

More info and the user manual are available on [micrometer.io](https://micrometer.io).

Micrometer is the instrumentation library underpinning Spring Boot 2.0's metrics collection.

More info is available on [Micrometer's Github.](https://github.com/micrometer-metrics/micrometer)

#### References

You can watch a [TechPrimers video](https://www.youtube.com/watch?v=PiBeO4E1xAU) talking about Micrometer.

### Prometheus

Prometheus, a Cloud Native Computing Foundation project, is a systems and service monitoring system. 
It collects metrics from configured targets at given intervals, evaluates rule expressions, 
displays the results, and can trigger alerts if some condition is observed to be true.

More info is available on [Prometheus's Github.](https://github.com/prometheus/prometheus)

#### Enviroment 

First of all you need to create a `prometheus.yml` on your server.

That `prometheus.yml` have the configuration for monitoring your application.

```yml
global:
  scrape_interval:     15s # Set the scrape interval to every 15 seconds. Default is every 1 minute.
  evaluation_interval: 15s # Evaluate rules every 15 seconds. The default is every 1 minute.
  # scrape_timeout is set to the global default (10s).

# Alertmanager configuration
alerting:
  alertmanagers:
  - static_configs:
    - targets:
      # - alertmanager:9093

# Load rules once and periodically evaluate them according to the global 'evaluation_interval'.
rule_files:
  # - "first_rules.yml"
  # - "second_rules.yml"

scrape_configs:
  
  - job_name: 'prometheus'
    # metrics_path default is /metrics
    static_configs:
    - targets: ['127.0.0.1:9090']

  - job_name: 'prometheus-poc'
    metrics_path: '/prometheus'
    scrape_interval: 5s
    static_configs:
    - targets: ['IP:PORT']
```

After that, create a simple `Dockerfile`

```Dockerfile
FROM prom/prometheus
# Add in the configuration file from the local directory.
ADD prometheus.yml /etc/prometheus/prometheus.yml
```
> *You will need the prom/prometheus image downloaded to your machine* 

Then create a **Docker Image** using this `Dockerfile`

```
docker build -t prometheus-poc .
```

And for running a container, just run 

```
docker run -p 9090:9090 prometheus-poc
```

Now you have the **Prometheus** running on port `9090`.

#### References

You can watch a [TechPrimers video](https://www.youtube.com/watch?v=PiBeO4E1xAU) talking about Prometheus instrumentation
using Micrometer in a Spring Boot Application.


### License
MIT License. [Click here for more information.](LICENSE)