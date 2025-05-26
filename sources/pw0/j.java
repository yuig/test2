package pw0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {
    public static boolean a(x type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type == x.ProfilePhoto || type == x.CollageCutoutAddPhoto;
    }

    public static boolean b(x type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type == x.IdeaPinPageAdd || type == x.IdeaPinAddMediaClip || type == x.IdeaPinImageSticker;
    }
}
