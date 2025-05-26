package by1;

/* loaded from: classes4.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public c f24129r;

    /* renamed from: s, reason: collision with root package name */
    public cy1.e f24130s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24131t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f24132u;

    /* renamed from: v, reason: collision with root package name */
    public int f24133v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f24132u = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f24131t = obj;
        this.f24133v |= Integer.MIN_VALUE;
        return this.f24132u.emit(null, this);
    }
}
