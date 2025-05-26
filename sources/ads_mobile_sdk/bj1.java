package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class bj1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj1 f2892b;

    /* renamed from: c, reason: collision with root package name */
    public int f2893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj1(dj1 dj1Var, bl2.c cVar) {
        super(cVar);
        this.f2892b = dj1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2891a = obj;
        this.f2893c |= Integer.MIN_VALUE;
        return this.f2892b.a((nm.u) null, this);
    }
}
