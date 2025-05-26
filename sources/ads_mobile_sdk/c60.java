package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class c60 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public t60 f3782a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f3783b;

    /* renamed from: c, reason: collision with root package name */
    public cs2 f3784c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t60 f3786e;

    /* renamed from: f, reason: collision with root package name */
    public int f3787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(t60 t60Var, bl2.c cVar) {
        super(cVar);
        this.f3786e = t60Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3785d = obj;
        this.f3787f |= Integer.MIN_VALUE;
        return this.f3786e.d(this);
    }
}
