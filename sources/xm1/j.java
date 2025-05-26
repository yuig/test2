package xm1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135381i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f135382j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(e eVar, int i13) {
        super(1);
        this.f135381i = i13;
        this.f135382j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135381i;
        int i14 = 0;
        e eVar = this.f135382j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(eVar.f135368f.getIcon());
                return Unit.f80348a;
            case 1:
                yl1.b buttonState = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                i0 i0Var = eVar.f135365c;
                return yl1.b.f(buttonState, i0Var, false, fm1.c.VISIBLE, i0Var, null, null, null, null, 0, null, 1010);
            case 2:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new j(eVar, i14));
                bind.c(fm1.c.VISIBLE);
                return Unit.f80348a;
            case 3:
                om1.q bind2 = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                if (eVar.f135369g && eVar.f135368f == null) {
                    i14 = 1;
                }
                bind2.getClass();
                bind2.f96679d = i14 != 0 ? fm1.c.VISIBLE : fm1.c.GONE;
                return Unit.f80348a;
            case 4:
                rn1.a bodyState = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(bodyState, "bodyState");
                return rn1.a.y(bodyState, eVar.f135364b, null, null, null, null, 0, null, null, null, null, eVar.f135371i, 0, null, null, null, null, null, false, null, null, 2096126);
            case 5:
                em1.d checkBoxState = (em1.d) obj;
                Intrinsics.checkNotNullParameter(checkBoxState, "checkBoxState");
                return em1.d.e(checkBoxState, null, null, fm1.c.VISIBLE, eVar.f135370h, null, null, eVar.f135372j, null, false, 0, 947);
            default:
                cm1.d buttonGroupState = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(buttonGroupState, "buttonGroupState");
                yl1.b bVar = buttonGroupState.f28012a;
                i0 i0Var2 = eVar.f135365c;
                yl1.e eVar2 = yl1.e.FULL_WIDTH;
                yl1.b f13 = yl1.b.f(bVar, i0Var2, false, null, i0Var2, null, null, null, null, 0, eVar2, 502);
                yl1.b bVar2 = buttonGroupState.f28013b;
                return cm1.d.e(buttonGroupState, f13, yl1.b.f(bVar2, null, false, null, bVar2.f139300a, null, null, null, null, 0, eVar2, 503), null, eVar.f135367e.getOrientation(), fm1.c.VISIBLE, 76);
        }
    }
}
