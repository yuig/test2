package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class n72 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public u72 f8691a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f8692b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u72 f8694d;

    /* renamed from: e, reason: collision with root package name */
    public int f8695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n72(u72 u72Var, bl2.c cVar) {
        super(cVar);
        this.f8694d = u72Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8693c = obj;
        this.f8695e |= Integer.MIN_VALUE;
        return u72.a(this.f8694d, this);
    }
}
