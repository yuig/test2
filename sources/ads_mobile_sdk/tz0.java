package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class tz0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public sx0 f11753a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.re f11755c;

    /* renamed from: d, reason: collision with root package name */
    public int f11756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(a.re reVar, bl2.c cVar) {
        super(cVar);
        this.f11755c = reVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11754b = obj;
        this.f11756d |= Integer.MIN_VALUE;
        return this.f11755c.a(null, this);
    }
}
