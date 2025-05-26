package rm1;

import android.content.Context;
import android.content.res.Resources;
import df.j1;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Map f108716a;

    public p(Map iconVariants) {
        Intrinsics.checkNotNullParameter(iconVariants, "iconVariants");
        this.f108716a = iconVariants;
    }

    @Override // rm1.o
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (dl2.b.w0(context, eo1.a.comp_icon_is_vr)) {
            return b(context, g92.d.VR);
        }
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return b(context, j1.x0(theme));
    }

    @Override // rm1.o
    public final int b(Context context, g92.d theme) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Integer num = (Integer) this.f108716a.get(theme);
        return num != null ? num.intValue() : c();
    }

    @Override // rm1.o
    public final int c() {
        return ((Number) z0.e(g92.d.CLASSIC, this.f108716a)).intValue();
    }
}
