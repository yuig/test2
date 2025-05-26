package wu;

import com.pinterest.ads.feature.owc.presenter.showcase.ShowcaseException;
import com.pinterest.api.model.f30;
import h32.c1;
import h32.f1;
import h32.v0;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import tb0.p;

/* loaded from: classes3.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f131133a;

    public c(d dVar) {
        this.f131133a = dVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.g event) {
        f30 f30Var;
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = d.Y0;
        d dVar = this.f131133a;
        xt.f v83 = dVar.v8();
        if (v83.f135874q) {
            v83.f135874q = false;
            int i14 = xt.e.f135857a[v83.f135871n.ordinal()];
            if (i14 == 1) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(new ShowcaseException(), "Attempting to clickthrough without a ClickthroughSource defined!", p.SHOWCASE_ADS);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    f30 f30Var2 = v83.f135872o;
                    if (f30Var2 != null) {
                        f1 f1Var = f1.SHOWCASE_SUBPAGE_CLICKTHROUGH_END;
                        String uid = f30Var2.getUid();
                        c1 a13 = xt.f.a(v83.f135861d, f30Var2, null);
                        v0 v0Var = new v0();
                        v0Var.C = Long.valueOf((System.currentTimeMillis() * 1000000) - v83.f135873p);
                        v83.f135858a.H(f1Var, uid, a13, null, v0Var, false);
                        v83.f135873p = 0L;
                        v83.f135872o = null;
                    }
                } else if (i14 == 4 && (f30Var = v83.f135872o) != null) {
                    f1 f1Var2 = f1.SHOWCASE_SUBPIN_CLICKTHROUGH_END;
                    String uid2 = f30Var.getUid();
                    c1 a14 = xt.f.a(v83.f135861d, v83.f135860c, f30Var);
                    v0 v0Var2 = new v0();
                    v0Var2.C = Long.valueOf((System.currentTimeMillis() * 1000000) - v83.f135873p);
                    v83.f135858a.H(f1Var2, uid2, a14, null, v0Var2, false);
                    v83.f135873p = 0L;
                    v83.f135872o = null;
                }
            } else if (v83.f135872o != null) {
                f30 f30Var3 = v83.f135861d;
                if (f30Var3 != null) {
                    f1 f1Var3 = f1.SHOWCASE_PIN_CLICKTHROUGH_END;
                    String uid3 = f30Var3.getUid();
                    v0 v0Var3 = new v0();
                    v0Var3.C = Long.valueOf((System.currentTimeMillis() * 1000000) - v83.f135873p);
                    v83.f135858a.H(f1Var3, uid3, null, null, v0Var3, false);
                    v83.f135873p = 0L;
                }
                v83.f135872o = null;
            }
        }
        dVar.v8().f(false, false);
    }
}
