package xs;

import ao2.j0;
import com.pinterest.api.model.b1;
import com.pinterest.api.model.g60;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135703r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f135704s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f135705t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f135706u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, d dVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f135704s = d0Var;
        this.f135705t = dVar;
        this.f135706u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f135704s, this.f135705t, this.f135706u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        g60 j03;
        String e13;
        g60 j04;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135703r;
        if (i13 == 0) {
            ue.c.H(obj);
            l80.c cVar = this.f135704s.f135708b;
            d dVar = this.f135705t;
            String F5 = ((a) dVar).f135696a.F5();
            if (F5 == null) {
                F5 = "";
            }
            String x33 = ((a) dVar).f135696a.x3();
            if (x33 == null) {
                x33 = "";
            }
            com.pinterest.api.model.g t33 = ((a) dVar).f135696a.t3();
            if (t33 == null || (j04 = t33.j0()) == null || (str = j04.f()) == null) {
                str = "";
            }
            com.pinterest.api.model.g t34 = ((a) dVar).f135696a.t3();
            String str2 = (t34 == null || (j03 = t34.j0()) == null || (e13 = j03.e()) == null) ? "" : e13;
            this.f135703r = 1;
            obj = cVar.a(F5, x33, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        l80.f fVar = (l80.f) obj;
        boolean z13 = fVar instanceof l80.e;
        u50.r rVar = this.f135706u;
        if (z13) {
            b1 b1Var = ((l80.e) fVar).f82112a;
            List i14 = b1Var.i();
            if (i14 == null || i14.isEmpty()) {
                rVar.a(new r(b1Var));
            } else {
                rVar.a(new t(System.currentTimeMillis() * 1000000, b1Var));
            }
        } else if (fVar instanceof l80.d) {
            l80.d dVar2 = (l80.d) fVar;
            rVar.a(new s(dVar2.f82110a, dVar2.f82111b));
        }
        return Unit.f80348a;
    }
}
