package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class lx1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mx1 f8021b;

    /* renamed from: c, reason: collision with root package name */
    public int f8022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx1(mx1 mx1Var, bl2.c cVar) {
        super(cVar);
        this.f8021b = mx1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8020a = obj;
        this.f8022c |= Integer.MIN_VALUE;
        return this.f8021b.a((a.ce) null, this);
    }
}
