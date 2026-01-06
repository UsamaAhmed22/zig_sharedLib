def docker_push(String project, String dockerhubUser) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubPass', usernameVariable: 'dockerhubUser')]) {
        sh "docker login -u ${dockerhubUser} -p ${dockerhubPass}"
    }

    // Push the Docker image to Docker Hub
    sh "docker push ${dockerhubUser}/${project}:latest"
}

