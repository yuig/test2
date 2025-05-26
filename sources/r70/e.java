package r70;

import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.g1;
import lh0.w;
import lh0.y0;
import lh0.z0;

/* loaded from: classes.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106366i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f106367j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f106366i = i13;
        this.f106367j = fVar;
    }

    public final NavigationImpl b() {
        int i13 = this.f106366i;
        f fVar = this.f106367j;
        switch (i13) {
            case 0:
                r41.k kVar = r41.k.f106176a;
                wy0 f13 = ((b60.d) fVar.f106374g).f();
                String uid = f13 != null ? f13.getUid() : null;
                if (uid == null) {
                    uid = "";
                }
                return r41.k.c(kVar, uid, r41.b.BottomNavConfiguration, r41.g.BottomNavTabBar, null, 24);
            default:
                w wVar = fVar.f106375h;
                wVar.getClass();
                Intrinsics.checkNotNullParameter("1tap", "keyWord");
                z0.f83518a.getClass();
                String h10 = ((g1) wVar.f83494a).h("android_search_nux_1tap_autocomplete", y0.f83512b);
                return (h10 == null || !((z.p(h10, "enabled", false) || z.p(h10, "employee", false)) && StringsKt.E(h10, "1tap", false))) ? Navigation.w1((ScreenLocation) a0.f50492c.getValue()) : Navigation.w1((ScreenLocation) a0.f50493d.getValue());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f106366i) {
        }
        return b();
    }
}
