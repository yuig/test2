package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r70 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f10527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(bl2.c cVar, f80 f80Var, String str, String str2) {
        super(2, cVar);
        this.f10527a = f80Var;
        this.f10528b = str;
        this.f10529c = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r70(cVar, this.f10527a, this.f10528b, this.f10529c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r70) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        synchronized (this.f10527a) {
        }
        return Unit.f80348a;
    }
}
