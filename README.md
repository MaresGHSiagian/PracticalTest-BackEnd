# Logical Test
### Convert Text
---
Request Body

```json
[http://localhost:8080/api/dashboard/summary](http://localhost:8080/api/convert-text?input=italem%20irad%20irigayaj%0Aiadab%20itsap%20ulalreb%0Analub%20kusutret%20gnalali)
```
Response Body
![image](https://github.com/user-attachments/assets/64f36746-41b2-4b22-bcd2-ab9fe98b8bf0)
```json
melati dari jayagiri 
badai pasti berlalu 
bulan tertusuk ilalang
```
---
### Fizz-Buzz
---
Request Body

```json
http://localhost:8080/api/fizz-buzz
```
Response Body
![image](https://github.com/user-attachments/assets/a88031e4-00b8-4fb4-a611-bbc62a1dbe45)
```json
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz",
    "16",
    "17",
    "Fizz",
    "19",
    "Buzz",
    "Fizz",
    "22",
    "23",
    "Fizz",
    "Buzz",
    "26",
    "Fizz",
    "28",
    "29",
    "FizzBuzz",
    "31",
    "32",
    "Fizz",
    "34",
    "Buzz",
    "Fizz",
    "37",
    "38",
    "Fizz",
    "Buzz",
    "41",
    "Fizz",
    "43",
    "44",
    "FizzBuzz",
    "46",
    "47",
    "Fizz",
    "49",
    "Buzz",
    "Fizz",
    "52",
    "53",
    "Fizz",
    "Buzz",
    "56",
    "Fizz",
    "58",
    "59",
    "FizzBuzz",
    "61",
    "62",
    "Fizz",
    "64",
    "Buzz",
    "Fizz",
    "67",
    "68",
    "Fizz",
    "Buzz",
    "71",
    "Fizz",
    "73",
    "74",
    "FizzBuzz",
    "76",
    "77",
    "Fizz",
    "79",
    "Buzz",
    "Fizz",
    "82",
    "83",
    "Fizz",
    "Buzz",
    "86",
    "Fizz",
    "88",
    "89",
    "FizzBuzz",
    "91",
    "92",
    "Fizz",
    "94",
    "Buzz",
    "Fizz",
    "97",
    "98",
    "Fizz",
    "Buzz"
]
```
---
### FIbonancci
---
Request Body

```json
http://localhost:8080/api/fibonacci?count=10
```
Response Body
![image](https://github.com/user-attachments/assets/a544a814-5fdd-4fa7-8b3a-3ed8b5a45baf)
```json
[
    0,
    1,
    1,
    2,
    3,
    5,
    8,
    13,
    21,
    34
]
```
---

### Stock Profit
---
Request Body

```json
http://localhost:8080/api/stock-profit?prices=10,9,6,5,15
```
Response Body
![image](https://github.com/user-attachments/assets/6b342c50-9a26-4a7c-91d2-316079eac170)

```json
[
  10
]
```
---

### Count-Cumbers

---
Request Body

```json
http://localhost:8080/api/count-numbers?list=2,h,6,u,y,t,7,j,y,h,8
```
Response Body
![image](https://github.com/user-attachments/assets/516f48a0-6cda-405f-bfce-d3f3567e71d6)

```json
[
  10
]
```
---


## PracticalTest-BackEnd


![image](https://github.com/user-attachments/assets/03cc8e2c-ff7b-4c6c-8733-fb9b4a16d25d)


### API Get: Transaksi Pemesanan Ruangan
Endpoint: GET /api/dummy-data/bookingList
URL: https://66876cc30bc7155dc017a662.mockapi.io/api/dummy-data/bookingList
Deskripsi: Mengambil daftar transaksi pemesanan ruangan.
### API Get: Master Jenis Konsumsi
Endpoint: GET /api/dummy-data/masterJenisKonsumsi
URL: https://6686cb5583c983911b03a7f3.mockapi.io/api/dummy-data/masterJenisKonsumsi


---
Request Body

```json
http://localhost:8080/api/dashboard/summary
```

Response Body
![image](https://github.com/user-attachments/assets/488c84dd-da98-44ee-8d49-5adb5551f884)
```json
[
    {
        "officeName": "UID JAYA",
        "roomName": "Ruang Borobudur",
        "usedPercentage": 62.0,
        "consumptionNominal": 4340000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 62
            },
            {
                "name": "Makan Siang",
                "number": 62
            },
            {
                "name": "Snack Sore",
                "number": 62
            }
        ]
    },
    {
        "officeName": "UID JAYA",
        "roomName": "Ruang Prambanan",
        "usedPercentage": 42.0,
        "consumptionNominal": 2100000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 42
            },
            {
                "name": "Makan Siang",
                "number": 42
            }
        ]
    },
    {
        "officeName": "UID JAYA",
        "roomName": "Ruang Mendhut",
        "usedPercentage": 15.0,
        "consumptionNominal": 300000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 15
            }
        ]
    },
    {
        "officeName": "UID JAYA",
        "roomName": "Ruang Mendhut",
        "usedPercentage": 27.0,
        "consumptionNominal": 1350000,
        "numberOfSnackList": [
            {
                "name": "Makan Siang",
                "number": 27
            },
            {
                "name": "Snack Sore",
                "number": 27
            }
        ]
    },
    {
        "officeName": "UID JABAR",
        "roomName": "Ruang Rinjani",
        "usedPercentage": 27.0,
        "consumptionNominal": 1350000,
        "numberOfSnackList": [
            {
                "name": "Makan Siang",
                "number": 27
            },
            {
                "name": "Snack Sore",
                "number": 27
            }
        ]
    },
    {
        "officeName": "UID BALI",
        "roomName": "Ruang Ganesha",
        "usedPercentage": 27.0,
        "consumptionNominal": 540000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 27
            }
        ]
    },
    {
        "officeName": "UID JAYA",
        "roomName": "Ruang Prambanan",
        "usedPercentage": 30.0,
        "consumptionNominal": 2100000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 30
            },
            {
                "name": "Makan Siang",
                "number": 30
            },
            {
                "name": "Snack Sore",
                "number": 30
            }
        ]
    },
    {
        "officeName": "UID JATENG & DIY",
        "roomName": "Ruang Arjuna",
        "usedPercentage": 35.0,
        "consumptionNominal": 1750000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 35
            },
            {
                "name": "Makan Siang",
                "number": 35
            }
        ]
    },
    {
        "officeName": "UID JAYA",
        "roomName": "Ruang Borobudur",
        "usedPercentage": 40.0,
        "consumptionNominal": 800000,
        "numberOfSnackList": [
            {
                "name": "Snack Sore",
                "number": 40
            }
        ]
    },
    {
        "officeName": "UID JAYA",
        "roomName": "Ruang Borobudur",
        "usedPercentage": 40.0,
        "consumptionNominal": 800000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 40
            }
        ]
    },
    {
        "officeName": "UID JATIM",
        "roomName": "Ruang Sudirman",
        "usedPercentage": 23.0,
        "consumptionNominal": 460000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 23
            }
        ]
    },
    {
        "officeName": "UID JATIM",
        "roomName": "Ruang Fatmawati",
        "usedPercentage": 30.0,
        "consumptionNominal": 600000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 30
            }
        ]
    },
    {
        "officeName": "UID JATIM",
        "roomName": "Ruang Fatmawati",
        "usedPercentage": 25.0,
        "consumptionNominal": 1750000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 25
            },
            {
                "name": "Makan Siang",
                "number": 25
            },
            {
                "name": "Snack Sore",
                "number": 25
            }
        ]
    },
    {
        "officeName": "UID JATIM",
        "roomName": "Ruang Sudirman",
        "usedPercentage": 23.0,
        "consumptionNominal": 1610000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 23
            },
            {
                "name": "Makan Siang",
                "number": 23
            },
            {
                "name": "Snack Sore",
                "number": 23
            }
        ]
    },
    {
        "officeName": "UID JABAR",
        "roomName": "Ruang Galunggung",
        "usedPercentage": 23.0,
        "consumptionNominal": 1610000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 23
            },
            {
                "name": "Makan Siang",
                "number": 23
            },
            {
                "name": "Snack Sore",
                "number": 23
            }
        ]
    },
    {
        "officeName": "UID JABAR",
        "roomName": "Ruang Semeru",
        "usedPercentage": 20.0,
        "consumptionNominal": 1000000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 20
            },
            {
                "name": "Makan Siang",
                "number": 20
            }
        ]
    },
    {
        "officeName": "UID JABAR",
        "roomName": "Ruang Semeru",
        "usedPercentage": 18.0,
        "consumptionNominal": 360000,
        "numberOfSnackList": [
            {
                "name": "Snack Sore",
                "number": 18
            }
        ]
    },
    {
        "officeName": "UID JABAR",
        "roomName": "Ruang Semeru",
        "usedPercentage": 20.0,
        "consumptionNominal": 400000,
        "numberOfSnackList": [
            {
                "name": "Snack Sore",
                "number": 20
            }
        ]
    },
    {
        "officeName": "UID JABAR",
        "roomName": "Ruang Bromo",
        "usedPercentage": 20.0,
        "consumptionNominal": 1400000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 20
            },
            {
                "name": "Makan Siang",
                "number": 20
            },
            {
                "name": "Snack Sore",
                "number": 20
            }
        ]
    },
    {
        "officeName": "UID BALI",
        "roomName": "Ruang Ganesha",
        "usedPercentage": 27.0,
        "consumptionNominal": 1350000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 27
            },
            {
                "name": "Makan Siang",
                "number": 27
            }
        ]
    },
    {
        "officeName": "UID BALI",
        "roomName": "Ruang Ganesha",
        "usedPercentage": 27.0,
        "consumptionNominal": 1350000,
        "numberOfSnackList": [
            {
                "name": "Snack Siang",
                "number": 27
            },
            {
                "name": "Makan Siang",
                "number": 27
            }
        ]
    }
]
```


---


