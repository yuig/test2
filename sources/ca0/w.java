package ca0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27168r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f27169s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f27169s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w wVar = new w(this.f27169s, cVar);
        wVar.f27168r = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((d) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d dVar = (d) this.f27168r;
        z zVar = this.f27169s;
        zVar.f27184g0.setValue(dVar);
        zVar.f27185h0 = dVar.f27093l;
        return Unit.f80348a;
    }
}
