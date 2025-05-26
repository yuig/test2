package yc;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Map f138653r;

    /* renamed from: s, reason: collision with root package name */
    public Set f138654s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f138655t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f138656u;

    /* renamed from: v, reason: collision with root package name */
    public int f138657v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, bl2.c cVar) {
        super(cVar);
        this.f138656u = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138655t = obj;
        this.f138657v |= Integer.MIN_VALUE;
        return this.f138656u.h(null, null, null, null, this, false);
    }
}
