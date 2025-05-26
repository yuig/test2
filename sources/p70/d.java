package p70;

import ao2.j0;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n70.d0;
import n70.e0;
import nx.d1;
import u50.r;
import u60.g;
import x02.b2;
import x02.i2;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f99068r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f99069s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f99070t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d0 d0Var, e eVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f99068r = d0Var;
        this.f99069s = eVar;
        this.f99070t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f99068r, this.f99069s, this.f99070t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f30 f30Var = ((e0) this.f99068r).f89607a;
        e eVar = this.f99069s;
        String b13 = ((d1) eVar.f99073c).b(f30Var);
        String id3 = f30Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.b m13 = ((i2) eVar.f99074d).m(new b2(id3, b13), f30Var);
        r rVar = this.f99070t;
        m13.i(new c(rVar, 0), new g(24, new a(rVar, 1)));
        return Unit.f80348a;
    }
}
