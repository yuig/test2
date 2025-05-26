package rf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends gb2.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String display, String contentDescription, c style, int i13) {
        super(display);
        style = (i13 & 4) != 0 ? c.Normal : style;
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(style, "style");
    }
}
