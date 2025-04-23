def call(String url, String branch){
   echo "This is cloning the Code Using Github Jenkins Script"
   git url: "${url}", branch: "${branch}"
   echo "Code cloning Succesfully"
}
