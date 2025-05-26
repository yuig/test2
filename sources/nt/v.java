package nt;

import com.pinterest.api.model.n90;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class v implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f92194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92195b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92196c;

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f92197d;

    /* renamed from: e, reason: collision with root package name */
    public final n90 f92198e;

    /* renamed from: f, reason: collision with root package name */
    public final u2 f92199f;

    /* renamed from: g, reason: collision with root package name */
    public final List f92200g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f92201h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f92202i;

    /* renamed from: j, reason: collision with root package name */
    public final f f92203j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f92204k;

    /* renamed from: l, reason: collision with root package name */
    public final n1 f92205l;

    /* renamed from: m, reason: collision with root package name */
    public final List f92206m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f92207n;

    public v(String str, String str2, String str3, wy0 wy0Var, n90 n90Var, u2 u2Var, List questionErrorDisplayState, boolean z13, boolean z14, f cacheData, LinkedHashSet questionViews, n1 n1Var, List leadGenBottomSheetActions, boolean z15) {
        Intrinsics.checkNotNullParameter(questionErrorDisplayState, "questionErrorDisplayState");
        Intrinsics.checkNotNullParameter(cacheData, "cacheData");
        Intrinsics.checkNotNullParameter(questionViews, "questionViews");
        Intrinsics.checkNotNullParameter(leadGenBottomSheetActions, "leadGenBottomSheetActions");
        this.f92194a = str;
        this.f92195b = str2;
        this.f92196c = str3;
        this.f92197d = wy0Var;
        this.f92198e = n90Var;
        this.f92199f = u2Var;
        this.f92200g = questionErrorDisplayState;
        this.f92201h = z13;
        this.f92202i = z14;
        this.f92203j = cacheData;
        this.f92204k = questionViews;
        this.f92205l = n1Var;
        this.f92206m = leadGenBottomSheetActions;
        this.f92207n = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    public static v e(v vVar, String str, String str2, String str3, wy0 wy0Var, n90 n90Var, u2 u2Var, ArrayList arrayList, boolean z13, f fVar, LinkedHashSet linkedHashSet, List leadGenBottomSheetActions, boolean z14, int i13) {
        String str4 = (i13 & 1) != 0 ? vVar.f92194a : str;
        String str5 = (i13 & 2) != 0 ? vVar.f92195b : str2;
        String str6 = (i13 & 4) != 0 ? vVar.f92196c : str3;
        wy0 wy0Var2 = (i13 & 8) != 0 ? vVar.f92197d : wy0Var;
        n90 n90Var2 = (i13 & 16) != 0 ? vVar.f92198e : n90Var;
        u2 u2Var2 = (i13 & 32) != 0 ? vVar.f92199f : u2Var;
        ArrayList questionErrorDisplayState = (i13 & 64) != 0 ? vVar.f92200g : arrayList;
        boolean z15 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? vVar.f92201h : z13;
        boolean z16 = vVar.f92202i;
        f cacheData = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? vVar.f92203j : fVar;
        LinkedHashSet questionViews = (i13 & 1024) != 0 ? vVar.f92204k : linkedHashSet;
        n1 n1Var = vVar.f92205l;
        boolean z17 = (i13 & 8192) != 0 ? vVar.f92207n : z14;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(questionErrorDisplayState, "questionErrorDisplayState");
        Intrinsics.checkNotNullParameter(cacheData, "cacheData");
        Intrinsics.checkNotNullParameter(questionViews, "questionViews");
        Intrinsics.checkNotNullParameter(leadGenBottomSheetActions, "leadGenBottomSheetActions");
        return new v(str4, str5, str6, wy0Var2, n90Var2, u2Var2, questionErrorDisplayState, z15, z16, cacheData, questionViews, n1Var, leadGenBottomSheetActions, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f92194a, vVar.f92194a) && Intrinsics.d(this.f92195b, vVar.f92195b) && Intrinsics.d(this.f92196c, vVar.f92196c) && Intrinsics.d(this.f92197d, vVar.f92197d) && Intrinsics.d(this.f92198e, vVar.f92198e) && Intrinsics.d(this.f92199f, vVar.f92199f) && Intrinsics.d(this.f92200g, vVar.f92200g) && this.f92201h == vVar.f92201h && this.f92202i == vVar.f92202i && Intrinsics.d(this.f92203j, vVar.f92203j) && Intrinsics.d(this.f92204k, vVar.f92204k) && Intrinsics.d(this.f92205l, vVar.f92205l) && Intrinsics.d(this.f92206m, vVar.f92206m) && this.f92207n == vVar.f92207n;
    }

    public final int hashCode() {
        String str = this.f92194a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92195b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92196c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        wy0 wy0Var = this.f92197d;
        int hashCode4 = (hashCode3 + (wy0Var == null ? 0 : wy0Var.hashCode())) * 31;
        n90 n90Var = this.f92198e;
        int hashCode5 = (hashCode4 + (n90Var == null ? 0 : n90Var.hashCode())) * 31;
        u2 u2Var = this.f92199f;
        int hashCode6 = (this.f92204k.hashCode() + ((this.f92203j.hashCode() + ep.b.e(this.f92202i, ep.b.e(this.f92201h, ep.b.c(this.f92200g, (hashCode5 + (u2Var == null ? 0 : Integer.hashCode(u2Var.f92193a))) * 31, 31), 31), 31)) * 31)) * 31;
        n1 n1Var = this.f92205l;
        return Boolean.hashCode(this.f92207n) + ep.b.c(this.f92206m, (hashCode6 + (n1Var != null ? n1Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LeadGenBottomSheetDisplayState(callToActionText=");
        sb3.append(this.f92194a);
        sb3.append(", title=");
        sb3.append(this.f92195b);
        sb3.append(", description=");
        sb3.append(this.f92196c);
        sb3.append(", promoter=");
        sb3.append(this.f92197d);
        sb3.append(", promotedLeadForm=");
        sb3.append(this.f92198e);
        sb3.append(", submitErrorDisplayState=");
        sb3.append(this.f92199f);
        sb3.append(", questionErrorDisplayState=");
        sb3.append(this.f92200g);
        sb3.append(", isCCTEnabled=");
        sb3.append(this.f92201h);
        sb3.append(", hasAcceptedDisclosures=");
        sb3.append(this.f92202i);
        sb3.append(", cacheData=");
        sb3.append(this.f92203j);
        sb3.append(", questionViews=");
        sb3.append(this.f92204k);
        sb3.append(", cleanErrorQuestionDisplayState=");
        sb3.append(this.f92205l);
        sb3.append(", leadGenBottomSheetActions=");
        sb3.append(this.f92206m);
        sb3.append(", isEligibleForGridRepTests=");
        return a.a.r(sb3, this.f92207n, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v() {
        /*
            r15 = this;
            kotlin.collections.q0 r13 = kotlin.collections.q0.f80391a
            nt.f r10 = new nt.f
            kotlin.collections.r0 r1 = kotlin.collections.z0.d()
            nt.d r2 = nt.d.f91999a
            r3 = 0
            r0 = r10
            r4 = r13
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            r14 = 1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r0 = r15
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt.v.<init>():void");
    }
}
