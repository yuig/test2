package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class wg1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public dh1 f13027a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f13028b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh1 f13030d;

    /* renamed from: e, reason: collision with root package name */
    public int f13031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(dh1 dh1Var, bl2.c cVar) {
        super(cVar);
        this.f13030d = dh1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13029c = obj;
        this.f13031e |= Integer.MIN_VALUE;
        return this.f13030d.g(this);
    }
}
