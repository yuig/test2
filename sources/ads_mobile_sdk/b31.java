package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class b31 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public g31 f2691a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g31 f2693c;

    /* renamed from: d, reason: collision with root package name */
    public int f2694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b31(g31 g31Var, bl2.c cVar) {
        super(cVar);
        this.f2693c = g31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2692b = obj;
        this.f2694d |= Integer.MIN_VALUE;
        return this.f2693c.d(this);
    }
}
