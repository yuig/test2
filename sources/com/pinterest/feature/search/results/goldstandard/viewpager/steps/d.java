package com.pinterest.feature.search.results.goldstandard.viewpager.steps;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.eg0;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.lf0;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class d extends t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47632a;

    /* renamed from: b, reason: collision with root package name */
    public final gw f47633b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r2, nx.a0 r3, uk1.e r4, x02.x2 r5, uj2.q r6, com.pinterest.api.model.gw r7) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "noOpPinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "pinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "userRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r5 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = "modelHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            uk1.d r3 = uk1.e.b(r4, r3)
            r1.<init>(r3, r6)
            r1.f47632a = r2
            r1.f47633b = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.results.goldstandard.viewpager.steps.d.<init>(android.content.Context, nx.a0, uk1.e, x02.x2, uj2.q, com.pinterest.api.model.gw):void");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        s61.a view = (s61.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((a) view).f47629l0 = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((a) ((s61.a) getView())).f47629l0 = null;
        super.onUnbind();
    }

    public final void p3(Bundle bundle) {
        List<lf0> q13;
        String string = bundle.getString("safety_treatment_text_hash_code");
        this.f47633b.getClass();
        eg0 eg0Var = string == null ? null : (eg0) ew.f37372p.get(string);
        Context context = this.f47632a;
        int parseColor = Color.parseColor(a0.q0(context) ? bundle.getString("font_color_dark_hex", "") : bundle.getString("font_color_hex", ""));
        if (eg0Var == null || (q13 = eg0Var.q()) == null) {
            return;
        }
        for (lf0 lf0Var : q13) {
            GestaltText view = new GestaltText(6, context, (AttributeSet) null);
            Intrinsics.f(lf0Var);
            j.C2(view, lf0Var);
            String text = a0.R(view);
            Intrinsics.checkNotNullParameter(text, "text");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(parseColor);
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(foregroundColorSpan, 0, text.length(), 0);
            a0.q(view, bs1.c.h2(spannableString));
            a aVar = (a) ((s61.a) getView());
            aVar.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            LinearLayout linearLayout = aVar.f47628k0;
            if (linearLayout == null) {
                Intrinsics.r("linearLayout");
                throw null;
            }
            linearLayout.addView(view);
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        s61.a view = (s61.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((a) view).f47629l0 = this;
    }
}
