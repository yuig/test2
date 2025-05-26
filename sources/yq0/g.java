package yq0;

import ac2.o1;
import com.pinterest.feature.core.view.MvpViewPagerFragment;

/* loaded from: classes.dex */
public final class g extends xa.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MvpViewPagerFragment f139694a;

    public g(MvpViewPagerFragment mvpViewPagerFragment) {
        this.f139694a = mvpViewPagerFragment;
    }

    @Override // xa.k, xa.i
    public final void i(int i13, float f13, int i14) {
        com.pinterest.framework.screens.a Z7 = this.f139694a.Z7();
        if (Z7 != null) {
            if (Z7 instanceof ec2.o) {
                ((o1) ((ec2.o) Z7).P0()).w();
            }
            if (Z7 instanceof nr0.i) {
                ((nr0.i) Z7).s6();
            }
        }
    }
}
