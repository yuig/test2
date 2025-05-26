package fk1;

import a.cb;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.g0;
import java.util.List;
import java.util.Map;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import net.quikkly.android.utils.BitmapUtils;
import ni1.w2;
import ni1.x2;
import zy.l0;

/* loaded from: classes2.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f62380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62381b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f62382c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f62383d;

    /* renamed from: e, reason: collision with root package name */
    public final w2 f62384e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62385f;

    /* renamed from: g, reason: collision with root package name */
    public final int f62386g;

    /* renamed from: h, reason: collision with root package name */
    public final qa2.a f62387h;

    /* renamed from: i, reason: collision with root package name */
    public final String f62388i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f62389j;

    /* renamed from: k, reason: collision with root package name */
    public final String f62390k;

    /* renamed from: l, reason: collision with root package name */
    public final String f62391l;

    /* renamed from: m, reason: collision with root package name */
    public final g0 f62392m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f62393n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f62394o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f62395p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f62396q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f62397r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f62398s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f62399t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f62400u;

    /* renamed from: v, reason: collision with root package name */
    public final List f62401v;

    /* renamed from: w, reason: collision with root package name */
    public final Map f62402w;

    public w(f30 pinModel, int i13, l0 pinalyticsVMState, x2 experimentConfigs, w2 adDebugConfig, boolean z13, int i14, qa2.a attributionReason, String reactionsPinId, boolean z14, String str, String trafficSource, g0 componentType, boolean z15, lf.a aVar, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, List stashedPieceDisplayStates, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(adDebugConfig, "adDebugConfig");
        Intrinsics.checkNotNullParameter(attributionReason, "attributionReason");
        Intrinsics.checkNotNullParameter(reactionsPinId, "reactionsPinId");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(stashedPieceDisplayStates, "stashedPieceDisplayStates");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f62380a = pinModel;
        this.f62381b = i13;
        this.f62382c = pinalyticsVMState;
        this.f62383d = experimentConfigs;
        this.f62384e = adDebugConfig;
        this.f62385f = z13;
        this.f62386g = i14;
        this.f62387h = attributionReason;
        this.f62388i = reactionsPinId;
        this.f62389j = z14;
        this.f62390k = str;
        this.f62391l = trafficSource;
        this.f62392m = componentType;
        this.f62393n = z15;
        this.f62394o = z16;
        this.f62395p = z17;
        this.f62396q = z18;
        this.f62397r = z19;
        this.f62398s = z23;
        this.f62399t = z24;
        this.f62400u = z25;
        this.f62401v = stashedPieceDisplayStates;
        this.f62402w = experimentsGroupInfo;
    }

    public static w b(w wVar, l0 l0Var, int i13, qa2.a aVar, String str, boolean z13, g0 g0Var, lf.a aVar2, boolean z14, boolean z15, boolean z16, boolean z17, List list, int i14) {
        lf.a aVar3;
        boolean z18;
        boolean z19;
        boolean z23;
        boolean z24;
        f30 pinModel = wVar.f62380a;
        int i15 = wVar.f62381b;
        l0 pinalyticsVMState = (i14 & 4) != 0 ? wVar.f62382c : l0Var;
        x2 experimentConfigs = wVar.f62383d;
        w2 adDebugConfig = wVar.f62384e;
        boolean z25 = wVar.f62385f;
        int i16 = (i14 & 64) != 0 ? wVar.f62386g : i13;
        qa2.a attributionReason = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? wVar.f62387h : aVar;
        String reactionsPinId = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? wVar.f62388i : str;
        boolean z26 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? wVar.f62389j : z13;
        String str2 = wVar.f62390k;
        String trafficSource = wVar.f62391l;
        g0 componentType = (i14 & 4096) != 0 ? wVar.f62392m : g0Var;
        boolean z27 = wVar.f62393n;
        if ((i14 & 16384) != 0) {
            wVar.getClass();
            aVar3 = null;
        } else {
            aVar3 = aVar2;
        }
        boolean z28 = wVar.f62394o;
        if ((i14 & 65536) != 0) {
            z18 = z28;
            z19 = wVar.f62395p;
        } else {
            z18 = z28;
            z19 = z14;
        }
        boolean z29 = (131072 & i14) != 0 ? wVar.f62396q : z15;
        boolean z33 = wVar.f62397r;
        boolean z34 = wVar.f62398s;
        if ((i14 & 1048576) != 0) {
            z23 = z34;
            z24 = wVar.f62399t;
        } else {
            z23 = z34;
            z24 = z16;
        }
        boolean z35 = (2097152 & i14) != 0 ? wVar.f62400u : z17;
        List stashedPieceDisplayStates = (i14 & 4194304) != 0 ? wVar.f62401v : list;
        Map experimentsGroupInfo = wVar.f62402w;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(adDebugConfig, "adDebugConfig");
        Intrinsics.checkNotNullParameter(attributionReason, "attributionReason");
        Intrinsics.checkNotNullParameter(reactionsPinId, "reactionsPinId");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(stashedPieceDisplayStates, "stashedPieceDisplayStates");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new w(pinModel, i15, pinalyticsVMState, experimentConfigs, adDebugConfig, z25, i16, attributionReason, reactionsPinId, z26, str2, trafficSource, componentType, z27, aVar3, z18, z19, z29, z33, z23, z24, z35, stashedPieceDisplayStates, experimentsGroupInfo);
    }

    public final List d() {
        return this.f62401v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!Intrinsics.d(this.f62380a, wVar.f62380a) || this.f62381b != wVar.f62381b || !Intrinsics.d(this.f62382c, wVar.f62382c) || !Intrinsics.d(this.f62383d, wVar.f62383d) || !Intrinsics.d(this.f62384e, wVar.f62384e) || this.f62385f != wVar.f62385f || this.f62386g != wVar.f62386g || this.f62387h != wVar.f62387h || !Intrinsics.d(this.f62388i, wVar.f62388i) || this.f62389j != wVar.f62389j || !Intrinsics.d(this.f62390k, wVar.f62390k) || !Intrinsics.d(this.f62391l, wVar.f62391l) || this.f62392m != wVar.f62392m || this.f62393n != wVar.f62393n) {
            return false;
        }
        wVar.getClass();
        return Intrinsics.d(null, null) && this.f62394o == wVar.f62394o && this.f62395p == wVar.f62395p && this.f62396q == wVar.f62396q && this.f62397r == wVar.f62397r && this.f62398s == wVar.f62398s && this.f62399t == wVar.f62399t && this.f62400u == wVar.f62400u && Intrinsics.d(this.f62401v, wVar.f62401v) && Intrinsics.d(this.f62402w, wVar.f62402w);
    }

    public final l0 h() {
        return this.f62382c;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f62389j, cb.d(this.f62388i, (this.f62387h.hashCode() + ep.b.b(this.f62386g, ep.b.e(this.f62385f, (this.f62384e.hashCode() + ((this.f62383d.hashCode() + jq.b.a(this.f62382c, ep.b.b(this.f62381b, this.f62380a.hashCode() * 31, 31), 31)) * 31)) * 31, 31), 31)) * 31, 31), 31);
        String str = this.f62390k;
        return this.f62402w.hashCode() + ep.b.c(this.f62401v, ep.b.e(this.f62400u, ep.b.e(this.f62399t, ep.b.e(this.f62398s, ep.b.e(this.f62397r, ep.b.e(this.f62396q, ep.b.e(this.f62395p, ep.b.e(this.f62394o, (ep.b.e(this.f62393n, (this.f62392m.hashCode() + cb.d(this.f62391l, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31) + 0) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "MetaDataZoneVMState(pinModel=" + this.f62380a + ", position=" + this.f62381b + ", pinalyticsVMState=" + this.f62382c + ", experimentConfigs=" + this.f62383d + ", adDebugConfig=" + this.f62384e + ", isPinnerAccount=" + this.f62385f + ", lastIndexForPin=" + this.f62386g + ", attributionReason=" + this.f62387h + ", reactionsPinId=" + this.f62388i + ", isInShoppingModule=" + this.f62389j + ", userUid=" + this.f62390k + ", trafficSource=" + this.f62391l + ", componentType=" + this.f62392m + ", renderBoardPinAttribution=" + this.f62393n + ", ctaOverlayType=" + ((Object) null) + ", isVRTheme=" + this.f62394o + ", isDLCollection=" + this.f62395p + ", shouldNotRenderMetaData=" + this.f62396q + ", shouldUseLightMetadata=" + this.f62397r + ", shouldDisplayStrikeThroughPriceInBlack=" + this.f62398s + ", shouldDisplayPrice=" + this.f62399t + ", shouldDisplayRating=" + this.f62400u + ", stashedPieceDisplayStates=" + this.f62401v + ", experimentsGroupInfo=" + this.f62402w + ")";
    }

    public w(f30 f30Var, int i13, l0 l0Var, x2 x2Var, w2 w2Var, boolean z13, qa2.a aVar, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Map map) {
        this(f30Var, i13, l0Var, x2Var, w2Var, z13, 0, aVar, "", false, str, str2, g0.FLOWED_PIN, z14, null, z15, z16, false, false, false, z17, z18, q0.f80391a, map);
    }
}
