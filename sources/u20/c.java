package u20;

import a7.f;
import ac2.m0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xk2.w;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements ak2.b, ak2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f120065b;

    public /* synthetic */ c(int i13, Function2 function2) {
        this.f120064a = i13;
        this.f120065b = function2;
    }

    @Override // ak2.b
    public final void accept(Object obj, Object obj2) {
        int i13 = this.f120064a;
        Function2 tmp0 = this.f120065b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj, obj2);
                break;
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj, obj2);
                break;
        }
    }

    @Override // ak2.c
    public final Object apply(Object p03, Object p13) {
        int i13 = this.f120064a;
        Function2 tmp0 = this.f120065b;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                return (Function0) tmp0.invoke(p03, p13);
            case 2:
                w p04 = (w) p03;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                Intrinsics.checkNotNullParameter(p04, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                return (w) tmp0.invoke(p04, p13);
            case 3:
            default:
                f fVar = m0.f1992a;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                return (w) tmp0.invoke(p03, p13);
            case 4:
                Pair p05 = (Pair) p03;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                Intrinsics.checkNotNullParameter(p05, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                return (Pair) tmp0.invoke(p05, p13);
            case 5:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                return (hr1.b) tmp0.invoke(p03, p13);
        }
    }
}
