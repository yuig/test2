package g70;

/* loaded from: classes5.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f63865r;

    /* renamed from: s, reason: collision with root package name */
    public b f63866s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f63867t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f63868u;

    /* renamed from: v, reason: collision with root package name */
    public int f63869v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, bl2.c cVar) {
        super(cVar);
        this.f63868u = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f63867t = obj;
        this.f63869v |= Integer.MIN_VALUE;
        return h.a(this.f63868u, null, null, this);
    }
}
