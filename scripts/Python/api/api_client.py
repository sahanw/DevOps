import requests
api = "http://127.0.0.1:5000/companies/"
   
response = requests.get(api)
print(response.json())
print(response.status_code)