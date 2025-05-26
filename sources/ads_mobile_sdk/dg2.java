package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class dg2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg2 f4280b;

    /* renamed from: c, reason: collision with root package name */
    public int f4281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg2(eg2 eg2Var, bl2.c cVar) {
        super(cVar);
        this.f4280b = eg2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4279a = obj;
        this.f4281c |= Integer.MIN_VALUE;
        return this.f4280b.c(this);
    }
}
