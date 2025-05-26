package xs0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class h implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f135814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f135815b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135816c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f135817d;

    public /* synthetic */ h(v7 v7Var, boolean z13, boolean z14, int i13) {
        this(v7Var, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? false : z14, new l0((h32.i0) null, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f135814a, hVar.f135814a) && this.f135815b == hVar.f135815b && this.f135816c == hVar.f135816c && Intrinsics.d(this.f135817d, hVar.f135817d);
    }

    public final int hashCode() {
        return this.f135817d.hashCode() + ep.b.e(this.f135816c, ep.b.e(this.f135815b, this.f135814a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SbaHfBoardToggleSettingCellVMState(board=" + this.f135814a + ", isUupDsaLaunchAndroidEnabled=" + this.f135815b + ", dsaOptedOut=" + this.f135816c + ", pinalyticsVMState=" + this.f135817d + ")";
    }

    public h(v7 board, boolean z13, boolean z14, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f135814a = board;
        this.f135815b = z13;
        this.f135816c = z14;
        this.f135817d = pinalyticsVMState;
    }
}
