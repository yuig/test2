package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class d32 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4108a;

    /* renamed from: b, reason: collision with root package name */
    public int f4109b;

    /* renamed from: c, reason: collision with root package name */
    public do2.j f4110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e32 f4111d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4112e;

    /* renamed from: f, reason: collision with root package name */
    public a.ad f4113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d32(e32 e32Var, bl2.c cVar) {
        super(cVar);
        this.f4111d = e32Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4108a = obj;
        this.f4109b |= Integer.MIN_VALUE;
        return this.f4111d.emit(null, this);
    }
}
