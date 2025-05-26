package yc;

import kotlin.Unit;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f138637r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f138638s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f138639t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pc.f f138640u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pc.v f138641v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, pc.f fVar, pc.v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f138639t = lVar;
        this.f138640u = fVar;
        this.f138641v = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f138639t, this.f138640u, this.f138641v, cVar);
        kVar.f138638s = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((pc.h) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f138637r;
        if (i13 == 0) {
            ue.c.H(obj);
            pc.h hVar = (pc.h) this.f138638s;
            this.f138637r = 1;
            if (this.f138639t.c(this.f138640u, hVar, this.f138641v, s0.f80394a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
