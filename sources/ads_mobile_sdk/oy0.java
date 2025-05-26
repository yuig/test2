package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class oy0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public sy0 f9485a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9486b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sy0 f9488d;

    /* renamed from: e, reason: collision with root package name */
    public int f9489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(sy0 sy0Var, bl2.c cVar) {
        super(cVar);
        this.f9488d = sy0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9487c = obj;
        this.f9489e |= Integer.MIN_VALUE;
        return this.f9488d.c(this);
    }
}
