package a92;

/* loaded from: classes2.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f1589r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f1591t;

    /* renamed from: u, reason: collision with root package name */
    public int f1592u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, bl2.c cVar) {
        super(cVar);
        this.f1591t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f1590s = obj;
        this.f1592u |= Integer.MIN_VALUE;
        return this.f1591t.b(this);
    }
}
