package jp.co.stah.githubreposearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/*
- 設計はAndroid Architecture Componentを使ったGoogleが推奨するアーキテクチャー。
  - https://developer.android.com/jetpack/docs/guide?hl=en
- 非同期通信はRetrofitと可能であればKotlin Coroutinesを併用
  - https://github.com/square/retrofit
  - https://kotlinlang.org/docs/reference/coroutines-overview.html
- targetSdkVersionは28、minSdkVersionは23
  - https://developer.android.com/guide/topics/manifest/uses-sdk-element?hl=en
- androidライブラリはsupportライブラリではなく、androidx
  - https://developer.android.com/jetpack/androidx?hl=en
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
