package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class or1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f9415a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9416b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr1 f9418d;

    /* renamed from: e, reason: collision with root package name */
    public int f9419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or1(tr1 tr1Var, bl2.c cVar) {
        super(cVar);
        this.f9418d = tr1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9417c = obj;
        this.f9419e |= Integer.MIN_VALUE;
        return tr1.a(this.f9418d, this);
    }
}
