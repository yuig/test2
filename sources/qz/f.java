package qz;

/* loaded from: classes3.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f105393r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f105394s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f105395t;

    /* renamed from: u, reason: collision with root package name */
    public int f105396u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, bl2.c cVar) {
        super(cVar);
        this.f105395t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f105394s = obj;
        this.f105396u |= Integer.MIN_VALUE;
        return this.f105395t.b(null, 0, 0, this);
    }
}
