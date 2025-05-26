package qr1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lqr1/n;", "", "", "Lt92/c;", "a", "Ljava/util/List;", "()Ljava/util/List;", "requirements", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("requirements")
    @NotNull
    private final List<t92.c> requirements;

    public n(yk2.b requirements) {
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        this.requirements = requirements;
    }

    /* renamed from: a, reason: from getter */
    public final List getRequirements() {
        return this.requirements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.requirements, ((n) obj).requirements);
    }

    public final int hashCode() {
        return this.requirements.hashCode();
    }

    public final String toString() {
        return "ComplianceResult(requirements=" + this.requirements + ")";
    }
}
