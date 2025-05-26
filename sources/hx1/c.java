package hx1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class c extends p implements Function1 {
    public c(Object obj) {
        super(1, obj, f.class, "onAudienceTypeChanged", "onAudienceTypeChanged(Lcom/pinterest/partnerAnalytics/feature/audience/model/AudienceType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gx1.d p03 = (gx1.d) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        j jVar = ((f) this.receiver).f70540t0;
        if (jVar != null) {
            jVar.q3(p03);
            return Unit.f80348a;
        }
        Intrinsics.r("listener");
        throw null;
    }
}
