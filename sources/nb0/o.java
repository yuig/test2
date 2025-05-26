package nb0;

import java.util.Set;

/* loaded from: classes5.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Set f90290r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f90291s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f90292t;

    /* renamed from: u, reason: collision with root package name */
    public int f90293u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90292t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90291s = obj;
        this.f90293u |= Integer.MIN_VALUE;
        return t.v(this.f90292t, null, null, this);
    }
}
