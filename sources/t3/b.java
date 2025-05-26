package t3;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public static b f115850d;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f115851c;

    @Override // t3.f
    public final int[] a(int i13) {
        int length = d().length();
        if (length <= 0 || i13 >= length) {
            return null;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        do {
            BreakIterator breakIterator = this.f115851c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i13)) {
                BreakIterator breakIterator2 = this.f115851c;
                if (breakIterator2 == null) {
                    Intrinsics.r("impl");
                    throw null;
                }
                int following = breakIterator2.following(i13);
                if (following == -1) {
                    return null;
                }
                return c(i13, following);
            }
            BreakIterator breakIterator3 = this.f115851c;
            if (breakIterator3 == null) {
                Intrinsics.r("impl");
                throw null;
            }
            i13 = breakIterator3.following(i13);
        } while (i13 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f115851c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i13)) {
                BreakIterator breakIterator2 = this.f115851c;
                if (breakIterator2 == null) {
                    Intrinsics.r("impl");
                    throw null;
                }
                int preceding = breakIterator2.preceding(i13);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i13);
            }
            BreakIterator breakIterator3 = this.f115851c;
            if (breakIterator3 == null) {
                Intrinsics.r("impl");
                throw null;
            }
            i13 = breakIterator3.preceding(i13);
        } while (i13 != -1);
        return null;
    }

    @Override // t3.a
    public final void e(String str) {
        this.f115827a = str;
        BreakIterator breakIterator = this.f115851c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            Intrinsics.r("impl");
            throw null;
        }
    }
}
