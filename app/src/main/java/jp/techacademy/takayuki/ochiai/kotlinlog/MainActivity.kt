package jp.techacademy.takayuki.ochiai.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)
        dog.say()
        Log.d("kotlintest", "名前：${dog.name} 年齢：${dog.age}")
        dog.move()

        val bigDog = BigDog("ヨーゼフ", 15)
        bigDog.say()
        Log.d("kotlintest", "名前：${bigDog.name} 年齢：${bigDog.age}")
        bigDog.move()

        // Lesson3：課題 ----------------------------------------------------------------
        val humanTaro = Human("太郎", 10, "車")
        humanTaro.say()
        humanTaro.think()

        val humanHanako = Human("花子", 20, "花")
        humanHanako.say()
        humanHanako.think()
        // ------------------------------------------------------------------------------
    }
}
