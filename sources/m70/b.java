package m70;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f86500r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v60.d f86501s;

    /* renamed from: t, reason: collision with root package name */
    public int f86502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v60.d dVar, bl2.c cVar) {
        super(cVar);
        this.f86501s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f86500r = obj;
        this.f86502t |= Integer.MIN_VALUE;
        return this.f86501s.a(0, null, null, null, this);
    }
}
