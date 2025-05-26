package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class c31 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public g31 f3721a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g31 f3723c;

    /* renamed from: d, reason: collision with root package name */
    public int f3724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(g31 g31Var, bl2.c cVar) {
        super(cVar);
        this.f3723c = g31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3722b = obj;
        this.f3724d |= Integer.MIN_VALUE;
        return g31.a(this.f3723c, (String) null, this);
    }
}
