package dj0;

/* loaded from: classes5.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55122r;

    /* renamed from: s, reason: collision with root package name */
    public int f55123s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f55124t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, bl2.c cVar) {
        super(cVar);
        this.f55124t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55122r = obj;
        this.f55123s |= Integer.MIN_VALUE;
        return this.f55124t.emit(null, this);
    }
}
