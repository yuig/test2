package m3;

/* loaded from: classes2.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f85723r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f85724s;

    /* renamed from: t, reason: collision with root package name */
    public int f85725t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, bl2.c cVar) {
        super(cVar);
        this.f85724s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85723r = obj;
        this.f85725t |= Integer.MIN_VALUE;
        return this.f85724s.b(0L, this);
    }
}
