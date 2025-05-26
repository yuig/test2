package nb0;

/* loaded from: classes5.dex */
public final class m extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public long f90266r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f90267s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f90268t;

    /* renamed from: u, reason: collision with root package name */
    public int f90269u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90268t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90267s = obj;
        this.f90269u |= Integer.MIN_VALUE;
        return t.t(this.f90268t, null, 0L, this);
    }
}
