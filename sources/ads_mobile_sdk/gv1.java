package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class gv1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public hv1 f5712a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f5713b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv1 f5715d;

    /* renamed from: e, reason: collision with root package name */
    public int f5716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv1(hv1 hv1Var, bl2.c cVar) {
        super(cVar);
        this.f5715d = hv1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5714c = obj;
        this.f5716e |= Integer.MIN_VALUE;
        return this.f5715d.c(this);
    }
}
