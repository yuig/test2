package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class wl1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xl1 f13111b;

    /* renamed from: c, reason: collision with root package name */
    public int f13112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl1(xl1 xl1Var, bl2.c cVar) {
        super(cVar);
        this.f13111b = xl1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13110a = obj;
        this.f13112c |= Integer.MIN_VALUE;
        return this.f13111b.a((a.ce) null, this);
    }
}
