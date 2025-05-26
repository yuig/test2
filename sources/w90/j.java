package w90;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f128557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p pVar, int i13) {
        super(0);
        this.f128556i = i13;
        this.f128557j = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f fVar = f.f128532a;
        d dVar = d.f128528a;
        p pVar = this.f128557j;
        int i13 = this.f128556i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        int i14 = p.V0;
                        kh2.j.x2(pVar.e9(), fVar);
                        break;
                    default:
                        int i15 = p.V0;
                        kh2.j.x2(pVar.e9(), dVar);
                        break;
                }
                return Unit.f80348a;
            case 1:
                switch (i13) {
                    case 0:
                        int i16 = p.V0;
                        kh2.j.x2(pVar.e9(), fVar);
                        break;
                    default:
                        int i17 = p.V0;
                        kh2.j.x2(pVar.e9(), dVar);
                        break;
                }
                return Unit.f80348a;
            default:
                Context requireContext = pVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                a82.b bVar = pVar.K0;
                if (bVar != null) {
                    return new xa0.p(requireContext, bVar);
                }
                Intrinsics.r("offscreenRenderer");
                throw null;
        }
    }
}
