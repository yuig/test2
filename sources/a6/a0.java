package a6;

/* loaded from: classes.dex */
public final class a0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f786r;

    /* renamed from: s, reason: collision with root package name */
    public Object f787s;

    /* renamed from: t, reason: collision with root package name */
    public Object f788t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f789u;

    /* renamed from: v, reason: collision with root package name */
    public j0 f790v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f791w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f792x;

    /* renamed from: y, reason: collision with root package name */
    public int f793y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, bl2.c cVar) {
        super(cVar);
        this.f792x = b0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f791w = obj;
        this.f793y |= Integer.MIN_VALUE;
        return this.f792x.a(null, this);
    }
}
