package jp.co.stah.githubreposearch.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.co.stah.githubreposearch.R

/*
- 設計はAndroid Architecture Componentを使ったGoogleが推奨するアーキテクチャー。
  - https://developer.android.com/jetpack/docs/guide?hl=en
- 非同期通信はRetrofitと可能であればKotlin Coroutinesを併用
  - https://github.com/square/retrofit
  - https://kotlinlang.org/docs/reference/coroutines-overview.html
- Github API は version3 と version4をどちらを使っていただいても構いません。
- もしDI(依存性の注入)ライブラリを使うのであれば、Koinでおねがいします。
  - https://github.com/InsertKoinIO/koin
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
