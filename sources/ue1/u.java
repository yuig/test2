package ue1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u implements a0, v {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f122053a;

    /* renamed from: b, reason: collision with root package name */
    public final ic0.a f122054b;

    /* renamed from: c, reason: collision with root package name */
    public final o21.b f122055c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f122056d;

    /* renamed from: e, reason: collision with root package name */
    public final t f122057e;

    /* renamed from: f, reason: collision with root package name */
    public final int f122058f;

    /* renamed from: g, reason: collision with root package name */
    public final wa2.p f122059g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f122060h;

    /* renamed from: i, reason: collision with root package name */
    public final f30 f122061i;

    public u(@NotNull f30 pin, ic0.a aVar, o21.b bVar, @NotNull wa2.m pinFeatureConfig, @NotNull t repStyle, int i13, @NotNull wa2.p feedbackState, Boolean bool) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        this.f122053a = pin;
        this.f122054b = aVar;
        this.f122055c = bVar;
        this.f122056d = pinFeatureConfig;
        this.f122057e = repStyle;
        this.f122058f = i13;
        this.f122059g = feedbackState;
        this.f122060h = bool;
        this.f122061i = pin;
    }

    public static u c(u uVar, wa2.m mVar, wa2.p pVar, int i13) {
        f30 pin = uVar.f122053a;
        ic0.a aVar = uVar.f122054b;
        o21.b bVar = uVar.f122055c;
        if ((i13 & 8) != 0) {
            mVar = uVar.f122056d;
        }
        wa2.m pinFeatureConfig = mVar;
        t repStyle = uVar.f122057e;
        int i14 = uVar.f122058f;
        if ((i13 & 64) != 0) {
            pVar = uVar.f122059g;
        }
        wa2.p feedbackState = pVar;
        Boolean bool = uVar.f122060h;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        return new u(pin, aVar, bVar, pinFeatureConfig, repStyle, i14, feedbackState, bool);
    }

    @Override // ue1.v
    public final f30 a() {
        return this.f122061i;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        String uid = this.f122053a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    @Override // ue1.a0
    public final String d() {
        return bs1.c.p0(this.f122053a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f122053a, uVar.f122053a) && Intrinsics.d(this.f122054b, uVar.f122054b) && Intrinsics.d(this.f122055c, uVar.f122055c) && Intrinsics.d(this.f122056d, uVar.f122056d) && this.f122057e == uVar.f122057e && this.f122058f == uVar.f122058f && this.f122059g == uVar.f122059g && Intrinsics.d(this.f122060h, uVar.f122060h);
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f122053a.hashCode() * 31;
        ic0.a aVar = this.f122054b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o21.b bVar = this.f122055c;
        int hashCode3 = (this.f122059g.hashCode() + ep.b.b(this.f122058f, (this.f122057e.hashCode() + ((this.f122056d.hashCode() + ((hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31, 31)) * 31;
        Boolean bool = this.f122060h;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // ue1.a0
    public final p i() {
        return this.f122057e;
    }

    @Override // ue1.a0
    public final int m() {
        if (Intrinsics.d(this.f122060h, Boolean.TRUE)) {
            return 10;
        }
        if (this.f122059g == wa2.p.STATE_NO_FEEDBACK) {
            return RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL;
        }
        return 3;
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        return this.f122058f;
    }

    public final String toString() {
        return "PinRepItemViewModel(pin=" + this.f122053a + ", indicatorModel=" + this.f122054b + ", fixedPinDimensions=" + this.f122055c + ", pinFeatureConfig=" + this.f122056d + ", repStyle=" + this.f122057e + ", cornerRadius=" + this.f122058f + ", feedbackState=" + this.f122059g + ", shouldShowSavedOverlay=" + this.f122060h + ")";
    }

    public u(f30 f30Var, ic0.a aVar, o21.b bVar, wa2.m mVar, t tVar, int i13, wa2.p pVar, Boolean bool, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f30Var, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : bVar, mVar, (i14 & 16) != 0 ? t.PIN_REP : tVar, (i14 & 32) != 0 ? xe1.v.f134804s : i13, (i14 & 64) != 0 ? wa2.p.STATE_NO_FEEDBACK : pVar, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? Boolean.FALSE : bool);
    }
}
