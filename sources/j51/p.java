package j51;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.profile.boardlesspins.components.UnorganizedIdeasHeader;
import com.pinterest.gestalt.divider.GestaltDivider;
import df.j1;
import h32.f1;
import h32.u0;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class p extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f74763a;

    /* renamed from: b, reason: collision with root package name */
    public final c51.e f74764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, boolean z13, boolean z14, c51.e eVar, s tapAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        this.f74763a = z13;
        this.f74764b = eVar;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(nz1.d.profile_boardless_pins_header, (ViewGroup) this, true);
        View findViewById = findViewById(nz1.c.profile_boardless_pins_header_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        UnorganizedIdeasHeader unorganizedIdeasHeader = (UnorganizedIdeasHeader) findViewById;
        GestaltDivider gestaltDivider = (GestaltDivider) findViewById(nz1.c.horizontal_divider);
        String f23 = bs1.c.f2(this, nz1.f.unorganized_ideas);
        String string = getResources().getString(x0.organize_board_button);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        unorganizedIdeasHeader.L(new k31.j(f23, new k31.i(tapAction, string)));
        if (z13) {
            bs1.c.X0(unorganizedIdeasHeader);
        }
        if (z14) {
            Intrinsics.f(gestaltDivider);
            j1.A0(gestaltDivider);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c51.e eVar;
        super.onAttachedToWindow();
        if (this.f74763a || (eVar = this.f74764b) == null) {
            return;
        }
        g51.n nVar = (g51.n) eVar;
        if (nVar.N) {
            return;
        }
        nVar.N = true;
        nVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.PROFILE_ORGANIZE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        xj2.b bVar;
        c51.e eVar = this.f74764b;
        if (eVar != null) {
            g51.n nVar = (g51.n) eVar;
            y0 y0Var = y0.ANDROID_PROFILE_BOARD_TAB_TAKEOVER;
            rg0.n b13 = ((dh0.d) nVar.f63637q).b(y0Var);
            if (b13 != null) {
                if (b13.f108060b == i32.l.ANDROID_BOARD_AUTO_ORGANIZE_TOOLTIP.getValue() && (bVar = (xj2.b) nVar.S.remove(y0Var)) != null) {
                    bVar.dispose();
                }
            }
        }
        super.onDetachedFromWindow();
    }
}
