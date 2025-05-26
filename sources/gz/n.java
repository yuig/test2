package gz;

import kh2.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66350i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f66351j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(h hVar, int i13) {
        super(1);
        this.f66350i = i13;
        this.f66351j = hVar;
    }

    public final d b(d lastState) {
        int i13 = this.f66350i;
        h hVar = this.f66351j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(lastState, "lastState");
                if (!(lastState instanceof c)) {
                    if ((lastState instanceof b) || Intrinsics.d(lastState, a.f66330a)) {
                        return lastState;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c cVar = (c) lastState;
                cz.b U0 = s0.U0(((e) hVar).f66338b);
                jz.d question = cVar.f66332a;
                Intrinsics.checkNotNullParameter(question, "question");
                return new c(question, U0, cVar.f66334c, cVar.f66335d, cVar.f66336e);
            default:
                Intrinsics.checkNotNullParameter(lastState, "it");
                g gVar = (g) hVar;
                return new c(gVar.f66340a, gVar.f66341b, gVar.f66342c, gVar.f66343d, gVar.f66344e);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f66350i) {
        }
        return b((d) obj);
    }
}
