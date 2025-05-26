package qr1;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lqr1/w;", "", "", "a", "Z", "()Z", "eligible", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "reasons", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("eligible")
    private final boolean eligible;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("reasons")
    @NotNull
    private final Map<String, String> reasons;

    /* renamed from: a, reason: from getter */
    public final boolean getEligible() {
        return this.eligible;
    }

    /* renamed from: b, reason: from getter */
    public final Map getReasons() {
        return this.reasons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.eligible == wVar.eligible && Intrinsics.d(this.reasons, wVar.reasons);
    }

    public final int hashCode() {
        return this.reasons.hashCode() + (Boolean.hashCode(this.eligible) * 31);
    }

    public final String toString() {
        return "MultiFactorEligibilityData(eligible=" + this.eligible + ", reasons=" + this.reasons + ")";
    }
}
