package z01;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import x02.i2;
import xk2.q;
import xk2.s;
import y01.l0;

/* loaded from: classes5.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public r f140526r;

    /* renamed from: s, reason: collision with root package name */
    public int f140527s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f140528t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ nu.b f140529u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y01.a f140530v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f140531w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f140532x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nu.b bVar, y01.a aVar, r rVar, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f140529u = bVar;
        this.f140530v = aVar;
        this.f140531w = rVar;
        this.f140532x = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f140529u, this.f140530v, this.f140531w, this.f140532x, cVar);
        aVar.f140528t = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        xk2.r rVar;
        y01.a aVar;
        r rVar2;
        f3 z33;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140527s;
        nu.b bVar = this.f140529u;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                aVar = this.f140530v;
                r rVar3 = this.f140531w;
                q qVar = s.f135225b;
                uj2.q P = ((i2) bVar.f92307b).P(aVar.f136381a);
                this.f140528t = aVar;
                this.f140526r = rVar3;
                this.f140527s = 1;
                Object q13 = kh2.j.q(P, this);
                if (q13 == aVar2) {
                    return aVar2;
                }
                rVar2 = rVar3;
                obj = q13;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar2 = this.f140526r;
                aVar = (y01.a) this.f140528t;
                ue.c.H(obj);
            }
            f30 f30Var = (f30) obj;
            String apdId = aVar.f136382b;
            Intrinsics.checkNotNullParameter(apdId, "apdId");
            String id3 = (f30Var == 0 || (z33 = f30Var.z3()) == null) ? null : z33.getId();
            if (id3 != null) {
                apdId = id3;
            }
            rVar2.a(new l0(apdId));
            q qVar2 = s.f135225b;
            rVar = f30Var;
        } catch (Throwable th3) {
            q qVar3 = s.f135225b;
            rVar = ue.c.m(th3);
        }
        if (!(rVar instanceof xk2.r)) {
            f30 f30Var2 = (f30) rVar;
            bVar.getClass();
            if (f30Var2 != null && com.bumptech.glide.c.f1(f30Var2)) {
                ko2.f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(this.f140532x, ho2.q.f69782a, null, new b(f30Var2, bVar, null), 2);
            }
        }
        s.a(rVar);
        return Unit.f80348a;
    }
}
