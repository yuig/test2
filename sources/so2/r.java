package so2;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public char[] f114809a;

    /* renamed from: b, reason: collision with root package name */
    public int f114810b;

    public final void a(int i13, int i14) {
        int i15 = i14 + i13;
        char[] cArr = this.f114809a;
        if (cArr.length <= i15) {
            int i16 = i13 * 2;
            if (i15 < i16) {
                i15 = i16;
            }
            char[] copyOf = Arrays.copyOf(cArr, i15);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f114809a = copyOf;
        }
    }

    public final void b() {
        e eVar = e.f114775d;
        char[] array = this.f114809a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (eVar) {
            try {
                int i13 = eVar.f130082b;
                if (array.length + i13 < d.f114773a) {
                    eVar.f130082b = i13 + array.length;
                    ((kotlin.collections.v) eVar.f130083c).addLast(array);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f114810b, length);
        text.getChars(0, text.length(), this.f114809a, this.f114810b);
        this.f114810b += length;
    }

    public final String toString() {
        return new String(this.f114809a, 0, this.f114810b);
    }
}
