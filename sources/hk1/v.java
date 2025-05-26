package hk1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import net.quikkly.android.utils.BitmapUtils;
import ni1.x2;
import zy.l0;

/* loaded from: classes2.dex */
public final class v implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f69373a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69374b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f69375c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f69376d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f69377e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69378f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69379g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f69380h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f69381i;

    /* renamed from: j, reason: collision with root package name */
    public final List f69382j;

    public v(f30 pinModel, int i13, x2 experimentConfigs, l0 pinalyticsVMState, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, List stashedPieceDisplayStates) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(stashedPieceDisplayStates, "stashedPieceDisplayStates");
        this.f69373a = pinModel;
        this.f69374b = i13;
        this.f69375c = experimentConfigs;
        this.f69376d = pinalyticsVMState;
        this.f69377e = z13;
        this.f69378f = z14;
        this.f69379g = z15;
        this.f69380h = z16;
        this.f69381i = z17;
        this.f69382j = stashedPieceDisplayStates;
    }

    public static v b(v vVar, l0 l0Var, boolean z13, boolean z14, boolean z15, List list, int i13) {
        f30 pinModel = vVar.f69373a;
        int i14 = vVar.f69374b;
        x2 experimentConfigs = vVar.f69375c;
        l0 pinalyticsVMState = (i13 & 8) != 0 ? vVar.f69376d : l0Var;
        boolean z16 = vVar.f69377e;
        boolean z17 = (i13 & 32) != 0 ? vVar.f69378f : z13;
        boolean z18 = vVar.f69379g;
        boolean z19 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? vVar.f69380h : z14;
        boolean z23 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? vVar.f69381i : z15;
        List stashedPieceDisplayStates = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? vVar.f69382j : list;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(stashedPieceDisplayStates, "stashedPieceDisplayStates");
        return new v(pinModel, i14, experimentConfigs, pinalyticsVMState, z16, z17, z18, z19, z23, stashedPieceDisplayStates);
    }

    public final List d() {
        return this.f69382j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f69373a, vVar.f69373a) && this.f69374b == vVar.f69374b && Intrinsics.d(this.f69375c, vVar.f69375c) && Intrinsics.d(this.f69376d, vVar.f69376d) && this.f69377e == vVar.f69377e && this.f69378f == vVar.f69378f && this.f69379g == vVar.f69379g && this.f69380h == vVar.f69380h && this.f69381i == vVar.f69381i && Intrinsics.d(this.f69382j, vVar.f69382j);
    }

    public final boolean f() {
        return this.f69379g;
    }

    public final int hashCode() {
        return this.f69382j.hashCode() + ep.b.e(this.f69381i, ep.b.e(this.f69380h, ep.b.e(this.f69379g, ep.b.e(this.f69378f, ep.b.e(this.f69377e, jq.b.a(this.f69376d, (this.f69375c.hashCode() + ep.b.b(this.f69374b, this.f69373a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrailingAccessoryZoneVMState(pinModel=");
        sb3.append(this.f69373a);
        sb3.append(", position=");
        sb3.append(this.f69374b);
        sb3.append(", experimentConfigs=");
        sb3.append(this.f69375c);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f69376d);
        sb3.append(", isPinnerAccount=");
        sb3.append(this.f69377e);
        sb3.append(", pinIsFavoritedByMe=");
        sb3.append(this.f69378f);
        sb3.append(", isVRTheme=");
        sb3.append(this.f69379g);
        sb3.append(", isHideSupported=");
        sb3.append(this.f69380h);
        sb3.append(", shouldNotRenderTrailingAccessory=");
        sb3.append(this.f69381i);
        sb3.append(", stashedPieceDisplayStates=");
        return a.c.j(sb3, this.f69382j, ")");
    }
}
