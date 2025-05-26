package t1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import q3.x;

/* loaded from: classes2.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f115755r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f115756s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f115757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f115758u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function0 f115759v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, x xVar, Function0 function0, Function0 function02, bl2.c cVar) {
        super(2, cVar);
        this.f115756s = kVar;
        this.f115757t = xVar;
        this.f115758u = function0;
        this.f115759v = function02;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f115756s, this.f115757t, this.f115758u, this.f115759v, cVar);
        jVar.f115755r = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f115755r;
        k kVar = this.f115756s;
        kotlin.jvm.internal.j.z(j0Var, null, null, new h(kVar, this.f115757t, this.f115758u, null), 3);
        return kotlin.jvm.internal.j.z(j0Var, null, null, new i(kVar, this.f115759v, null), 3);
    }
}
