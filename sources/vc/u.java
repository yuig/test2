package vc;

/* loaded from: classes3.dex */
public final class u extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public v f125574r;

    /* renamed from: s, reason: collision with root package name */
    public pc.h f125575s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f125576t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f125577u;

    /* renamed from: v, reason: collision with root package name */
    public int f125578v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, bl2.c cVar) {
        super(cVar);
        this.f125577u = vVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f125576t = obj;
        this.f125578v |= Integer.MIN_VALUE;
        return this.f125577u.emit(null, this);
    }
}
