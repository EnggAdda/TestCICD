#!/bin/bash
JAR_NAME=app.jar
APP_DIR=/home/ec2-user/app

# Stop any running instance
pkill -f $JAR_NAME

# Move the new JAR
mv /tmp/$JAR_NAME $APP_DIR/

# Start the new version
nohup java -jar $APP_DIR/$JAR_NAME > $APP_DIR/app.log 2>&1 &
