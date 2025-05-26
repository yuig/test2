package h4;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public String f67613a;

    /* renamed from: b, reason: collision with root package name */
    public y1.p f67614b;

    /* renamed from: c, reason: collision with root package name */
    public int f67615c;

    /* renamed from: d, reason: collision with root package name */
    public int f67616d;

    public final int a() {
        y1.p pVar = this.f67614b;
        if (pVar == null) {
            return this.f67613a.length();
        }
        return pVar.e() + (this.f67613a.length() - (this.f67616d - this.f67615c));
    }

    public final void b(int i13, int i14, String str) {
        if (i13 > i14) {
            throw new IllegalArgumentException(a.a.f("start index must be less than or equal to end index: ", i13, " > ", i14).toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("start must be non-negative, but was ", i13).toString());
        }
        y1.p pVar = this.f67614b;
        if (pVar == null) {
            int max = Math.max(255, str.length() + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            char[] cArr = new char[max];
            int min = Math.min(i13, 64);
            int min2 = Math.min(this.f67613a.length() - i14, 64);
            String str2 = this.f67613a;
            int i15 = i13 - min;
            Intrinsics.g(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i15, i13, cArr, 0);
            String str3 = this.f67613a;
            int i16 = max - min2;
            int i17 = min2 + i14;
            Intrinsics.g(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i14, i17, cArr, i16);
            str.getChars(0, str.length(), cArr, min);
            this.f67614b = new y1.p(cArr, str.length() + min, i16, 1);
            this.f67615c = i15;
            this.f67616d = i17;
            return;
        }
        int i18 = this.f67615c;
        int i19 = i13 - i18;
        int i23 = i14 - i18;
        if (i19 < 0 || i23 > pVar.e()) {
            this.f67613a = toString();
            this.f67614b = null;
            this.f67615c = -1;
            this.f67616d = -1;
            b(i13, i14, str);
            return;
        }
        pVar.f(str.length() - (i23 - i19));
        pVar.b(i19, i23);
        str.getChars(0, str.length(), pVar.f136596c, pVar.f136597d);
        pVar.f136597d = str.length() + pVar.f136597d;
    }

    public final String toString() {
        y1.p pVar = this.f67614b;
        if (pVar == null) {
            return this.f67613a;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) this.f67613a, 0, this.f67615c);
        pVar.a(sb3);
        String str = this.f67613a;
        sb3.append((CharSequence) str, this.f67616d, str.length());
        return sb3.toString();
    }
}
