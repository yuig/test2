package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class tj extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public uj f11559a;

    /* renamed from: b, reason: collision with root package name */
    public double f11560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11561c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uj f11563e;

    /* renamed from: f, reason: collision with root package name */
    public int f11564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(uj ujVar, bl2.c cVar) {
        super(cVar);
        this.f11563e = ujVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11562d = obj;
        this.f11564f |= Integer.MIN_VALUE;
        return uj.a(this.f11563e, null, 0.0d, false, this);
    }
}
