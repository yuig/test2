package yc;

/* loaded from: classes.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138630r;

    /* renamed from: s, reason: collision with root package name */
    public int f138631s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f138632t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(cVar);
        this.f138632t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138630r = obj;
        this.f138631s |= Integer.MIN_VALUE;
        return this.f138632t.emit(null, this);
    }
}
