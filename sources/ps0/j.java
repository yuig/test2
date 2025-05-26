package ps0;

import android.view.View;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements ar0.f, se0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101273a;

    public /* synthetic */ j(HomeFeedFragment homeFeedFragment) {
        this.f101273a = homeFeedFragment;
    }

    @Override // ar0.f
    public boolean b(int i13, int i14) {
        int i15 = HomeFeedFragment.U1;
        HomeFeedFragment this$0 = this.f101273a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d dVar = this$0.f45769y1;
        Intrinsics.f(dVar);
        int i16 = ((r0) dVar).O.f20388f;
        d dVar2 = this$0.f45769y1;
        if (dVar2 == null || ((r0) dVar2).f109911w > 1) {
            if (i14 < i13 - i16) {
                return false;
            }
        } else if (i14 < i13 - 9) {
            return false;
        }
        return true;
    }

    @Override // se0.j
    public void d(float f13) {
        int i13 = HomeFeedFragment.U1;
        HomeFeedFragment this$0 = this.f101273a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.C1;
        if (view == null || !bs1.c.o1(view)) {
            return;
        }
        this$0.o9(u0.anim_speed_superfast);
    }
}
