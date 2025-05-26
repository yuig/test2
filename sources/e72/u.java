package e72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* renamed from: a, reason: collision with root package name */
    public final String f57688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57689b;

    public u(int i13, String str, String str2) {
        if ((i13 & 1) == 0) {
            this.f57688a = null;
        } else {
            this.f57688a = str;
        }
        if ((i13 & 2) == 0) {
            this.f57689b = null;
        } else {
            this.f57689b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f57688a, uVar.f57688a) && Intrinsics.d(this.f57689b, uVar.f57689b);
    }

    public final int hashCode() {
        String str = this.f57688a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57689b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummaryEntity(site_name=");
        sb3.append(this.f57688a);
        sb3.append(", display_description=");
        return a.a.p(sb3, this.f57689b, ")");
    }
}
