#!/bin/bash -x

mvn package
docker build --tag space-scanner-alien:latest .