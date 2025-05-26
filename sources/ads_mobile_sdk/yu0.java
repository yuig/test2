package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class yu0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public dv0 f14408a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dv0 f14410c;

    /* renamed from: d, reason: collision with root package name */
    public int f14411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(dv0 dv0Var, bl2.c cVar) {
        super(cVar);
        this.f14410c = dv0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14409b = obj;
        this.f14411d |= Integer.MIN_VALUE;
        return this.f14410c.a(this);
    }
}
