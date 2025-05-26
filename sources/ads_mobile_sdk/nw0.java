package ads_mobile_sdk;

import a.hb;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class nw0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jk0 f9014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi.b0 f9015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(String str, String str2, Object obj, bl2.c cVar, jk0 jk0Var, wi.b0 b0Var) {
        super(2, cVar);
        this.f9011b = str;
        this.f9012c = str2;
        this.f9013d = obj;
        this.f9014e = jk0Var;
        this.f9015f = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nw0(this.f9011b, this.f9012c, this.f9013d, cVar, this.f9014e, this.f9015f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nw0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9010a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f9011b, "] on listener [", this.f9012c, "]");
            hb hbVar = (hb) this.f9013d;
            jk0 jk0Var = this.f9014e;
            wi.b0 b0Var = this.f9015f;
            this.f9010a = 1;
            if (hbVar.a(jk0Var, b0Var, this) == aVar) {
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
