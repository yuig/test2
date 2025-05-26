package t50;

import android.content.Context;
import android.content.Intent;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f116430a = {"com.asus.launcher"};

    @Override // kh2.k3
    public final void Y1(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i13);
        intent.putExtra("badge_count_package_name", k3.g0(context));
        intent.putExtra("badge_count_class_name", k3.e0(context));
        intent.putExtra("badge_vip_count", 0);
        context.sendBroadcast(intent);
    }
}
