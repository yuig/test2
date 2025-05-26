package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class po2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qo2 f9761b;

    /* renamed from: c, reason: collision with root package name */
    public int f9762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po2(qo2 qo2Var, bl2.c cVar) {
        super(cVar);
        this.f9761b = qo2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9760a = obj;
        this.f9762c |= Integer.MIN_VALUE;
        return this.f9761b.a(false, (bl2.c) this);
    }
}
