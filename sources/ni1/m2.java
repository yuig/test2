package ni1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90741i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f90742j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(boolean z13, int i13) {
        super(1);
        this.f90741i = i13;
        this.f90742j = z13;
    }

    public final ek1.r1 b(ek1.r1 it) {
        switch (this.f90741i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return ek1.r1.b(it, null, null, 0, null, null, null, this.f90742j, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -1025, 4194303);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ek1.r1.b(it, null, null, 0, null, null, null, false, false, null, 0, null, null, this.f90742j, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -524289, 4194303);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f90741i;
        boolean z13 = this.f90742j;
        switch (i13) {
            case 0:
                u0 it = (u0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                y2 it2 = (y2) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                gk1.x0 it3 = (gk1.x0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 5:
                yl1.l bind = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f139350c = z13 ? fm1.c.VISIBLE : fm1.c.GONE;
                bind.f139349b = z13;
                break;
            default:
                nc2.l writeVideoState = (nc2.l) obj;
                Intrinsics.checkNotNullParameter(writeVideoState, "$this$writeVideoState");
                writeVideoState.f90409a = !z13;
                break;
        }
        return Unit.f80348a;
    }
}
