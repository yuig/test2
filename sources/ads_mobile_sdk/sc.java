package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class sc extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f11027a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f11029c;

    /* renamed from: d, reason: collision with root package name */
    public int f11030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, bl2.c cVar) {
        super(cVar);
        this.f11029c = tcVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11028b = obj;
        this.f11030d |= Integer.MIN_VALUE;
        return this.f11029c.c(this);
    }
}
