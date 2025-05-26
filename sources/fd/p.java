package fd;

/* loaded from: classes3.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f61792r;

    /* renamed from: s, reason: collision with root package name */
    public int f61793s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f61794t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, bl2.c cVar) {
        super(cVar);
        this.f61794t = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f61792r = obj;
        this.f61793s |= Integer.MIN_VALUE;
        return this.f61794t.emit(null, this);
    }
}
