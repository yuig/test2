package xl2;

import dm2.i0;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b1;
import pn2.u0;

/* loaded from: classes2.dex */
public final class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f135275c;

    public /* synthetic */ j(int i13, Object obj, Object obj2) {
        this.f135273a = i13;
        this.f135275c = obj;
        this.f135274b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f135273a;
        Object obj = this.f135275c;
        switch (i13) {
            case 0:
                l lVar = (l) obj;
                i0 i0Var = lVar.f135280a;
                Object obj2 = this.f135274b;
                if (i0Var == null) {
                    lVar.f135280a = (i0) obj2;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + lVar.f135280a + " (attempting to reset to " + ((i0) obj2) + ")");
            default:
                u0.f100848b.getClass();
                u0 u0Var = u0.f100849c;
                b1 e13 = ((dm2.j) obj).e();
                List emptyList = Collections.emptyList();
                h getScope = new h(this, 2);
                Intrinsics.checkNotNullParameter(getScope, "getScope");
                on2.c NO_LOCKS = on2.q.f96785e;
                Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
                return pn2.g.r(emptyList, new in2.j(NO_LOCKS, getScope), u0Var, e13, false);
        }
    }
}
