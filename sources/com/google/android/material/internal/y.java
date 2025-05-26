package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f32804a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f32805b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32806c;

    /* renamed from: d, reason: collision with root package name */
    public int f32807d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32814k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f32808e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f32809f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f32810g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f32811h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f32812i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32813j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f32815l = null;

    public y(CharSequence charSequence, TextPaint textPaint, int i13) {
        this.f32804a = charSequence;
        this.f32805b = textPaint;
        this.f32806c = i13;
        this.f32807d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f32804a == null) {
            this.f32804a = "";
        }
        int max = Math.max(0, this.f32806c);
        CharSequence charSequence = this.f32804a;
        int i13 = this.f32809f;
        TextPaint textPaint = this.f32805b;
        if (i13 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f32815l);
        }
        int min = Math.min(charSequence.length(), this.f32807d);
        this.f32807d = min;
        if (this.f32814k && this.f32809f == 1) {
            this.f32808e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f32808e);
        obtain.setIncludePad(this.f32813j);
        obtain.setTextDirection(this.f32814k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f32815l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f32809f);
        float f13 = this.f32810g;
        if (f13 != 0.0f || this.f32811h != 1.0f) {
            obtain.setLineSpacing(f13, this.f32811h);
        }
        if (this.f32809f > 1) {
            obtain.setHyphenationFrequency(this.f32812i);
        }
        return obtain.build();
    }
}
