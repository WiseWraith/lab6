package activity

import android.app.Activity
import android.os.Bundle
import com.example.gameb.R

class SearchActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }
}