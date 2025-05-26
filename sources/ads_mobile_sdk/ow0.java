package ads_mobile_sdk;

import a.hb;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ow0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9464c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cf2 f9466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0 f9467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi.b0 f9468g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(String str, String str2, Object obj, bl2.c cVar, cf2 cf2Var, r0 r0Var, wi.b0 b0Var) {
        super(2, cVar);
        this.f9463b = str;
        this.f9464c = str2;
        this.f9465d = obj;
        this.f9466e = cf2Var;
        this.f9467f = r0Var;
        this.f9468g = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ow0(this.f9463b, this.f9464c, this.f9465d, cVar, this.f9466e, this.f9467f, this.f9468g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ow0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9462a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f9463b, "] on listener [", this.f9464c, "]");
            hb hbVar = (hb) this.f9465d;
            cf2 cf2Var = this.f9466e;
            r0 r0Var = this.f9467f;
            wi.b0 b0Var = this.f9468g;
            this.f9462a = 1;
            if (hbVar.a(cf2Var, r0Var, b0Var, this) == aVar) {
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
