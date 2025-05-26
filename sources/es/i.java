package es;

import g72.d2;
import g72.f0;
import g72.h2;
import java.util.function.BiFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f59985b;

    public /* synthetic */ i(int i13, Function2 function2) {
        this.f59984a = i13;
        this.f59985b = function2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i13 = this.f59984a;
        Function2 tmp0 = this.f59985b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 1:
                en0.b bVar = en0.c.f59644a;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 3:
                f0 f0Var = f0.f63980b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 4:
                f0 f0Var2 = f0.f63980b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 5:
                d2 d2Var = d2.f63965b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 6:
                d2 d2Var2 = d2.f63965b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            case 7:
                h2 h2Var = h2.f64001b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
            default:
                h2 h2Var2 = h2.f64001b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                break;
        }
        return (ro2.n) tmp0.invoke(obj, obj2);
    }
}
