package fj0;

import ao2.j0;
import cj0.i0;
import cj0.o0;
import cj0.u;
import com.pinterest.api.model.v7;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import u50.r;
import ve.h;
import vs.w;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62233r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f62234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f62235t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f62236u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, u uVar, r rVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62234s = cVar;
        this.f62235t = uVar;
        this.f62236u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f62234s, this.f62235t, this.f62236u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62233r;
        r rVar = this.f62236u;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j0 j0Var = new do2.j0(h.z(this.f62234s.f62237a, ((o0) this.f62235t).f27854a), new w(2, rVar, null));
            this.f62233r = 1;
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
        v7 v7Var = (v7) obj;
        if (v7Var != null) {
            rVar.a(new i0(v7Var));
        }
        return Unit.f80348a;
    }
}
