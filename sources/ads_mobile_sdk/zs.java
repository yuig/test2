package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class zs extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at f14906b;

    /* renamed from: c, reason: collision with root package name */
    public int f14907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(at atVar, bl2.c cVar) {
        super(cVar);
        this.f14906b = atVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14905a = obj;
        this.f14907c |= Integer.MIN_VALUE;
        return this.f14906b.a((a.b) null, this);
    }
}
