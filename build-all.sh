#!/bin/bash -x

for service in alien gateway; do
	cd $service
	./build.sh
	cd ..
done