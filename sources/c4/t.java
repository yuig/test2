package c4;

import a.d1;
import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class t {
    public static final boolean a(@NotNull StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(@NotNull StaticLayout.Builder builder, int i13, int i14) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = d1.g().setLineBreakStyle(i13);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i14);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
