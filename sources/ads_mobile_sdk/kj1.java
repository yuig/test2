package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class kj1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public String f7338a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oj1 f7340c;

    /* renamed from: d, reason: collision with root package name */
    public int f7341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(oj1 oj1Var, bl2.c cVar) {
        super(cVar);
        this.f7340c = oj1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7339b = obj;
        this.f7341d |= Integer.MIN_VALUE;
        return oj1.a(this.f7340c, (nm.u) null, this);
    }
}
