def call(String ImageName, String ImageTag, String dockerhubuser){
  echo "This is pushing the image to DockerHub using script"
                withCredentials([
                    usernamePassword( 
                                      credentialsId:"dockerHubCred",
                                      passwordVariable:"dockerHubPass",
                                      usernameVariable:"dockerHubUser")
                                ])
                {
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh "docker image tag devopslab-app:latest ${dockerHubUser}/${ImageName}:${ImageTag}"
                sh "docker push ${dockerHubUser}/${ImageName}:${ImageTag}"
                }
}
