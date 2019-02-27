[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

# Prometheus POC

It's a POC `(Proof of concept)` using Prometheus to instrument an Spring Boot Application. Micrometer has to be used 
for handling the endpoint, because Prometheus client libraries has no longer compatibility with **Spring Boot 2.x**. 

### Micrometer

An application metrics facade for the most popular monitoring tools. Instrument your code with dimensional metrics with a
vendor neutral interface and decide on the monitoring backend at the last minute.

More info and the user manual are available on [micrometer.io](https://micrometer.io).

Micrometer is the instrumentation library underpinning Spring Boot 2.0's metrics collection.

More info is available on [Micrometer's Github.](https://github.com/micrometer-metrics/micrometer)

### Prometheus

Prometheus, a Cloud Native Computing Foundation project, is a systems and service monitoring system. 
It collects metrics from configured targets at given intervals, evaluates rule expressions, 
displays the results, and can trigger alerts if some condition is observed to be true.

More info is available on [Prometheus's Github.](https://github.com/prometheus/prometheus)

### License
MIT License. [Click here for more information.](LICENSE)