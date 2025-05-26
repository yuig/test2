package z2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends u2.p implements d {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f140604n;

    /* renamed from: o, reason: collision with root package name */
    public v f140605o;

    @Override // z2.d
    public final void x(x xVar) {
        if (Intrinsics.d(this.f140605o, xVar)) {
            return;
        }
        this.f140605o = xVar;
        this.f140604n.invoke(xVar);
    }
}
