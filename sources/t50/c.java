package t50;

import android.content.Context;
import android.content.Intent;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f116432a = {"com.htc.launcher"};

    @Override // kh2.k3
    public final void Y1(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", k3.e0(context));
        intent.putExtra("com.htc.launcher.extra.COUNT", i13);
        context.sendBroadcast(intent);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", k3.g0(context));
        intent2.putExtra("count", i13);
        context.sendBroadcast(intent2);
    }
}
