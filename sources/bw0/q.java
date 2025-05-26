package bw0;

import androidx.lifecycle.m0;
import java.util.Iterator;
import java.util.List;
import kb.s0;
import kb.t0;
import kotlin.jvm.internal.Intrinsics;
import uj2.c0;

/* loaded from: classes5.dex */
public final class q implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f24015a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f24016b;

    public q(String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.f24015a = pageId;
    }

    @Override // androidx.lifecycle.m0
    public final void a(Object obj) {
        Object obj2;
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((t0) obj2).f79032c.contains(this.f24015a)) {
                    break;
                }
            }
        }
        t0 t0Var = (t0) obj2;
        if (t0Var == null) {
            return;
        }
        int[] iArr = p.f24014a;
        s0 s0Var = t0Var.f79031b;
        if (iArr[s0Var.ordinal()] != 1) {
            c0 c0Var = this.f24016b;
            if (c0Var != null) {
                ((kk2.a) c0Var).b(s0Var);
            } else {
                Intrinsics.r("emitter");
                throw null;
            }
        }
    }
}
