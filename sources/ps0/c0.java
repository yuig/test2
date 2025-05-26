package ps0;

import android.net.Uri;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import df.j1;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101248i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f101249j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(r0 r0Var, int i13) {
        super(1);
        this.f101248i = i13;
        this.f101249j = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e W3;
        int i13 = this.f101248i;
        r0 r0Var = this.f101249j;
        switch (i13) {
            case 0:
                String url = (String) obj;
                e W32 = r0Var.W3();
                if (W32 != null) {
                    Intrinsics.f(url);
                    HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W32;
                    Intrinsics.checkNotNullParameter(url, "url");
                    if (!j1.H0(false, Uri.parse(url))) {
                        homeFeedFragment.f7().e(500L, new i92.i(new lr.y(url)));
                    }
                }
                break;
            case 1:
                e eVar = (e) r0Var.getViewIfBound();
                if (eVar != null) {
                    ((HomeFeedFragment) eVar).r9(y0.ANDROID_HOME_FEED_AFTER_CLICKTHROUGH);
                }
                break;
            default:
                if (r0Var.isBound() && (W3 = r0Var.W3()) != null) {
                    ((HomeFeedFragment) W3).o9(u0.anim_speed_fastest);
                }
                break;
        }
        return Unit.f80348a;
    }
}
