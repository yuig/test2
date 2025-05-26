package z82;

/* loaded from: classes2.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j f141105r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f141106s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f141107t;

    /* renamed from: u, reason: collision with root package name */
    public int f141108u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, bl2.c cVar) {
        super(cVar);
        this.f141107t = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f141106s = obj;
        this.f141108u |= Integer.MIN_VALUE;
        return this.f141107t.a(this);
    }
}
