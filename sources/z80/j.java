package z80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f141060r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f141061s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141061s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f141061s, cVar);
        jVar.f141060r = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((h62.l) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h62.l lVar = (h62.l) this.f141060r;
        this.f141061s.a(new s80.s(lVar.f67848a > 0, lVar.f67849b > 0));
        return Unit.f80348a;
    }
}
