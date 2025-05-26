package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class im0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public String f6488a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f6490c;

    /* renamed from: d, reason: collision with root package name */
    public int f6491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im0(ym0 ym0Var, bl2.c cVar) {
        super(cVar);
        this.f6490c = ym0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6489b = obj;
        this.f6491d |= Integer.MIN_VALUE;
        return this.f6490c.b(null, null, null, this);
    }
}
