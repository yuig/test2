package l5;

/* loaded from: classes.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f81559r;

    /* renamed from: s, reason: collision with root package name */
    public int f81560s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f81561t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f81561t = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f81559r = obj;
        this.f81560s |= Integer.MIN_VALUE;
        return this.f81561t.emit(null, this);
    }
}
