package ji1;

import ab2.p;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.c5;
import h32.d4;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f76282b;

    public /* synthetic */ b(c cVar, int i13) {
        this.f76281a = i13;
        this.f76282b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f30 f30Var;
        int i13 = this.f76281a;
        c this$0 = this.f76282b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ii1.b bVar = this$0.f76285b;
                if (bVar != null) {
                    bVar.p3(f1.TAP);
                    f30 f30Var2 = bVar.f72314l;
                    if (f30Var2 != null) {
                        Boolean R4 = f30Var2.R4();
                        Intrinsics.checkNotNullExpressionValue(R4, "getIsEligibleForWebCloseup(...)");
                        if (!R4.booleanValue()) {
                            bVar.f72307e.d(Navigation.z0((ScreenLocation) c5.f50631a.getValue(), f30Var2.getUid()));
                            return;
                        }
                        uk1.d dVar = bVar.f72304b;
                        d0 d0Var = dVar.f122379a;
                        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                        ps.a a13 = bVar.f72308f.a(bVar.f72309g.a(d0Var));
                        d0 d0Var2 = dVar.f122379a;
                        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                        a13.a(f30Var2, d0Var2, g0.FLOWED_PIN, bVar.f72316n, new HashMap(), com.bumptech.glide.c.D(f30Var2), d4.SEARCH, null, null, false, false, true, false, false, null, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ii1.b bVar2 = this$0.f76285b;
                if (bVar2 != null && (f30Var = bVar2.f72314l) != null) {
                    uk1.d dVar2 = bVar2.f72304b;
                    d0 d0Var3 = dVar2.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
                    ps.a a14 = bVar2.f72308f.a(bVar2.f72309g.a(d0Var3));
                    d0 d0Var4 = dVar2.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var4, "getPinalytics(...)");
                    a14.a(f30Var, d0Var4, g0.FLOWED_PIN, bVar2.f72316n, new HashMap(), com.bumptech.glide.c.D(f30Var), d4.SEARCH, null, null, false, false, true, false, false, null, null);
                }
                p pVar = this$0.f76294k;
                if (pVar != null) {
                    this$0.removeView(pVar);
                    return;
                } else {
                    Intrinsics.r("endFrame");
                    throw null;
                }
        }
    }
}
