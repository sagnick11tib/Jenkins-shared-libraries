def call(String ImageName, String ImageTag, String DockerHubUser){
   echo "This is building the Code"
   sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
   echo "Docker Image Build Succesfully"
}
