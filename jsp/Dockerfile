FROM tomcat

# deleting default files
RUN rm -rf /usr/local/tomcat/webapps/ROOT/*

# copying src files to web root
COPY src/* /usr/local/tomcat/webapps/ROOT/

# copying context.xml and tomcat-users.xml to allow tomcat web manager access

# COPY context.xml /usr/local/tomcat/conf/
COPY tomcat-users.xml /usr/local/tomcat/conf/

COPY manager.xml /usr/local/tomcat/conf/Catalina/localhost/