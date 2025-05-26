package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class f31 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f5029a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g31 f5031c;

    /* renamed from: d, reason: collision with root package name */
    public int f5032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(g31 g31Var, bl2.c cVar) {
        super(cVar);
        this.f5031c = g31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5030b = obj;
        this.f5032d |= Integer.MIN_VALUE;
        return g31.b(this.f5031c, (String) null, this);
    }
}
