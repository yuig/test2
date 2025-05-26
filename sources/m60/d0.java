package m60;

import android.content.Context;
import android.content.res.Configuration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85897a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f85898b;

    public d0(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85897a = z13;
        this.f85898b = context.getResources().getConfiguration();
    }

    public final int a(y style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.f85897a) {
            int i13 = c0.f85890a[style.ordinal()];
            Configuration configuration = this.f85898b;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3 && i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (configuration == null || configuration.orientation != 1) {
                        return 3;
                    }
                } else if (configuration != null && configuration.orientation == 1) {
                    return 3;
                }
            } else if (configuration == null || configuration.orientation != 1) {
                return 5;
            }
            return 4;
        }
        int i14 = c0.f85890a[style.ordinal()];
        if (i14 == 1) {
            return 3;
        }
        if (i14 != 2) {
            if (i14 == 3 || i14 == 4) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 2;
    }
}
