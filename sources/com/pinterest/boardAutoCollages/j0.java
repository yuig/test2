package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f44570a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44571b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44572c;

    /* renamed from: d, reason: collision with root package name */
    public final xa0.q f44573d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.l0 f44574e;

    /* renamed from: f, reason: collision with root package name */
    public final o82.j0 f44575f;

    public j0(String str, String str2, String str3, xa0.q draftSelectionResult, zy.l0 pinalyticsState, o82.j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(draftSelectionResult, "draftSelectionResult");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f44570a = str;
        this.f44571b = str2;
        this.f44572c = str3;
        this.f44573d = draftSelectionResult;
        this.f44574e = pinalyticsState;
        this.f44575f = multiSectionVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f44570a, j0Var.f44570a) && Intrinsics.d(this.f44571b, j0Var.f44571b) && Intrinsics.d(this.f44572c, j0Var.f44572c) && this.f44573d == j0Var.f44573d && Intrinsics.d(this.f44574e, j0Var.f44574e) && Intrinsics.d(this.f44575f, j0Var.f44575f);
    }

    public final int hashCode() {
        String str = this.f44570a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44571b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44572c;
        return this.f44575f.f93634a.hashCode() + jq.b.a(this.f44574e, (this.f44573d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "BoardAutoCollagesVMState(boardId=" + this.f44570a + ", boardSessionId=" + this.f44571b + ", requestParams=" + this.f44572c + ", draftSelectionResult=" + this.f44573d + ", pinalyticsState=" + this.f44574e + ", multiSectionVMState=" + this.f44575f + ")";
    }
}
