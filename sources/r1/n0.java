package r1;

import k1.v1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f105940r;

    /* renamed from: s, reason: collision with root package name */
    public v1 f105941s;

    /* renamed from: t, reason: collision with root package name */
    public Function2 f105942t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f105943u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f105944v;

    /* renamed from: w, reason: collision with root package name */
    public int f105945w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f105944v = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f105943u = obj;
        this.f105945w |= Integer.MIN_VALUE;
        return this.f105944v.b(null, null, this);
    }
}
