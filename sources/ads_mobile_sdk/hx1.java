package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class hx1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ix1 f6135b;

    /* renamed from: c, reason: collision with root package name */
    public int f6136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(ix1 ix1Var, bl2.c cVar) {
        super(cVar);
        this.f6135b = ix1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6134a = obj;
        this.f6136c |= Integer.MIN_VALUE;
        return this.f6135b.a((a.ce) null, this);
    }
}
