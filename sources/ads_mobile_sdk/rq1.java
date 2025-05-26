package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class rq1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zq1 f10754b;

    /* renamed from: c, reason: collision with root package name */
    public int f10755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq1(zq1 zq1Var, bl2.c cVar) {
        super(cVar);
        this.f10754b = zq1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10753a = obj;
        this.f10755c |= Integer.MIN_VALUE;
        return zq1.a(this.f10754b, this);
    }
}
