package b11;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
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
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f20984b;

    public /* synthetic */ d0(j0 j0Var, int i13) {
        this.f20983a = i13;
        this.f20984b = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v0 v0Var;
        int i13 = this.f20983a;
        j0 this$0 = this.f20984b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.f(view);
                this$0.r0(view);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.f(view);
                this$0.r0(view);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PinReactionIconButton pinReactionIconButton = this$0.f21029g;
                if (pinReactionIconButton != null) {
                    pinReactionIconButton.callOnClick();
                }
                v32.c cVar = this$0.f21047y;
                v32.c cVar2 = v32.c.NONE;
                ViewGroup viewGroup = this$0.f21027e;
                if (cVar == cVar2) {
                    viewGroup.announceForAccessibility(this$0.getResources().getString(x0.liked));
                    return;
                } else {
                    viewGroup.announceForAccessibility(this$0.getResources().getString(x0.not_liked));
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f30 f30Var = this$0.f21042t;
                if (f30Var != null) {
                    if (this$0.P == null) {
                        Intrinsics.r("commentUtils");
                        throw null;
                    }
                    boolean h10 = qh1.e.h(f30Var);
                    lh0.z Z = this$0.Z();
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) Z.f83517a;
                    if (g1Var.o("ce_android_comment_composer_redesign", "enabled", z3Var) || g1Var.l("ce_android_comment_composer_redesign")) {
                        qh1.e eVar = this$0.P;
                        if (eVar == null) {
                            Intrinsics.r("commentUtils");
                            throw null;
                        }
                        String uid = f30Var.getUid();
                        String g13 = b40.g(f30Var);
                        String string = this$0.getContext().getResources().getString(x0.comment_composer_empty_state_first_comment_hint);
                        h32.u0 u0Var = h32.u0.PIN_COMMENT_BUTTON;
                        h32.g0 g0Var = h32.g0.PIN_CLOSEUP_COMMENTS;
                        Intrinsics.f(uid);
                        eVar.n(this$0.f21025c, uid, (r36 & 4) != 0 ? "" : g13, (r36 & 8) != 0 ? null : u0Var, (r36 & 16) != 0 ? null : g0Var, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : string, (r36 & 1024) != 0 ? false : false, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : null, (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : true, true);
                        return;
                    }
                    int value = (hf0.b.q() || ((Boolean) this$0.U.getValue()).booleanValue()) ? ml1.b.NO_TRANSITION.getValue() : ml1.b.DEFAULT_TRANSITION.getValue();
                    m60.w eventManager = this$0.getEventManager();
                    h32.u0 u0Var2 = h32.u0.PIN_COMMENT_BUTTON;
                    h32.g0 g0Var2 = h32.g0.PIN_CLOSEUP_COMMENTS;
                    HashMap hashMap = new HashMap();
                    hashMap.put("pin_id", f30Var.getUid());
                    d1 d1Var = this$0.M;
                    if (d1Var == null) {
                        Intrinsics.r("trackingParamAttacher");
                        throw null;
                    }
                    String b13 = d1Var.b(f30Var);
                    if (b13 != null) {
                        v0 v0Var2 = new v0();
                        v0Var2.G = b13;
                        v0Var = v0Var2;
                    } else {
                        v0Var = null;
                    }
                    ai0.a.b(f30Var, eventManager, (r39 & 2) != 0 ? ml1.b.NO_TRANSITION.getValue() : value, (r39 & 4) != 0 ? null : this$0.f21025c, (r39 & 8) != 0 ? null : hashMap, (r39 & 16) != 0 ? null : u0Var2, (r39 & 32) != 0 ? null : g0Var2, null, (r39 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : v0Var, (r39 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : this$0.getResources(), (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? "" : null, (r39 & 4096) != 0 ? "" : null, (r39 & 8192) != 0 ? "" : null, (r39 & 16384) != 0 ? "" : null, (32768 & r39) != 0 ? "" : null, null, (131072 & r39) != 0 ? false : h10, false, (r39 & 524288) != 0 ? false : true);
                    return;
                }
                return;
        }
    }
}
