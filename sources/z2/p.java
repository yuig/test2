package z2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f140646a = l.f140629i;

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return this.f140646a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(this.f140646a, ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f140646a.hashCode();
    }
}
