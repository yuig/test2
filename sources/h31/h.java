package h31;

/* loaded from: classes5.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f66814r;

    /* renamed from: s, reason: collision with root package name */
    public int f66815s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dj0.b f66816t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dj0.b bVar, bl2.c cVar) {
        super(cVar);
        this.f66816t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f66814r = obj;
        this.f66815s |= Integer.MIN_VALUE;
        return this.f66816t.emit(null, this);
    }
}
