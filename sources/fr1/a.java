package fr1;

import dl2.d;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: r, reason: collision with root package name */
    public c f62815r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f62816s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f62817t;

    /* renamed from: u, reason: collision with root package name */
    public int f62818u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f62817t = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f62816s = obj;
        this.f62818u |= Integer.MIN_VALUE;
        return this.f62817t.b(this);
    }
}
