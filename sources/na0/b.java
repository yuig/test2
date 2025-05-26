package na0;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import dl2.j;
import ha2.a0;
import ha2.x;
import ha2.z;
import java.util.ArrayList;
import java.util.Set;
import jc0.v;
import ka0.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import la0.m0;
import la0.n0;
import la0.o0;
import la0.t1;
import la0.u1;
import lp.k;
import sv.y;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f90084r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0 f90085s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f90086t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f90087u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o0 o0Var, c cVar, r rVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f90085s = o0Var;
        this.f90086t = cVar;
        this.f90087u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f90085s, this.f90086t, this.f90087u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object q13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90084r;
        o0 o0Var = this.f90085s;
        c cVar = this.f90086t;
        if (i13 == 0) {
            ue.c.H(obj);
            if (o0Var instanceof n0) {
                Set options = ((n0) o0Var).f82439a;
                y actionHandler = new y(this.f90087u, o0Var, cVar, 12);
                Set set = u1.f82470a;
                Intrinsics.checkNotNullParameter(options, "options");
                Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                x xVar = new x(b0.collages_retrieval_sheet_title, null, null, null, null, 30);
                Set<t1> set2 = options;
                ArrayList arrayList = new ArrayList(g0.q(set2, 10));
                for (t1 t1Var : set2) {
                    arrayList.add(new a0(t1Var.getTitleResId(), t1Var.ordinal(), null, null, null, null, null, null, null, 1020));
                }
                cVar.f90088a.d(new v(new k(new ha2.a(e0.b(new z(xVar, arrayList, actionHandler)), false, (Integer) null, 14)), false, 0L, 30));
            } else if (o0Var instanceof m0) {
                o12.a aVar2 = cVar.f90089b;
                String str = ((m0) o0Var).f82427b;
                this.f90084r = 1;
                q13 = aVar2.q(str, this);
                if (q13 == aVar) {
                    return aVar;
                }
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ue.c.H(obj);
        q13 = obj;
        NetworkResponse networkResponse = (NetworkResponse) q13;
        if (networkResponse instanceof xz.b) {
            i0 i0Var = ((m0) o0Var).f82426a;
            if (i0Var != null) {
                cVar.f90088a.d(new ma0.a(i0Var));
            }
        } else if (!(networkResponse instanceof xz.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f80348a;
    }
}
