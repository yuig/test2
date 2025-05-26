package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class sf extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public eg f11071a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f11072b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg f11074d;

    /* renamed from: e, reason: collision with root package name */
    public int f11075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(eg egVar, bl2.c cVar) {
        super(cVar);
        this.f11074d = egVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11073c = obj;
        this.f11075e |= Integer.MIN_VALUE;
        return eg.a(this.f11074d, this);
    }
}
