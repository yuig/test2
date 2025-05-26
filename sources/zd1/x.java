package zd1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzd1/x;", "Lzd1/a0;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "filterOptionId", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class x extends a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("filter_option_id")
    @NotNull
    private final String filterOptionId;

    public x(String filterOptionId) {
        Intrinsics.checkNotNullParameter(filterOptionId, "filterOptionId");
        this.filterOptionId = filterOptionId;
    }

    @Override // zd1.a0
    /* renamed from: a, reason: from getter */
    public final String getFilterOptionId() {
        return this.filterOptionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.filterOptionId, ((x) obj).filterOptionId);
    }

    public final int hashCode() {
        return this.filterOptionId.hashCode();
    }

    public final String toString() {
        return a.a.k("UnifiedFilterBasicOptionApiSpec(filterOptionId=", this.filterOptionId, ")");
    }
}
