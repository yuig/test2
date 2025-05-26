package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class fc1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5101c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc1(String str, String str2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f5100b = str;
        this.f5101c = str2;
        this.f5102d = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new fc1(this.f5100b, this.f5101c, this.f5102d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fc1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5099a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f5100b, "] on listener [", this.f5101c, "]");
            a.g6 g6Var = (a.g6) this.f5102d;
            this.f5099a = 1;
            if (g6Var.h(this) == aVar) {
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
