package w91;

import u50.r;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public r f128591r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f128592s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f128593t;

    /* renamed from: u, reason: collision with root package name */
    public int f128594u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, bl2.c cVar) {
        super(cVar);
        this.f128593t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f128592s = obj;
        this.f128594u |= Integer.MIN_VALUE;
        return f.j(this.f128593t, null, this);
    }
}
