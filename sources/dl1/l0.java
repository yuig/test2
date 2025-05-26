package dl1;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55249i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f55250j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(q0 q0Var, int i13) {
        super(1);
        this.f55249i = i13;
        this.f55250j = q0Var;
    }

    public final Boolean b(s it) {
        int i13 = this.f55249i;
        q0 q0Var = this.f55250j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(q0Var.f55272e.a(it));
    }

    public final Boolean e(Pair it) {
        int i13 = this.f55249i;
        q0 q0Var = this.f55250j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(q0Var.f55272e.a((s) it.f80347b));
            case 4:
                Intrinsics.checkNotNullParameter(it, "<name for destructuring parameter 0>");
                return Boolean.valueOf(q0Var.f55270c.b((m) it.f80346a, a.WRITE));
            default:
                Intrinsics.checkNotNullParameter(it, "<name for destructuring parameter 0>");
                return Boolean.valueOf(q0Var.f55270c.a((m) it.f80346a, a.WRITE));
        }
    }

    public final Pair f(Pair pair) {
        int i13 = this.f55249i;
        q0 q0Var = this.f55250j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(pair, "pair");
                m mVar = (m) pair.f80346a;
                s sVar = (s) pair.f80347b;
                z zVar = q0Var.f55270c;
                a aVar = a.WRITE;
                if (zVar.b(mVar, aVar) || q0Var.f55270c.a(mVar, aVar)) {
                    q0Var.h(mVar, sVar);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(pair, "pair");
                q0Var.f55274g.a((m) pair.f80346a, (s) pair.f80347b);
                break;
        }
        return pair;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f55249i) {
            case 0:
                return b((s) obj);
            case 1:
                return e((Pair) obj);
            case 2:
                return b((s) obj);
            case 3:
                return f((Pair) obj);
            case 4:
                return e((Pair) obj);
            case 5:
                return f((Pair) obj);
            default:
                return e((Pair) obj);
        }
    }
}
