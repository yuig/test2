package dj0;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f55137r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55138s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f55139t;

    /* renamed from: u, reason: collision with root package name */
    public int f55140u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f55139t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55138s = obj;
        this.f55140u |= Integer.MIN_VALUE;
        return this.f55139t.a(0, null, null, null, this);
    }
}
