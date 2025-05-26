package am2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15561i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ym2.c f15562j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(ym2.c cVar, int i13) {
        super(1);
        this.f15561i = i13;
        this.f15562j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15561i;
        ym2.c cVar = this.f15562j;
        switch (i13) {
            case 0:
                ym2.c it = (ym2.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.d() && Intrinsics.d(it.e(), cVar));
            default:
                bm2.i it2 = (bm2.i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.a(cVar);
        }
    }
}
