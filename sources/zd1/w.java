package zd1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lzd1/w;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "filterId", "", "Lzd1/a0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "filterOptionList", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "productFilterType", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("filter_id")
    @NotNull
    private final String filterId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("filter_options")
    @NotNull
    private final List<a0> filterOptionList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("product_filter_type")
    private final Integer productFilterType;

    public w(String filterId, ArrayList filterOptionList, Integer num) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(filterOptionList, "filterOptionList");
        this.filterId = filterId;
        this.filterOptionList = filterOptionList;
        this.productFilterType = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getFilterId() {
        return this.filterId;
    }

    /* renamed from: b, reason: from getter */
    public final List getFilterOptionList() {
        return this.filterOptionList;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getProductFilterType() {
        return this.productFilterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.filterId, wVar.filterId) && Intrinsics.d(this.filterOptionList, wVar.filterOptionList) && Intrinsics.d(this.productFilterType, wVar.productFilterType);
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.filterOptionList, this.filterId.hashCode() * 31, 31);
        Integer num = this.productFilterType;
        return c13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String str = this.filterId;
        List<a0> list = this.filterOptionList;
        Integer num = this.productFilterType;
        StringBuilder sb3 = new StringBuilder("UnifiedFilterApiSpec(filterId=");
        sb3.append(str);
        sb3.append(", filterOptionList=");
        sb3.append(list);
        sb3.append(", productFilterType=");
        return a.c.i(sb3, num, ")");
    }
}
