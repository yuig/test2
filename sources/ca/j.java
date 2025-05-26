package ca;

import androidx.lifecycle.m0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements m0, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f27050a;

    public j(e.f function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f27050a = function;
    }

    @Override // androidx.lifecycle.m0
    public final /* synthetic */ void a(Object obj) {
        this.f27050a.invoke(obj);
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return this.f27050a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof m0) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(this.f27050a, ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f27050a.hashCode();
    }
}
