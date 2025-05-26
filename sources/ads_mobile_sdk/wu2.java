package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class wu2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu2 f13269b;

    /* renamed from: c, reason: collision with root package name */
    public int f13270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu2(xu2 xu2Var, bl2.c cVar) {
        super(cVar);
        this.f13269b = xu2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13268a = obj;
        this.f13270c |= Integer.MIN_VALUE;
        return this.f13269b.a((a.b) null, this);
    }
}
