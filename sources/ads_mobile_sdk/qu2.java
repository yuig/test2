package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qu2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru2 f10287b;

    /* renamed from: c, reason: collision with root package name */
    public int f10288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu2(ru2 ru2Var, bl2.c cVar) {
        super(cVar);
        this.f10287b = ru2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10286a = obj;
        this.f10288c |= Integer.MIN_VALUE;
        return this.f10287b.a((a.b) null, this);
    }
}
