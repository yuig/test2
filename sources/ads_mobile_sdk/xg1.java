package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class xg1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public String f13651a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dh1 f13653c;

    /* renamed from: d, reason: collision with root package name */
    public int f13654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg1(dh1 dh1Var, bl2.c cVar) {
        super(cVar);
        this.f13653c = dh1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13652b = obj;
        this.f13654d |= Integer.MIN_VALUE;
        return this.f13653c.a(null, this);
    }
}
