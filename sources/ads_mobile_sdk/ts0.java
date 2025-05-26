package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ts0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ws0 f11658a;

    /* renamed from: b, reason: collision with root package name */
    public String f11659b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0 f11661d;

    /* renamed from: e, reason: collision with root package name */
    public int f11662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(ws0 ws0Var, bl2.c cVar) {
        super(cVar);
        this.f11661d = ws0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11660c = obj;
        this.f11662e |= Integer.MIN_VALUE;
        return ws0.a(this.f11661d, this);
    }
}
