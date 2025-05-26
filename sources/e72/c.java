package e72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final i f57626a;

    public c(int i13, i iVar) {
        if ((i13 & 1) == 0) {
            this.f57626a = null;
        } else {
            this.f57626a = iVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f57626a, ((c) obj).f57626a);
    }

    public final int hashCode() {
        i iVar = this.f57626a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "LinkDomainEntity(official_user=" + this.f57626a + ")";
    }
}
