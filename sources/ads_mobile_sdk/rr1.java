package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class rr1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public tr1 f10761a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr1 f10763c;

    /* renamed from: d, reason: collision with root package name */
    public int f10764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr1(tr1 tr1Var, bl2.c cVar) {
        super(cVar);
        this.f10763c = tr1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10762b = obj;
        this.f10764d |= Integer.MIN_VALUE;
        return tr1.d(this.f10763c, this);
    }
}
