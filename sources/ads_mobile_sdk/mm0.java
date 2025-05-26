package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mm0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym0 f8289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm0(ym0 ym0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f8289a = ym0Var;
        this.f8290b = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mm0(this.f8289a, this.f8290b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mm0(this.f8289a, this.f8290b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f8289a.evaluateJavascript(this.f8290b, null);
        return Unit.f80348a;
    }
}
