package ni1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u50.i0 f90603j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, u50.i0 i0Var) {
        super(1);
        this.f90602i = i13;
        this.f90603j = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90602i) {
            case 0:
                u0 state = (u0) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return u0.e(state, 0, null, null, false, null, this.f90603j, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 2097087);
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, this.f90603j, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }
}
