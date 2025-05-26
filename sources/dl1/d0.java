package dl1;

import gk2.d1;
import jk2.i2;
import jk2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f55205j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f55206k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(q0 q0Var, m mVar, int i13) {
        super(1);
        this.f55204i = i13;
        this.f55205j = q0Var;
        this.f55206k = mVar;
    }

    public final void b(s model) {
        int i13 = this.f55204i;
        m mVar = this.f55206k;
        q0 q0Var = this.f55205j;
        switch (i13) {
            case 0:
                if (model != null) {
                    m o13 = q0Var.o(model);
                    Intrinsics.checkNotNullParameter(model, "model");
                    q0Var.f55278k.c(model);
                    if (q0Var.f55283p) {
                        q0Var.v(new s0(u0.CREATE, model, q0Var.f55280m.incrementAndGet()));
                    }
                    if (o13 != null) {
                        mVar = o13;
                    }
                    q0Var.F(mVar, model);
                    break;
                }
                break;
            case 1:
            default:
                Intrinsics.f(model);
                q0Var.H(mVar, model, true);
                break;
            case 2:
                Intrinsics.f(model);
                q0Var.H(mVar, model, true);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 1;
        int i14 = this.f55204i;
        m mVar = this.f55206k;
        q0 q0Var = this.f55205j;
        switch (i14) {
            case 0:
                b((s) obj);
                return Unit.f80348a;
            case 1:
                s updatedModelFromRemote = (s) obj;
                Intrinsics.checkNotNullParameter(updatedModelFromRemote, "updatedModelFromRemote");
                j1 j1Var = new j1(q0Var.p(mVar, true), new com.pinterest.framework.multisection.datasource.pagedlist.h(16, new e0(q0Var, updatedModelFromRemote, i13)), 0);
                ck2.i.b(updatedModelFromRemote, "defaultItem is null");
                return new d1(new jk2.g0(j1Var, updatedModelFromRemote), 3);
            case 2:
                b((s) obj);
                return Unit.f80348a;
            case 3:
                s remoteModel = (s) obj;
                Intrinsics.checkNotNullParameter(remoteModel, "remoteModel");
                return new i2(new j1(q0Var.p(mVar, true), new com.pinterest.framework.multisection.datasource.pagedlist.h(19, new e0(q0Var, remoteModel, 2)), 0), uj2.q.y(remoteModel), 0);
            default:
                b((s) obj);
                return Unit.f80348a;
        }
    }
}
