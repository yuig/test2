package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class hq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f6041a;

    /* renamed from: b, reason: collision with root package name */
    public aq f6042b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f6044d;

    /* renamed from: e, reason: collision with root package name */
    public int f6045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f6044d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6043c = obj;
        this.f6045e |= Integer.MIN_VALUE;
        return this.f6044d.g(this);
    }
}
