package d4;

import a.cb;
import c4.j;
import java.text.BreakIterator;
import java.util.Locale;
import kg.n;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f53672a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53674c;

    /* renamed from: d, reason: collision with root package name */
    public final BreakIterator f53675d;

    public g(CharSequence charSequence, int i13, Locale locale) {
        this.f53672a = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (i13 < 0 || i13 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f53675d = wordInstance;
        this.f53673b = Math.max(0, -50);
        this.f53674c = Math.min(charSequence.length(), i13 + 50);
        wordInstance.setText(new j(i13, charSequence));
    }

    public final void a(int i13) {
        int i14 = this.f53673b;
        int i15 = this.f53674c;
        if (i13 > i15 || i14 > i13) {
            throw new IllegalArgumentException(cb.l(a.a.t("Invalid offset: ", i13, ". Valid range is [", i14, " , "), i15, ']').toString());
        }
    }

    public final boolean b(int i13) {
        return i13 <= this.f53674c && this.f53673b + 1 <= i13 && Character.isLetterOrDigit(Character.codePointBefore(this.f53672a, i13));
    }

    public final boolean c(int i13) {
        int i14 = this.f53673b + 1;
        if (i13 > this.f53674c || i14 > i13) {
            return false;
        }
        return n.f(Character.codePointBefore(this.f53672a, i13));
    }

    public final boolean d(int i13) {
        return i13 < this.f53674c && this.f53673b <= i13 && Character.isLetterOrDigit(Character.codePointAt(this.f53672a, i13));
    }

    public final boolean e(int i13) {
        if (i13 >= this.f53674c || this.f53673b > i13) {
            return false;
        }
        return n.f(Character.codePointAt(this.f53672a, i13));
    }
}
