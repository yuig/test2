package ix1;

import jx1.t;
import kh2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends p implements Function1 {
    public a(Object obj) {
        super(1, obj, f.class, "onAudienceTypeChanged", "onAudienceTypeChanged(Lcom/pinterest/partnerAnalytics/feature/audience/model/AudienceType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gx1.d p03 = (gx1.d) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        f fVar = (f) this.receiver;
        int i13 = f.f73801m0;
        j.x2((t) fVar.f73802c0.getValue(), new jx1.f(p03));
        return Unit.f80348a;
    }
}
