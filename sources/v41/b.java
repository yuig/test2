package v41;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124112r;

    /* renamed from: s, reason: collision with root package name */
    public int f124113s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dj0.b f124114t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dj0.b bVar, bl2.c cVar) {
        super(cVar);
        this.f124114t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f124112r = obj;
        this.f124113s |= Integer.MIN_VALUE;
        return this.f124114t.emit(null, this);
    }
}
