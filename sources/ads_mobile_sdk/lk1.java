package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class lk1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ym0 f7865a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mk1 f7867c;

    /* renamed from: d, reason: collision with root package name */
    public int f7868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(mk1 mk1Var, bl2.c cVar) {
        super(cVar);
        this.f7867c = mk1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7866b = obj;
        this.f7868d |= Integer.MIN_VALUE;
        return mk1.a(this.f7867c, null, this);
    }
}
