package s80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g6 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111561i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l62.w f111562j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(l62.w wVar, int i13) {
        super(1);
        this.f111561i = i13;
        this.f111562j = wVar;
    }

    public final n6 b(n6 it) {
        int i13 = this.f111561i;
        l62.w wVar = this.f111562j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, null, null, false, false, false, false, null, null, ((l62.n) wVar).f81666a, null, null, null, null, null, false, null, false, null, 2096639);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, null, null, false, false, false, false, null, null, null, Integer.valueOf(((l62.q) wVar).f81685b), null, null, null, null, false, null, false, null, 2096127);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f111561i) {
        }
        return b((n6) obj);
    }
}
