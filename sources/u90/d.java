package u90;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121176r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f121177s;

    /* renamed from: t, reason: collision with root package name */
    public int f121178t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, bl2.c cVar) {
        super(cVar);
        this.f121177s = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f121176r = obj;
        this.f121178t |= Integer.MIN_VALUE;
        return j.j(this.f121177s, null, this);
    }
}
