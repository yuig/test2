package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class vs0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ws0 f12622a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f12623b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0 f12625d;

    /* renamed from: e, reason: collision with root package name */
    public int f12626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(ws0 ws0Var, bl2.c cVar) {
        super(cVar);
        this.f12625d = ws0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12624c = obj;
        this.f12626e |= Integer.MIN_VALUE;
        return this.f12625d.d(this);
    }
}
