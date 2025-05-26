package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ys0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zs0 f14382a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f14383b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs0 f14385d;

    /* renamed from: e, reason: collision with root package name */
    public int f14386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(zs0 zs0Var, bl2.c cVar) {
        super(cVar);
        this.f14385d = zs0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14384c = obj;
        this.f14386e |= Integer.MIN_VALUE;
        return zs0.a(this.f14385d, this);
    }
}
