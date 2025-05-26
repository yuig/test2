package ev;

import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f60204i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(0);
        this.f60204i = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h hVar = this.f60204i;
        bv.a aVar = hVar.f60211m0;
        if (aVar != null) {
            ((dv.f) aVar).r3(hVar.A0, u0.PIN_AD_TARGETING_REASONS_GEO_REGION);
        }
        return Unit.f80348a;
    }
}
