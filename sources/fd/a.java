package fd;

import okhttp3.WebSocket;

/* loaded from: classes3.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public bd.b f61740r;

    /* renamed from: s, reason: collision with root package name */
    public WebSocket f61741s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f61742t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f61743u;

    /* renamed from: v, reason: collision with root package name */
    public int f61744v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, bl2.c cVar) {
        super(cVar);
        this.f61743u = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f61742t = obj;
        this.f61744v |= Integer.MIN_VALUE;
        return this.f61743u.a(null, null, this);
    }
}
