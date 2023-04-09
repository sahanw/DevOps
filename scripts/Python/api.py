import requests

url = "https://jsonplaceholder.typicode.com/posts"

params = {"id": 5}
response = requests.get(url, params=params)

print(response.json())