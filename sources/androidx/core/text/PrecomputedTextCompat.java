package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.appsflyer.internal.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PrecomputedTextCompat implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public final Spannable f17941a;

    /* renamed from: b, reason: collision with root package name */
    public final Params f17942b;

    /* renamed from: c, reason: collision with root package name */
    public final PrecomputedText f17943c;

    public PrecomputedTextCompat(String str, Params params) {
        this.f17941a = new SpannableString(str);
        this.f17942b = params;
        this.f17943c = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f17941a.charAt(i13);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f17941a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f17941a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f17941a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i13, int i14, Class cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return this.f17941a.getSpans(i13, i14, cls);
        }
        spans = this.f17943c.getSpans(i13, i14, cls);
        return spans;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f17941a.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i13, int i14, Class cls) {
        return this.f17941a.nextSpanTransition(i13, i14, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f17943c.removeSpan(obj);
        } else {
            this.f17941a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i13, int i14, int i15) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f17943c.setSpan(obj, i13, i14, i15);
        } else {
            this.f17941a.setSpan(obj, i13, i14, i15);
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i13, int i14) {
        return this.f17941a.subSequence(i13, i14);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f17941a.toString();
    }

    public PrecomputedTextCompat(PrecomputedText precomputedText, Params params) {
        this.f17941a = precomputedText;
        this.f17942b = params;
        this.f17943c = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static final class Params {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f17944a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f17945b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17946c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17947d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f17948e;

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i13, int i14) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = b.h(textPaint).setBreakStrategy(i13);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i14);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f17948e = build;
            } else {
                this.f17948e = null;
            }
            this.f17944a = textPaint;
            this.f17945b = textDirectionHeuristic;
            this.f17946c = i13;
            this.f17947d = i14;
        }

        public final boolean a(Params params) {
            if (this.f17946c != params.f17946c || this.f17947d != params.f17947d) {
                return false;
            }
            TextPaint textPaint = this.f17944a;
            if (textPaint.getTextSize() != params.f17944a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = params.f17944a;
            if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return a(params) && this.f17945b == params.f17945b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f17944a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f17945b, Integer.valueOf(this.f17946c), Integer.valueOf(this.f17947d));
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("{");
            StringBuilder sb4 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f17944a;
            sb4.append(textPaint.getTextSize());
            sb3.append(sb4.toString());
            sb3.append(", textScaleX=" + textPaint.getTextScaleX());
            sb3.append(", textSkewX=" + textPaint.getTextSkewX());
            sb3.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb3.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb3.append(", textLocale=" + textPaint.getTextLocales());
            sb3.append(", typeface=" + textPaint.getTypeface());
            sb3.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb3.append(", textDir=" + this.f17945b);
            sb3.append(", breakStrategy=" + this.f17946c);
            sb3.append(", hyphenationFrequency=" + this.f17947d);
            sb3.append("}");
            return sb3.toString();
        }

        public Params(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f17944a = textPaint;
            textDirection = params.getTextDirection();
            this.f17945b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f17946c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f17947d = hyphenationFrequency;
            this.f17948e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
