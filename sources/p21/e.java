package p21;

import android.content.Context;
import gb2.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import qa2.a1;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k pinOverlayUpdate = (k) obj;
        Intrinsics.checkNotNullParameter(pinOverlayUpdate, "p0");
        q21.d dVar = (q21.d) ((o21.d) ((f) this.receiver).getView());
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pinOverlayUpdate, "update");
        if (dVar.f102138m == null) {
            Context context = dVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a1 a1Var = new a1(context, dVar.f102134i, null, null);
            a1Var.A = false;
            dVar.f102137l.addView(a1Var);
            dVar.f102138m = a1Var;
        }
        a1 a1Var2 = dVar.f102138m;
        if (a1Var2 != null) {
            Intrinsics.checkNotNullParameter(pinOverlayUpdate, "pinOverlayUpdate");
            a1Var2.setVisibility(pinOverlayUpdate.f64759b.getValue());
            if (a1Var2.C == null) {
                a1Var2.m(pinOverlayUpdate);
            }
        }
        return Unit.f80348a;
    }
}
