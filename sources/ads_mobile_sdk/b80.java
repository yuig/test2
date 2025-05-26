package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b80 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f2770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(bl2.c cVar, f80 f80Var, String str, String str2) {
        super(2, cVar);
        this.f2770a = f80Var;
        this.f2771b = str;
        this.f2772c = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b80(cVar, this.f2770a, this.f2771b, this.f2772c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b80) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        synchronized (this.f2770a) {
        }
        return Unit.f80348a;
    }
}
