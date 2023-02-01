i=1
sp="/-\|"

while true
do
    printf "\b${sp:i++%${#sp}:1}"
done

echo "Thank You"
