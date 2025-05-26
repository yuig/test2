package net.quikkly.android.utils;

import android.content.Context;
import net.quikkly.core.Pipeline;
import net.quikkly.core.QuikklyCore;
import net.quikkly.core.StrUtils;

/* loaded from: classes4.dex */
public class AssetsUtils {
    public static Pipeline buildDefaultPipeline(Context context) {
        return buildPipelineFromAssets(context, "default_blueprint.json");
    }

    public static Pipeline buildPipelineFromAssets(Context context, String str) {
        return QuikklyCore.buildPipeline(readUtf8FromAssets(context, str));
    }

    public static String readUtf8FromAssets(Context context, String str) {
        return StrUtils.readUtf8FromStream(context.getAssets().open(str, 2));
    }
}
