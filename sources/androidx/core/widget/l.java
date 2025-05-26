package androidx.core.widget;

import a.i0;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import c5.y;
import kh2.n;
import kh2.r;

/* loaded from: classes.dex */
public abstract class l {
    public static PrecomputedTextCompat.Params a(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            return new PrecomputedTextCompat.Params(y.i(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int v13 = n.v(textView);
        int x13 = n.x(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i13 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z13 = textView.getLayoutDirection() == 1;
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z13) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(y.a(r.N(textView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new PrecomputedTextCompat.Params(textPaint, textDirectionHeuristic, v13, x13);
    }

    public static void b(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        n.d0(textView, colorStateList);
    }

    public static void c(TextView textView, PorterDuff.Mode mode) {
        textView.getClass();
        n.e0(textView, mode);
    }

    public static void d(TextView textView, int i13) {
        com.bumptech.glide.d.l(i13);
        if (Build.VERSION.SDK_INT >= 28) {
            y.m(textView, i13);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i14 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i13 > Math.abs(i14)) {
            textView.setPadding(textView.getPaddingLeft(), i13 + i14, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(TextView textView, int i13) {
        com.bumptech.glide.d.l(i13);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i14 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i13 > Math.abs(i14)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i13 - i14);
        }
    }

    public static void f(TextView textView, int i13) {
        com.bumptech.glide.d.l(i13);
        if (i13 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i13 - r0, 1.0f);
        }
    }

    public static void g(TextView textView, int i13, float f13) {
        if (Build.VERSION.SDK_INT >= 34) {
            d0.i.l(textView, i13, f13);
        } else {
            f(textView, Math.round(TypedValue.applyDimension(i13, f13, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void h(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Spannable spannable = precomputedTextCompat.f17941a;
            textView.setText(i0.B(spannable) ? i0.h(spannable) : null);
        } else {
            if (!a(textView).a(precomputedTextCompat.f17942b)) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(precomputedTextCompat);
        }
    }

    public static ActionMode.Callback i(ActionMode.Callback callback) {
        return callback instanceof k ? ((k) callback).a() : callback;
    }

    public static ActionMode.Callback j(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof k) || callback == null) ? callback : new k(callback, textView);
    }
}
