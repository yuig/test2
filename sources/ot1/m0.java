package ot1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97608a;

    /* renamed from: b, reason: collision with root package name */
    public final List f97609b;

    public m0(ArrayList scales, boolean z13) {
        Intrinsics.checkNotNullParameter(scales, "scales");
        this.f97608a = z13;
        this.f97609b = scales;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f97608a == m0Var.f97608a && Intrinsics.d(this.f97609b, m0Var.f97609b);
    }

    public final int hashCode() {
        return this.f97609b.hashCode() + (Boolean.hashCode(this.f97608a) * 31);
    }

    public final String toString() {
        return "ScalingList(useDefaultScalingMatrix=" + this.f97608a + ", scales=" + this.f97609b + ")";
    }
}
