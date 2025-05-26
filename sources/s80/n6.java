package s80;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class n6 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111711c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f111712d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f111713e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f111714f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f111715g;

    /* renamed from: h, reason: collision with root package name */
    public final List f111716h;

    /* renamed from: i, reason: collision with root package name */
    public final String f111717i;

    /* renamed from: j, reason: collision with root package name */
    public final String f111718j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f111719k;

    /* renamed from: l, reason: collision with root package name */
    public final String f111720l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f111721m;

    /* renamed from: n, reason: collision with root package name */
    public final b7 f111722n;

    /* renamed from: o, reason: collision with root package name */
    public final t80.d0 f111723o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f111724p;

    /* renamed from: q, reason: collision with root package name */
    public final zy.l0 f111725q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f111726r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f111727s;

    /* renamed from: t, reason: collision with root package name */
    public final d32.c f111728t;

    /* renamed from: u, reason: collision with root package name */
    public final Map f111729u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f111730v;

    public n6(String draftId, String boardId, String remixPinId, boolean z13, boolean z14, boolean z15, boolean z16, List list, String str, String str2, Integer num, String str3, Map onboardingStepToDisplayData, b7 prevOnboardingStep, t80.d0 emptyStateCarouselState, boolean z17, zy.l0 pinalyticsState, boolean z18, boolean z19, d32.c entryPointSource, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(remixPinId, "remixPinId");
        Intrinsics.checkNotNullParameter(onboardingStepToDisplayData, "onboardingStepToDisplayData");
        Intrinsics.checkNotNullParameter(prevOnboardingStep, "prevOnboardingStep");
        Intrinsics.checkNotNullParameter(emptyStateCarouselState, "emptyStateCarouselState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f111709a = draftId;
        this.f111710b = boardId;
        this.f111711c = remixPinId;
        this.f111712d = z13;
        this.f111713e = z14;
        this.f111714f = z15;
        this.f111715g = z16;
        this.f111716h = list;
        this.f111717i = str;
        this.f111718j = str2;
        this.f111719k = num;
        this.f111720l = str3;
        this.f111721m = onboardingStepToDisplayData;
        this.f111722n = prevOnboardingStep;
        this.f111723o = emptyStateCarouselState;
        this.f111724p = z17;
        this.f111725q = pinalyticsState;
        this.f111726r = z18;
        this.f111727s = z19;
        this.f111728t = entryPointSource;
        this.f111729u = experimentsGroupInfo;
        this.f111730v = (str3 == null || Intrinsics.d(str3, g2.f111552j)) ? false : true;
    }

    public static n6 b(n6 n6Var, String str, String str2, boolean z13, boolean z14, boolean z15, boolean z16, List list, String str3, String str4, Integer num, String str5, Map map, b7 b7Var, t80.d0 d0Var, boolean z17, zy.l0 l0Var, boolean z18, d32.c cVar, int i13) {
        String draftId = (i13 & 1) != 0 ? n6Var.f111709a : str;
        String boardId = n6Var.f111710b;
        String remixPinId = (i13 & 4) != 0 ? n6Var.f111711c : str2;
        boolean z19 = (i13 & 8) != 0 ? n6Var.f111712d : z13;
        boolean z23 = (i13 & 16) != 0 ? n6Var.f111713e : z14;
        boolean z24 = (i13 & 32) != 0 ? n6Var.f111714f : z15;
        boolean z25 = (i13 & 64) != 0 ? n6Var.f111715g : z16;
        List list2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? n6Var.f111716h : list;
        String str6 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? n6Var.f111717i : str3;
        String str7 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? n6Var.f111718j : str4;
        Integer num2 = (i13 & 1024) != 0 ? n6Var.f111719k : num;
        String str8 = (i13 & 2048) != 0 ? n6Var.f111720l : str5;
        Map onboardingStepToDisplayData = (i13 & 4096) != 0 ? n6Var.f111721m : map;
        b7 prevOnboardingStep = (i13 & 8192) != 0 ? n6Var.f111722n : b7Var;
        String str9 = str8;
        t80.d0 emptyStateCarouselState = (i13 & 16384) != 0 ? n6Var.f111723o : d0Var;
        Integer num3 = num2;
        boolean z26 = (i13 & 32768) != 0 ? n6Var.f111724p : z17;
        zy.l0 pinalyticsState = (65536 & i13) != 0 ? n6Var.f111725q : l0Var;
        String str10 = str7;
        boolean z27 = (i13 & 131072) != 0 ? n6Var.f111726r : z18;
        boolean z28 = n6Var.f111727s;
        d32.c entryPointSource = (i13 & 524288) != 0 ? n6Var.f111728t : cVar;
        Map experimentsGroupInfo = n6Var.f111729u;
        n6Var.getClass();
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(remixPinId, "remixPinId");
        Intrinsics.checkNotNullParameter(onboardingStepToDisplayData, "onboardingStepToDisplayData");
        Intrinsics.checkNotNullParameter(prevOnboardingStep, "prevOnboardingStep");
        Intrinsics.checkNotNullParameter(emptyStateCarouselState, "emptyStateCarouselState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new n6(draftId, boardId, remixPinId, z19, z23, z24, z25, list2, str6, str10, num3, str9, onboardingStepToDisplayData, prevOnboardingStep, emptyStateCarouselState, z26, pinalyticsState, z27, z28, entryPointSource, experimentsGroupInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f111719k, r6.f111719k) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f111720l, r6.f111720l) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f111721m, r6.f111721m) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        if (r5.f111722n == r6.f111722n) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f111723o, r6.f111723o) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r5.f111724p == r6.f111724p) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f111725q, r6.f111725q) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bd, code lost:
    
        if (r5.f111726r == r6.f111726r) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c4, code lost:
    
        if (r5.f111727s == r6.f111727s) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cb, code lost:
    
        if (r5.f111728t == r6.f111728t) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.f111729u, r6.f111729u) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0071, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1, r3) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s80.n6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int e13 = ep.b.e(this.f111715g, ep.b.e(this.f111714f, ep.b.e(this.f111713e, ep.b.e(this.f111712d, cb.d(this.f111711c, cb.d(this.f111710b, this.f111709a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        List list = this.f111716h;
        int hashCode2 = (e13 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f111717i;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111718j;
        if (str2 == null) {
            hashCode = 0;
        } else {
            int i13 = r72.a2.f106437b;
            hashCode = str2.hashCode();
        }
        int i14 = (hashCode3 + hashCode) * 31;
        Integer num = this.f111719k;
        int hashCode4 = (i14 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f111720l;
        return this.f111729u.hashCode() + ((this.f111728t.hashCode() + ep.b.e(this.f111727s, ep.b.e(this.f111726r, jq.b.a(this.f111725q, ep.b.e(this.f111724p, (this.f111723o.hashCode() + ((this.f111722n.hashCode() + a.c.e(this.f111721m, (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        String str = this.f111718j;
        String a13 = str == null ? "null" : r72.a2.a(str);
        StringBuilder sb3 = new StringBuilder("CollageComposerVMState(draftId=");
        sb3.append(this.f111709a);
        sb3.append(", boardId=");
        sb3.append(this.f111710b);
        sb3.append(", remixPinId=");
        sb3.append(this.f111711c);
        sb3.append(", draftLoading=");
        sb3.append(this.f111712d);
        sb3.append(", hasUnsavedChanges=");
        sb3.append(this.f111713e);
        sb3.append(", canUndo=");
        sb3.append(this.f111714f);
        sb3.append(", canRedo=");
        sb3.append(this.f111715g);
        sb3.append(", pendingSuccessfulSaveSideEffects=");
        sb3.append(this.f111716h);
        sb3.append(", cutoutIdToReplace=");
        a.a.B(sb3, this.f111717i, ", draggedShuffleItemId=", a13, ", currentZIndex=");
        sb3.append(this.f111719k);
        sb3.append(", backgroundColor=");
        sb3.append(this.f111720l);
        sb3.append(", onboardingStepToDisplayData=");
        sb3.append(this.f111721m);
        sb3.append(", prevOnboardingStep=");
        sb3.append(this.f111722n);
        sb3.append(", emptyStateCarouselState=");
        sb3.append(this.f111723o);
        sb3.append(", cutoutPickerAutoPullupCancelled=");
        sb3.append(this.f111724p);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f111725q);
        sb3.append(", clipboardDataAvailable=");
        sb3.append(this.f111726r);
        sb3.append(", openedFromAdd=");
        sb3.append(this.f111727s);
        sb3.append(", entryPointSource=");
        sb3.append(this.f111728t);
        sb3.append(", experimentsGroupInfo=");
        sb3.append(this.f111729u);
        sb3.append(")");
        return sb3.toString();
    }
}
