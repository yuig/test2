package qa1;

import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends p implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pa1.b bVar = ((e) this.receiver).F0;
        if (bVar != null) {
            bVar.getPinalytics().X(u0.CONTINUE_BUTTON);
            try {
                fk2.c l13 = bVar.f99397f.f131564a.b(null, null).h(wj2.c.a()).l(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                nl.b.n(l13, new h81.b(bVar, 9), new pa1.a(bVar, 0));
            } catch (Exception e13) {
                bVar.f99393b.i(e13.getMessage());
            }
        }
        return Unit.f80348a;
    }
}
