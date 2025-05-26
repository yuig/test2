package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class sh extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public th f11087a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f11088b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11089c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th f11091e;

    /* renamed from: f, reason: collision with root package name */
    public int f11092f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(th thVar, bl2.c cVar) {
        super(cVar);
        this.f11091e = thVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11090d = obj;
        this.f11092f |= Integer.MIN_VALUE;
        return this.f11091e.a(false, this);
    }
}
