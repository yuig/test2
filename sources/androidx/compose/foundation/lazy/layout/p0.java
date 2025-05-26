package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f17275j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(r0 r0Var, int i13) {
        super(1);
        this.f17274i = i13;
        this.f17275j = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f17274i;
        r0 r0Var = this.f17275j;
        switch (i13) {
            case 0:
                y yVar = (y) r0Var.f17280n.invoke();
                int a13 = yVar.a();
                int i14 = 0;
                while (true) {
                    if (i14 >= a13) {
                        i14 = -1;
                    } else if (!Intrinsics.d(yVar.c(i14), obj)) {
                        i14++;
                    }
                }
                return Integer.valueOf(i14);
            default:
                int intValue = ((Number) obj).intValue();
                y yVar2 = (y) r0Var.f17280n.invoke();
                if (intValue >= 0 && intValue < yVar2.a()) {
                    kotlin.jvm.internal.j.z(r0Var.z0(), null, null, new q0(r0Var, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder s13 = a.a.s("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                s13.append(yVar2.a());
                s13.append(')');
                throw new IllegalArgumentException(s13.toString().toString());
        }
    }
}
