package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qr2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rr2 f10237b;

    /* renamed from: c, reason: collision with root package name */
    public int f10238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(rr2 rr2Var, bl2.c cVar) {
        super(cVar);
        this.f10237b = rr2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10236a = obj;
        this.f10238c |= Integer.MIN_VALUE;
        return rr2.a(this.f10237b, false, this);
    }
}
