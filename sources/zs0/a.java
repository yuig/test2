package zs0;

import dl2.d;

/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f142749r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f142750s;

    /* renamed from: t, reason: collision with root package name */
    public int f142751t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f142750s = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f142749r = obj;
        this.f142751t |= Integer.MIN_VALUE;
        return this.f142750s.a(0, null, null, null, this);
    }
}
