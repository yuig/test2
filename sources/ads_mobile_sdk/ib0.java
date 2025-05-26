package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ib0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f6300a;

    /* renamed from: b, reason: collision with root package name */
    public sy0 f6301b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0 f6303d;

    /* renamed from: e, reason: collision with root package name */
    public int f6304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib0(kb0 kb0Var, bl2.c cVar) {
        super(cVar);
        this.f6303d = kb0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6302c = obj;
        this.f6304e |= Integer.MIN_VALUE;
        return this.f6303d.a((db0) null, this);
    }
}
