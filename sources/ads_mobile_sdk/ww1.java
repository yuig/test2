package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ww1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zw1 f13281a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f13282b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13283c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1 f13284d;

    /* renamed from: e, reason: collision with root package name */
    public int f13285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww1(zw1 zw1Var, bl2.c cVar) {
        super(cVar);
        this.f13284d = zw1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13283c = obj;
        this.f13285e |= Integer.MIN_VALUE;
        return zw1.a(this.f13284d, this);
    }
}
