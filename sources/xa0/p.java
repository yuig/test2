package xa0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.j0;
import ao2.k2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import cp.t;
import h32.r2;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kh2.g3;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.v;
import nx.v0;
import ra0.l0;
import s1.w;
import zp.y0;

/* loaded from: classes5.dex */
public final class p extends ConstraintLayout implements v, yk1.n {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f134422k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a82.b f134423a;

    /* renamed from: b, reason: collision with root package name */
    public final RoundedCornersLayout f134424b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f134425c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f134426d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltIconButton f134427e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f134428f;

    /* renamed from: g, reason: collision with root package name */
    public k2 f134429g;

    /* renamed from: h, reason: collision with root package name */
    public fi0 f134430h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f134431i;

    /* renamed from: j, reason: collision with root package name */
    public r2 f134432j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, a82.b offscreenRenderer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(offscreenRenderer, "offscreenRenderer");
        this.f134423a = offscreenRenderer;
        View inflate = View.inflate(context, qa0.e.view_collage_draft_item, this);
        View findViewById = inflate.findViewById(qa0.d.draft_preview_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f134424b = (RoundedCornersLayout) findViewById;
        View findViewById2 = inflate.findViewById(qa0.d.last_edited_label);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f134428f = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(qa0.d.draft_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f134425c = (WebImageView) findViewById3;
        View findViewById4 = inflate.findViewById(qa0.d.edit_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f134426d = (GestaltIconButton) findViewById4;
        View findViewById5 = inflate.findViewById(qa0.d.overflow_menu);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f134427e = (GestaltIconButton) findViewById5;
    }

    public final void L(j0 offscreenRenderingScope, a state, Function2 onDraftTapped, Function1 onOverflowMenuTapped) {
        fi0 r63;
        Intrinsics.checkNotNullParameter(offscreenRenderingScope, "offscreenRenderingScope");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDraftTapped, "onDraftTapped");
        Intrinsics.checkNotNullParameter(onOverflowMenuTapped, "onOverflowMenuTapped");
        f30 f30Var = state.f134388a;
        if (f30Var == null || (r63 = f30Var.r6()) == null) {
            return;
        }
        this.f134430h = r63;
        this.f134431i = Integer.valueOf(state.f134389b);
        GestaltIconButton gestaltIconButton = this.f134426d;
        ViewParent parent = gestaltIconButton.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        int i13 = 6;
        int i14 = 4;
        RoundedCornersLayout roundedCornersLayout = this.f134424b;
        if (constraintLayout != null) {
            androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
            pVar.j(constraintLayout);
            pVar.l(gestaltIconButton.getId(), 4, roundedCornersLayout.getId(), 4);
            pVar.l(gestaltIconButton.getId(), 7, roundedCornersLayout.getId(), 7);
            boolean z13 = state.f134394g;
            if (z13) {
                pVar.l(gestaltIconButton.getId(), 6, roundedCornersLayout.getId(), 6);
            }
            pVar.b(constraintLayout);
            int i15 = z13 ? eo1.c.space_600 : eo1.c.space_200;
            ViewGroup.LayoutParams layoutParams = gestaltIconButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = getResources().getDimensionPixelSize(i15);
            if (!z13) {
                layoutParams2.setMarginEnd(getResources().getDimensionPixelSize(eo1.c.space_200));
            }
            gestaltIconButton.setLayoutParams(layoutParams2);
            g3.y(gestaltIconButton, new t(z13, 17));
        }
        String d03 = k3.d0(r63);
        WebImageView webImageView = this.f134425c;
        if (d03 != null) {
            webImageView.loadUrl(d03);
        } else {
            webImageView.clear();
            k2 k2Var = this.f134429g;
            if (k2Var != null) {
                k2Var.cancel((CancellationException) null);
            }
            this.f134429g = kotlin.jvm.internal.j.z(offscreenRenderingScope, null, null, new o(this, r63, webImageView, null), 3);
        }
        roundedCornersLayout.setOnClickListener(new y0(onDraftTapped, r63, state, 2));
        m mVar = new m(0, onOverflowMenuTapped, r63);
        GestaltIconButton gestaltIconButton2 = this.f134427e;
        gestaltIconButton2.setOnClickListener(mVar);
        boolean z14 = state.f134391d;
        boolean z15 = !z14;
        bs1.c.R1(gestaltIconButton, z15);
        bs1.c.R1(gestaltIconButton2, z15);
        GestaltText gestaltText = this.f134428f;
        bs1.c.R1(gestaltText, z15);
        if (!z14) {
            gestaltText.i(new w(this, r63, state.f134393f, i14));
        }
        gestaltIconButton2.t(new l0(state, i13));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        r2 source = this.f134432j;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Long c13 = jq.b.c(TimeUnit.MILLISECONDS);
        Short sh3 = source.f67225g;
        String str = source.f67226h;
        Long l13 = source.f67219a;
        String str2 = source.f67220b;
        r2 impression = new r2(l13, str2, source.f67221c, c13, source.f67223e, source.f67224f, sh3, str, source.f67227i, source.f67228j);
        Intrinsics.checkNotNullParameter(impression, "impression");
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("shuffle_id", str2);
        }
        Unit unit = Unit.f80348a;
        return new v0(impression, str2, hashMap);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        fi0 shuffle = this.f134430h;
        if (shuffle == null) {
            return null;
        }
        r2 impression = this.f134432j;
        if (impression == null) {
            Integer num = this.f134431i;
            Intrinsics.checkNotNullParameter(shuffle, "shuffle");
            Long c13 = jq.b.c(TimeUnit.MILLISECONDS);
            String uid = shuffle.getUid();
            String uid2 = shuffle.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            Long h03 = StringsKt.h0(uid2);
            Long valueOf = h03 != null ? Long.valueOf(h03.longValue()) : null;
            String Q = shuffle.Q();
            impression = new r2(valueOf, uid, c13, null, null, null, num != null ? Short.valueOf((short) num.intValue()) : null, null, null, Q != null ? Q : null);
            this.f134432j = impression;
        }
        Intrinsics.checkNotNullParameter(impression, "impression");
        HashMap hashMap = new HashMap();
        String str = impression.f67220b;
        if (str != null) {
            hashMap.put("shuffle_id", str);
        }
        Unit unit = Unit.f80348a;
        return new v0(impression, str, hashMap);
    }
}
