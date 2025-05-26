package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class vf0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public eg0 f12483a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f12484b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg0 f12486d;

    /* renamed from: e, reason: collision with root package name */
    public int f12487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(eg0 eg0Var, bl2.c cVar) {
        super(cVar);
        this.f12486d = eg0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12485c = obj;
        this.f12487e |= Integer.MIN_VALUE;
        return eg0.b(this.f12486d, this);
    }
}
