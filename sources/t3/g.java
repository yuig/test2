package t3;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: d, reason: collision with root package name */
    public static g f115999d;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f116000c;

    @Override // t3.f
    public final int[] a(int i13) {
        if (d().length() <= 0 || i13 >= d().length()) {
            return null;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        while (!g(i13) && (!g(i13) || (i13 != 0 && g(i13 - 1)))) {
            BreakIterator breakIterator = this.f116000c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                throw null;
            }
            i13 = breakIterator.following(i13);
            if (i13 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f116000c;
        if (breakIterator2 == null) {
            Intrinsics.r("impl");
            throw null;
        }
        int following = breakIterator2.following(i13);
        if (following == -1 || !f(following)) {
            return null;
        }
        return c(i13, following);
    }

    @Override // t3.f
    public final int[] b(int i13) {
        int length = d().length();
        if (length <= 0 || i13 <= 0) {
            return null;
        }
        if (i13 > length) {
            i13 = length;
        }
        while (i13 > 0 && !g(i13 - 1) && !f(i13)) {
            BreakIterator breakIterator = this.f116000c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                throw null;
            }
            i13 = breakIterator.preceding(i13);
            if (i13 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f116000c;
        if (breakIterator2 == null) {
            Intrinsics.r("impl");
            throw null;
        }
        int preceding = breakIterator2.preceding(i13);
        if (preceding == -1 || !g(preceding) || (preceding != 0 && g(preceding - 1))) {
            return null;
        }
        return c(preceding, i13);
    }

    @Override // t3.a
    public final void e(String str) {
        this.f115827a = str;
        BreakIterator breakIterator = this.f116000c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            Intrinsics.r("impl");
            throw null;
        }
    }

    public final boolean f(int i13) {
        return i13 > 0 && g(i13 + (-1)) && (i13 == d().length() || !g(i13));
    }

    public final boolean g(int i13) {
        if (i13 < 0 || i13 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i13));
    }
}
