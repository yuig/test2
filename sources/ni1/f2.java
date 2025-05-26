package ni1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90681i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f90682j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(l82.c0 c0Var, int i13) {
        super(1);
        this.f90681i = i13;
        this.f90682j = c0Var;
    }

    public final u0 b(u0 pgcDisplayState) {
        int i13 = this.f90681i;
        l82.c0 c0Var = this.f90682j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pgcDisplayState, "pgcDisplayState");
                return u0.e(pgcDisplayState, 0, null, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, (bk1.o) c0Var.f82212a, null, null, 1835007);
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            default:
                Intrinsics.checkNotNullParameter(pgcDisplayState, "pgcDisplayState");
                return u0.e(pgcDisplayState, 0, null, null, false, null, null, null, null, null, null, false, null, null, null, (hk1.g) c0Var.f82212a, null, null, null, null, null, 2064383);
            case 2:
                Intrinsics.checkNotNullParameter(pgcDisplayState, "pgcDisplayState");
                return u0.e(pgcDisplayState, 0, null, null, false, null, null, null, null, null, null, false, null, null, null, null, null, (ck1.a) c0Var.f82212a, null, null, null, 1966079);
            case 4:
                Intrinsics.checkNotNullParameter(pgcDisplayState, "pgcDisplayState");
                return u0.e(pgcDisplayState, 0, null, null, false, null, null, null, null, null, null, false, (dk1.b) c0Var.f82212a, null, null, null, null, null, null, null, null, 2093055);
            case 6:
                Intrinsics.checkNotNullParameter(pgcDisplayState, "pgcDisplayState");
                return u0.e(pgcDisplayState, 0, null, null, false, null, null, null, null, null, null, false, null, (ek1.r) c0Var.f82212a, null, null, null, null, null, null, null, 2088959);
            case 8:
                Intrinsics.checkNotNullParameter(pgcDisplayState, "pgcDisplayState");
                return u0.e(pgcDisplayState, 0, null, null, false, null, null, null, null, null, null, false, null, null, null, null, (fk1.d) c0Var.f82212a, null, null, null, null, 2031615);
            case 10:
                Intrinsics.checkNotNullParameter(pgcDisplayState, "pgcDisplayState");
                return u0.e(pgcDisplayState, 0, null, null, false, null, null, null, null, null, null, false, null, null, (gk1.l) c0Var.f82212a, null, null, null, null, null, null, 2080767);
        }
    }

    public final y2 e(y2 pinRepVmState) {
        int i13 = this.f90681i;
        l82.c0 c0Var = this.f90682j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                return y2.b(pinRepVmState, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, null, null, (bk1.a2) c0Var.f82213b, -1, 2097151);
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            default:
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                return y2.b(pinRepVmState, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, (hk1.v) c0Var.f82213b, null, null, null, -1, 3932159);
            case 3:
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                return y2.b(pinRepVmState, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, null, (ck1.d) c0Var.f82213b, null, -1, 3145727);
            case 5:
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                return y2.b(pinRepVmState, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, (dk1.h) c0Var.f82213b, null, null, null, null, null, null, -1, 4161535);
            case 7:
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                return y2.b(pinRepVmState, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, (ek1.r1) c0Var.f82213b, null, null, null, null, null, -1, 4128767);
            case 9:
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                return y2.b(pinRepVmState, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, (fk1.w) c0Var.f82213b, null, null, -1, 3670015);
            case 11:
                Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
                return y2.b(pinRepVmState, null, null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, (gk1.x0) c0Var.f82213b, null, null, null, null, -1, 4063231);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f90681i) {
            case 0:
                return b((u0) obj);
            case 1:
                return e((y2) obj);
            case 2:
                return b((u0) obj);
            case 3:
                return e((y2) obj);
            case 4:
                return b((u0) obj);
            case 5:
                return e((y2) obj);
            case 6:
                return b((u0) obj);
            case 7:
                return e((y2) obj);
            case 8:
                return b((u0) obj);
            case 9:
                return e((y2) obj);
            case 10:
                return b((u0) obj);
            case 11:
                return e((y2) obj);
            case 12:
                return b((u0) obj);
            default:
                return e((y2) obj);
        }
    }
}
