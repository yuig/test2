package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ab0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public kb0 f2343a;

    /* renamed from: b, reason: collision with root package name */
    public sy0 f2344b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0 f2346d;

    /* renamed from: e, reason: collision with root package name */
    public int f2347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(kb0 kb0Var, bl2.c cVar) {
        super(cVar);
        this.f2346d = kb0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2345c = obj;
        this.f2347e |= Integer.MIN_VALUE;
        return this.f2346d.b(null, this);
    }
}
