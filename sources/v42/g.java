package v42;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ni1.y2;
import om1.q;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f124142j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f124143k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f124144l = new g(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f124145i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f124145i) {
            case 0:
                q bind = (q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fm1.a importantForAccessibility = fm1.a.NO;
                bind.getClass();
                Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
                bind.f96685j = importantForAccessibility;
                return Unit.f80348a;
            case 1:
                y2 it = (y2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            default:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return om1.c.e(it2, rm1.q.HANDLE, null, om1.f.TRANSPARENT_ALWAYS_LIGHT, null, null, false, 0, 1018);
        }
    }
}
