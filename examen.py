numeros = []  

for i in range(10):
    num = float(input(f"Ingrese un numero {i+1}: "))
    numeros.append(num)

suma = sum(numeros)
promedio = suma / len(numeros)
maximo = max(numeros)
minimo = min(numeros)

print("\n--- RESULTADOS ---")
print("Los números ingresados son:", numeros)
print("Suma:", suma)
print("Promedio:", promedio)
print("Máximo:", maximo)
print("Mínimo:", minimo)
