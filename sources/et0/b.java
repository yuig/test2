package et0;

import dl2.d;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f60018r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zs0.c f60019s;

    /* renamed from: t, reason: collision with root package name */
    public int f60020t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zs0.c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f60019s = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f60018r = obj;
        this.f60020t |= Integer.MIN_VALUE;
        return this.f60019s.a(0, null, null, null, this);
    }
}
