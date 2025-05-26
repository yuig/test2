package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class mf2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nf2 f8204b;

    /* renamed from: c, reason: collision with root package name */
    public int f8205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf2(nf2 nf2Var, bl2.c cVar) {
        super(cVar);
        this.f8204b = nf2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8203a = obj;
        this.f8205c |= Integer.MIN_VALUE;
        return this.f8204b.c(this);
    }
}
