package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class wm0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f13120b;

    /* renamed from: c, reason: collision with root package name */
    public int f13121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm0(ym0 ym0Var, bl2.c cVar) {
        super(cVar);
        this.f13120b = ym0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13119a = obj;
        this.f13121c |= Integer.MIN_VALUE;
        return this.f13120b.c(null, this);
    }
}
