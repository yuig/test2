package wr1;

/* loaded from: classes4.dex */
public final class c1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d1 f130949r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f130950s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f130951t;

    /* renamed from: u, reason: collision with root package name */
    public int f130952u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(androidx.appcompat.widget.q qVar, bl2.c cVar) {
        super(cVar);
        this.f130951t = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f130950s = obj;
        this.f130952u |= Integer.MIN_VALUE;
        return this.f130951t.i(null, this);
    }
}
