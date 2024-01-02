package com.example.appsarah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.appsarah.databinding.ActivityTablayoutactivityBinding
import com.google.android.material.tabs.TabLayout

class tablayoutactivity : AppCompatActivity() {
    private lateinit var binding: ActivityTablayoutactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this ,R.layout.activity_tablayoutactivity)


        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("First"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Second"))

        val adapter = FragmentPageAdapter(supportFragmentManager,lifecycle)
        binding.viewPager22.adapter = adapter
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab !=null){
                    tab.position.also { binding.viewPager22.currentItem = it }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        binding.viewPager22.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tabLayout.selectTab(binding.tabLayout.getTabAt(position))
            }
        })



    }
}