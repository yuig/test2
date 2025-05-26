package ue1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;
import z32.f2;

/* loaded from: classes5.dex */
public final class w implements a0, v {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f122062a;

    /* renamed from: b, reason: collision with root package name */
    public final ic0.a f122063b;

    /* renamed from: c, reason: collision with root package name */
    public final o21.b f122064c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f122065d;

    /* renamed from: e, reason: collision with root package name */
    public final t f122066e;

    /* renamed from: f, reason: collision with root package name */
    public final String f122067f;

    /* renamed from: g, reason: collision with root package name */
    public final String f122068g;

    /* renamed from: h, reason: collision with root package name */
    public final f2 f122069h;

    /* renamed from: i, reason: collision with root package name */
    public final wa2.p f122070i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f122071j;

    /* renamed from: k, reason: collision with root package name */
    public final String f122072k;

    /* renamed from: l, reason: collision with root package name */
    public final f30 f122073l;

    public w(@NotNull f30 pin, ic0.a aVar, o21.b bVar, @NotNull wa2.m pinFeatureConfig, @NotNull t repStyle, String str, String str2, f2 f2Var, @NotNull wa2.p feedbackState, boolean z13, @NotNull String trafficSource) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        this.f122062a = pin;
        this.f122063b = aVar;
        this.f122064c = bVar;
        this.f122065d = pinFeatureConfig;
        this.f122066e = repStyle;
        this.f122067f = str;
        this.f122068g = str2;
        this.f122069h = f2Var;
        this.f122070i = feedbackState;
        this.f122071j = z13;
        this.f122072k = trafficSource;
        this.f122073l = pin;
    }

    public static w c(w wVar, f30 f30Var, wa2.p pVar, int i13) {
        if ((i13 & 1) != 0) {
            f30Var = wVar.f122062a;
        }
        f30 pin = f30Var;
        ic0.a aVar = wVar.f122063b;
        o21.b bVar = wVar.f122064c;
        wa2.m pinFeatureConfig = wVar.f122065d;
        t repStyle = wVar.f122066e;
        String str = wVar.f122067f;
        String str2 = wVar.f122068g;
        f2 f2Var = wVar.f122069h;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            pVar = wVar.f122070i;
        }
        wa2.p feedbackState = pVar;
        boolean z13 = wVar.f122071j;
        String trafficSource = wVar.f122072k;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        return new w(pin, aVar, bVar, pinFeatureConfig, repStyle, str, str2, f2Var, feedbackState, z13, trafficSource);
    }

    @Override // ue1.v
    public final f30 a() {
        return this.f122073l;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        String uid = this.f122062a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    @Override // ue1.a0
    public final String d() {
        return bs1.c.p0(this.f122062a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f122062a, wVar.f122062a) && Intrinsics.d(this.f122063b, wVar.f122063b) && Intrinsics.d(this.f122064c, wVar.f122064c) && Intrinsics.d(this.f122065d, wVar.f122065d) && this.f122066e == wVar.f122066e && Intrinsics.d(this.f122067f, wVar.f122067f) && Intrinsics.d(this.f122068g, wVar.f122068g) && this.f122069h == wVar.f122069h && this.f122070i == wVar.f122070i && this.f122071j == wVar.f122071j && Intrinsics.d(this.f122072k, wVar.f122072k);
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f122062a.hashCode() * 31;
        ic0.a aVar = this.f122063b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o21.b bVar = this.f122064c;
        int hashCode3 = (this.f122066e.hashCode() + ((this.f122065d.hashCode() + ((hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31;
        String str = this.f122067f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f122068g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f2 f2Var = this.f122069h;
        return this.f122072k.hashCode() + ep.b.e(this.f122071j, (this.f122070i.hashCode() + ((hashCode5 + (f2Var != null ? f2Var.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // ue1.a0
    public final p i() {
        return this.f122066e;
    }

    @Override // ue1.a0
    public final int m() {
        return this.f122070i == wa2.p.STATE_NO_FEEDBACK ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        return xe1.v.f134804s;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingOneTapSavePinRepItemViewModel(pin=");
        sb3.append(this.f122062a);
        sb3.append(", indicatorModel=");
        sb3.append(this.f122063b);
        sb3.append(", fixedPinDimensions=");
        sb3.append(this.f122064c);
        sb3.append(", pinFeatureConfig=");
        sb3.append(this.f122065d);
        sb3.append(", repStyle=");
        sb3.append(this.f122066e);
        sb3.append(", boardId=");
        sb3.append(this.f122067f);
        sb3.append(", boardSessionId=");
        sb3.append(this.f122068g);
        sb3.append(", quickSaveIcon=");
        sb3.append(this.f122069h);
        sb3.append(", feedbackState=");
        sb3.append(this.f122070i);
        sb3.append(", isBoardShopModule=");
        sb3.append(this.f122071j);
        sb3.append(", trafficSource=");
        return a.a.p(sb3, this.f122072k, ")");
    }

    public /* synthetic */ w(f30 f30Var, ic0.a aVar, o21.b bVar, wa2.m mVar, t tVar, String str, String str2, f2 f2Var, wa2.p pVar, boolean z13, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f30Var, (i13 & 2) != 0 ? null : aVar, (i13 & 4) != 0 ? null : bVar, mVar, (i13 & 16) != 0 ? t.PIN_REP : tVar, str, str2, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : f2Var, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? wa2.p.STATE_NO_FEEDBACK : pVar, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z13, str3);
    }
}
