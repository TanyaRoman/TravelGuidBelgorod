//package ru.vsu.travelguidbelgorod;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentStatePagerAdapter;
//
//import org.jetbrains.annotations.NotNull;
//
//import java.util.List;
//
//public class SliderPagerAdapter extends FragmentStatePagerAdapter {
//
//    private List<Fragment> fragmentList;
//
//    public SliderPagerAdapter(FragmentManager fm, List<Fragment> fragmentList){
//        super(fm);
//        this.fragmentList = fragmentList;
//    }
//
//    @NonNull
//    @NotNull
//    @Override
//    public Fragment getItem(int position) {
//        return fragmentList.get(position);
//    }
//
//    @Override
//    public int getCount() {
//        return fragmentList.size();
//    }
//}
