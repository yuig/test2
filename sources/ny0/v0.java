package ny0;

/* loaded from: classes5.dex */
public final class v0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public String f92636r;

    /* renamed from: s, reason: collision with root package name */
    public int f92637s;

    /* renamed from: t, reason: collision with root package name */
    public int f92638t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f92639u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f92640v;

    /* renamed from: w, reason: collision with root package name */
    public int f92641w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.appcompat.widget.q qVar, bl2.c cVar) {
        super(cVar);
        this.f92640v = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92639u = obj;
        this.f92641w |= Integer.MIN_VALUE;
        return this.f92640v.i(null, this);
    }
}
