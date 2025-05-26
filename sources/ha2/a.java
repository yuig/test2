package ha2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final List f68395a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68396b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f68397c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f68398d;

    public /* synthetic */ a(List list, boolean z13, Integer num, int i13) {
        this(list, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? null : num, (d0) null);
    }

    @Override // ha2.b
    public final Integer a() {
        return this.f68397c;
    }

    @Override // ha2.b
    public final d0 b() {
        return this.f68398d;
    }

    @Override // ha2.b
    public final boolean c() {
        return this.f68396b;
    }

    @Override // ha2.b
    public final List d() {
        return this.f68395a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f68395a, aVar.f68395a) && this.f68396b == aVar.f68396b && Intrinsics.d(this.f68397c, aVar.f68397c) && Intrinsics.d(this.f68398d, aVar.f68398d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f68396b, this.f68395a.hashCode() * 31, 31);
        Integer num = this.f68397c;
        int hashCode = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        d0 d0Var = this.f68398d;
        return hashCode + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ActionSheet(groups=" + this.f68395a + ", showCloseButton=" + this.f68396b + ", titleRes=" + this.f68397c + ", modalMargins=" + this.f68398d + ")";
    }

    public a(List groups, boolean z13, Integer num, d0 d0Var) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f68395a = groups;
        this.f68396b = z13;
        this.f68397c = num;
        this.f68398d = d0Var;
    }
}
