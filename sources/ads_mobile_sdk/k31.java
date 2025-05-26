package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class k31 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l31 f7087b;

    /* renamed from: c, reason: collision with root package name */
    public int f7088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(l31 l31Var, bl2.c cVar) {
        super(cVar);
        this.f7087b = l31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7086a = obj;
        this.f7088c |= Integer.MIN_VALUE;
        return this.f7087b.a((a.j5) null, this);
    }
}
