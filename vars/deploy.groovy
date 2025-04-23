def call(){
   echo "This is deploying the Code using script"
   //sh "docker run -d -p 3000:3000 devopslab-app:latest"
   sh "docker-compose down && docker-compose up -d"
}
