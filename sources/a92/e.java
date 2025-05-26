package a92;

/* loaded from: classes4.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f1593r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1594s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f1595t;

    /* renamed from: u, reason: collision with root package name */
    public int f1596u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, bl2.c cVar) {
        super(cVar);
        this.f1595t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f1594s = obj;
        this.f1596u |= Integer.MIN_VALUE;
        return this.f1595t.c(null, this);
    }
}
