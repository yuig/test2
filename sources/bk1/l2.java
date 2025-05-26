package bk1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.vq0;
import java.util.Map;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m2 f23259r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i1 f23260s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, i1 i1Var, bl2.c cVar) {
        super(2, cVar);
        this.f23259r = m2Var;
        this.f23260s = i1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l2(this.f23259r, this.f23260s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f30 f30Var = ((g1) this.f23260s).f23228a;
        m2 m2Var = this.f23259r;
        m2Var.getClass();
        pq0 D = n3.D(f30Var);
        if (D != null) {
            String C = a.a.C(f30Var.getId(), "-0");
            vq0 g13 = D.g();
            Map c13 = g13 != null ? g13.c() : null;
            bc2.l z03 = df.j1.z0(f30Var);
            bc2.m mVar = bc2.m.PIN_CLOSEUP;
            bc2.q r03 = dl2.b.r0(C, c13, true, false, 0, z03, m2Var.f23270b, mVar);
            if (r03 != null) {
                m2Var.f23269a.x(a.a.C(f30Var.getId(), "-0"), r03, mVar, true);
            }
        }
        return Unit.f80348a;
    }
}
