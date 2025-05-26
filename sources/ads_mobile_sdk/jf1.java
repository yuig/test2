package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class jf1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f6779a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f6780b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf1 f6782d;

    /* renamed from: e, reason: collision with root package name */
    public int f6783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf1(uf1 uf1Var, bl2.c cVar) {
        super(cVar);
        this.f6782d = uf1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6781c = obj;
        this.f6783e |= Integer.MIN_VALUE;
        return this.f6782d.a(null, null, this);
    }
}
