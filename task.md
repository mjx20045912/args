##Tasks

#### length
* **given** "-a -b -c"
* **when** handled in the method
* **then** get the args length is 3
---
* **given** ""
* **when** handled in the method
* **then** get the args length is 0
---
* **given** "-a 123"
* **when** handled in the method
* **then** get the args length is 1

### value
* **given** "-a -b -c"
* **when** handled in the method
* **then** get the args value is {a: true; b:true; c: true }
--- 
* **given** "-a 1 -b 2 -c 3"
* **when** handled in the method
* **then** get the args value is {a: 1; b:2; c: 2 }

### schema
* **given** schema {a: int, b : string, c: string} and args "-a 1 -c abc"
* **when** handled in the method
* **then** get the args value is {a: 1; b:abc; }
---
* **given** schema { a: int } and args "-a 1 -c 123"
* **when** handled in the method
* **then** get the args value is { a: 1 }

