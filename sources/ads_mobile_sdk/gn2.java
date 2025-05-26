package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class gn2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public hn2 f5633a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hn2 f5635c;

    /* renamed from: d, reason: collision with root package name */
    public int f5636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn2(hn2 hn2Var, bl2.c cVar) {
        super(cVar);
        this.f5635c = hn2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5634b = obj;
        this.f5636d |= Integer.MIN_VALUE;
        return hn2.a(this.f5635c, (bl2.c) this);
    }
}
