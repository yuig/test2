package b4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e0 implements r2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f21546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f21547b;

    public e0(a0 a0Var, b0 b0Var) {
        this.f21546a = a0Var;
        this.f21547b = b0Var;
    }

    @Override // r2.p
    public final Object a(r2.c cVar, Object obj) {
        return this.f21546a.invoke(cVar, obj);
    }
}
