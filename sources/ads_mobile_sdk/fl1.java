package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class fl1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gl1 f5193b;

    /* renamed from: c, reason: collision with root package name */
    public int f5194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(gl1 gl1Var, bl2.c cVar) {
        super(cVar);
        this.f5193b = gl1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5192a = obj;
        this.f5194c |= Integer.MIN_VALUE;
        return this.f5193b.a((a.ce) null, this);
    }
}
