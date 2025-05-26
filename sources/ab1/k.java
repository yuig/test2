package ab1;

import com.pinterest.error.NetworkResponseError;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import v.f1;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1723i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f1724j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i13) {
        super(1);
        this.f1723i = i13;
        this.f1724j = lVar;
    }

    public final void b(Throwable th3) {
        f1 f1Var;
        qz.d M;
        int i13 = this.f1723i;
        String str = null;
        l lVar = this.f1724j;
        switch (i13) {
            case 1:
                ya1.d dVar = (ya1.d) lVar.getView();
                Intrinsics.checkNotNullExpressionValue(dVar, "access$getView(...)");
                ((bb1.s) dVar).b8(null);
                break;
            case 2:
            default:
                ya1.d dVar2 = (ya1.d) lVar.getView();
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
                    str = M.f105384d;
                }
                ((bb1.s) dVar2).b8(str);
                break;
            case 3:
                ya1.d dVar3 = (ya1.d) lVar.getView();
                Intrinsics.checkNotNullExpressionValue(dVar3, "access$getView(...)");
                ((bb1.s) dVar3).b8(null);
                break;
        }
    }

    public final void e(xj2.c cVar) {
        int i13 = this.f1723i;
        l lVar = this.f1724j;
        switch (i13) {
            case 0:
                if (lVar.isBound()) {
                    ((bb1.s) ((ya1.d) lVar.getView())).c8(true);
                    break;
                }
                break;
            case 1:
            default:
                if (lVar.isBound()) {
                    ((bb1.s) ((ya1.d) lVar.getView())).c8(true);
                    break;
                }
                break;
            case 2:
                if (lVar.isBound()) {
                    ((bb1.s) ((ya1.d) lVar.getView())).c8(true);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1723i) {
            case 0:
                e((xj2.c) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                e((xj2.c) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                e((xj2.c) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
