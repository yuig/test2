package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class dd1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public kd1 f4233a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f4234b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4235c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kd1 f4237e;

    /* renamed from: f, reason: collision with root package name */
    public int f4238f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd1(kd1 kd1Var, bl2.c cVar) {
        super(cVar);
        this.f4237e = kd1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4236d = obj;
        this.f4238f |= Integer.MIN_VALUE;
        return kd1.a(this.f4237e, false, (bl2.c) this);
    }
}
