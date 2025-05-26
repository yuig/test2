package m70;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f86519r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v60.d f86520s;

    /* renamed from: t, reason: collision with root package name */
    public int f86521t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v60.d dVar, bl2.c cVar) {
        super(cVar);
        this.f86520s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f86519r = obj;
        this.f86521t |= Integer.MIN_VALUE;
        return this.f86520s.a(0, null, null, null, this);
    }
}
