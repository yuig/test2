package z80;

import ao2.j0;
import com.pinterest.api.model.ci0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import r72.t1;
import s80.c1;
import s80.j5;
import s80.k5;
import x02.i2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141079r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f141080s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k5 f141081t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f141082u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, k5 k5Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141080s = qVar;
        this.f141081t = k5Var;
        this.f141082u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f141080s, this.f141081t, this.f141082u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        fi0 r63;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141079r;
        fi0 fi0Var = null;
        u50.r rVar = this.f141082u;
        if (i13 == 0) {
            ue.c.H(obj);
            i2 i2Var = this.f141080s.f141084b;
            String modelId = ((j5) this.f141081t).f111630a;
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            Intrinsics.checkNotNullParameter(modelId, "modelId");
            do2.j0 j0Var = new do2.j0(kotlin.jvm.internal.j.a(i2Var.L(modelId)), new n(1, rVar, null));
            this.f141079r = 1;
            obj = l0.h0(j0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        f30 f30Var = (f30) obj;
        if (f30Var != null && (r63 = f30Var.r6()) != null) {
            Intrinsics.checkNotNullParameter(r63, "<this>");
            Boolean L = r63.L();
            Intrinsics.checkNotNullExpressionValue(L, "getIsRemixable(...)");
            if (L.booleanValue()) {
                ci0 ci0Var = new ci0(0);
                int i14 = t1.f106663a;
                ci0Var.u("-1");
                Boolean bool = Boolean.TRUE;
                ci0Var.i(bool);
                ci0Var.j(bool);
                ci0Var.m(bool);
                ci0Var.n(r63.M());
                ci0Var.e(r63.G());
                ci0Var.p(r63);
                fi0Var = ci0Var.a();
            }
            if (fi0Var != null) {
                rVar.a(new c1(fi0Var));
            }
        }
        return Unit.f80348a;
    }
}
