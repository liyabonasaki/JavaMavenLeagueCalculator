#!/usr/bin/env bash

# Author: Liyabona Saki
# Version: 1.0

#DO NOT MODIFY
function RUNNING_CHECK() {
  pgrep -x run.sh >/dev/null && echo "Process found" || echo "Process not found"

}



#for new systems that dont have java or maven installed, these commands should install maven for dependancy management
function INSTALL_MAVEN() {
    sudo apt update || yum -y update;
    sudo apt install maven;

}
#Below commands should setup  the maven environment
function SETTUP_MAVEN_ENV() {
    export JAVA_HOME=/usr/lib/jvm/default-java
    export M2_HOME=/opt/maven
    export MAVEN_HOME=/opt/maven
    export PATH=${M2_HOME}/bin:${PATH}

}

function ENTRYPOINT() {
    RUNNING_CHECK

}
