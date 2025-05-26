package cn0;

import co2.z;

/* loaded from: classes5.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public z f28090r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f28091s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f28092t;

    /* renamed from: u, reason: collision with root package name */
    public int f28093u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, bl2.c cVar) {
        super(cVar);
        this.f28092t = uVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f28091s = obj;
        this.f28093u |= Integer.MIN_VALUE;
        return u.a(this.f28092t, null, this);
    }
}
