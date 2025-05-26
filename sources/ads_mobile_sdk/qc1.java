package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qc1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public sc1 f10033a;

    /* renamed from: b, reason: collision with root package name */
    public ym0 f10034b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc1 f10036d;

    /* renamed from: e, reason: collision with root package name */
    public int f10037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc1(sc1 sc1Var, bl2.c cVar) {
        super(cVar);
        this.f10036d = sc1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10035c = obj;
        this.f10037e |= Integer.MIN_VALUE;
        return this.f10036d.a(null, null, this);
    }
}
