package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class c03 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public d03 f3671a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d03 f3673c;

    /* renamed from: d, reason: collision with root package name */
    public int f3674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c03(d03 d03Var, bl2.c cVar) {
        super(cVar);
        this.f3673c = d03Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3672b = obj;
        this.f3674d |= Integer.MIN_VALUE;
        return this.f3673c.a(this);
    }
}
