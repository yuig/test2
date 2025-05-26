package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f17235a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f17235a = Intrinsics.d(lowerCase, "robolectric") ? new a0() : null;
    }
}
