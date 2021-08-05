package ru.vsu.travelguidbelgorod;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import ru.vsu.travelguidbelgorod.databinding.ActivityMainBinding;
import ru.vsu.travelguidbelgorod.ui.entertainment.EntertainmentFragment;
import ru.vsu.travelguidbelgorod.ui.news.NewsFragment;
import ru.vsu.travelguidbelgorod.ui.profile.ProfileFragment;
import ru.vsu.travelguidbelgorod.ui.shop.ShopFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
//    private ViewPager pager;
//    private PagerAdapter pagerAdapter;
    MyAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_news,
                R.id.navigation_entertainment,
                R.id.navigation_profile,
                R.id.navigation_shop)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

//        List<Fragment> fragmentList = new ArrayList<>();
//        fragmentList.add(new NewsFragment());
//        fragmentList.add(new EntertainmentFragment());
//        fragmentList.add(new ProfileFragment());
//        fragmentList.add(new ShopFragment());
//
//        pager = findViewById(R.id.vpPager);
//        pagerAdapter = new SliderPagerAdapter(getSupportFragmentManager(), fragmentList);
//        pager.setAdapter(pagerAdapter);

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

    }

    public static class MyAdapter extends FragmentPagerAdapter {
        MyAdapter (@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @NotNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
//                    return ItemNewFragment.newInstance(10);
                    return NewsFragment.newInstance();
                case 1:
                    return EntertainmentFragment.newInstance();
                case 2:
                    return ProfileFragment.newInstance();
                case 3:
                    return ShopFragment.newInstance();

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

}
