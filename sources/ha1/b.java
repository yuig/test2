package ha1;

import ao2.j0;
import da1.c;
import dl2.j;
import e82.f;
import e82.w;
import et1.t0;
import ga1.u;
import kk2.g;
import kk2.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import u50.r;
import uj2.b0;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f68392r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f68393s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f68394t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, u uVar, r rVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f68392r = cVar;
        this.f68393s = uVar;
        this.f68394t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f68392r, this.f68393s, this.f68394t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c cVar = this.f68392r;
        xj2.b bVar = (xj2.b) cVar.f54231d;
        f fVar = (f) cVar.f54230c;
        u uVar = this.f68393s;
        w network = uVar.f64654a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(network, "network");
        String apiParam = network.getApiParam();
        Intrinsics.checkNotNullExpressionValue(apiParam, "getApiParam(...)");
        b0<vd0.c> a13 = fVar.f57831a.a(apiParam, null);
        b22.f fVar2 = new b22.f(16, new t0(uVar.f64655b, uVar.f64656c, fVar, network, 1));
        a13.getClass();
        g gVar = new g(pk2.f.k(new m(a13, fVar2, 0).r(e.f118017c), "observeOn(...)"), new fa1.c(17, new y71.b(18, cVar, uVar)), 3);
        r rVar = this.f68394t;
        bVar.a(gVar.o(new fa1.c(18, new rx0.f(cVar, uVar, rVar, 22)), new fa1.c(19, new fa1.g(rVar, 8))));
        return Unit.f80348a;
    }
}
