# Microservices — Tests & Endpoints

---

## Eureka Server
**Check registered services :**
- GATEWAY
- SERVICE-CLIENT  
- SERVICE-VOITURE  

<img width="1917" height="1079" alt="image" src="https://github.com/user-attachments/assets/c2af41f5-886d-4330-8bab-7267775a99e9" />


---

## Gateway — Mode Statique

### **Endpoints :**
- `http://localhost:8888/clients`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/e356161e-8537-4a1d-912e-c739c065cfe4" /> 
- `http://localhost:8888/client/1`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/880a7fc8-306c-411c-8c8a-81f0bc9e3085" /> 
- `http://localhost:8888/voitures`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/bb2af557-9584-414a-8a54-41d1e520d290" />

---

## Gateway — Mode Dynamique (via Eureka)

### **Endpoints :**
- `http://localhost:8888/SERVICE-CLIENT/clients`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/46c259fa-eb47-4acd-87ed-508df5b4c827" />
- `http://localhost:8888/SERVICE-CLIENT/client/1`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/ad517227-8b7c-41f9-9561-d9d2ad2f840f" />
- `http://localhost:8888/SERVICE-VOITURE/voitures`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/772c8772-dcfb-402f-8427-a4af458a5593" />
- `http://localhost:8888/SERVICE-VOITURE/voitures/1`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/4a1a8829-a89f-4eeb-8dd3-593b75c91701" />

---

## Microservice — SERVICE-CLIENT (8088)

### **Endpoints :**
- `http://localhost:8088/clients`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/f09e503c-7b02-4b80-85bf-7e3899a5ba0f" />
- `http://localhost:8088/client/1`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/0424da49-8237-41e5-91df-2d286bb1ee32" />

---

## Microservice — SERVICE-VOITURE (8089)

### **Endpoints :**
- `http://localhost:8089/voitures`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/ff1f9a73-911b-46e6-9e00-1d07f412c5b4" />
- `http://localhost:8089/voitures/1`
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/b8c8a5f7-346a-4321-9936-e5fc1025c2ac" />
- `http://localhost:8089/voitures/client/1`
<img width="1919" height="1076" alt="image" src="https://github.com/user-attachments/assets/35b37c18-d4f9-4e1a-a64c-840fa64d07d9" />


