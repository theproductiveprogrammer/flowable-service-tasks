FROM flowable/all-in-one

COPY ./flowable-task.war /opt/tomcat/webapps/
COPY ./application.properties /opt/tomcat/lib/

EXPOSE 8080

WORKDIR /opt/tomcat

USER tomcat

CMD ["/opt/tomcat/bin/catalina.sh", "run"]
