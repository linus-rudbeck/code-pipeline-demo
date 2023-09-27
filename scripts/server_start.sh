#!/usr/bin/env bash
cd /home/ec2-user/server
sudo java -jar -Dserver.port=443 \
    -Dserver.ssl.key-store=letsencrypt.jks  \
    -Dserver.ssl.key-store-password=password  \
    -Dserver.ssl.key-alias=simple-cert  \
    -Dserver.ssl.key-password=password  \
    *.jar > /dev/null 2> /dev/null < /dev/null &