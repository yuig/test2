package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class fm2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gm2 f5207b;

    /* renamed from: c, reason: collision with root package name */
    public int f5208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm2(gm2 gm2Var, bl2.c cVar) {
        super(cVar);
        this.f5207b = gm2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5206a = obj;
        this.f5208c |= Integer.MIN_VALUE;
        return this.f5207b.a((a.ce) null, this);
    }
}
