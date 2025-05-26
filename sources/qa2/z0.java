package qa2;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103376i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f103377j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(a1 a1Var, int i13) {
        super(1);
        this.f103376i = i13;
        this.f103377j = a1Var;
    }

    public final void b(String str) {
        gb2.d dVar;
        gb2.d dVar2;
        int i13 = this.f103376i;
        String str2 = null;
        a1 a1Var = this.f103377j;
        switch (i13) {
            case 0:
                Intrinsics.f(str);
                gb2.k kVar = a1Var.C;
                if (kVar != null && (dVar = kVar.f64761d) != null) {
                    str2 = dVar.f64745a;
                }
                if (Intrinsics.d(str2, str)) {
                    a1Var.x();
                    break;
                }
                break;
            default:
                Intrinsics.f(str);
                gb2.k kVar2 = a1Var.C;
                if ((kVar2 != null ? kVar2.f64761d : null) instanceof gb2.b) {
                    if (kVar2 != null && (dVar2 = kVar2.f64761d) != null) {
                        str2 = dVar2.f64745a;
                    }
                    if (Intrinsics.d(str2, str)) {
                        a1Var.x();
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        gb2.d dVar;
        int i13 = this.f103376i;
        a1 a1Var = this.f103377j;
        switch (i13) {
            case 0:
                b((String) obj);
                return Unit.f80348a;
            case 1:
                b((String) obj);
                return Unit.f80348a;
            case 2:
                f30 f30Var = (f30) obj;
                Intrinsics.f(f30Var);
                gb2.k kVar = a1Var.C;
                if (kVar == null || (dVar = kVar.f64761d) == null) {
                    str = null;
                } else {
                    boolean z13 = dVar instanceof gb2.a;
                    str = dVar.f64745a;
                    if (!z13) {
                        if (dVar instanceof gb2.b) {
                            str = ((gb2.b) dVar).f64744b;
                        } else if (!(dVar instanceof gb2.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                if (str != null) {
                    v7 D3 = f30Var.D3();
                    String uid = D3 != null ? D3.getUid() : null;
                    String H = b40.H(f30Var);
                    if (Intrinsics.d(uid, str) || Intrinsics.d(H, str)) {
                        a1Var.x();
                    }
                }
                return Unit.f80348a;
            default:
                gb2.k it = (gb2.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var2 = a1Var.f103228w;
                return Boolean.valueOf(Intrinsics.d(f30Var2 != null ? f30Var2.getUid() : null, it.f64758a));
        }
    }
}
