package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24816r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j1.d f24817s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f24818t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j1.n f24819u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(j1.d dVar, boolean z13, j1.n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f24817s = dVar;
        this.f24818t = z13;
        this.f24819u = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h4(this.f24817s, this.f24818t, this.f24819u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24816r;
        if (i13 == 0) {
            ue.c.H(obj);
            Float f13 = new Float(this.f24818t ? 1.0f : 0.8f);
            this.f24816r = 1;
            if (j1.d.c(this.f24817s, f13, this.f24819u, this) == aVar) {
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
