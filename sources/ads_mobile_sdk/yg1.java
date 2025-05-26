package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class yg1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f14239a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14240b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh1 f14242d;

    /* renamed from: e, reason: collision with root package name */
    public int f14243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg1(dh1 dh1Var, bl2.c cVar) {
        super(cVar);
        this.f14242d = dh1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14241c = obj;
        this.f14243e |= Integer.MIN_VALUE;
        return this.f14242d.e(this);
    }
}
