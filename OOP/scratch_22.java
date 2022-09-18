/*
OOP: Object Oriented Programming
Java, Python, C++, Kotlin, Swift Dart, Javascript

Class -> Blueprint (พิมพ์เขียวของต้นฉบับ)
    - Attribute / Property/ Member / Field ตัวแปรที่เก็บข้อมูลในคลาส -> Private, Public , But this is optional to put it in or not
    - Method / Function / Action / Behavior ฟังก์ขชั่นกำหนดให้ทำงานด้านต่างๆ -> Optional

class Vehicle
    Attribute: make, model, color, year, engineType, fuelType, pwh
    Method: moveForward(), moveBackward(), break(), startEngine(), ...

class HouseTwoFloors
    Attribute: bedRooms, bathRooms, parkingSpace, area
    Method: alarm(), openGate(), openCurtain()

class Box
    Attribute: bedRooms, bathRooms, parkingSpace, area
    Method: calculateArea

*** Class : Anyone can use Class as a template/Blueprint ***


 */
// ชื่อคลาส นิยมใช้รูปแบบตัวอักษรแรกของทุกคำจะเป็นตัวใหญ่
// คลาส Box แยกออกจาก Scratch ที่อยู่ด่งล่าง
class Box {
    // กำหนด property = width, height, depth เป็น double
    // ในคลาสนี้ ไม่มีการกำหนด Method ใดๆ มีเพียง Property จำนวน 3 ตัวเท่านั้น
    double width;
    double height;
    double depth;
    // Method is optional here because there are no method written in this class
}

class Temp {
    // There are no property and method in this class. Therefore, this class is nothing provides as a blueprint
}

// คลาส Scratch แยกจาก Box
class Scratch {
    public static void main(String[] args){
        Box myObject = new Box();   // Declare & Initiate Object -> myObject is an Object name
                                    // myObject เป็นออบเจ็คที่สร้างตามแบบของ Box ดังนั้น อะไรที่ Box มีก็จะมีใน myObject ด้วย
                                    // Box is a template for myObject
        Temp myTemp = new Temp();   // Declare & Initiate Object -> myTemp is an Object name.
        // การกำหนดค่าให้กับ Property ซึ่งมีจำนวนและชื่อ Property เหมือนกัน Class Template ทุกอย่าง
        // การกำหนดต้องอ้างชื่อของ Object นำหน้าเสมอ ในที่นี้คือ myObject
        myObject.width = 10.50;
        myObject.depth = 5.95;
        myObject.height = 12.45;

        // Display ค่า Object
        System.out.println("myObject Depth = " + myObject.depth);
        System.out.println("myObject Width = " + myObject.width);
        System.out.println("myObject Height = " + myObject.height);

        // เราสามารถสร้าง Object ใหม่ได้ตามต้องการโดยใช้ Class Template ตัวเดียวกัน
        // ในที่นี้เราทดลองสร้าง myObject2 เป็นอีก Object Instance โดยใช้ Box เป็น Class Template เหมือนกับ myObject ตัวแรก
        Box myObject2 = new Box(); // Declare & Initiate Object -> myObject2 is an Object name.
        myObject2.width = 50.50;
        myObject2.depth = 56.95;
        myObject2.height = 92.45;

        // Display ค่า Object
        System.out.println("myObject2 Depth = " + myObject2.depth);
        System.out.println("myObject2 Width = " + myObject2.width);
        System.out.println("myObject2 Height = " + myObject2.height);

        //หมายเหตู myObject, myObject2 เรียกว่า Object หรือ Object Instance ก็ได้
    }
}