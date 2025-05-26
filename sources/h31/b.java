package h31;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public boolean f66802r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f66803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f66804t;

    /* renamed from: u, reason: collision with root package name */
    public int f66805u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f66804t = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f66803s = obj;
        this.f66805u |= Integer.MIN_VALUE;
        return this.f66804t.a(0, null, null, null, this);
    }
}
