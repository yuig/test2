package s80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h6 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111570i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r1 f111571j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(r1 r1Var, int i13) {
        super(1);
        this.f111570i = i13;
        this.f111571j = r1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f111570i;
        r1 r1Var = this.f111571j;
        switch (i13) {
            case 0:
                j it = (j) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f7 f7Var = it.f111599h;
                boolean z13 = ((m1) r1Var).f111673a;
                u50.i0 text = f7Var.f111540b;
                Intrinsics.checkNotNullParameter(text, "text");
                return j.e(it, null, null, null, null, null, null, null, new f7(text, z13), null, null, null, null, false, false, false, null, 130943);
            default:
                n6 it2 = (n6) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return n6.b(it2, null, null, false, false, false, false, null, null, null, null, null, ((o1) r1Var).f111735b, null, null, false, null, false, null, 2093055);
        }
    }
}
