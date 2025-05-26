package gd0;

import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List p03 = (List) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        f fVar = (f) this.receiver;
        fVar.getClass();
        return p03.isEmpty() ? q0.f80391a : e0.b(new hd0.a(p03, fVar.f64813l));
    }
}
