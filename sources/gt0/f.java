package gt0;

import ao2.j0;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.d1;
import u50.r;
import xs0.w;
import xs0.x;

/* loaded from: classes5.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ nu.b f66093r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f30 f66094s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f66095t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f66096u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(nu.b bVar, f30 f30Var, r rVar, x xVar, bl2.c cVar) {
        super(2, cVar);
        this.f66093r = bVar;
        this.f66094s = f30Var;
        this.f66095t = xVar;
        this.f66096u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x xVar = this.f66095t;
        return new f(this.f66093r, this.f66094s, this.f66096u, xVar, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        nu.b bVar = this.f66093r;
        js0.a aVar2 = (js0.a) bVar.f92308c;
        Integer num = new Integer(((w) this.f66095t).f135844b.getValue());
        d1 d1Var = (d1) bVar.f92310e;
        f30 f30Var = this.f66094s;
        aVar2.mo120prepare(f30Var, num, d1Var.b(f30Var)).execute((ak2.e) new d(bVar, f30Var, 0), (ak2.e) new e(this.f66096u, 0));
        return Unit.f80348a;
    }
}
