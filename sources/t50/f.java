package t50;

import android.content.Context;
import android.content.Intent;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f116435a = {"com.sonyericsson.home"};

    @Override // kh2.k3
    public final void Y1(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", k3.g0(context));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", k3.e0(context));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i13));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", true);
        context.sendBroadcast(intent);
    }
}
