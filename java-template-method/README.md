# Java Template Method Pattern Example

โปรแกรมนี้เป็นตัวอย่างการใช้งาน Template Method Design Pattern ในภาษา Java

## Template Method Pattern คืออะไร?

Template Method คือ Design Pattern ที่กำหนดโครงสร้างของอัลกอริทึมไว้ในเมธอดหลัก (Template Method) ของคลาสแม่ (Abstract Class) แต่จะปล่อยให้คลาสลูก (Concrete Class) สามารถนิยามการทำงานในแต่ละขั้นตอนของอัลกอริทึมนั้นๆ ได้เอง ทำให้เราสามารถมีอัลกอริทึมที่มีโครงสร้างเหมือนกัน แต่มีการทำงานในรายละเอียดที่แตกต่างกันไปได้ โดยไม่จำเป็นต้องแก้ไขโค้ดในคลาสแม่

## โครงสร้างของโปรแกรม

โปรแกรมนี้ประกอบไปด้วย 4 คลาสหลัก:

1.  `Game.java` (Abstract Class)
    *   เป็นคลาสแม่ที่กำหนดโครงสร้างหลักของการเล่นเกมผ่านเมธอด `play()` ซึ่งเป็น Template Method
    *   เมธอด `play()` จะมีการเรียกใช้งานเมธอดอื่นๆ ตามลำดับที่แน่นอนคือ `initialize()`, `startPlay()`, และ `endPlay()`
    *   เมธอด `initialize()`, `startPlay()`, `endPlay()` ถูกกำหนดเป็น `abstract` เพื่อบังคับให้คลาสลูกต้องทำการ implement การทำงานของเมธอดเหล่านี้

2.  `Cricket.java` (Concrete Class)
    *   เป็นคลาสลูกที่สืบทอดมาจาก `Game`
    *   ทำการ implement การทำงานของเมธอด `initialize()`, `startPlay()`, และ `endPlay()` สำหรับ "เกมคริกเก็ต"

3.  `Football.java` (Concrete Class)
    *   เป็นคลาสลูกที่สืบทอดมาจาก `Game`
    *   ทำการ implement การทำงานของเมธอด `initialize()`, `startPlay()`, และ `endPlay()` สำหรับ "เกมฟุตบอล"

4.  `TemplatePatternDemo.java`
    *   เป็นคลาสหลักที่มี `main`เมธอดสำหรับทดสอบการทำงาน
    *   ทำการสร้าง object จากคลาส `Cricket` และ `Football` แล้วเรียกใช้เมธอด `play()` เพื่อแสดงให้เห็นว่าถึงแม้จะเรียกเมธอดเดียวกัน แต่ผลลัพธ์การทำงานในแต่ละขั้นตอนจะแตกต่างกันไปตามที่คลาสลูกได้นิยามไว้

## วิธีการคอมไพล์และรันโปรแกรม

1.  **Compile:**
    เปิด Command Prompt หรือ Terminal แล้วเข้าไปที่ไดเรกทอรี `java-template-method` จากนั้นใช้คำสั่ง:
    ```bash
    javac com/example/template/*.java
    ```

2.  **Run:**
    หลังจากคอมไพล์เสร็จเรียบร้อยแล้ว ใช้คำสั่งเพื่อรันโปรแกรม:
    ```bash
    java com.example.template.TemplatePatternDemo
    ```

## ผลลัพธ์ที่คาดหวัง

```
Cricket Game Initialized! Start playing.
Cricket Game Started. Enjoy the game!
Cricket Game Finished!

Football Game Initialized! Start playing.
Football Game Started. Enjoy the game!
Football Game Finished!
```
