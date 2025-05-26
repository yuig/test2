package jz0;

import i90.i;

/* loaded from: classes5.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f77763r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f77764s;

    /* renamed from: t, reason: collision with root package name */
    public int f77765t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, bl2.c cVar) {
        super(cVar);
        this.f77764s = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f77763r = obj;
        this.f77765t |= Integer.MIN_VALUE;
        return this.f77764s.a(0, null, null, null, this);
    }
}
