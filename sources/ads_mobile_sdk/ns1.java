package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ns1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ws1 f8959a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f8960b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws1 f8962d;

    /* renamed from: e, reason: collision with root package name */
    public int f8963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(ws1 ws1Var, bl2.c cVar) {
        super(cVar);
        this.f8962d = ws1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8961c = obj;
        this.f8963e |= Integer.MIN_VALUE;
        return ws1.b(this.f8962d, this);
    }
}
