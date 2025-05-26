package l80;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f82106r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f82107s;

    /* renamed from: t, reason: collision with root package name */
    public int f82108t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f82107s = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f82106r = obj;
        this.f82108t |= Integer.MIN_VALUE;
        return this.f82107s.a(null, null, null, null, this);
    }
}
