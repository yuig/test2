package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qr1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f10231a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10232b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr1 f10234d;

    /* renamed from: e, reason: collision with root package name */
    public int f10235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr1(tr1 tr1Var, bl2.c cVar) {
        super(cVar);
        this.f10234d = tr1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10233c = obj;
        this.f10235e |= Integer.MIN_VALUE;
        return tr1.c(this.f10234d, this);
    }
}
