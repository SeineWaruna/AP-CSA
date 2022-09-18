/*
OOP: Object Oriented Programming
Java, Python, C++, Kotlin, Swift Dart, Javascript

    - Lab นี้แสดงการสร้าง Object Instance , กำหนดค่าให้ Properties ใน Object Instance และเรียกใช้เมตธอด (นำมาคำนวนปริมาตร) และแสดงผล
*/

// ชื่อคลาส นิยมใช้รูปแบบตัวอักษรตัวแรกของทุกคำจะเป็นตัวใหญ่
// คลาส Box แยกออกจาก Scratch ที่อยู่ด้านล่าง
class Box {
    // กำหนด property = width, height, depth เป็น double
    // ในคลาสนี้ ไม่มีการกำหนด Method ใดๆ มีเพียง Property จำนวน 3 ตัวเท่านั้น
    double width;
    double height;
    double depth;
    // Method
    void volume() {
        System.out.print("Volume is "+ width * depth * height);
    }
}

// คลาส Scratch แยกจาก Box
class Scratch {
    public static void main(String[] args) {
        Box myObject = new Box();   // Declare & Initiate Object -> myObject is an Object name
        Box myObject2 = new Box();   // Declare & Initiate Object -> myObject2 is an Object name
        // กำหนดค่าของ Instance ที่ 1 ชื่อ myObject
        myObject.width = 10.50;
        myObject.depth = 5.95;
        myObject.height = 12.45;

        // Display ค่า Object
        System.out.println("myObject Depth = " + myObject.depth);
        System.out.println("myObject Width = " + myObject.width);
        System.out.println("myObject Height = " + myObject.height);
        //เรียกเมตธอด จาก Class Template ที่ชื่อ volume()
        myObject.volume();

        // กำหนดค่าของ Instance ที่ 1 ชื่อ myObject
        myObject2.width = 210.50;
        myObject2.depth = 45.95;
        myObject2.height = 612.45;
        myObject2.volume(); // Call method instance from myObject2

    }
}