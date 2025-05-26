package wt1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f131113r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f131114s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ yk1.n f131115t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f131116u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yk1.n nVar, d dVar, e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f131114s = eVar;
        this.f131115t = nVar;
        this.f131116u = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g gVar = new g(this.f131115t, this.f131116u, this.f131114s, cVar);
        gVar.f131113r = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((u50.o) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u50.o itemDisplayState = (u50.o) this.f131113r;
        e eVar = this.f131114s;
        if (!Intrinsics.d(eVar.f131101e, itemDisplayState)) {
            u50.r eventIntake = this.f131116u.c();
            Intrinsics.checkNotNullParameter(itemDisplayState, "itemDisplayState");
            yk1.n view = this.f131115t;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
            eVar.f131102f.h(itemDisplayState, view, eventIntake);
            eVar.f131101e = null;
        }
        return Unit.f80348a;
    }
}
