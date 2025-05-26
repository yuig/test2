package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class du2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu2 f4457b;

    /* renamed from: c, reason: collision with root package name */
    public int f4458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(eu2 eu2Var, bl2.c cVar) {
        super(cVar);
        this.f4457b = eu2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4456a = obj;
        this.f4458c |= Integer.MIN_VALUE;
        return this.f4457b.c(this);
    }
}
