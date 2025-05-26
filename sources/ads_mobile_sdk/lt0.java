package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class lt0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ku0 f7953b;

    /* renamed from: c, reason: collision with root package name */
    public int f7954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(ku0 ku0Var, bl2.c cVar) {
        super(cVar);
        this.f7953b = ku0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7952a = obj;
        this.f7954c |= Integer.MIN_VALUE;
        return this.f7953b.f(this);
    }
}
