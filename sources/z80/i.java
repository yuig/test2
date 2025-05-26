package z80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f141058r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f141059s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141059s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f141059s, cVar);
        iVar.f141058r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((l62.a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f141059s.a(new s80.t((l62.a) this.f141058r));
        return Unit.f80348a;
    }
}
