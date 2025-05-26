package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class zq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f14858a;

    /* renamed from: b, reason: collision with root package name */
    public aq f14859b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f14861d;

    /* renamed from: e, reason: collision with root package name */
    public int f14862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f14861d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14860c = obj;
        this.f14862e |= Integer.MIN_VALUE;
        return zr.f(this.f14861d, this);
    }
}
