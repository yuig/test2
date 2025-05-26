package do2;

/* loaded from: classes4.dex */
public final class s extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55927r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f55928s;

    /* renamed from: t, reason: collision with root package name */
    public int f55929t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, bl2.c cVar) {
        super(cVar);
        this.f55928s = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55927r = obj;
        this.f55929t |= Integer.MIN_VALUE;
        return this.f55928s.emit(null, this);
    }
}
