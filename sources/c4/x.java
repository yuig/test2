package c4;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f25682a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f25683b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Intrinsics.d(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.d(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f25682a = alignment;
        f25683b = alignment2;
    }
}
