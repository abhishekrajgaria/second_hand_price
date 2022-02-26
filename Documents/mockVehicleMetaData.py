# python code for inserting data into mongodb

from pymongo import MongoClient
try:
    connection = MongoClient('mongodb://localhost:27017/')
    print("Connected Successfully !")
except exp:
    print("Could not connect to mongodb")

db = connection.secondHand

vehicles = db.vehicles
# vehicles.drop()

for i in range(1,51):
    vehicle = {
        "brand" : "Tata Motors",
        "model" : "Harrier",
        "year" : "2020",
        "price" : "1600000",
        "fuelType" : "Petrol",
        "vehicleType": "SUV",
        "pictureUrl": "/assets/tata_harrier.png"
    }

    vehicles.insert_one(vehicle)
