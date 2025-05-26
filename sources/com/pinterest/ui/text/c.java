package com.pinterest.ui.text;

import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z2;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kg.n;
import m60.u;
import nx.d0;
import vb0.j;

/* loaded from: classes4.dex */
public final class c extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f52653a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f52654b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f52655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52656d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f52657e = false;

    public c(int i13, g0 g0Var, u0 u0Var, d0 d0Var) {
        this.f52656d = i13;
        this.f52653a = d0Var;
        this.f52654b = g0Var;
        this.f52655c = u0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        n.a(view);
        boolean z13 = view instanceof TextView;
        j.f125466a.S(z13, "HashstagSpan can only be used with a TextView", new Object[0]);
        if (z13) {
            CharSequence text = ((TextView) view).getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int spanStart = spanned.getSpanStart(this);
                int spanEnd = spanned.getSpanEnd(this);
                if (spanStart < 0 || spanEnd < 0 || spanEnd <= spanStart || spanEnd > spanned.length()) {
                    return;
                }
                String charSequence = spanned.subSequence(spanStart, spanEnd).toString();
                String substring = charSequence.substring(1);
                HashMap hashMap = new HashMap(1);
                hashMap.put("hashtags", substring);
                this.f52653a.h(this.f52654b, this.f52655c, hashMap);
                NavigationImpl z03 = Navigation.z0((ScreenLocation) z2.f51674d.getValue(), charSequence);
                z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", br.a.HASHTAG.getValue());
                u.f85943a.d(z03);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f52656d);
        textPaint.setFakeBoldText(this.f52657e);
    }
}
