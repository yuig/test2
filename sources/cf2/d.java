package cf2;

import ao2.v;

/* loaded from: classes4.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f27659r;

    /* renamed from: s, reason: collision with root package name */
    public v f27660s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27661t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y1.b f27662u;

    /* renamed from: v, reason: collision with root package name */
    public int f27663v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y1.b bVar, bl2.c cVar) {
        super(cVar);
        this.f27662u = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f27661t = obj;
        this.f27663v |= Integer.MIN_VALUE;
        return this.f27662u.c(null, this);
    }
}
