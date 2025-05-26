package yc;

/* loaded from: classes3.dex */
public final class s extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138667r;

    /* renamed from: s, reason: collision with root package name */
    public int f138668s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f138669t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, bl2.c cVar) {
        super(cVar);
        this.f138669t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138667r = obj;
        this.f138668s |= Integer.MIN_VALUE;
        return this.f138669t.emit(null, this);
    }
}
