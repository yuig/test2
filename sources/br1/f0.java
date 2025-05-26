package br1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.i0;
import u50.k0;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f23780a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23781b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23782c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23783d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23784e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23785f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23786g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f23787h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f23788i;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f23789j;

    public f0(f animationState, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, i0 textLineOne, i0 textLineTwo, i0 fullText) {
        Intrinsics.checkNotNullParameter(animationState, "animationState");
        Intrinsics.checkNotNullParameter(textLineOne, "textLineOne");
        Intrinsics.checkNotNullParameter(textLineTwo, "textLineTwo");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        this.f23780a = animationState;
        this.f23781b = z13;
        this.f23782c = z14;
        this.f23783d = z15;
        this.f23784e = z16;
        this.f23785f = z17;
        this.f23786g = z18;
        this.f23787h = textLineOne;
        this.f23788i = textLineTwo;
        this.f23789j = fullText;
    }

    public static f0 a(f0 f0Var, f fVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, k0 k0Var, k0 k0Var2, k0 k0Var3, int i13) {
        f animationState = (i13 & 1) != 0 ? f0Var.f23780a : fVar;
        boolean z18 = (i13 & 2) != 0 ? f0Var.f23781b : z13;
        boolean z19 = (i13 & 4) != 0 ? f0Var.f23782c : z14;
        boolean z23 = (i13 & 8) != 0 ? f0Var.f23783d : z15;
        boolean z24 = (i13 & 16) != 0 ? f0Var.f23784e : z16;
        boolean z25 = (i13 & 32) != 0 ? f0Var.f23785f : false;
        boolean z26 = (i13 & 64) != 0 ? f0Var.f23786g : z17;
        i0 textLineOne = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? f0Var.f23787h : k0Var;
        i0 textLineTwo = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? f0Var.f23788i : k0Var2;
        i0 fullText = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? f0Var.f23789j : k0Var3;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(animationState, "animationState");
        Intrinsics.checkNotNullParameter(textLineOne, "textLineOne");
        Intrinsics.checkNotNullParameter(textLineTwo, "textLineTwo");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        return new f0(animationState, z18, z19, z23, z24, z25, z26, textLineOne, textLineTwo, fullText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f23780a == f0Var.f23780a && this.f23781b == f0Var.f23781b && this.f23782c == f0Var.f23782c && this.f23783d == f0Var.f23783d && this.f23784e == f0Var.f23784e && this.f23785f == f0Var.f23785f && this.f23786g == f0Var.f23786g && Intrinsics.d(this.f23787h, f0Var.f23787h) && Intrinsics.d(this.f23788i, f0Var.f23788i) && Intrinsics.d(this.f23789j, f0Var.f23789j);
    }

    public final int hashCode() {
        return this.f23789j.hashCode() + ep.b.d(this.f23788i, ep.b.d(this.f23787h, ep.b.e(this.f23786g, ep.b.e(this.f23785f, ep.b.e(this.f23784e, ep.b.e(this.f23783d, ep.b.e(this.f23782c, ep.b.e(this.f23781b, this.f23780a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UnauthSplashScreenState(animationState=");
        sb3.append(this.f23780a);
        sb3.append(", handleTextOverflow=");
        sb3.append(this.f23781b);
        sb3.append(", useBiggerLogo=");
        sb3.append(this.f23782c);
        sb3.append(", useFixedSplashPinsLayoutOnSmallScreens=");
        sb3.append(this.f23783d);
        sb3.append(", useAspectRatioForAdaptiveSplashPinsCutoff=");
        sb3.append(this.f23784e);
        sb3.append(", hideContentOnVerySmallScreens=");
        sb3.append(this.f23785f);
        sb3.append(", preventAnimationRestartingOnSizeChange=");
        sb3.append(this.f23786g);
        sb3.append(", textLineOne=");
        sb3.append(this.f23787h);
        sb3.append(", textLineTwo=");
        sb3.append(this.f23788i);
        sb3.append(", fullText=");
        return jq.b.k(sb3, this.f23789j, ")");
    }
}
