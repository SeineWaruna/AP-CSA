/*
OOP: Object Oriented Programming
Java, Python, C++, Kotlin, Swift Dart, Javascript

    - Lab นี้แสดงการสร้าง Object Instance , กำหนดค่าให้ Properties ใน Object Instance และเรียกใช้ (นำมาคำนวนปริมาตร) และแสดงผล
    - เราเขียนโค้กดการคำนวณไว้ที่ main() เองเพื่อไม่ได้เขียนไว้ใน Class "Box"
*/

// ชื่อคลาส นิยมใช้รูปแบบตัวอักษรตัวแรกของทุกคำจะเป็นตัวใหญ่
// คลาส Box แยกออกจาก Scratch ที่อยู่ด้านล่าง
class Box {
    // กำหนด property = width, height, depth เป็น double
    // ในคลาสนี้ ไม่มีการกำหนด Method ใดๆ มีเพียง Property จำนวน 3 ตัวเท่านั้น
    double width;
    double height;
    double depth;
    // Method is optional here because there are no method written in this class
}

// คลาส Scratch แยกจาก Box
class Scratch {
    public static void main(String[] args) {
        Box myObject = new Box();   // Declare & Initiate Object -> myObject is an Object name
        // myObject เป็นออบเจ็คที่สร้างตามแบบของ Box ดังนั้น อะไรที่ Box มีก็จะมีใน myObject ด้วย
        // Box is a template for myObject
        // การกำหนดค่าให้กับ Property ซึ่งมีจำนวนและชื่อ Property เหมือนกัน Class Template ทุกอย่าง
        // การกำหนดต้องอ้างชื่อของ Object นำหน้าเสมอ ในที่นี้คือ myObject
        // Assign values to Properties
        myObject.width = 10.50;
        myObject.depth = 5.95;
        myObject.height = 12.45;

        // ตัวอย่างการใช้งานค่า Property จาก Class
        // คำนวนปริมาตร โดยการสร้างตัวแปรใหม่ ชื่อ volume
        double volume;
        volume = myObject.width * myObject.depth * myObject.height; // นำคำของ Object Instance มาใช้งาน

        // Display ค่า Object
        System.out.println("myObject Depth = " + myObject.depth);
        System.out.println("myObject Width = " + myObject.width);
        System.out.println("myObject Height = " + myObject.height);
        System.out.println("Volume of myObject " + volume); // ใช้ค่าจากตัวแปรที่สร้างใหม่ด้านบนชื่อ volume
        // หรือจะใช้วิะ๊การคำนวณค่าโดยตรงจากค่าใน Property ของ Object Instance
        System.out.println("Volume of myObject " + (myObject.width * myObject.depth * myObject.height));

    }
}