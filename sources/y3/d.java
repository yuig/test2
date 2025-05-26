package y3;

/* loaded from: classes2.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public g f136696r;

    /* renamed from: s, reason: collision with root package name */
    public Object f136697s;

    /* renamed from: t, reason: collision with root package name */
    public n4.i f136698t;

    /* renamed from: u, reason: collision with root package name */
    public int f136699u;

    /* renamed from: v, reason: collision with root package name */
    public int f136700v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f136701w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f136702x;

    /* renamed from: y, reason: collision with root package name */
    public int f136703y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, bl2.c cVar) {
        super(cVar);
        this.f136702x = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f136701w = obj;
        this.f136703y |= Integer.MIN_VALUE;
        return g.a(this.f136702x, null, null, this);
    }
}
