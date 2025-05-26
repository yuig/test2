package cf2;

/* loaded from: classes4.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f27648r;

    /* renamed from: s, reason: collision with root package name */
    public y2.b f27649s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27650t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f27651u;

    /* renamed from: v, reason: collision with root package name */
    public int f27652v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, bl2.c cVar) {
        super(cVar);
        this.f27651u = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f27650t = obj;
        this.f27652v |= Integer.MIN_VALUE;
        return this.f27651u.Q0(null, this);
    }
}
