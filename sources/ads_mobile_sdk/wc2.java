package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class wc2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc2 f12986b;

    /* renamed from: c, reason: collision with root package name */
    public int f12987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc2(xc2 xc2Var, bl2.c cVar) {
        super(cVar);
        this.f12986b = xc2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12985a = obj;
        this.f12987c |= Integer.MIN_VALUE;
        return this.f12986b.c(this);
    }
}
