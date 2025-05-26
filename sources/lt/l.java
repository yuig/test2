package lt;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.a0;

/* loaded from: classes3.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84754i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f84755j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(1);
        this.f84754i = i13;
        this.f84755j = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84754i;
        m mVar = this.f84755j;
        switch (i13) {
            case 0:
                a0 stateEngineBuilder = (a0) obj;
                Intrinsics.checkNotNullParameter(stateEngineBuilder, "$this$stateEngineBuilder");
                stateEngineBuilder.d(mVar.f84756c);
                stateEngineBuilder.c(mVar, mVar.f84759f);
                break;
            default:
                l82.n start = (l82.n) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, mVar.f84757d);
                break;
        }
        return Unit.f80348a;
    }
}
