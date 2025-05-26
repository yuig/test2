package s02;

/* loaded from: classes4.dex */
public final class l extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f110324r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i90.i f110325s;

    /* renamed from: t, reason: collision with root package name */
    public int f110326t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i90.i iVar, bl2.c cVar) {
        super(cVar);
        this.f110325s = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f110324r = obj;
        this.f110326t |= Integer.MIN_VALUE;
        return this.f110325s.a(0, null, null, null, this);
    }
}
