package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFavoriteModule f109148j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i13, PinCloseupFavoriteModule pinCloseupFavoriteModule) {
        super(1);
        this.f109147i = i13;
        this.f109148j = pinCloseupFavoriteModule;
    }

    public final void b(f30 f30Var) {
        int i13 = this.f109147i;
        PinCloseupFavoriteModule pinCloseupFavoriteModule = this.f109148j;
        switch (i13) {
            case 0:
                pinCloseupFavoriteModule.f35009p = true;
                pinCloseupFavoriteModule.updateView();
                x02.i2 i2Var = pinCloseupFavoriteModule.f34997d;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                Intrinsics.f(f30Var);
                i2Var.W(f30Var);
                return;
            default:
                pinCloseupFavoriteModule.f35009p = true;
                x02.i2 i2Var2 = pinCloseupFavoriteModule.f34997d;
                if (i2Var2 == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                Intrinsics.f(f30Var);
                i2Var2.W(f30Var);
                return;
        }
    }

    public final void e(Throwable th3) {
        int i13 = this.f109147i;
        PinCloseupFavoriteModule pinCloseupFavoriteModule = this.f109148j;
        switch (i13) {
            case 1:
                pinCloseupFavoriteModule.f35008o = false;
                pinCloseupFavoriteModule.updateView();
                pinCloseupFavoriteModule.f35009p = true;
                i92.k kVar = pinCloseupFavoriteModule.f35000g;
                if (kVar != null) {
                    kVar.i(pinCloseupFavoriteModule.getResources().getString(m60.x0.generic_error));
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
            case 2:
            default:
                bs1.c.X0(pinCloseupFavoriteModule);
                return;
            case 3:
                pinCloseupFavoriteModule.f35008o = true;
                pinCloseupFavoriteModule.updateView();
                pinCloseupFavoriteModule.f35009p = true;
                i92.k kVar2 = pinCloseupFavoriteModule.f35000g;
                if (kVar2 != null) {
                    kVar2.i(pinCloseupFavoriteModule.getResources().getString(m60.x0.generic_error));
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109147i;
        PinCloseupFavoriteModule pinCloseupFavoriteModule = this.f109148j;
        switch (i13) {
            case 0:
                b((f30) obj);
                break;
            case 1:
                e((Throwable) obj);
                break;
            case 2:
                b((f30) obj);
                break;
            case 3:
                e((Throwable) obj);
                break;
            case 4:
                e((Throwable) obj);
                break;
            case 5:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(pinCloseupFavoriteModule.f35008o ? rm1.q.STAR : rm1.q.STAR_OUTLINE);
                break;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new e1(5, pinCloseupFavoriteModule));
                break;
        }
        return Unit.f80348a;
    }
}
