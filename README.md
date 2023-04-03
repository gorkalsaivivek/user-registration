# user-registration

mvn clean package
mvn clean install
docker build -t 7039402000/user-registration:2 . 
If needed to tag an image
docker tag 230b2016794f 7039402000/user-registration:2
docker push 7039402000/user-registration:latest
after this test the jar in docker
docker run -it app.jar /bin/bash
docker run -it 7039402000/user-registration:1 /bin/bash
if no issues , proceed to deployment
deploying to GCP kubernetes
gcloud auth login
gcloud container clusters get-credentials mycluster-1 --zone us-central1-c --project student-00331

Kube commands: 
kubectl apply -f deployment.yaml


kubectl get services user-registration
Kubectl get all
kubectl get nodes -o wide

if using nodeport as service , we can use <nodeip>:<nodeport>