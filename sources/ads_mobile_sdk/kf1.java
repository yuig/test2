package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class kf1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public if1 f7283a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uf1 f7285c;

    /* renamed from: d, reason: collision with root package name */
    public int f7286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf1(uf1 uf1Var, bl2.c cVar) {
        super(cVar);
        this.f7285c = uf1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7284b = obj;
        this.f7286d |= Integer.MIN_VALUE;
        return this.f7285c.b(null, null, this);
    }
}
