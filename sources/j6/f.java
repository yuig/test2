package j6;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import h6.m;

/* loaded from: classes.dex */
public final class f implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f74803a;

    /* renamed from: b, reason: collision with root package name */
    public e f74804b;

    public f(TextView textView) {
        this.f74803a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
        TextView textView = this.f74803a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b13 = m.a().b();
        if (b13 != 0) {
            if (b13 == 1) {
                if ((i16 == 0 && i15 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i13 != 0 || i14 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i13, i14);
                }
                return m.a().g(0, charSequence.length(), charSequence, 0);
            }
            if (b13 != 3) {
                return charSequence;
            }
        }
        m a13 = m.a();
        if (this.f74804b == null) {
            this.f74804b = new e(textView, this);
        }
        a13.h(this.f74804b);
        return charSequence;
    }
}
