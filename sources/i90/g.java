package i90;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f71780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f71781s;

    /* renamed from: t, reason: collision with root package name */
    public int f71782t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, bl2.c cVar) {
        super(cVar);
        this.f71781s = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f71780r = obj;
        this.f71782t |= Integer.MIN_VALUE;
        return this.f71781s.a(0, null, null, null, this);
    }
}
