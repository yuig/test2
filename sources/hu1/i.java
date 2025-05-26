package hu1;

import ao2.j0;
import do2.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import vs.w;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f70421r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f70422s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f70423t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f70424u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, k kVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f70422s = jVar;
        this.f70423t = kVar;
        this.f70424u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f70422s, this.f70423t, this.f70424u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f70421r;
        if (i13 == 0) {
            ue.c.H(obj);
            r rVar = this.f70424u;
            do2.j0 j0Var = new do2.j0(new h0(new h(2, null), ve.h.z(this.f70422s.f70426b, this.f70423t.f70427a)), new w(6, rVar, null));
            da0.b bVar = new da0.b(rVar, 5);
            this.f70421r = 1;
            if (j0Var.collect(bVar, this) == aVar) {
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
