package dm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.v1;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55409i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f55410j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i13) {
        super(1);
        this.f55409i = i13;
        this.f55410j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        int i13 = this.f55409i;
        g descriptor = this.f55410j;
        switch (i13) {
            case 0:
                ((qn2.h) ((qn2.i) obj)).getClass();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return null;
            default:
                v1 v1Var = (v1) obj;
                Intrinsics.f(v1Var);
                if (!ao2.m0.U(v1Var)) {
                    am2.j b13 = v1Var.w0().b();
                    if ((b13 instanceof am2.c1) && !Intrinsics.d(((am2.c1) b13).g(), descriptor)) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(z13);
        }
    }
}
