package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class sp extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wp f11184b;

    /* renamed from: c, reason: collision with root package name */
    public int f11185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(wp wpVar, bl2.c cVar) {
        super(cVar);
        this.f11184b = wpVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11183a = obj;
        this.f11185c |= Integer.MIN_VALUE;
        return wp.a(this.f11184b, null, this);
    }
}
