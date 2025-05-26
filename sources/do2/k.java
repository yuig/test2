package do2;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55829r;

    /* renamed from: s, reason: collision with root package name */
    public int f55830s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f55831t;

    /* renamed from: u, reason: collision with root package name */
    public j f55832u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f55833v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bl2.c cVar) {
        super(cVar);
        this.f55831t = lVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55829r = obj;
        this.f55830s |= Integer.MIN_VALUE;
        return this.f55831t.collect(null, this);
    }
}
