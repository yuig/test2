package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class sy2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy2(String str, String str2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f11287b = str;
        this.f11288c = str2;
        this.f11289d = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new sy2(this.f11287b, this.f11288c, this.f11289d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sy2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11286a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f11287b, "] on listener [", this.f11288c, "]");
            a.qe qeVar = (a.qe) this.f11289d;
            this.f11286a = 1;
            if (qeVar.a(false, this) == aVar) {
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
