package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class nt1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public pt1 f8986a;

    /* renamed from: b, reason: collision with root package name */
    public wi.o f8987b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pt1 f8989d;

    /* renamed from: e, reason: collision with root package name */
    public int f8990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt1(pt1 pt1Var, bl2.c cVar) {
        super(cVar);
        this.f8989d = pt1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8988c = obj;
        this.f8990e |= Integer.MIN_VALUE;
        return pt1.a(this.f8989d, null, this);
    }
}
