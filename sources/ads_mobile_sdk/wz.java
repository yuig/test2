package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class wz extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public a00 f13304a;

    /* renamed from: b, reason: collision with root package name */
    public String f13305b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a00 f13307d;

    /* renamed from: e, reason: collision with root package name */
    public int f13308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(a00 a00Var, bl2.c cVar) {
        super(cVar);
        this.f13307d = a00Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13306c = obj;
        this.f13308e |= Integer.MIN_VALUE;
        return a00.a(this.f13307d, null, this);
    }
}
