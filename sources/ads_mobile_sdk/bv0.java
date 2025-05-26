package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class bv0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public dv0 f3608a;

    /* renamed from: b, reason: collision with root package name */
    public nm.o f3609b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv0 f3611d;

    /* renamed from: e, reason: collision with root package name */
    public int f3612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(dv0 dv0Var, bl2.c cVar) {
        super(cVar);
        this.f3611d = dv0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3610c = obj;
        this.f3612e |= Integer.MIN_VALUE;
        return this.f3611d.a((String) null, this);
    }
}
