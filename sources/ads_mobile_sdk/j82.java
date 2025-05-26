package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class j82 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public n82 f6728a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n82 f6730c;

    /* renamed from: d, reason: collision with root package name */
    public int f6731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(n82 n82Var, bl2.c cVar) {
        super(cVar);
        this.f6730c = n82Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6729b = obj;
        this.f6731d |= Integer.MIN_VALUE;
        return this.f6730c.a(this);
    }
}
