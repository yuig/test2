package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class mq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f8333a;

    /* renamed from: b, reason: collision with root package name */
    public aq f8334b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f8336d;

    /* renamed from: e, reason: collision with root package name */
    public int f8337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f8336d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8335c = obj;
        this.f8337e |= Integer.MIN_VALUE;
        return this.f8336d.k(this);
    }
}
