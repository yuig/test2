package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class hj2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f5997a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f5998b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.t5 f6000d;

    /* renamed from: e, reason: collision with root package name */
    public int f6001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj2(a.t5 t5Var, bl2.c cVar) {
        super(cVar);
        this.f6000d = t5Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5999c = obj;
        this.f6001e |= Integer.MIN_VALUE;
        return a.t5.a(this.f6000d, this);
    }
}
