package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class cv0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public dv0 f4042a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dv0 f4044c;

    /* renamed from: d, reason: collision with root package name */
    public int f4045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(dv0 dv0Var, bl2.c cVar) {
        super(cVar);
        this.f4044c = dv0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4043b = obj;
        this.f4045d |= Integer.MIN_VALUE;
        return this.f4044c.d(this);
    }
}
