package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class pr1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public tr1 f9785a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9786b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9787c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr1 f9788d;

    /* renamed from: e, reason: collision with root package name */
    public int f9789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(tr1 tr1Var, bl2.c cVar) {
        super(cVar);
        this.f9788d = tr1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9787c = obj;
        this.f9789e |= Integer.MIN_VALUE;
        return tr1.b(this.f9788d, this);
    }
}
