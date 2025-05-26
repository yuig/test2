package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class zd1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ce1 f14719a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f14720b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce1 f14722d;

    /* renamed from: e, reason: collision with root package name */
    public int f14723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd1(ce1 ce1Var, bl2.c cVar) {
        super(cVar);
        this.f14722d = ce1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14721c = obj;
        this.f14723e |= Integer.MIN_VALUE;
        return ce1.a(this.f14722d, this);
    }
}
