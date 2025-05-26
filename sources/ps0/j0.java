package ps0;

import android.os.Handler;
import androidx.recyclerview.widget.g2;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101274a;

    public j0(r0 r0Var) {
        this.f101274a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.u event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e W3 = this.f101274a.W3();
        if (W3 == null) {
            throw null;
        }
        HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W3;
        long integer = (hf0.b.q() && hf0.b.o()) ? homeFeedFragment.getResources().getInteger(u0.anim_speed_fast) : homeFeedFragment.getResources().getInteger(u0.anim_speed_fastest);
        c02.u temporaryItemAnimator = new c02.u(new c02.d(integer), new c02.a(integer, integer), new c02.b(integer), new c02.c(2 * integer), c02.e.f24436a);
        Intrinsics.checkNotNullParameter(temporaryItemAnimator, "temporaryItemAnimator");
        PinterestRecyclerView pinterestRecyclerView = homeFeedFragment.f139736j0;
        g2 g2Var = pinterestRecyclerView != null ? pinterestRecyclerView.f52531a.M : null;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.k(temporaryItemAnimator);
        }
        ((Handler) homeFeedFragment.f139741o0.getValue()).postDelayed(new ja.y(homeFeedFragment, temporaryItemAnimator, g2Var, 19), integer);
        throw null;
    }
}
