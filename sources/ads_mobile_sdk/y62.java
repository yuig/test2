package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class y62 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public c72 f14109a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f14110b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c72 f14112d;

    /* renamed from: e, reason: collision with root package name */
    public int f14113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y62(c72 c72Var, bl2.c cVar) {
        super(cVar);
        this.f14112d = c72Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14111c = obj;
        this.f14113e |= Integer.MIN_VALUE;
        return this.f14112d.c(this);
    }
}
