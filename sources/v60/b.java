package v60;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124195r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f124196s;

    /* renamed from: t, reason: collision with root package name */
    public int f124197t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(cVar);
        this.f124196s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f124195r = obj;
        this.f124197t |= Integer.MIN_VALUE;
        return this.f124196s.a(0, null, null, null, this);
    }
}
