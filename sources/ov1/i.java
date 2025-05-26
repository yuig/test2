package ov1;

import de1.d0;
import de1.f0;
import de1.m0;
import de1.o0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zd1.c0;
import zd1.e0;

/* loaded from: classes4.dex */
public final class i implements de1.e, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f97730a;

    public i(k kVar) {
        this.f97730a = kVar;
    }

    @Override // de1.d0
    public final void G0(ArrayList updatedProductFilterList, int i13, de1.a filterAction, boolean z13, t32.f fVar, c0 unifiedFiltersApiSpec) {
        Intrinsics.checkNotNullParameter(updatedProductFilterList, "updatedProductFilterList");
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
        Intrinsics.checkNotNullParameter(unifiedFiltersApiSpec, "unifiedFiltersApiSpec");
        de1.a aVar = de1.a.APPLY;
        k kVar = this.f97730a;
        if (filterAction == aVar) {
            e0 e0Var = kVar.f97749q;
            if (e0Var != null) {
                e0Var.h(String.valueOf(fVar != null ? Integer.valueOf(fVar.getValue()) : null), updatedProductFilterList);
            }
            kVar.f97747o.Q3(fVar, updatedProductFilterList);
        } else {
            e0 e0Var2 = kVar.f97749q;
            if (e0Var2 != null) {
                e0Var2.g(String.valueOf(fVar != null ? Integer.valueOf(fVar.getValue()) : null));
            }
            kVar.f97747o.G3(fVar);
        }
        d0 d0Var = kVar.f97748p;
        if (d0Var != null) {
            d0Var.G0(updatedProductFilterList, i13, filterAction, z13, fVar, unifiedFiltersApiSpec);
        }
        e0 e0Var3 = kVar.f97749q;
        if (e0Var3 != null) {
            ArrayList e13 = e0Var3.e(null);
            d0 d0Var2 = kVar.f97748p;
            if (d0Var2 != null) {
                d0Var2.Z(e13);
            }
        }
    }

    @Override // de1.d0
    public final void L(String productFilterType) {
        ArrayList filterList;
        zd1.d0 d0Var;
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        k kVar = this.f97730a;
        e0 e0Var = kVar.f97749q;
        if (e0Var != null && (filterList = e0Var.d(productFilterType)) != null && (d0Var = kVar.f97750r) != null) {
            o0 o0Var = ((m0) d0Var).f54607m;
            if (!(o0Var instanceof f0)) {
                o0Var = null;
            }
            if (o0Var != null) {
                Intrinsics.checkNotNullParameter(filterList, "filterList");
                Intrinsics.checkNotNullParameter(filterList, "<set-?>");
                o0Var.f54565i = filterList;
                o0Var.x3(filterList);
                o0Var.J3(o0Var.f54565i);
                o0Var.f54617u = true;
            }
        }
        super.L(productFilterType);
    }

    @Override // de1.g
    public final void g2(Object obj, ArrayList selectedProductFilters, int i13, de1.a filterAction) {
        c0 filterApiSpec = (c0) obj;
        Intrinsics.checkNotNullParameter(filterApiSpec, "filterApiSpec");
        Intrinsics.checkNotNullParameter(selectedProductFilters, "selectedProductFilters");
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
    }
}
