package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class pr extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f9779a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9780b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f9782d;

    /* renamed from: e, reason: collision with root package name */
    public int f9783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f9782d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9781c = obj;
        this.f9783e |= Integer.MIN_VALUE;
        return this.f9782d.w(this);
    }
}
