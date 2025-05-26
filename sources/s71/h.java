package s71;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111361i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f111362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l lVar, int i13) {
        super(0);
        this.f111361i = i13;
        this.f111362j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f111361i;
        l lVar = this.f111362j;
        switch (i13) {
            case 0:
                com.airbnb.lottie.v vVar = new com.airbnb.lottie.v();
                if (lVar.f111384m) {
                    vVar.f28445J = com.airbnb.lottie.a.ENABLED;
                }
                return vVar;
            default:
                if (lVar.f111382k) {
                    if (lVar.f111383l) {
                        lVar.c().d();
                    } else {
                        lVar.b().f2();
                    }
                }
                return Unit.f80348a;
        }
    }
}
