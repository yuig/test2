package zp0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f142623a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.c f142624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142625c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f142626d;

    public j(int i13, vn1.c textColor, int i14, boolean z13) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f142623a = i13;
        this.f142624b = textColor;
        this.f142625c = i14;
        this.f142626d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f142623a == jVar.f142623a && this.f142624b == jVar.f142624b && this.f142625c == jVar.f142625c && this.f142626d == jVar.f142626d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142626d) + ep.b.b(this.f142625c, (this.f142624b.hashCode() + (Integer.hashCode(this.f142623a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ContextualTypeaheadListViewStyles(backgroundColor=" + this.f142623a + ", textColor=" + this.f142624b + ", avatarSize=" + this.f142625c + ", shouldShowAddButton=" + this.f142626d + ")";
    }
}
