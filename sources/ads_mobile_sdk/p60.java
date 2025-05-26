package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class p60 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public t60 f9564a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t60 f9566c;

    /* renamed from: d, reason: collision with root package name */
    public int f9567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(t60 t60Var, bl2.c cVar) {
        super(cVar);
        this.f9566c = t60Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9565b = obj;
        this.f9567d |= Integer.MIN_VALUE;
        return this.f9566c.a(false, null, null, false, this);
    }
}
