package p70;

import ao2.j0;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import u60.g;
import x02.c2;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f99062r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f30 f99063s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c2 f99064t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f99065u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, f30 f30Var, c2 c2Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f99062r = eVar;
        this.f99063s = f30Var;
        this.f99064t = c2Var;
        this.f99065u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f99062r, this.f99063s, this.f99064t, this.f99065u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        com.pinterest.feature.pin.j jVar = (com.pinterest.feature.pin.j) this.f99062r.f99072b;
        r rVar = this.f99065u;
        f30 f30Var = this.f99063s;
        jVar.a(f30Var, this.f99064t, new g(22, new hs.a(29, rVar, f30Var)), new g(23, new a(rVar, 0)));
        return Unit.f80348a;
    }
}
