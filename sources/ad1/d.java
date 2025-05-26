package ad1;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.d4;
import kc1.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import u50.f0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lad1/d;", "Lmm1/l;", "<init>", "()V", "g4/u", "unlinkBA_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f2090h0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final d4 f2091g0 = d4.UNKNOWN_VIEW;

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(m52.b.view_unlink_ba_link_expired_modal, false, 30, 0, false, true, new h81.b(this, 20), AdSize.LEADERBOARD_WIDTH);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF2091g0() {
        return this.f2091g0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(m52.a.unlink_ba_check_inbox_modal_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        CharSequence string = j1.a0(requireContext().getString(m52.c.unlink_ba_modal_link_expired_description));
        Intrinsics.checkNotNullExpressionValue(string, "fromHtml(...)");
        Intrinsics.checkNotNullParameter(string, "string");
        a0.q((GestaltText) findViewById, new f0(string));
        a8(new w(this, 12));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltButton gestaltButton = new GestaltButton(0, 14, requireContext, (AttributeSet) null);
        bs1.c.s(gestaltButton, c.f2089i);
        Y7(new lc1.b(this, 10));
        Z7(new b(gestaltButton, 0));
    }
}
