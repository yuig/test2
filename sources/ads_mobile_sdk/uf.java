package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class uf extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public eg f12051a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f12052b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg f12054d;

    /* renamed from: e, reason: collision with root package name */
    public int f12055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(eg egVar, bl2.c cVar) {
        super(cVar);
        this.f12054d = egVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12053c = obj;
        this.f12055e |= Integer.MIN_VALUE;
        return this.f12054d.a(this);
    }
}
