package qz;

/* loaded from: classes3.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f105403r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f105404s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f105405t;

    /* renamed from: u, reason: collision with root package name */
    public int f105406u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(cVar);
        this.f105405t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f105404s = obj;
        this.f105406u |= Integer.MIN_VALUE;
        return this.f105405t.c(null, 0, null, this);
    }
}
