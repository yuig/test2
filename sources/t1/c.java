package t1;

/* loaded from: classes2.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public a3.d f115736r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f115737s;

    /* renamed from: t, reason: collision with root package name */
    public int f115738t;

    /* renamed from: u, reason: collision with root package name */
    public int f115739u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f115740v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f115741w;

    /* renamed from: x, reason: collision with root package name */
    public int f115742x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, bl2.c cVar) {
        super(cVar);
        this.f115741w = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f115740v = obj;
        this.f115742x |= Integer.MIN_VALUE;
        return this.f115741w.a(null, this);
    }
}
