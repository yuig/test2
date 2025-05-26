package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class dr extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f4410a;

    /* renamed from: b, reason: collision with root package name */
    public aq f4411b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f4413d;

    /* renamed from: e, reason: collision with root package name */
    public int f4414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f4413d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4412c = obj;
        this.f4414e |= Integer.MIN_VALUE;
        return this.f4413d.s(this);
    }
}
