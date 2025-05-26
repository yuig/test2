package w21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f127740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f127741b;

    /* renamed from: c, reason: collision with root package name */
    public final List f127742c;

    /* renamed from: d, reason: collision with root package name */
    public final List f127743d;

    /* renamed from: e, reason: collision with root package name */
    public final List f127744e;

    /* renamed from: f, reason: collision with root package name */
    public final List f127745f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f127746g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.a0 f127747h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f127748i;

    public m(String title, int i13, List indices, List options, List enabled, List chosenOptions, boolean z13, zy.a0 pinalyticsDisplayState, boolean z14) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(indices, "indices");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        Intrinsics.checkNotNullParameter(chosenOptions, "chosenOptions");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f127740a = title;
        this.f127741b = i13;
        this.f127742c = indices;
        this.f127743d = options;
        this.f127744e = enabled;
        this.f127745f = chosenOptions;
        this.f127746g = z13;
        this.f127747h = pinalyticsDisplayState;
        this.f127748i = z14;
    }

    public static m e(m mVar, String str, int i13, List list, List list2, boolean z13, int i14) {
        String title = (i14 & 1) != 0 ? mVar.f127740a : str;
        int i15 = (i14 & 2) != 0 ? mVar.f127741b : i13;
        List indices = mVar.f127742c;
        List options = (i14 & 8) != 0 ? mVar.f127743d : list;
        List enabled = mVar.f127744e;
        List chosenOptions = (i14 & 32) != 0 ? mVar.f127745f : list2;
        zy.a0 pinalyticsDisplayState = mVar.f127747h;
        boolean z14 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? mVar.f127748i : false;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(indices, "indices");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        Intrinsics.checkNotNullParameter(chosenOptions, "chosenOptions");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new m(title, i15, indices, options, enabled, chosenOptions, z13, pinalyticsDisplayState, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f127740a, mVar.f127740a) && this.f127741b == mVar.f127741b && Intrinsics.d(this.f127742c, mVar.f127742c) && Intrinsics.d(this.f127743d, mVar.f127743d) && Intrinsics.d(this.f127744e, mVar.f127744e) && Intrinsics.d(this.f127745f, mVar.f127745f) && this.f127746g == mVar.f127746g && Intrinsics.d(this.f127747h, mVar.f127747h) && this.f127748i == mVar.f127748i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127748i) + ((this.f127747h.hashCode() + ep.b.e(this.f127746g, ep.b.c(this.f127745f, ep.b.c(this.f127744e, ep.b.c(this.f127743d, ep.b.c(this.f127742c, ep.b.b(this.f127741b, this.f127740a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinOrSpinSelectionDisplayState(title=");
        sb3.append(this.f127740a);
        sb3.append(", phase=");
        sb3.append(this.f127741b);
        sb3.append(", indices=");
        sb3.append(this.f127742c);
        sb3.append(", options=");
        sb3.append(this.f127743d);
        sb3.append(", enabled=");
        sb3.append(this.f127744e);
        sb3.append(", chosenOptions=");
        sb3.append(this.f127745f);
        sb3.append(", resetToDefault=");
        sb3.append(this.f127746g);
        sb3.append(", pinalyticsDisplayState=");
        sb3.append(this.f127747h);
        sb3.append(", isLoading=");
        return a.a.r(sb3, this.f127748i, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(zy.a0 r11, boolean r12, int r13) {
        /*
            r10 = this;
            kotlin.collections.q0 r6 = kotlin.collections.q0.f80391a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r0, r0}
            java.util.List r5 = kotlin.collections.f0.j(r0)
            r0 = r13 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L15
            zy.a0 r11 = new zy.a0
            r11.<init>()
        L15:
            r8 = r11
            r11 = r13 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L1b
            r12 = 0
        L1b:
            r9 = r12
            java.lang.String r1 = ""
            r2 = 0
            r7 = 0
            r0 = r10
            r3 = r6
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.m.<init>(zy.a0, boolean, int):void");
    }
}
