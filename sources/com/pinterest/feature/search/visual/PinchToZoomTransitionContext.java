package com.pinterest.feature.search.visual;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ep.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;
import s71.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/search/visual/PinchToZoomTransitionContext;", "Landroid/os/Parcelable;", "CREATOR", "s71/r", "visualSearchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class PinchToZoomTransitionContext implements Parcelable {

    @NotNull
    public static final r CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final String f47924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47925b;

    /* renamed from: c, reason: collision with root package name */
    public final float f47926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47928e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47929f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47930g;

    /* renamed from: h, reason: collision with root package name */
    public final Float f47931h;

    /* renamed from: i, reason: collision with root package name */
    public final Float f47932i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f47933j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f47934k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f47935l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f47936m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f47937n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f47938o;

    public PinchToZoomTransitionContext(String pinId, String str, float f13, int i13, int i14, int i15, boolean z13, Float f14, Float f15, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i16) {
        int i17 = i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Float valueOf = Float.valueOf(0.0f);
        Float f16 = i17 != 0 ? valueOf : f14;
        valueOf = (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0 ? f15 : valueOf;
        boolean z23 = (i16 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z14;
        boolean z24 = (i16 & 1024) != 0 ? false : z15;
        boolean z25 = (i16 & 2048) != 0 ? false : z16;
        boolean z26 = (i16 & 4096) != 0 ? false : z17;
        boolean z27 = (i16 & 8192) != 0 ? false : z18;
        boolean z28 = (i16 & 16384) == 0 ? z19 : false;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f47924a = pinId;
        this.f47925b = str;
        this.f47926c = f13;
        this.f47927d = i13;
        this.f47928e = i14;
        this.f47929f = i15;
        this.f47930g = z13;
        this.f47931h = f16;
        this.f47932i = valueOf;
        this.f47933j = z23;
        this.f47934k = z24;
        this.f47935l = z25;
        this.f47936m = z26;
        this.f47937n = z27;
        this.f47938o = z28;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getF47933j() {
        return this.f47933j;
    }

    /* renamed from: b, reason: from getter */
    public final int getF47929f() {
        return this.f47929f;
    }

    /* renamed from: d, reason: from getter */
    public final int getF47928e() {
        return this.f47928e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final float getF47926c() {
        return this.f47926c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinchToZoomTransitionContext)) {
            return false;
        }
        PinchToZoomTransitionContext pinchToZoomTransitionContext = (PinchToZoomTransitionContext) obj;
        return Intrinsics.d(this.f47924a, pinchToZoomTransitionContext.f47924a) && Intrinsics.d(this.f47925b, pinchToZoomTransitionContext.f47925b) && Float.compare(this.f47926c, pinchToZoomTransitionContext.f47926c) == 0 && this.f47927d == pinchToZoomTransitionContext.f47927d && this.f47928e == pinchToZoomTransitionContext.f47928e && this.f47929f == pinchToZoomTransitionContext.f47929f && this.f47930g == pinchToZoomTransitionContext.f47930g && Intrinsics.d(this.f47931h, pinchToZoomTransitionContext.f47931h) && Intrinsics.d(this.f47932i, pinchToZoomTransitionContext.f47932i) && this.f47933j == pinchToZoomTransitionContext.f47933j && this.f47934k == pinchToZoomTransitionContext.f47934k && this.f47935l == pinchToZoomTransitionContext.f47935l && this.f47936m == pinchToZoomTransitionContext.f47936m && this.f47937n == pinchToZoomTransitionContext.f47937n && this.f47938o == pinchToZoomTransitionContext.f47938o;
    }

    /* renamed from: f, reason: from getter */
    public final String getF47924a() {
        return this.f47924a;
    }

    /* renamed from: g, reason: from getter */
    public final String getF47925b() {
        return this.f47925b;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getF47937n() {
        return this.f47937n;
    }

    public final int hashCode() {
        int hashCode = this.f47924a.hashCode() * 31;
        String str = this.f47925b;
        int e13 = b.e(this.f47930g, b.b(this.f47929f, b.b(this.f47928e, b.b(this.f47927d, a.a(this.f47926c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        Float f13 = this.f47931h;
        int hashCode2 = (e13 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.f47932i;
        return Boolean.hashCode(this.f47938o) + b.e(this.f47937n, b.e(this.f47936m, b.e(this.f47935l, b.e(this.f47934k, b.e(this.f47933j, (hashCode2 + (f14 != null ? f14.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final Float getF47932i() {
        return this.f47932i;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getF47935l() {
        return this.f47935l;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getF47938o() {
        return this.f47938o;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinchToZoomTransitionContext(pinId=");
        sb3.append(this.f47924a);
        sb3.append(", pinImageSignature=");
        sb3.append(this.f47925b);
        sb3.append(", initialScale=");
        sb3.append(this.f47926c);
        sb3.append(", pinPositionY=");
        sb3.append(this.f47927d);
        sb3.append(", imageHeight=");
        sb3.append(this.f47928e);
        sb3.append(", fullImageHeight=");
        sb3.append(this.f47929f);
        sb3.append(", clickThrough=");
        sb3.append(this.f47930g);
        sb3.append(", scaledXPosition=");
        sb3.append(this.f47931h);
        sb3.append(", scaledYPosition=");
        sb3.append(this.f47932i);
        sb3.append(", fromFlashlight=");
        sb3.append(this.f47933j);
        sb3.append(", fromRelatedProducts=");
        sb3.append(this.f47934k);
        sb3.append(", showProductPinsOnly=");
        sb3.append(this.f47935l);
        sb3.append(", fromCloseupDot=");
        sb3.append(this.f47936m);
        sb3.append(", pinIsStela=");
        sb3.append(this.f47937n);
        sb3.append(", isFromAdsStl=");
        return a.r(sb3, this.f47938o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f47924a);
        dest.writeString(this.f47925b);
        dest.writeFloat(this.f47926c);
        dest.writeInt(this.f47927d);
        dest.writeInt(this.f47928e);
        dest.writeInt(this.f47929f);
        dest.writeByte(this.f47930g ? (byte) 1 : (byte) 0);
        Float f13 = this.f47931h;
        dest.writeFloat(f13 != null ? f13.floatValue() : 0.0f);
        Float f14 = this.f47932i;
        dest.writeFloat(f14 != null ? f14.floatValue() : 0.0f);
        dest.writeByte(this.f47933j ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f47934k ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f47935l ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f47936m ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f47937n ? (byte) 1 : (byte) 0);
    }
}
