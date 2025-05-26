package vo;

import com.pinterest.activity.PinterestActivity;
import com.pinterest.api.model.wy0;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinterestActivity f126373a;

    public n(PinterestActivity pinterestActivity) {
        this.f126373a = pinterestActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.p e13) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(e13, "e");
        y0 y0Var = y0.ANDROID_MAIN_USER_ED;
        y0 y0Var2 = e13.f108078a;
        if (y0Var == y0Var2) {
            PinterestActivity pinterestActivity = this.f126373a;
            rg0.s sVar = pinterestActivity.f34826s;
            if (sVar == null) {
                Intrinsics.r("experiences");
                throw null;
            }
            rg0.n c13 = ((dh0.d) sVar).c(y0Var2);
            if ((c13 != null ? c13.f108068j : null) != null) {
                b60.b bVar = pinterestActivity.f34825r;
                if (bVar == null) {
                    Intrinsics.r("activeUserManager");
                    throw null;
                }
                wy0 f13 = ((b60.d) bVar).f();
                if (f13 == null || (bool = f13.G3()) == null) {
                    bool = Boolean.FALSE;
                }
                if (!bool.booleanValue()) {
                    ((lu1.c) ((lu1.b) ((bf2.b) pinterestActivity.q()).get())).n(pinterestActivity, null, pinterestActivity.getIntent().getExtras());
                }
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.q e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (y0.ANDROID_MAIN_USER_ED == e13.a()) {
            PinterestActivity pinterestActivity = this.f126373a;
            ((lu1.c) ((lu1.b) ((bf2.b) pinterestActivity.q()).get())).k(pinterestActivity, false);
            pinterestActivity.finish();
        }
    }
}
