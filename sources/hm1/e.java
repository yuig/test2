package hm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements gm1.a, m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f69580b;

    public e(int i13, Function1 function) {
        this.f69579a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f69580b = function;
            return;
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f69580b = function;
            return;
        }
        if (i13 == 3) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f69580b = function;
        } else if (i13 == 4) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f69580b = function;
        } else if (i13 != 5) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f69580b = function;
        } else {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f69580b = function;
        }
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        int i13 = this.f69579a;
        Function1 function1 = this.f69580b;
        switch (i13) {
        }
        return function1;
    }

    public final boolean equals(Object obj) {
        switch (this.f69579a) {
            case 0:
                if ((obj instanceof gm1.a) && (obj instanceof m)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof gm1.a) && (obj instanceof m)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof gm1.a) && (obj instanceof m)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof gm1.a) && (obj instanceof m)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof gm1.a) && (obj instanceof m)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof gm1.a) && (obj instanceof m)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(c(), ((m) obj).c());
    }

    @Override // gm1.a
    public final /* synthetic */ void h3(gm1.c cVar) {
        int i13 = this.f69579a;
        Function1 function1 = this.f69580b;
        switch (i13) {
            case 0:
                function1.invoke(cVar);
                break;
            case 1:
                function1.invoke(cVar);
                break;
            case 2:
                function1.invoke(cVar);
                break;
            case 3:
                function1.invoke(cVar);
                break;
            case 4:
                function1.invoke(cVar);
                break;
            default:
                function1.invoke(cVar);
                break;
        }
    }

    public final int hashCode() {
        switch (this.f69579a) {
        }
        return c().hashCode();
    }
}
