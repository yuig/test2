package a;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class eh {
    public static boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return kotlin.text.z.i("gmsg", uri.getScheme(), true) && kotlin.text.z.i("mobileads.google.com", uri.getHost(), true);
    }
}
