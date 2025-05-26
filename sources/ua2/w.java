package ua2;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121619i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f121620j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i13) {
        super(1);
        this.f121619i = i13;
        this.f121620j = xVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f121619i;
        x xVar = this.f121620j;
        switch (i13) {
            case 1:
                xVar.F(false);
                xVar.f121630s = true;
                xVar.f121623l.i(((yk1.a) xVar.f121624m).f139224a.getString(m60.x0.generic_error));
                break;
            default:
                xVar.F(true);
                xVar.f121630s = true;
                xVar.f121623l.i(((yk1.a) xVar.f121624m).f139224a.getString(m60.x0.generic_error));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x xVar = this.f121620j;
        int i13 = this.f121619i;
        switch (i13) {
            case 0:
                f30 f30Var = (f30) obj;
                switch (i13) {
                    case 0:
                        xVar.f121630s = true;
                        Intrinsics.f(f30Var);
                        xVar.f121621j.W(f30Var);
                        break;
                    default:
                        xVar.f121630s = true;
                        Intrinsics.f(f30Var);
                        xVar.f121621j.W(f30Var);
                        break;
                }
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                f30 f30Var2 = (f30) obj;
                switch (i13) {
                    case 0:
                        xVar.f121630s = true;
                        Intrinsics.f(f30Var2);
                        xVar.f121621j.W(f30Var2);
                        break;
                    default:
                        xVar.f121630s = true;
                        Intrinsics.f(f30Var2);
                        xVar.f121621j.W(f30Var2);
                        break;
                }
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
