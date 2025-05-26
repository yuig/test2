package tq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118884i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f118885j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, int i13) {
        super(1);
        this.f118884i = i13;
        this.f118885j = nVar;
    }

    public final pq.b b(pq.b it) {
        int i13 = this.f118884i;
        n nVar = this.f118885j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, null, null, null, false, false, false, false, false, null, false, nVar.b().f35051h <= 0, 1023);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, nVar.getPin(), null, null, true, false, false, false, false, null, false, false, 2038);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f118884i) {
        }
        return b((pq.b) obj);
    }
}
