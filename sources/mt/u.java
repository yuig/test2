package mt;

/* loaded from: classes3.dex */
public final class u extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88132r;

    /* renamed from: s, reason: collision with root package name */
    public int f88133s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f88134t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f88134t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f88132r = obj;
        this.f88133s |= Integer.MIN_VALUE;
        return this.f88134t.emit(null, this);
    }
}
