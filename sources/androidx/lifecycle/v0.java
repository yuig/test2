package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f18698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f18699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f18700c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f18701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ao2.m f18702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mo2.a f18703f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f18704g;

    public v0(q qVar, kotlin.jvm.internal.j0 j0Var, ao2.j0 j0Var2, q qVar2, ao2.o oVar, mo2.c cVar, Function2 function2) {
        this.f18698a = qVar;
        this.f18699b = j0Var;
        this.f18700c = j0Var2;
        this.f18701d = qVar2;
        this.f18702e = oVar;
        this.f18703f = cVar;
        this.f18704g = function2;
    }

    @Override // androidx.lifecycle.x
    public final void c(z zVar, q event) {
        Intrinsics.checkNotNullParameter(zVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f18698a;
        kotlin.jvm.internal.j0 j0Var = this.f18699b;
        if (event == qVar) {
            j0Var.f80434a = kotlin.jvm.internal.j.z(this.f18700c, null, null, new u0(this.f18703f, this.f18704g, null), 3);
            return;
        }
        if (event == this.f18701d) {
            ao2.o1 o1Var = (ao2.o1) j0Var.f80434a;
            if (o1Var != null) {
                o1Var.cancel((CancellationException) null);
            }
            j0Var.f80434a = null;
        }
        if (event == q.ON_DESTROY) {
            xk2.q qVar2 = xk2.s.f135225b;
            this.f18702e.resumeWith(Unit.f80348a);
        }
    }
}
