package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class df1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ff1 f4261a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f4262b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff1 f4264d;

    /* renamed from: e, reason: collision with root package name */
    public int f4265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df1(ff1 ff1Var, bl2.c cVar) {
        super(cVar);
        this.f4264d = ff1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4263c = obj;
        this.f4265e |= Integer.MIN_VALUE;
        return this.f4264d.a(this);
    }
}
