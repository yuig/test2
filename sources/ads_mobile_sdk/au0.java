package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class au0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ku0 f2545a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ku0 f2547c;

    /* renamed from: d, reason: collision with root package name */
    public int f2548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(ku0 ku0Var, bl2.c cVar) {
        super(cVar);
        this.f2547c = ku0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2546b = obj;
        this.f2548d |= Integer.MIN_VALUE;
        return ku0.a(this.f2547c, this);
    }
}
