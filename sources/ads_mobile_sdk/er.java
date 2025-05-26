package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class er extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Exception f4923a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zr f4925c;

    /* renamed from: d, reason: collision with root package name */
    public int f4926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f4925c = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4924b = obj;
        this.f4926d |= Integer.MIN_VALUE;
        return this.f4925c.a((Exception) null, this);
    }
}
