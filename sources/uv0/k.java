package uv0;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.ln0;
import dl1.t;
import h32.f1;
import java.io.File;
import jk2.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;
import xk2.v;

/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final v f123176a = xk2.m.b(g.f123168k);

    public static final ek2.j a(d0 pinalytics, Context context, String draftId, Function1 onSuccess, Function1 onFailure) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        int i13 = 12;
        d0.v(pinalytics, f1.STORY_PIN_MULTI_DRAFTS_SAVE_COVER, draftId, false, 12);
        q j13 = ((dl1.l) ((t) f123176a.getValue())).M(draftId).h(tk2.e.f118017c).e(wj2.c.a()).j();
        bv0.k kVar = new bv0.k(28, new q0.d(context, i13));
        int i14 = 13;
        ep.g gVar = new ep.g(i14, j.f123175i);
        int i15 = uj2.h.f122339a;
        xj2.c F = j13.u(new e1(gVar, kVar, 1), false, i15, i15).F(new pv0.e(i13, new t90.n(11, onSuccess)), new pv0.e(i14, new t90.n(i13, onFailure)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return (ek2.j) F;
    }

    public static /* synthetic */ void b(d0 d0Var, Context context, String str, com.pinterest.feature.ideaPinCreation.closeup.view.n nVar, int i13) {
        i iVar = i.f123172j;
        Function1 function1 = nVar;
        if ((i13 & 16) != 0) {
            function1 = i.f123173k;
        }
        a(d0Var, context, str, iVar, function1);
    }

    public static final void c(ln0 draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        String j13 = draft.j();
        if (j13 != null) {
            File f13 = new File(j13);
            Intrinsics.checkNotNullParameter(f13, "f");
            if (f13.exists()) {
                f13.delete();
            }
        }
    }

    public static final void d(i92.k kVar, View view) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        view.postDelayed(new vs0.b(kVar, 8), 500L);
    }
}
