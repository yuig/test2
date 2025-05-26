package sm0;

/* loaded from: classes5.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j f113263r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f113264s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f113265t;

    /* renamed from: u, reason: collision with root package name */
    public int f113266u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bl2.c cVar) {
        super(cVar);
        this.f113265t = lVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f113264s = obj;
        this.f113266u |= Integer.MIN_VALUE;
        return this.f113265t.a(0, null, null, null, this);
    }
}
