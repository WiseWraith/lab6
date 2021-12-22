package activity

import android.app.Activity
import android.os.Bundle
import com.example.gameb.R

class ShopActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_shop)
    }
}
