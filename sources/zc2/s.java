package zc2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f141643r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f141644s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f141644s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s sVar = new s(this.f141644s, cVar);
        sVar.f141643r = ((Number) obj).longValue();
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create(Long.valueOf(((Number) obj).longValue()), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        kh2.j.x2(this.f141644s, new h(new Long(this.f141643r)));
        return Unit.f80348a;
    }
}
