package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ts1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ws1 f11663a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ws1 f11665c;

    /* renamed from: d, reason: collision with root package name */
    public int f11666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts1(ws1 ws1Var, bl2.c cVar) {
        super(cVar);
        this.f11665c = ws1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11664b = obj;
        this.f11666d |= Integer.MIN_VALUE;
        return ws1.d(this.f11665c, this);
    }
}
