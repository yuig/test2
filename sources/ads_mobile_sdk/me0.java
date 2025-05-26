package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class me0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public oe0 f8187a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oe0 f8189c;

    /* renamed from: d, reason: collision with root package name */
    public int f8190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(oe0 oe0Var, bl2.c cVar) {
        super(cVar);
        this.f8189c = oe0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8188b = obj;
        this.f8190d |= Integer.MIN_VALUE;
        return this.f8189c.a(this);
    }
}
