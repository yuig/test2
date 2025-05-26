package zd1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0005¨\u0006\u000e"}, d2 = {"Lzd1/z;", "Lzd1/a0;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "filterOptionId", "", "b", "I", "()I", "numericValue", "c", "unit", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class z extends a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("filter_option_id")
    @NotNull
    private final String filterOptionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("numeric_value")
    private final int numericValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("unit")
    private final String unit;

    public z(String filterOptionId, int i13, String str) {
        Intrinsics.checkNotNullParameter(filterOptionId, "filterOptionId");
        this.filterOptionId = filterOptionId;
        this.numericValue = i13;
        this.unit = str;
    }

    @Override // zd1.a0
    /* renamed from: a, reason: from getter */
    public final String getFilterOptionId() {
        return this.filterOptionId;
    }

    /* renamed from: b, reason: from getter */
    public final int getNumericValue() {
        return this.numericValue;
    }

    /* renamed from: c, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.filterOptionId, zVar.filterOptionId) && this.numericValue == zVar.numericValue && Intrinsics.d(this.unit, zVar.unit);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.numericValue, this.filterOptionId.hashCode() * 31, 31);
        String str = this.unit;
        return b13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.filterOptionId;
        int i13 = this.numericValue;
        return a.a.p(a.a.v("UnifiedFilterNumericOptionApiSpec(filterOptionId=", str, ", numericValue=", i13, ", unit="), this.unit, ")");
    }
}
