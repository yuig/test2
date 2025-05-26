package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class jc2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public pc2 f6746a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f6747b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc2 f6749d;

    /* renamed from: e, reason: collision with root package name */
    public int f6750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc2(pc2 pc2Var, bl2.c cVar) {
        super(cVar);
        this.f6749d = pc2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6748c = obj;
        this.f6750e |= Integer.MIN_VALUE;
        return this.f6749d.a(null, null, null, this);
    }
}
