package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ws extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xs f13201b;

    /* renamed from: c, reason: collision with root package name */
    public int f13202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws(xs xsVar, bl2.c cVar) {
        super(cVar);
        this.f13201b = xsVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13200a = obj;
        this.f13202c |= Integer.MIN_VALUE;
        return this.f13201b.a((a.b) null, this);
    }
}
