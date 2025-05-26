package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class v1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f12289b;

    /* renamed from: c, reason: collision with root package name */
    public int f12290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, bl2.c cVar) {
        super(cVar);
        this.f12289b = w1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12288a = obj;
        this.f12290c |= Integer.MIN_VALUE;
        return this.f12289b.c(this);
    }
}
