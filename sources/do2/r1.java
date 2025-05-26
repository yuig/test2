package do2;

/* loaded from: classes2.dex */
public final class r1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55921r;

    /* renamed from: s, reason: collision with root package name */
    public int f55922s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s1 f55923t;

    /* renamed from: u, reason: collision with root package name */
    public s1 f55924u;

    /* renamed from: v, reason: collision with root package name */
    public j f55925v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f55926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, bl2.c cVar) {
        super(cVar);
        this.f55923t = s1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55921r = obj;
        this.f55922s |= Integer.MIN_VALUE;
        return this.f55923t.collect(null, this);
    }
}
