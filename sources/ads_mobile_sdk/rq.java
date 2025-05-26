package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class rq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f10748a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f10749b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10750c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f10751d;

    /* renamed from: e, reason: collision with root package name */
    public int f10752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f10751d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10750c = obj;
        this.f10752e |= Integer.MIN_VALUE;
        return zr.c(this.f10751d, this);
    }
}
