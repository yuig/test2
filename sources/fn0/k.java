package fn0;

import co2.z;

/* loaded from: classes5.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public z f62632r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f62633s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.f f62634t;

    /* renamed from: u, reason: collision with root package name */
    public int f62635u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f62634t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f62633s = obj;
        this.f62635u |= Integer.MIN_VALUE;
        return this.f62634t.c(null, this);
    }
}
