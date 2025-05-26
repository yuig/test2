package a11;

import android.content.Context;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f260a;

    /* renamed from: b, reason: collision with root package name */
    public final lb0.o f261b;

    /* renamed from: c, reason: collision with root package name */
    public z f262c;

    public b0(Context context, lb0.o preferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f260a = context;
        this.f261b = preferences;
        this.f262c = z.Unknown;
    }

    public static boolean b(String str) {
        List split$default;
        List split$default2;
        if (str == null) {
            return false;
        }
        split$default = StringsKt__StringsKt.split$default("89.0.4389.10", new String[]{"."}, false, 0, 6, null);
        split$default2 = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        if (split$default.size() != split$default2.size()) {
            return false;
        }
        int i13 = 0;
        for (Object obj : split$default) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            String str2 = (String) obj;
            String str3 = i13 < split$default2.size() ? (String) split$default2.get(i13) : null;
            if (str3 != null && Integer.parseInt(str3) < Integer.parseInt(str2)) {
                return false;
            }
            i13 = i14;
        }
        return true;
    }

    public final void a(boolean z13) {
        ((lb0.b) this.f261b).o("HAS_VALID_YOUTUBE_WEBVIEW", z13);
        this.f262c = z13 ? z.Yes : z.No;
    }
}
