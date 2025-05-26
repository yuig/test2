package e2;

/* loaded from: classes2.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public q f56873r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f56874s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f56875t;

    /* renamed from: u, reason: collision with root package name */
    public int f56876u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, bl2.c cVar) {
        super(cVar);
        this.f56875t = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f56874s = obj;
        this.f56876u |= Integer.MIN_VALUE;
        return this.f56875t.a(this);
    }
}
