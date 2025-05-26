package a92;

/* loaded from: classes2.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f1597r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1598s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f1599t;

    /* renamed from: u, reason: collision with root package name */
    public int f1600u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, bl2.c cVar) {
        super(cVar);
        this.f1599t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f1598s = obj;
        this.f1600u |= Integer.MIN_VALUE;
        return this.f1599t.d(this);
    }
}
