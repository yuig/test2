package n1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Function1 f88875r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f88876s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f88877t;

    /* renamed from: u, reason: collision with root package name */
    public int f88878u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, bl2.c cVar) {
        super(cVar);
        this.f88877t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f88876s = obj;
        this.f88878u |= Integer.MIN_VALUE;
        return this.f88877t.c(null, 0.0f, null, this);
    }
}
