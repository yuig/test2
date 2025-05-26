package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class f41 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public String f5035a;

    /* renamed from: b, reason: collision with root package name */
    public ao2.v f5036b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g41 f5038d;

    /* renamed from: e, reason: collision with root package name */
    public int f5039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f41(g41 g41Var, bl2.c cVar) {
        super(cVar);
        this.f5038d = g41Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5037c = obj;
        this.f5039e |= Integer.MIN_VALUE;
        return g41.a(this.f5038d, (String) null, (ao2.v) null, this);
    }
}
