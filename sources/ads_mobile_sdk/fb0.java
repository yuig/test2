package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class fb0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public kb0 f5092a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f5093b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0 f5095d;

    /* renamed from: e, reason: collision with root package name */
    public int f5096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(kb0 kb0Var, bl2.c cVar) {
        super(cVar);
        this.f5095d = kb0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5094c = obj;
        this.f5096e |= Integer.MIN_VALUE;
        return this.f5095d.c(this);
    }
}
