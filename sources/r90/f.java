package r90;

/* loaded from: classes5.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public String f106869r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f106870s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f106871t;

    /* renamed from: u, reason: collision with root package name */
    public int f106872u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(cVar);
        this.f106871t = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f106870s = obj;
        this.f106872u |= Integer.MIN_VALUE;
        return this.f106871t.i(null, this);
    }
}
