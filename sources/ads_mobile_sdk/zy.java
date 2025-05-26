package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class zy extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public dz f14978a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f14979b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz f14981d;

    /* renamed from: e, reason: collision with root package name */
    public int f14982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(dz dzVar, bl2.c cVar) {
        super(cVar);
        this.f14981d = dzVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14980c = obj;
        this.f14982e |= Integer.MIN_VALUE;
        return this.f14981d.a(this);
    }
}
