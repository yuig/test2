package bt0;

/* loaded from: classes5.dex */
public final class m extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23878r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f23879s;

    /* renamed from: t, reason: collision with root package name */
    public int f23880t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, bl2.c cVar) {
        super(cVar);
        this.f23879s = nVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f23878r = obj;
        this.f23880t |= Integer.MIN_VALUE;
        return this.f23879s.a(0, null, null, null, this);
    }
}
