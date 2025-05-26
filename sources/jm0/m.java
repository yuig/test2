package jm0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements s42.d, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f76996b;

    public m(int i13, Function0 function) {
        this.f76995a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f76996b = function;
        } else {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f76996b = function;
        }
    }

    @Override // s42.d
    public final /* synthetic */ void b() {
        int i13 = this.f76995a;
        Function0 function0 = this.f76996b;
        switch (i13) {
            case 0:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return this.f76996b;
    }

    public final boolean equals(Object obj) {
        int i13 = this.f76995a;
        Function0 function0 = this.f76996b;
        switch (i13) {
            case 0:
                if ((obj instanceof s42.d) && (obj instanceof kotlin.jvm.internal.m)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof s42.d) && (obj instanceof kotlin.jvm.internal.m)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(function0, ((kotlin.jvm.internal.m) obj).c());
    }

    public final int hashCode() {
        int i13 = this.f76995a;
        Function0 function0 = this.f76996b;
        switch (i13) {
        }
        return function0.hashCode();
    }
}
