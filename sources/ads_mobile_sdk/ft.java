package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ft extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gt f5275b;

    /* renamed from: c, reason: collision with root package name */
    public int f5276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(gt gtVar, bl2.c cVar) {
        super(cVar);
        this.f5275b = gtVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5274a = obj;
        this.f5276c |= Integer.MIN_VALUE;
        return this.f5275b.a((a.b) null, this);
    }
}
