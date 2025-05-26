package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qy0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public sy0 f10318a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f10319b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sy0 f10321d;

    /* renamed from: e, reason: collision with root package name */
    public int f10322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(sy0 sy0Var, bl2.c cVar) {
        super(cVar);
        this.f10321d = sy0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10320c = obj;
        this.f10322e |= Integer.MIN_VALUE;
        return this.f10321d.e(this);
    }
}
