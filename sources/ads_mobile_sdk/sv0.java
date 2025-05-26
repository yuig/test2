package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class sv0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tv0 f11265b;

    /* renamed from: c, reason: collision with root package name */
    public int f11266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(tv0 tv0Var, bl2.c cVar) {
        super(cVar);
        this.f11265b = tv0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11264a = obj;
        this.f11266c |= Integer.MIN_VALUE;
        return this.f11265b.c(this);
    }
}
