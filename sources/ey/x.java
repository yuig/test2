package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends my.b {

    /* renamed from: e, reason: collision with root package name */
    public final q1 f60613e;

    /* renamed from: f, reason: collision with root package name */
    public final s92.o f60614f;

    /* renamed from: g, reason: collision with root package name */
    public final h32.d4 f60615g;

    /* renamed from: h, reason: collision with root package name */
    public final h32.a4 f60616h;

    /* renamed from: i, reason: collision with root package name */
    public final ny.f f60617i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f60618j;

    /* renamed from: k, reason: collision with root package name */
    public final int f60619k;

    /* renamed from: l, reason: collision with root package name */
    public final String f60620l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q1 pwtSearchType, s92.o pwtResult, h32.d4 viewType, h32.a4 viewParameterType, ny.f fVar, e0 e0Var, int i13, String str, int i14) {
        super(pwtSearchType);
        fVar = (i14 & 16) != 0 ? null : fVar;
        e0Var = (i14 & 32) != 0 ? null : e0Var;
        i13 = (i14 & 64) != 0 ? -1 : i13;
        Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        this.f60613e = pwtSearchType;
        this.f60614f = pwtResult;
        this.f60615g = viewType;
        this.f60616h = viewParameterType;
        this.f60617i = fVar;
        this.f60618j = e0Var;
        this.f60619k = i13;
        this.f60620l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f60613e == xVar.f60613e && this.f60614f == xVar.f60614f && this.f60615g == xVar.f60615g && this.f60616h == xVar.f60616h && Intrinsics.d(this.f60617i, xVar.f60617i) && Intrinsics.d(this.f60618j, xVar.f60618j) && this.f60619k == xVar.f60619k && Intrinsics.d(this.f60620l, xVar.f60620l);
    }

    public final int hashCode() {
        int hashCode = (this.f60616h.hashCode() + ((this.f60615g.hashCode() + ((this.f60614f.hashCode() + (this.f60613e.hashCode() * 31)) * 31)) * 31)) * 31;
        ny.f fVar = this.f60617i;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e0 e0Var = this.f60618j;
        int b13 = ep.b.b(this.f60619k, (hashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31, 31);
        String str = this.f60620l;
        return b13 + (str != null ? str.hashCode() : 0);
    }

    public final s92.o l() {
        return this.f60614f;
    }

    public final int m() {
        return this.f60619k;
    }

    public final String toString() {
        return "SearchCompleteEvent(pwtSearchType=" + this.f60613e + ", pwtResult=" + this.f60614f + ", viewType=" + this.f60615g + ", viewParameterType=" + this.f60616h + ", feedPinCellTypeCounts=" + this.f60617i + ", feedStoryContainerTypeCounts=" + this.f60618j + ", sourceFragmentId=" + this.f60619k + ", queryVerticals=" + this.f60620l + ")";
    }
}
