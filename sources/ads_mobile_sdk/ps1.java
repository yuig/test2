package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ps1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ws1 f9796a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9797b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws1 f9799d;

    /* renamed from: e, reason: collision with root package name */
    public int f9800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps1(ws1 ws1Var, bl2.c cVar) {
        super(cVar);
        this.f9799d = ws1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9798c = obj;
        this.f9800e |= Integer.MIN_VALUE;
        return ws1.c(this.f9799d, this);
    }
}
