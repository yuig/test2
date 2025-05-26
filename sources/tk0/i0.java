package tk0;

import a.cb;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zy.l0;

/* loaded from: classes5.dex */
public final class i0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f117971a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117972b;

    /* renamed from: c, reason: collision with root package name */
    public final String f117973c;

    /* renamed from: d, reason: collision with root package name */
    public final v7 f117974d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f117975e;

    /* renamed from: f, reason: collision with root package name */
    public final jl0.d f117976f;

    /* renamed from: g, reason: collision with root package name */
    public final List f117977g;

    /* renamed from: h, reason: collision with root package name */
    public final List f117978h;

    /* renamed from: i, reason: collision with root package name */
    public final int f117979i;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f117980j;

    public i0(List toolList, String boardId, String str, v7 v7Var, boolean z13, jl0.d boardViewState, List selectedPinIds, List excludedPinIds, int i13, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(toolList, "toolList");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardViewState, "boardViewState");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        Intrinsics.checkNotNullParameter(excludedPinIds, "excludedPinIds");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f117971a = toolList;
        this.f117972b = boardId;
        this.f117973c = str;
        this.f117974d = v7Var;
        this.f117975e = z13;
        this.f117976f = boardViewState;
        this.f117977g = selectedPinIds;
        this.f117978h = excludedPinIds;
        this.f117979i = i13;
        this.f117980j = pinalyticsVMState;
    }

    public static i0 b(i0 i0Var, v7 v7Var, jl0.d dVar, List list, List list2, int i13, int i14) {
        List toolList = i0Var.f117971a;
        String boardId = i0Var.f117972b;
        String str = i0Var.f117973c;
        v7 v7Var2 = (i14 & 8) != 0 ? i0Var.f117974d : v7Var;
        boolean z13 = i0Var.f117975e;
        jl0.d boardViewState = (i14 & 32) != 0 ? i0Var.f117976f : dVar;
        List selectedPinIds = (i14 & 64) != 0 ? i0Var.f117977g : list;
        List excludedPinIds = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? i0Var.f117978h : list2;
        int i15 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? i0Var.f117979i : i13;
        l0 pinalyticsVMState = i0Var.f117980j;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(toolList, "toolList");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardViewState, "boardViewState");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        Intrinsics.checkNotNullParameter(excludedPinIds, "excludedPinIds");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new i0(toolList, boardId, str, v7Var2, z13, boardViewState, selectedPinIds, excludedPinIds, i15, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f117971a, i0Var.f117971a) && Intrinsics.d(this.f117972b, i0Var.f117972b) && Intrinsics.d(this.f117973c, i0Var.f117973c) && Intrinsics.d(this.f117974d, i0Var.f117974d) && this.f117975e == i0Var.f117975e && this.f117976f == i0Var.f117976f && Intrinsics.d(this.f117977g, i0Var.f117977g) && Intrinsics.d(this.f117978h, i0Var.f117978h) && this.f117979i == i0Var.f117979i && Intrinsics.d(this.f117980j, i0Var.f117980j);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f117972b, this.f117971a.hashCode() * 31, 31);
        String str = this.f117973c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        v7 v7Var = this.f117974d;
        return this.f117980j.hashCode() + ep.b.b(this.f117979i, ep.b.c(this.f117978h, ep.b.c(this.f117977g, (this.f117976f.hashCode() + ep.b.e(this.f117975e, (hashCode + (v7Var != null ? v7Var.hashCode() : 0)) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "OrganizeFloatingToolbarVMState(toolList=" + this.f117971a + ", boardId=" + this.f117972b + ", sectionId=" + this.f117973c + ", board=" + this.f117974d + ", isAutoMagicalBoard=" + this.f117975e + ", boardViewState=" + this.f117976f + ", selectedPinIds=" + this.f117977g + ", excludedPinIds=" + this.f117978h + ", selectedPinCount=" + this.f117979i + ", pinalyticsVMState=" + this.f117980j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0(java.util.List r15, java.lang.String r16, java.lang.String r17, boolean r18, zy.l0 r19, int r20) {
        /*
            r14 = this;
            r0 = r20
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L9
            r6 = r2
            goto Lb
        L9:
            r6 = r17
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L12
            r1 = 0
            r8 = r1
            goto L14
        L12:
            r8 = r18
        L14:
            jl0.c r1 = jl0.d.Companion
            r1.getClass()
            jl0.d r9 = jl0.d.access$getDEFAULT$cp()
            kotlin.collections.q0 r11 = kotlin.collections.q0.f80391a
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L2b
            zy.l0 r0 = new zy.l0
            r1 = 3
            r0.<init>(r2, r1)
            r13 = r0
            goto L2d
        L2b:
            r13 = r19
        L2d:
            r7 = 0
            r12 = 0
            r3 = r14
            r4 = r15
            r5 = r16
            r10 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tk0.i0.<init>(java.util.List, java.lang.String, java.lang.String, boolean, zy.l0, int):void");
    }
}
