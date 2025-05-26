package lt;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes3.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f84745r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f84746s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f84747t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, h hVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f84745r = gVar;
        this.f84746s = hVar;
        this.f84747t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f84745r, this.f84746s, this.f84747t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        String str = this.f84746s.f84749a;
        this.f84745r.getClass();
        return Unit.f80348a;
    }
}
