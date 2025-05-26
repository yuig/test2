package w2;

/* loaded from: classes.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f127607r;

    /* renamed from: s, reason: collision with root package name */
    public co2.e f127608s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f127609t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f127610u;

    /* renamed from: v, reason: collision with root package name */
    public int f127611v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, bl2.c cVar) {
        super(cVar);
        this.f127610u = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f127609t = obj;
        this.f127611v |= Integer.MIN_VALUE;
        return this.f127610u.a(this);
    }
}
