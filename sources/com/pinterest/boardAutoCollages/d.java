package com.pinterest.boardAutoCollages;

import com.pinterest.api.model.fi0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final fi0 f44549a;

    public /* synthetic */ d() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f44549a, ((d) obj).f44549a);
    }

    public final int hashCode() {
        fi0 fi0Var = this.f44549a;
        if (fi0Var == null) {
            return 0;
        }
        return fi0Var.hashCode();
    }

    public final String toString() {
        return "BoardAutoCollageItem(model=" + this.f44549a + ")";
    }

    public d(fi0 fi0Var) {
        this.f44549a = fi0Var;
    }
}
