package c71;

import de1.d0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zd1.c0;

/* loaded from: classes5.dex */
public final class p implements de1.e, d0, n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26815a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f26816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f26817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h61.k f26818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wk1.n f26819e;

    public p(h61.k kVar, z zVar, d0 d0Var) {
        this.f26819e = zVar;
        this.f26818d = kVar;
        this.f26816b = d0Var;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        this.f26817c = new q(zVar, 0);
    }

    @Override // de1.d0
    public final void G0(ArrayList updatedProductFilterList, int i13, de1.a filterAction, boolean z13, t32.f fVar, c0 unifiedFiltersApiSpec) {
        switch (this.f26815a) {
            case 0:
                Intrinsics.checkNotNullParameter(updatedProductFilterList, "updatedProductFilterList");
                Intrinsics.checkNotNullParameter(filterAction, "filterAction");
                Intrinsics.checkNotNullParameter(unifiedFiltersApiSpec, "unifiedFiltersApiSpec");
                this.f26816b.G0(updatedProductFilterList, i13, filterAction, z13, fVar, unifiedFiltersApiSpec);
                break;
            default:
                Intrinsics.checkNotNullParameter(updatedProductFilterList, "updatedProductFilterList");
                Intrinsics.checkNotNullParameter(filterAction, "filterAction");
                Intrinsics.checkNotNullParameter(unifiedFiltersApiSpec, "unifiedFiltersApiSpec");
                this.f26816b.G0(updatedProductFilterList, i13, filterAction, z13, fVar, unifiedFiltersApiSpec);
                break;
        }
    }

    @Override // de1.d0
    public final void L(String productFilterType) {
        int i13 = this.f26815a;
        d0 d0Var = this.f26816b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
                d0Var.L(productFilterType);
                break;
            default:
                Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
                d0Var.L(productFilterType);
                break;
        }
    }

    @Override // de1.d0
    public final void Z(ArrayList appliedProductFilters) {
        int i13 = this.f26815a;
        d0 d0Var = this.f26816b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
                d0Var.Z(appliedProductFilters);
                break;
            default:
                Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
                d0Var.Z(appliedProductFilters);
                break;
        }
    }

    @Override // c71.n
    public final void a(h61.k kVar, boolean z13, b0 newSearchParameters, int i13) {
        int i14 = this.f26815a;
        q qVar = this.f26817c;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(newSearchParameters, "newSearchParameters");
                qVar.a(kVar, z13, newSearchParameters, i13);
                break;
            default:
                Intrinsics.checkNotNullParameter(newSearchParameters, "newSearchParameters");
                qVar.a(kVar, z13, newSearchParameters, i13);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0139, code lost:
    
        if (r11 != null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(zd1.c0 r39, java.util.ArrayList r40, int r41, de1.a r42) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.p.b(zd1.c0, java.util.ArrayList, int, de1.a):void");
    }

    @Override // de1.d0
    public final void b5(String productFilterType) {
        int i13 = this.f26815a;
        d0 d0Var = this.f26816b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
                d0Var.b5(productFilterType);
                break;
            default:
                Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
                d0Var.b5(productFilterType);
                break;
        }
    }

    @Override // de1.g
    public final /* bridge */ /* synthetic */ void g2(Object obj, ArrayList arrayList, int i13, de1.a aVar) {
        switch (this.f26815a) {
            case 0:
                b((c0) obj, arrayList, i13, aVar);
                break;
            default:
                b((c0) obj, arrayList, i13, aVar);
                break;
        }
    }

    public p(h61.k kVar, m mVar, d0 d0Var) {
        this.f26819e = mVar;
        this.f26818d = kVar;
        this.f26816b = d0Var;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        this.f26817c = new q(mVar, 1);
    }
}
