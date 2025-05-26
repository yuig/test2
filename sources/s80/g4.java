package s80;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e7 f111556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f111557j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f111558k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f111559l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(e7 e7Var, int i13, int i14, int i15) {
        super(1);
        this.f111556i = e7Var;
        this.f111557j = i13;
        this.f111558k = i14;
        this.f111559l = i15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i1.n1 b13;
        Intrinsics.checkNotNullParameter((i1.s) obj, "$this$null");
        e7 e7Var = this.f111556i;
        boolean z13 = e7Var instanceof c7;
        int i13 = this.f111558k;
        int i14 = this.f111557j;
        if (z13) {
            b13 = androidx.compose.animation.a.c(j1.e.r(i14, i13, null, 4), 2);
        } else {
            if (!(e7Var instanceof d7)) {
                throw new NoWhenBranchMatchedException();
            }
            b13 = androidx.compose.animation.a.c(j1.e.r(i14, i13, null, 4), 2).b(androidx.compose.animation.a.e(j1.e.r(i14, i13, null, 4), ((d7) e7Var).f111504a, 4));
        }
        return kh2.r.u1(b13, androidx.compose.animation.a.d(j1.e.r(this.f111559l, 0, null, 6), 2));
    }
}
