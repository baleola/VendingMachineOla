# Ola Bale - Vending Machine Task

### Install Dependencies
- Make sure to be in the root directory
- This should be run from IDE (pref. IntelliJ IDEA) unless `maven` is installed globally 
- run the `maven` install command:
```aidl
mvn clean install
```
### Running Program
- After running the above command, the program has been build and is in the `.target` folder.
- Open a console (Terminal or Command Prompt)
- Java Version `1.8`
- Navigate to the `target` folder and enter the following command:
```aidl
cd /target 
```
```aidl
java -cp VendingMachineOla-1.0-SNAPSHOT.jar com.vm.ola.Main
```

### Using the Vending Machine Program
- The program commands are:
```aidl
buy
```
```aidl
money
```
```aidl
balance
```
```aidl
refund
```
```aidl
reset
```
```aidl
refill
```
```aidl
inventory
```
```aidl
exit
```

### How to run the tests
- Make sure to be in the root directory
- Tests are located in `./src/test/java/com/vm/ola`
- This should be run from IDE (pref. IntelliJ IDEA) unless maven is installed globally  
- run the `maven` test command:
```aidl
mvn test
```
