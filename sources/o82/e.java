package o82;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93562r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f93563s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f93564t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2 f93565u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, u50.r rVar, d2 d2Var, bl2.c cVar) {
        super(2, cVar);
        this.f93563s = hVar;
        this.f93564t = rVar;
        this.f93565u = d2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f93563s, this.f93564t, this.f93565u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93562r;
        if (i13 == 0) {
            ue.c.H(obj);
            Object obj2 = ((v1) this.f93565u).f93733a;
            this.f93562r = 1;
            if (h.j(this.f93564t, this.f93563s, obj2, this) == aVar) {
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
