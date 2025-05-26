package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class t21 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f11321a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f11322b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g31 f11324d;

    /* renamed from: e, reason: collision with root package name */
    public int f11325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(g31 g31Var, bl2.c cVar) {
        super(cVar);
        this.f11324d = g31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11323c = obj;
        this.f11325e |= Integer.MIN_VALUE;
        return this.f11324d.a((String) null, this);
    }
}
