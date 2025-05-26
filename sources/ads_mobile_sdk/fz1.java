package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class fz1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public h02 f5336a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f5337b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02 f5339d;

    /* renamed from: e, reason: collision with root package name */
    public int f5340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz1(h02 h02Var, bl2.c cVar) {
        super(cVar);
        this.f5339d = h02Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5338c = obj;
        this.f5340e |= Integer.MIN_VALUE;
        return this.f5339d.e(this);
    }
}
