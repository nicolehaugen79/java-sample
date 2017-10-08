FROM tomcat
ENV JAVA_OPTS="-Djava.security.egd=file:/dev/urandom"
ADD target/helloworld.war /usr/local/tomcat/webapps