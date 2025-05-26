package p91;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99327i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f99328j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f99329k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, wy0 wy0Var, int i13) {
        super(1);
        this.f99327i = i13;
        this.f99328j = wVar;
        this.f99329k = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f99327i) {
            case 0:
                String typedPasscode = (String) obj;
                Intrinsics.checkNotNullParameter(typedPasscode, "typedPasscode");
                w.F3(this.f99328j, this.f99329k, true, typedPasscode, false, 8);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                boolean c13 = r91.b.c(th3);
                int i13 = 0;
                wy0 wy0Var = this.f99329k;
                w wVar = this.f99328j;
                if (c13 && wVar.isBound()) {
                    ((q91.u) ((l91.i) wVar.getView())).y6(new u(wVar, wy0Var, i13));
                } else if (r91.b.d(th3) && wVar.isBound()) {
                    ((q91.u) ((l91.i) wVar.getView())).z3(new v(0, wVar, wy0Var));
                } else {
                    w.t3(wVar, th3);
                }
                break;
        }
        return Unit.f80348a;
    }
}
