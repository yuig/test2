package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class pk1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk1 f9721b;

    /* renamed from: c, reason: collision with root package name */
    public int f9722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk1(qk1 qk1Var, bl2.c cVar) {
        super(cVar);
        this.f9721b = qk1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9720a = obj;
        this.f9722c |= Integer.MIN_VALUE;
        return this.f9721b.a((a.ce) null, this);
    }
}
