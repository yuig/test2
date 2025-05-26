package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class nw1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public rw1 f9016a;

    /* renamed from: b, reason: collision with root package name */
    public hk0 f9017b;

    /* renamed from: c, reason: collision with root package name */
    public mo2.a f9018c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw1 f9020e;

    /* renamed from: f, reason: collision with root package name */
    public int f9021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(rw1 rw1Var, bl2.c cVar) {
        super(cVar);
        this.f9020e = rw1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9019d = obj;
        this.f9021f |= Integer.MIN_VALUE;
        return rw1.a(this.f9020e, this);
    }
}
