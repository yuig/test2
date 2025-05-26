package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class tz2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vz2 f11758b;

    /* renamed from: c, reason: collision with root package name */
    public int f11759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz2(vz2 vz2Var, bl2.c cVar) {
        super(cVar);
        this.f11758b = vz2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11757a = obj;
        this.f11759c |= Integer.MIN_VALUE;
        return vz2.a(this.f11758b, this);
    }
}
