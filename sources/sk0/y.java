package sk0;

import a.cb;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class y implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f113090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113091b;

    /* renamed from: c, reason: collision with root package name */
    public final String f113092c;

    /* renamed from: d, reason: collision with root package name */
    public final String f113093d;

    /* renamed from: e, reason: collision with root package name */
    public final int f113094e;

    /* renamed from: f, reason: collision with root package name */
    public final int f113095f;

    /* renamed from: g, reason: collision with root package name */
    public final int f113096g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f113097h;

    public y(List boardToolList, String boardId, String str, String str2, int i13, int i14, int i15, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(boardToolList, "boardToolList");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f113090a = boardToolList;
        this.f113091b = boardId;
        this.f113092c = str;
        this.f113093d = str2;
        this.f113094e = i13;
        this.f113095f = i14;
        this.f113096g = i15;
        this.f113097h = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f113090a, yVar.f113090a) && Intrinsics.d(this.f113091b, yVar.f113091b) && Intrinsics.d(this.f113092c, yVar.f113092c) && Intrinsics.d(this.f113093d, yVar.f113093d) && this.f113094e == yVar.f113094e && this.f113095f == yVar.f113095f && this.f113096g == yVar.f113096g && Intrinsics.d(this.f113097h, yVar.f113097h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f113091b, this.f113090a.hashCode() * 31, 31);
        String str = this.f113092c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f113093d;
        return this.f113097h.hashCode() + ep.b.b(this.f113096g, ep.b.b(this.f113095f, ep.b.b(this.f113094e, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "FloatingToolbarVMState(boardToolList=" + this.f113090a + ", boardId=" + this.f113091b + ", boardSessionId=" + this.f113092c + ", sectionId=" + this.f113093d + ", sectionlessPinCount=" + this.f113094e + ", pinCount=" + this.f113095f + ", sectionCount=" + this.f113096g + ", pinalyticsVMState=" + this.f113097h + ")";
    }

    public y(String str, String str2, String str3, l0 l0Var, int i13) {
        this(q0.f80391a, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, 0, 0, 0, l0Var);
    }
}
