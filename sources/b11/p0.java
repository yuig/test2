package b11;

import android.view.View;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import h32.v0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d1;

/* loaded from: classes5.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedPinActionBarView f21073b;

    public /* synthetic */ p0(UnifiedPinActionBarView unifiedPinActionBarView, int i13) {
        this.f21072a = i13;
        this.f21073b = unifiedPinActionBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v0 v0Var = null;
        int i13 = this.f21072a;
        UnifiedPinActionBarView this$0 = this.f21073b;
        switch (i13) {
            case 0:
                int i14 = UnifiedPinActionBarView.L;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.f(view);
                f30 f30Var = this$0.f47049p;
                if (f30Var != null) {
                    nx.d0 d0Var = this$0.f47037d;
                    if (d0Var != null) {
                        d0Var.b0(h32.u0.PIN_SHARE_BUTTON, h32.g0.MODAL_PIN, f30Var.getUid(), false);
                    }
                    np0.g gVar = this$0.B;
                    if (gVar != null) {
                        ((np0.d) gVar).f(view, f30Var);
                        return;
                    } else {
                        Intrinsics.r("closeupActionController");
                        throw null;
                    }
                }
                return;
            case 1:
                int i15 = UnifiedPinActionBarView.L;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f30 f30Var2 = this$0.f47049p;
                if (f30Var2 != null) {
                    nx.d0 d0Var2 = this$0.f47037d;
                    if (d0Var2 != null) {
                        d0Var2.b0(h32.u0.COMMENT_REACT_BUTTON, h32.g0.MODAL_PIN, f30Var2.getUid(), false);
                    }
                    if (this$0.G == null) {
                        Intrinsics.r("commentUtils");
                        throw null;
                    }
                    boolean h10 = qh1.e.h(f30Var2);
                    lh0.z zVar = this$0.F;
                    if (zVar == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) zVar.f83517a;
                    if (g1Var.o("ce_android_comment_composer_redesign", "enabled", z3Var) || g1Var.l("ce_android_comment_composer_redesign")) {
                        qh1.e eVar = this$0.G;
                        if (eVar == null) {
                            Intrinsics.r("commentUtils");
                            throw null;
                        }
                        String uid = f30Var2.getUid();
                        String g13 = b40.g(f30Var2);
                        String string = this$0.getContext().getResources().getString(x0.comment_composer_empty_state_first_comment_hint);
                        h32.u0 u0Var = h32.u0.PIN_COMMENT_BUTTON;
                        h32.g0 g0Var = h32.g0.PIN_CLOSEUP_COMMENTS;
                        Intrinsics.f(uid);
                        eVar.n(this$0.f47037d, uid, (r36 & 4) != 0 ? "" : g13, (r36 & 8) != 0 ? null : u0Var, (r36 & 16) != 0 ? null : g0Var, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : string, (r36 & 1024) != 0 ? false : false, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : null, (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : true, true);
                        return;
                    }
                    int value = (!hf0.b.q() ? ml1.b.DEFAULT_TRANSITION : ml1.b.NO_TRANSITION).getValue();
                    m60.w eventManager = this$0.getEventManager();
                    h32.u0 u0Var2 = h32.u0.PIN_COMMENT_BUTTON;
                    h32.g0 g0Var2 = h32.g0.PIN_CLOSEUP_COMMENTS;
                    HashMap hashMap = new HashMap();
                    hashMap.put("pin_id", f30Var2.getUid());
                    d1 d1Var = this$0.D;
                    if (d1Var == null) {
                        Intrinsics.r("trackingParamAttacher");
                        throw null;
                    }
                    String b13 = d1Var.b(f30Var2);
                    if (b13 != null) {
                        v0Var = new v0();
                        v0Var.G = b13;
                    }
                    ai0.a.b(f30Var2, eventManager, (r39 & 2) != 0 ? ml1.b.NO_TRANSITION.getValue() : value, (r39 & 4) != 0 ? null : this$0.f47037d, (r39 & 8) != 0 ? null : hashMap, (r39 & 16) != 0 ? null : u0Var2, (r39 & 32) != 0 ? null : g0Var2, null, (r39 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : v0Var, (r39 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : this$0.getResources(), (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? "" : null, (r39 & 4096) != 0 ? "" : null, (r39 & 8192) != 0 ? "" : null, (r39 & 16384) != 0 ? "" : null, (32768 & r39) != 0 ? "" : null, null, (131072 & r39) != 0 ? false : h10, false, (r39 & 524288) != 0 ? false : true);
                    return;
                }
                return;
            default:
                int i16 = UnifiedPinActionBarView.L;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.K.invoke();
                return;
        }
    }
}
