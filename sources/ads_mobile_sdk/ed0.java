package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ed0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public fd0 f4812a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f4813b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fd0 f4815d;

    /* renamed from: e, reason: collision with root package name */
    public int f4816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(fd0 fd0Var, bl2.c cVar) {
        super(cVar);
        this.f4815d = fd0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4814c = obj;
        this.f4816e |= Integer.MIN_VALUE;
        return fd0.a(this.f4815d, this);
    }
}
