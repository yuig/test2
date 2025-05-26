package t11;

import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115793i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f115794j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f115793i = i13;
        this.f115794j = fVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f115793i;
        f fVar = this.f115794j;
        switch (i13) {
            case 1:
                fVar.f115813m = false;
                s11.c cVar = fVar.f115811k;
                if (cVar == null) {
                    Intrinsics.r("editablePinFieldSource");
                    throw null;
                }
                aq.d dVar = aq.d.LINK;
                cVar.v(dVar, null, fVar.t3(dVar));
                return;
            default:
                fVar.f115807g.k(x0.generic_error);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f115793i) {
            case 0:
                Integer q13 = ((v7) obj).q1();
                Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                int intValue = q13.intValue();
                f fVar = this.f115794j;
                if (intValue > 0) {
                    s11.c cVar = fVar.f115811k;
                    if (cVar == null) {
                        Intrinsics.r("editablePinFieldSource");
                        throw null;
                    }
                    cVar.w("");
                } else {
                    s11.c cVar2 = fVar.f115811k;
                    if (cVar2 == null) {
                        Intrinsics.r("editablePinFieldSource");
                        throw null;
                    }
                    aq.d editablePinField = aq.d.SECTION_ID;
                    Intrinsics.checkNotNullParameter(editablePinField, "editablePinField");
                    Integer num = (Integer) cVar2.f110593j.get(editablePinField);
                    if (num != null) {
                        cVar2.removeItem(num.intValue());
                    }
                    cVar2.u(cVar2.d());
                }
                return Unit.f80348a;
            case 1:
                b((Throwable) obj);
                return Unit.f80348a;
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
