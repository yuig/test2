package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class tu2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uu2 f11704b;

    /* renamed from: c, reason: collision with root package name */
    public int f11705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu2(uu2 uu2Var, bl2.c cVar) {
        super(cVar);
        this.f11704b = uu2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11703a = obj;
        this.f11705c |= Integer.MIN_VALUE;
        return this.f11704b.a((a.b) null, this);
    }
}
