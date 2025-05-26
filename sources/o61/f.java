package o61;

import a7.i0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ProgressBar;
import com.pinterest.api.model.ef0;
import com.pinterest.api.model.hf0;
import com.pinterest.api.model.tf0;
import com.pinterest.api.model.wf0;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import dl1.s;
import ek2.j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import m7.x;
import pk.a0;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class f extends t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f92964a;

    /* renamed from: b, reason: collision with root package name */
    public final hf0 f92965b;

    /* renamed from: c, reason: collision with root package name */
    public final r61.b f92966c;

    /* renamed from: d, reason: collision with root package name */
    public l0 f92967d;

    /* renamed from: e, reason: collision with root package name */
    public j f92968e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92969f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92970g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r2, com.pinterest.api.model.hf0 r3, nx.a0 r4, uk1.e r5, uj2.q r6, r61.b r7) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "safetyAudioTreatment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "noOpPinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "mixpanelManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            uk1.d r4 = uk1.e.b(r5, r4)
            r1.<init>(r4, r6)
            r1.f92964a = r2
            r1.f92965b = r3
            r1.f92966c = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o61.f.<init>(android.content.Context, com.pinterest.api.model.hf0, nx.a0, uk1.e, uj2.q, r61.b):void");
    }

    public static final String p3(f fVar) {
        l0 l0Var = fVar.f92967d;
        if (l0Var == null) {
            Intrinsics.r("exoPlayer");
            throw null;
        }
        long duration = l0Var.getDuration();
        l0 l0Var2 = fVar.f92967d;
        if (l0Var2 == null) {
            Intrinsics.r("exoPlayer");
            throw null;
        }
        long X = (duration - l0Var2.X()) / 1000;
        long j13 = 60;
        return j1.U("%2d:%02d", new Object[]{Long.valueOf((X / j13) % j13), Long.valueOf(X % j13)});
    }

    @Override // yk1.b
    public final void onDestroy() {
        l0 l0Var = this.f92967d;
        if (l0Var == null) {
            Intrinsics.r("exoPlayer");
            throw null;
        }
        l0Var.stop();
        l0Var.a();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((c) ((m61.b) getView())).f92950l0 = null;
        super.onUnbind();
    }

    public final void q3() {
        this.f92966c.a(0L, "TAP_MICROTREATMENT_AUDIO_FORWARD_BUTTON");
        l0 l0Var = this.f92967d;
        if (l0Var != null) {
            l0Var.c0(5, l0Var.X() + 10000);
        } else {
            Intrinsics.r("exoPlayer");
            throw null;
        }
    }

    @Override // yk1.p
    public final void r3(m61.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((c) view).f92950l0 = this;
        l0 a13 = new x(this.f92964a).a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.f92967d = a13;
        a13.f86277n.a(new e(this, view));
    }

    public final void s3() {
        c cVar = (c) ((m61.b) getView());
        if (!this.f92969f) {
            WebImageView webImageView = cVar.f92956r0;
            if (webImageView == null) {
                Intrinsics.r("backgroundView");
                throw null;
            }
            kg.a.s(webImageView, BaseRecyclerCellView.AUTOSCROLL_DELAY, null, 4);
            GestaltIconButtonFloating gestaltIconButtonFloating = cVar.f92959u0;
            if (gestaltIconButtonFloating == null) {
                Intrinsics.r("playButton");
                throw null;
            }
            pp2.a.j(gestaltIconButtonFloating, b.f92944l);
        } else {
            WebImageView webImageView2 = cVar.f92956r0;
            if (webImageView2 == null) {
                Intrinsics.r("backgroundView");
                throw null;
            }
            kg.a.u(webImageView2, 0, BaseRecyclerCellView.AUTOSCROLL_DELAY, 2);
            GestaltIconButtonFloating gestaltIconButtonFloating2 = cVar.f92959u0;
            if (gestaltIconButtonFloating2 == null) {
                Intrinsics.r("playButton");
                throw null;
            }
            pp2.a.j(gestaltIconButtonFloating2, b.f92945m);
        }
        boolean z13 = this.f92969f;
        r61.b bVar = this.f92966c;
        if (z13) {
            bVar.a(0L, "TAP_MICROTREATMENT_PAUSE_BUTTON");
            l0 l0Var = this.f92967d;
            if (l0Var != null) {
                l0Var.pause();
                return;
            } else {
                Intrinsics.r("exoPlayer");
                throw null;
            }
        }
        bVar.a(0L, "TAP_MICROTREATMENT_PLAY_BUTTON");
        l0 l0Var2 = this.f92967d;
        if (l0Var2 != null) {
            l0Var2.play();
        } else {
            Intrinsics.r("exoPlayer");
            throw null;
        }
    }

    public final void t3() {
        String D;
        wf0 wf0Var;
        m61.b bVar = (m61.b) getView();
        Context context = this.f92964a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        hf0 safetyAudioTreatment = this.f92965b;
        Intrinsics.checkNotNullParameter(safetyAudioTreatment, "safetyAudioTreatment");
        int parseColor = Color.parseColor(a0.q0(context) ? safetyAudioTreatment.H() : safetyAudioTreatment.I());
        View view = ((c) bVar).getView();
        if (view != null) {
            view.setBackgroundColor(parseColor);
        }
        m61.b bVar2 = (m61.b) getView();
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(safetyAudioTreatment, "safetyAudioTreatment");
        int parseColor2 = Color.parseColor(a0.q0(context) ? safetyAudioTreatment.B() : safetyAudioTreatment.C());
        c cVar = (c) bVar2;
        cVar.f92951m0 = Integer.valueOf(parseColor2);
        GestaltText gestaltText = cVar.f92953o0;
        if (gestaltText == null) {
            Intrinsics.r("duration");
            throw null;
        }
        String text = a0.R(gestaltText);
        Intrinsics.checkNotNullParameter(text, "text");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(parseColor2);
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(foregroundColorSpan, 0, text.length(), 0);
        a0.q(gestaltText, bs1.c.h2(spannableString));
        GestaltText gestaltText2 = cVar.f92954p0;
        if (gestaltText2 == null) {
            Intrinsics.r("loading");
            throw null;
        }
        String text2 = a0.R(gestaltText2);
        Intrinsics.checkNotNullParameter(text2, "text");
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(parseColor2);
        SpannableString spannableString2 = new SpannableString(text2);
        spannableString2.setSpan(foregroundColorSpan2, 0, text2.length(), 0);
        a0.q(gestaltText2, bs1.c.h2(spannableString2));
        ProgressBar progressBar = cVar.f92960v0;
        if (progressBar == null) {
            Intrinsics.r("progressBar");
            throw null;
        }
        progressBar.setProgressTintList(ColorStateList.valueOf(parseColor2));
        m61.b bVar3 = (m61.b) getView();
        String url = "";
        if (!a0.q0(context) ? (D = safetyAudioTreatment.D()) != null : (D = safetyAudioTreatment.E()) != null) {
            url = D;
        }
        c cVar2 = (c) bVar3;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        WebImageView webImageView = cVar2.f92956r0;
        if (webImageView == null) {
            Intrinsics.r("backgroundView");
            throw null;
        }
        webImageView.loadUrl(url);
        List M = safetyAudioTreatment.M();
        if (M != null) {
            Iterator it = M.iterator();
            while (it.hasNext()) {
                s a13 = ((ef0) it.next()).a();
                if (a13 != null && (a13 instanceof wf0)) {
                    wf0Var = (wf0) a13;
                    break;
                }
            }
        }
        tf0 tf0Var = new tf0(0);
        wf0Var = new wf0(tf0Var.f42196a, tf0Var.f42197b, tf0Var.f42198c, tf0Var.f42199d, tf0Var.f42200e, tf0Var.f42201f, tf0Var.f42202g, tf0Var.f42203h, tf0Var.f42204i, tf0Var.f42205j, 0);
        Intrinsics.checkNotNullExpressionValue(wf0Var, "build(...)");
        String q13 = wf0Var.q();
        if (q13 != null) {
            l0 l0Var = this.f92967d;
            if (l0Var == null) {
                Intrinsics.r("exoPlayer");
                throw null;
            }
            l0Var.e0(i0.b(q13));
            l0 l0Var2 = this.f92967d;
            if (l0Var2 != null) {
                l0Var2.b();
            } else {
                Intrinsics.r("exoPlayer");
                throw null;
            }
        }
    }

    public final void u3() {
        this.f92966c.a(0L, "TAP_MICROTREATMENT_AUDIO_REWIND_BUTTON");
        l0 l0Var = this.f92967d;
        if (l0Var != null) {
            l0Var.c0(5, l0Var.X() - 10000);
        } else {
            Intrinsics.r("exoPlayer");
            throw null;
        }
    }
}
