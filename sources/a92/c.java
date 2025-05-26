package a92;

/* loaded from: classes4.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f1585r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1586s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f1587t;

    /* renamed from: u, reason: collision with root package name */
    public int f1588u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, bl2.c cVar) {
        super(cVar);
        this.f1587t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f1586s = obj;
        this.f1588u |= Integer.MIN_VALUE;
        return this.f1587t.a(this);
    }
}
