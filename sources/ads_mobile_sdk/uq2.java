package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class uq2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wi.c0 f12158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq2(wi.c0 c0Var, bl2.c cVar, boolean z13) {
        super(2, cVar);
        this.f12158a = c0Var;
        this.f12159b = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new uq2(this.f12158a, cVar, this.f12159b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new uq2(this.f12158a, (bl2.c) obj2, this.f12159b).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f12158a.onVideoMute(this.f12159b);
        return Unit.f80348a;
    }
}
