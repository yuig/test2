package i72;

/* loaded from: classes4.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public g f71685r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f71686s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f71687t;

    /* renamed from: u, reason: collision with root package name */
    public int f71688u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, bl2.c cVar) {
        super(cVar);
        this.f71687t = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f71686s = obj;
        this.f71688u |= Integer.MIN_VALUE;
        return this.f71687t.b(null, this);
    }
}
