package nc0;

import i2.o;
import kh2.m2;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p1.f1;

/* loaded from: classes5.dex */
public final class c extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90354i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gc0.a f90355j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f90356k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ rm1.d f90357l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(gc0.a aVar, Function0 function0, rm1.d dVar, int i13) {
        super(3);
        this.f90354i = i13;
        this.f90355j = aVar;
        this.f90356k = function0;
        this.f90357l = dVar;
    }

    public final void b(f1 f1Var, o oVar, int i13) {
        int i14 = this.f90354i;
        Function0 function0 = this.f90356k;
        gc0.a aVar = this.f90355j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(f1Var, "$this$null");
                if ((i13 & 81) == 16) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                if (aVar != null) {
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(-1690204226);
                    if (function0 != null) {
                        m2.H(this.f90357l, aVar, null, function0, sVar2, 8, 4);
                    }
                    sVar2.r(false);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(f1Var, "$this$null");
                if ((i13 & 81) == 16) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                if (aVar != null) {
                    i2.s sVar4 = (i2.s) oVar;
                    sVar4.W(-1690187458);
                    if (function0 != null) {
                        m2.H(this.f90357l, aVar, null, function0, sVar4, 8, 4);
                    }
                    sVar4.r(false);
                    break;
                }
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f90354i) {
            case 0:
                b((f1) obj, (o) obj2, ((Number) obj3).intValue());
                break;
            default:
                b((f1) obj, (o) obj2, ((Number) obj3).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
