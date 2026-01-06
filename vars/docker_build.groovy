// Define function
def call(String ProjectName,String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}"
}
