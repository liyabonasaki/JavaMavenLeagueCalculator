#!/usr/bin/env bash

# Author: Liyabona Saki
# Version: 1.0
#Description : this script to setup maven as the application uses maven as its dependency management

#DO NOT MODIFY
function RUNNING_CHECK() {
# its always good having running checks to maintain computer resources
  pgrep -x setup_maven.sh >/dev/null && echo "Process found" || echo "Process not found"

}



#for new systems that dont have java or maven installed, these commands should install maven for dependancy management
function INSTALL_MAVEN() {
    sudo apt update;
    sudo apt install maven;

}
#Below commands should setup  the maven environment
#only if maven is not installed on the target machine
function SETUP_MAVEN_ENV() {
    export JAVA_HOME=/usr/lib/jvm/default-java
    export M2_HOME=/opt/maven
    export MAVEN_HOME=/opt/maven
    export PATH=${M2_HOME}/bin:${PATH}

}

function ENTRYPOINT() {
    RUNNING_CHECK
    INSTALL_MAVEN
    SETUP_MAVEN_ENV
}

#Exec endpoint
ENTRYPOINT
