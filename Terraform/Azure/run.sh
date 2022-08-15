#!/bin/bash
counter=1
while [ $counter -gt 0 ]
do
    terraform plan;
    terraform destroy -auto-approve;
    terraform apply -auto-approve;
done