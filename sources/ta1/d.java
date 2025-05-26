package ta1;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import va1.m1;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f116933j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(1);
        this.f116932i = i13;
        this.f116933j = fVar;
    }

    public final void b(wy0 wy0Var) {
        int i13 = this.f116932i;
        f fVar = this.f116933j;
        switch (i13) {
            case 1:
                Intrinsics.f(wy0Var);
                fVar.f116947j = wy0Var;
                fVar.loadData();
                break;
            default:
                Intrinsics.f(wy0Var);
                fVar.f116947j = wy0Var;
                m1 m1Var = fVar.f116946i;
                if (m1Var != null) {
                    fVar.f116946i = null;
                    fVar.u3(m1Var, true);
                    break;
                }
                break;
        }
    }

    public final void e(xj2.c cVar) {
        int i13 = this.f116932i;
        f fVar = this.f116933j;
        switch (i13) {
            case 0:
                ra1.a aVar = (ra1.a) fVar.getViewIfBound();
                if (aVar != null) {
                    ((ua1.d) aVar).V8(true);
                    break;
                }
                break;
            case 1:
            default:
                ((ua1.d) ((ra1.a) fVar.getView())).V8(true);
                break;
            case 2:
                ((ua1.d) ((ra1.a) fVar.getView())).V8(true);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116932i) {
            case 0:
                e((xj2.c) obj);
                break;
            case 1:
                b((wy0) obj);
                break;
            case 2:
                e((xj2.c) obj);
                break;
            case 3:
                e((xj2.c) obj);
                break;
            case 4:
                b((wy0) obj);
                break;
            default:
                ra1.a aVar = (ra1.a) this.f116933j.getView();
                Intrinsics.checkNotNullExpressionValue(aVar, "access$getView(...)");
                ((ua1.d) aVar).W8(null);
                break;
        }
        return Unit.f80348a;
    }
}
