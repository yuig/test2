package o61;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import com.pinterest.api.model.hf0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.a0;
import so.d3;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo61/c;", "Lyk1/k;", "Lm61/b;", "<init>", "()V", "kg/p", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c extends g implements m61.b {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f92947x0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public d3 f92948j0;

    /* renamed from: k0, reason: collision with root package name */
    public final a0 f92949k0;

    /* renamed from: l0, reason: collision with root package name */
    public f f92950l0;

    /* renamed from: m0, reason: collision with root package name */
    public Integer f92951m0;

    /* renamed from: n0, reason: collision with root package name */
    public Integer f92952n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f92953o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f92954p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f92955q0;

    /* renamed from: r0, reason: collision with root package name */
    public WebImageView f92956r0;

    /* renamed from: s0, reason: collision with root package name */
    public GestaltIconButton f92957s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltIconButton f92958t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltIconButtonFloating f92959u0;

    /* renamed from: v0, reason: collision with root package name */
    public ProgressBar f92960v0;

    /* renamed from: w0, reason: collision with root package name */
    public final d4 f92961w0;

    public c() {
        a0 a0Var = new a0();
        this.f92949k0 = a0Var;
        this.E = l42.d.fragment_gold_standard_audio_play;
        setPinalytics(a0Var);
        this.f92961w0 = d4.UNKNOWN_VIEW;
    }

    @Override // yk1.k
    public final m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("extra_safety_audio_treatment") : null;
        hf0 hf0Var = i03 instanceof hf0 ? (hf0) i03 : null;
        if (hf0Var == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        d3 d3Var = this.f92948j0;
        if (d3Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return d3Var.a(requireContext, hf0Var, this.f92949k0);
    }

    public final void b8(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Integer num = this.f92951m0;
        if (num != null) {
            int intValue = num.intValue();
            GestaltText gestaltText = this.f92953o0;
            if (gestaltText != null) {
                pk.a0.q(gestaltText, j1.f0(intValue, text));
            } else {
                Intrinsics.r("duration");
                throw null;
            }
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140085y0() {
        return this.f92961w0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(l42.b.gold_standard_audio_play_duration);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f92953o0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(l42.b.gold_standard_audio_play_loading_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f92954p0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(l42.b.gold_standard_audio_play_quote);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f92955q0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(l42.b.gold_standard_audio_play_background_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f92956r0 = (WebImageView) findViewById4;
        View findViewById5 = v13.findViewById(l42.b.gold_standard_audio_play_rewind);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f92957s0 = (GestaltIconButton) findViewById5;
        View findViewById6 = v13.findViewById(l42.b.gold_standard_audio_play_advance);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f92958t0 = (GestaltIconButton) findViewById6;
        View findViewById7 = v13.findViewById(l42.b.gold_standard_audio_play_fab);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f92959u0 = (GestaltIconButtonFloating) findViewById7;
        View findViewById8 = v13.findViewById(l42.b.gold_standard_audio_play_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f92960v0 = (ProgressBar) findViewById8;
        f fVar = this.f92950l0;
        if (fVar != null) {
            fVar.t3();
        }
        ((GestaltIconButton) v13.findViewById(l42.b.gold_standard_audio_play_back_button)).u(new a(this, 0));
        GestaltIconButtonFloating gestaltIconButtonFloating = this.f92959u0;
        if (gestaltIconButtonFloating == null) {
            Intrinsics.r("playButton");
            throw null;
        }
        gestaltIconButtonFloating.c(new a(this, 1));
        GestaltIconButton gestaltIconButton = this.f92957s0;
        if (gestaltIconButton == null) {
            Intrinsics.r("rewind");
            throw null;
        }
        gestaltIconButton.u(new a(this, 2));
        GestaltIconButton gestaltIconButton2 = this.f92958t0;
        if (gestaltIconButton2 != null) {
            gestaltIconButton2.u(new a(this, 3));
        } else {
            Intrinsics.r("advance");
            throw null;
        }
    }
}
