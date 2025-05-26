package z80;

import ao2.j0;
import com.pinterest.api.model.fi0;
import do2.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import s80.c1;
import s80.i5;
import s80.k5;
import x02.b1;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141075r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f141076s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k5 f141077t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f141078u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, k5 k5Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141076s = qVar;
        this.f141077t = k5Var;
        this.f141078u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f141076s, this.f141077t, this.f141078u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141075r;
        u50.r rVar = this.f141078u;
        if (i13 == 0) {
            ue.c.H(obj);
            q qVar = this.f141076s;
            b1 b1Var = qVar.f141083a;
            k5 k5Var = this.f141077t;
            String modelId = ((i5) k5Var).f111590a;
            Intrinsics.checkNotNullParameter(b1Var, "<this>");
            Intrinsics.checkNotNullParameter(modelId, "modelId");
            do2.j0 j0Var = new do2.j0(new f0(kotlin.jvm.internal.j.a(b1Var.L(modelId)), new c2.r(qVar, k5Var, null, 2)), new n(0, rVar, null));
            this.f141075r = 1;
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
        fi0 fi0Var = (fi0) obj;
        if (fi0Var != null) {
            rVar.a(new c1(fi0Var));
        }
        return Unit.f80348a;
    }
}
