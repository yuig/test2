package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class t62 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public c72 f11428a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f11429b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c72 f11431d;

    /* renamed from: e, reason: collision with root package name */
    public int f11432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t62(c72 c72Var, bl2.c cVar) {
        super(cVar);
        this.f11431d = c72Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11430c = obj;
        this.f11432e |= Integer.MIN_VALUE;
        return this.f11431d.a(this);
    }
}
