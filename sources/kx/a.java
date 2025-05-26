package kx;

import bl2.c;
import dl2.d;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: r, reason: collision with root package name */
    public b f81045r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f81046s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f81047t;

    /* renamed from: u, reason: collision with root package name */
    public int f81048u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f81047t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f81046s = obj;
        this.f81048u |= Integer.MIN_VALUE;
        return this.f81047t.a(this);
    }
}
