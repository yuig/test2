package m9;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import v.j2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final j2 f86567c = new j2(15);

    /* renamed from: a, reason: collision with root package name */
    public final c7.b f86568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86569b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f13, int i13, float f14, int i14, boolean z13, int i15, int i16) {
        boolean z14;
        int i17;
        if (z13) {
            i17 = i15;
            z14 = true;
        } else {
            z14 = false;
            i17 = -16777216;
        }
        this.f86568a = new c7.b(spannableStringBuilder, alignment, null, null, f13, 0, i13, f14, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z14, i17, Integer.MIN_VALUE, 0.0f);
        this.f86569b = i16;
    }
}
