package zd1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lzd1/c0;", "", "", "Lzd1/w;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "filterSpecs", "g4/u", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f141699b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("filters")
    @NotNull
    private final List<w> filterSpecs;

    static {
        new HashSet();
    }

    public c0(ArrayList filterSpecs) {
        Intrinsics.checkNotNullParameter(filterSpecs, "filterSpecs");
        this.filterSpecs = filterSpecs;
    }

    public final String a() {
        String str;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        for (w wVar : this.filterSpecs) {
            if (!wVar.getFilterOptionList().isEmpty()) {
                sb3.append(wVar.getFilterId());
                Integer productFilterType = wVar.getProductFilterType();
                if (productFilterType != null) {
                    int intValue = productFilterType.intValue();
                    sb3.append("_");
                    sb3.append(intValue);
                }
                sb3.append(":");
                ArrayList arrayList2 = new ArrayList();
                for (a0 a0Var : wVar.getFilterOptionList()) {
                    sb3.append(a0Var.getFilterOptionId());
                    if (a0Var instanceof z) {
                        sb3.append("_");
                        z zVar = (z) a0Var;
                        sb3.append(zVar.getNumericValue());
                        String unit = zVar.getUnit();
                        if (unit != null) {
                            sb3.append("_");
                            sb3.append(unit);
                        }
                    } else if (a0Var instanceof b0) {
                        sb3.append("_");
                        sb3.append(((b0) a0Var).f141689b.getValue());
                    } else if ((a0Var instanceof y) && (str = ((y) a0Var).f141778b) != null) {
                        sb3.append("_");
                        sb3.append(str);
                    }
                    String sb4 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                    arrayList2.add(sb4);
                    Intrinsics.checkNotNullParameter(sb3, "<this>");
                    sb3.setLength(0);
                }
                sb3.append(CollectionsKt.Z(arrayList2, ",", null, null, 0, null, null, 62));
                String sb5 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
                arrayList.add(sb5);
                Intrinsics.checkNotNullParameter(sb3, "<this>");
                sb3.setLength(0);
            }
        }
        return CollectionsKt.Z(arrayList, "|", null, null, 0, null, null, 62);
    }

    /* renamed from: b, reason: from getter */
    public final List getFilterSpecs() {
        return this.filterSpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.filterSpecs, ((c0) obj).filterSpecs);
    }

    public final int hashCode() {
        return this.filterSpecs.hashCode();
    }

    public final String toString() {
        return "UnifiedFiltersApiSpec(filterSpecs=" + this.filterSpecs + ")";
    }
}
