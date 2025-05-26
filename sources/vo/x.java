package vo;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import com.pinterest.activity.task.activity.MainActivity;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.x0;
import so.oa;

/* loaded from: classes.dex */
public final class x {
    public static ShortcutInfo a(MainActivity mainActivity, int i13, int i14) {
        String string = mainActivity.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(mainActivity, string);
        Object k03 = l0.k0(mainActivity.getApplicationContext(), so1.b.class);
        Intrinsics.checkNotNullExpressionValue(k03, "get(...)");
        Intent flags = ((lu1.d) ((oa) ((so1.b) k03)).f113782l2.get()).b(mainActivity, lu1.a.MAIN_ACTIVITY).setFlags(32768);
        Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
        flags.putExtra("com.pinterest.EXTRA_SHORTCUT", string);
        flags.setAction("android.intent.action.VIEW");
        ShortcutInfo.Builder disabledMessage = builder.setIntent(flags).setShortLabel(string).setLongLabel(string).setDisabledMessage(mainActivity.getString(x0.shortcuts_login_request));
        Intrinsics.checkNotNullExpressionValue(disabledMessage, "setDisabledMessage(...)");
        ShortcutInfo build = disabledMessage.setIcon(Icon.createWithResource(mainActivity, i14)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
