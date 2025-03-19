## Examen de Test Unitarios

---

### Enunciado

Con el código de este repositorio realiza:

- (*4 puntos*) Los test unitarios de los **dos** métodos, utiliza test **parametrizados**. Suponiendo que la `string` DNI, siempre es un DNI válido.
- (*2 puntos*) En el código, hay un error, ¿lo pudiste comprabar en los test? ¿Plantea la solución?
- (*3 puntos*) Si no hubiera una comprobación previamente encuanto a la longitud de la `string` del DNI, ¿Qué hay que cambiar en los tests para que comprueben estos casos?

Entrega tu repositorio con el código y los test. Además un `Readme` explicando y justificando cada apartado

Formato del `Readme` *1 punto*

---

### Resolución

- **Para `calcularLetraDNI`:**
    - Creé un test con múltiples casos usando `@CsvSource`. Incluí DNIs como `53818040` (que debería dar H) y casos límite como `00000000` (letra T) y `99999999` (letra R).
    - Usé `assertEquals` para verificar que el método retorne la letra correcta para cada número.

- **Para `comprobarDNI`:**
    - Reutilicé los mismos casos de `calcularLetraDNI`, pero agregué un caso extra: `00000000, R` (sabía que estaba mal, pero quería ver si el test lo detectaba).
    - Usé `assertTrue` para confirmar que la letra coincida con la calculada.  
### Error en el código

    - El error del codigo es que la J y la Q estna invertidas. La solución es cambiar la J por la Q y la Q por la J.

### Qué cambiaría si no hubiera validación de longitud:
**Agregaría estos casos a los tests:**
    -Usando el AsserFalse para verificar que el metodo retorne false en estos casos. (en la funcion de comprobarDNI)
   ```java
   @CsvSource({
       "1234567, Z",   // 7 dígitos → Inválido
       "123456789, A"  // 9 dígitos → Inválido
   })
    ```
   
    
