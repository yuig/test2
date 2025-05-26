package t72;

/* loaded from: classes4.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116659r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f116660s;

    /* renamed from: t, reason: collision with root package name */
    public int f116661t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, bl2.c cVar) {
        super(cVar);
        this.f116660s = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116659r = obj;
        this.f116661t |= Integer.MIN_VALUE;
        return this.f116660s.n(null, null, this);
    }
}
