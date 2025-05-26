package h31;

/* loaded from: classes5.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f66817r;

    /* renamed from: s, reason: collision with root package name */
    public int f66818s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dj0.b f66819t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dj0.b bVar, bl2.c cVar) {
        super(cVar);
        this.f66819t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f66817r = obj;
        this.f66818s |= Integer.MIN_VALUE;
        return this.f66819t.emit(null, this);
    }
}
