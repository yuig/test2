package w91;

import e82.w;
import u50.r;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f128595r;

    /* renamed from: s, reason: collision with root package name */
    public w f128596s;

    /* renamed from: t, reason: collision with root package name */
    public r f128597t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f128598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f128599v;

    /* renamed from: w, reason: collision with root package name */
    public int f128600w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, bl2.c cVar) {
        super(cVar);
        this.f128599v = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f128598u = obj;
        this.f128600w |= Integer.MIN_VALUE;
        return f.k(this.f128599v, false, null, null, this);
    }
}
