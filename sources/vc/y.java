package vc;

import a.cb;
import do2.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import pc.t0;

/* loaded from: classes3.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public j0 f125586r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f125587s;

    /* renamed from: t, reason: collision with root package name */
    public int f125588t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f125589u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ oc.a f125590v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f125591w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f125592x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(oc.a aVar, boolean z13, boolean z14, bl2.c cVar) {
        super(2, cVar);
        this.f125590v = aVar;
        this.f125591w = z13;
        this.f125592x = z14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y yVar = new y(this.f125590v, this.f125591w, this.f125592x, cVar);
        yVar.f125589u = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        do2.j jVar;
        j0 j0Var;
        j0 j0Var2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f125588t;
        oc.a aVar2 = this.f125590v;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            jVar = (do2.j) this.f125589u;
            j0Var = new j0();
            j0Var2 = new j0();
            do2.j0 j0Var3 = new do2.j0(aVar2.d(), new t(this.f125591w, null));
            v vVar = new v(j0Var2, j0Var, jVar);
            this.f125589u = jVar;
            this.f125586r = j0Var;
            this.f125587s = j0Var2;
            this.f125588t = 1;
            if (j0Var3.collect(vVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            j0Var2 = this.f125587s;
            j0Var = this.f125586r;
            jVar = (do2.j) this.f125589u;
            ue.c.H(obj);
        }
        oc.a c13 = aVar2.c();
        cb.w(aVar2.f93985c.a(z.f125593b));
        m interceptor = r.f125565a;
        Intrinsics.checkNotNullParameter(c13, "<this>");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        c13.b(new g(interceptor));
        pc.h hVar = (pc.h) j0Var2.f80434a;
        t0 t0Var = hVar != null ? (t0) hVar.f99563c : null;
        w retryWhen = new w(this.f125592x, null);
        Intrinsics.checkNotNullParameter(c13, "<this>");
        Intrinsics.checkNotNullParameter(retryWhen, "retryWhen");
        oc.a c14 = c13.c();
        c14.b(new b0(t0Var, retryWhen));
        h0 h0Var = new h0(new x(j0Var, null), c14.d());
        wb.b bVar = new wb.b(jVar, i14);
        this.f125589u = null;
        this.f125586r = null;
        this.f125587s = null;
        this.f125588t = 2;
        if (h0Var.collect(bVar, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
