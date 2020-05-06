#!/bin/bash

mvn compile || exit 1

cd orig-wars
mkdir xpanded
cd xpanded

jar -xvf ../flowable-task.war
mkdir -p WEB-INF/classes/com/salesboxai/flowable/

cp ../../target/classes/com/salesboxai/flowable/* WEB-INF/classes/com/salesboxai/flowable/

jar -cvf ../../flowable-task.war .

cd ..
rm -rf xpanded
cd ..

docker build -t flowable .

rm flowable-task.war
