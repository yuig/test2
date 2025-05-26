package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class bw1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw1 f3625b;

    /* renamed from: c, reason: collision with root package name */
    public int f3626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(cw1 cw1Var, bl2.c cVar) {
        super(cVar);
        this.f3625b = cw1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3624a = obj;
        this.f3626c |= Integer.MIN_VALUE;
        return this.f3625b.c(this);
    }
}
