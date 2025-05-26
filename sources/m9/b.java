package m9;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f86540a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f86541b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f86542c;

    /* renamed from: d, reason: collision with root package name */
    public int f86543d;

    /* renamed from: e, reason: collision with root package name */
    public int f86544e;

    /* renamed from: f, reason: collision with root package name */
    public int f86545f;

    /* renamed from: g, reason: collision with root package name */
    public int f86546g;

    /* renamed from: h, reason: collision with root package name */
    public int f86547h;

    public b(int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        this.f86540a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f86541b = arrayList2;
        StringBuilder sb3 = new StringBuilder();
        this.f86542c = sb3;
        this.f86546g = i13;
        arrayList.clear();
        arrayList2.clear();
        sb3.setLength(0);
        this.f86543d = 15;
        this.f86544e = 0;
        this.f86545f = 0;
        this.f86547h = i14;
    }

    public final void a(char c13) {
        StringBuilder sb3 = this.f86542c;
        if (sb3.length() < 32) {
            sb3.append(c13);
        }
    }

    public final void b() {
        StringBuilder sb3 = this.f86542c;
        int length = sb3.length();
        if (length > 0) {
            sb3.delete(length - 1, length);
            ArrayList arrayList = this.f86540a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i13 = aVar.f86539c;
                if (i13 != length) {
                    return;
                }
                aVar.f86539c = i13 - 1;
            }
        }
    }

    public final c7.b c(int i13) {
        float f13;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f86541b;
            if (i14 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i14));
            spannableStringBuilder.append('\n');
            i14++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i15 = this.f86544e + this.f86545f;
        int length = (32 - i15) - spannableStringBuilder.length();
        int i16 = i15 - length;
        int i17 = i13 != Integer.MIN_VALUE ? i13 : (this.f86546g != 2 || (Math.abs(i16) >= 3 && length >= 0)) ? (this.f86546g != 2 || i16 <= 0) ? 0 : 2 : 1;
        if (i17 != 1) {
            if (i17 == 2) {
                i15 = 32 - length;
            }
            f13 = ((i15 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f13 = 0.5f;
        }
        int i18 = this.f86543d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f86546g == 1) {
            i18 -= this.f86547h - 1;
        }
        return new c7.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, f13, i17, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f86542c);
        int length = spannableStringBuilder.length();
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        boolean z13 = false;
        while (true) {
            ArrayList arrayList = this.f86540a;
            if (i17 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i17);
            boolean z14 = aVar.f86538b;
            int i19 = aVar.f86537a;
            if (i19 != 8) {
                boolean z15 = i19 == 7;
                if (i19 != 7) {
                    i16 = c.B[i19];
                }
                z13 = z15;
            }
            int i23 = aVar.f86539c;
            i17++;
            if (i23 != (i17 < arrayList.size() ? ((a) arrayList.get(i17)).f86539c : length)) {
                if (i13 != -1 && !z14) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i23, 33);
                    i13 = -1;
                } else if (i13 == -1 && z14) {
                    i13 = i23;
                }
                if (i14 != -1 && !z13) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i14, i23, 33);
                    i14 = -1;
                } else if (i14 == -1 && z13) {
                    i14 = i23;
                }
                if (i16 != i15) {
                    if (i15 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i18, i23, 33);
                    }
                    i15 = i16;
                    i18 = i23;
                }
            }
        }
        if (i13 != -1 && i13 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
        }
        if (i14 != -1 && i14 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
        }
        if (i18 != length && i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i18, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f86540a.isEmpty() && this.f86541b.isEmpty() && this.f86542c.length() == 0;
    }
}
