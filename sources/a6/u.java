package a6;

/* loaded from: classes.dex */
public final class u extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f881r;

    /* renamed from: s, reason: collision with root package name */
    public int f882s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f883t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, bl2.c cVar) {
        super(cVar);
        this.f883t = vVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f881r = obj;
        this.f882s |= Integer.MIN_VALUE;
        return this.f883t.emit(null, this);
    }
}
