package do2;

/* loaded from: classes2.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public eo2.k0 f55716r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55717s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ pb.k f55718t;

    /* renamed from: u, reason: collision with root package name */
    public int f55719u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pb.k kVar, bl2.c cVar) {
        super(cVar);
        this.f55718t = kVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55717s = obj;
        this.f55719u |= Integer.MIN_VALUE;
        return this.f55718t.collect(null, this);
    }
}
