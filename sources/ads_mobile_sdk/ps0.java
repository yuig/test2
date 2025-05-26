package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ps0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ws0 f9791a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9792b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0 f9794d;

    /* renamed from: e, reason: collision with root package name */
    public int f9795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(ws0 ws0Var, bl2.c cVar) {
        super(cVar);
        this.f9794d = ws0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9793c = obj;
        this.f9795e |= Integer.MIN_VALUE;
        return this.f9794d.a(this);
    }
}
