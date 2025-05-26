package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class fr extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public jk0 f5242a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zr f5244c;

    /* renamed from: d, reason: collision with root package name */
    public int f5245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f5244c = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5243b = obj;
        this.f5245d |= Integer.MIN_VALUE;
        return this.f5244c.a((jk0) null, this);
    }
}
