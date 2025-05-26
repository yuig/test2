package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ke1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public le1 f7252a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ le1 f7254c;

    /* renamed from: d, reason: collision with root package name */
    public int f7255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke1(le1 le1Var, bl2.c cVar) {
        super(cVar);
        this.f7254c = le1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7253b = obj;
        this.f7255d |= Integer.MIN_VALUE;
        return this.f7254c.a(null, 0, this);
    }
}
