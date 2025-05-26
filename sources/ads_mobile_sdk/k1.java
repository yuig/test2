package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(String str, String str2, Object obj, bl2.c cVar, String str3, String str4) {
        super(2, cVar);
        this.f7038b = str;
        this.f7039c = str2;
        this.f7040d = obj;
        this.f7041e = str3;
        this.f7042f = str4;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k1(this.f7038b, this.f7039c, this.f7040d, cVar, this.f7041e, this.f7042f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7037a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f7038b, "] on listener [", this.f7039c, "]");
            a.q6 q6Var = (a.q6) this.f7040d;
            String str = this.f7041e;
            String str2 = this.f7042f;
            this.f7037a = 1;
            if (q6Var.a(str, str2, this) == aVar) {
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
