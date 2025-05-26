package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class nl1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ol1 f8858a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ol1 f8860c;

    /* renamed from: d, reason: collision with root package name */
    public int f8861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl1(ol1 ol1Var, bl2.c cVar) {
        super(cVar);
        this.f8860c = ol1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8859b = obj;
        this.f8861d |= Integer.MIN_VALUE;
        return ol1.b(this.f8860c, this);
    }
}
