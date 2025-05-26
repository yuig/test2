package hp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.p implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t tVar = (t) this.receiver;
        kh2.j.x2((f0) tVar.f69870l0.getValue(), f.f69833a);
        jp0.b bVar = tVar.f69880v0;
        if (bVar != null) {
            bVar.onDeactivated();
            return Unit.f80348a;
        }
        Intrinsics.r("carouselView");
        throw null;
    }
}
