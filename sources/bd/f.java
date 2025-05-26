package bd;

/* loaded from: classes3.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public g f22693r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f22694s;

    /* renamed from: t, reason: collision with root package name */
    public int f22695t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f22696u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(cVar);
        this.f22696u = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f22694s = obj;
        this.f22695t |= Integer.MIN_VALUE;
        return this.f22696u.emit(null, this);
    }
}
