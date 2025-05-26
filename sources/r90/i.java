package r90;

/* loaded from: classes5.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f106876r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f106877s;

    /* renamed from: t, reason: collision with root package name */
    public int f106878t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, bl2.c cVar) {
        super(cVar);
        this.f106877s = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f106876r = obj;
        this.f106878t |= Integer.MIN_VALUE;
        return this.f106877s.a(0, null, null, null, this);
    }
}
