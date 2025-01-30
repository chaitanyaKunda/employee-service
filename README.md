docker build 
=============
    docker info
    docker build -t 20706215/employee-service:0.0.1 .
    docker run -dp 8081:8081 20706215/employee-service:0.0.1
    docker stop <<container_hash>> //to stop running container

docker commands
====================
1. See all the existing images:
    docker images -a

2. See all the existing containers:
    docker ps -a

3. Delete single image:
    docker images -a
    docker rmi <IMAGE_ID>

4. Stop single container:
    docker ps -a
    docker stop <CONTAINER_ID>

5. Stop multiple containers:
    docker ps -a
    docker stop <CONTAINER_ID1> <CONTAINER_ID2>

6. Delete single container:
    docker ps -a
    docker rm <CONTAINER_ID>

7. Delete multiple images:
    docker images -a
    docker rmi <IMAGE_ID1> <IMAGE_ID2>

8. Delete multiple stopped containers:
    docker ps -a
    docker rm <CONTAINER_ID1> <CONTAINER_ID2>

9. Delete images only in a single command:
    docker rmi -f $(docker images -a -q)

10. Delete both containers and images in a single command:
    docker rm $(docker ps -a -q) && docker rmi -f $(docker images -a -q)

11. To prune all containers:
    docker container prune

Check Minikube 
=================
minikube start //start if minikube is stopped
minikube status //will give status


Kubernates steps
==================
kubectl create deployment employee-service --image 20706215/employee-service:0.0.1

# Start minikube
minikube start

# Set docker env
eval $(minikube docker-env)             # Unix shells
minikube docker-env | Invoke-Expression # PowerShell

# Build image
docker build -t foo:0.0.1 .

# Run in Minikube
kubectl run hello-foo --image=foo:0.0.1 --image-pull-policy=Never

# Check that it's running
kubectl get pods
