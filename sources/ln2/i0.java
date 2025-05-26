package ln2;

import am2.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.p0;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84089i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f84090j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(l0 l0Var, int i13) {
        super(1);
        this.f84089i = i13;
        this.f84090j = l0Var;
    }

    public final am2.j b(int i13) {
        int i14 = this.f84089i;
        l0 l0Var = this.f84090j;
        switch (i14) {
            case 0:
                p0 p0Var = l0Var.f84099a;
                ym2.b s03 = bs1.c.s0((vm2.f) p0Var.f82654c, i13);
                boolean z13 = s03.f139465c;
                Object obj = p0Var.f82653b;
                return z13 ? ((o) obj).b(s03) : lb.l0.d0(((o) obj).f84109b, s03);
            default:
                p0 p0Var2 = l0Var.f84099a;
                ym2.b classId = bs1.c.s0((vm2.f) p0Var2.f82654c, i13);
                if (classId.f139465c) {
                    return null;
                }
                am2.d0 d0Var = ((o) p0Var2.f82653b).f84109b;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                Intrinsics.checkNotNullParameter(classId, "classId");
                am2.j d03 = lb.l0.d0(d0Var, classId);
                if (d03 instanceof b1) {
                    return (b1) d03;
                }
                return null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f84089i) {
        }
        return b(((Number) obj).intValue());
    }
}
