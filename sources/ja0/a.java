package ja0;

/* loaded from: classes5.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public b f75288r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f75289s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f75290t;

    /* renamed from: u, reason: collision with root package name */
    public int f75291u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, bl2.c cVar) {
        super(cVar);
        this.f75290t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f75289s = obj;
        this.f75291u |= Integer.MIN_VALUE;
        return this.f75290t.a(0, null, null, null, this);
    }
}
