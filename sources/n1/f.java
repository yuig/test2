package n1;

/* loaded from: classes2.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88888r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f88889s;

    /* renamed from: t, reason: collision with root package name */
    public int f88890t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, bl2.c cVar) {
        super(cVar);
        this.f88889s = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f88888r = obj;
        this.f88890t |= Integer.MIN_VALUE;
        return this.f88889s.d(null, 0.0f, null, this);
    }
}
