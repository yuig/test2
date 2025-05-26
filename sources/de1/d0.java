package de1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface d0 {
    static /* synthetic */ void b3(d0 d0Var, ArrayList arrayList, int i13, a aVar, boolean z13, t32.f fVar, int i14) {
        if ((i14 & 8) != 0) {
            z13 = true;
        }
        boolean z14 = z13;
        if ((i14 & 16) != 0) {
            fVar = null;
        }
        d0Var.G0(arrayList, i13, aVar, z14, fVar, new zd1.c0(new ArrayList()));
    }

    default void G0(ArrayList updatedProductFilterList, int i13, a filterAction, boolean z13, t32.f fVar, zd1.c0 unifiedFiltersApiSpec) {
        Intrinsics.checkNotNullParameter(updatedProductFilterList, "updatedProductFilterList");
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
        Intrinsics.checkNotNullParameter(unifiedFiltersApiSpec, "unifiedFiltersApiSpec");
    }

    default void L(String productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
    }

    default void Z(ArrayList appliedProductFilters) {
        Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
    }

    default void b5(String productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
    }
}
