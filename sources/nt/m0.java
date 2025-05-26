package nt;

import com.pinterest.api.model.n90;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f92095r;

    /* renamed from: s, reason: collision with root package name */
    public int f92096s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q0 f92097t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r0 f92098u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f92099v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f92100w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q0 q0Var, r0 r0Var, u50.r rVar, ao2.j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f92097t = q0Var;
        this.f92098u = r0Var;
        this.f92099v = rVar;
        this.f92100w = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f92097t, this.f92098u, this.f92099v, this.f92100w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long j13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92096s;
        q0 q0Var = this.f92097t;
        if (i13 == 0) {
            ue.c.H(obj);
            long currentTimeMillis = System.currentTimeMillis();
            r0 r0Var = this.f92098u;
            n90 n90Var = r0Var.f92158a;
            this.f92095r = currentTimeMillis;
            this.f92096s = 1;
            obj = q0.j(q0Var, n90Var, r0Var.f92160c, r0Var.f92159b, this);
            if (obj == aVar) {
                return aVar;
            }
            j13 = currentTimeMillis;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.f92095r;
            ue.c.H(obj);
        }
        Pair pair = (Pair) obj;
        f fVar = (f) pair.f80346a;
        b0 b0Var = new b0(fVar, (List) pair.f80347b, j13);
        u50.r rVar = this.f92099v;
        rVar.a(b0Var);
        q0Var.getClass();
        if (fVar.f92031c) {
            rVar.a(new f0());
        } else {
            kotlin.jvm.internal.j.z(this.f92100w, null, null, new i0(j13, rVar, null), 3);
        }
        return Unit.f80348a;
    }
}
