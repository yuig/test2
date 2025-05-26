package ads_mobile_sdk;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r90 {

    /* renamed from: a, reason: collision with root package name */
    public final PowerManager f10553a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyguardManager f10554b;

    public r90(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10553a = (PowerManager) context.getSystemService(PowerManager.class);
        this.f10554b = (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public final boolean a(View view, boolean z13) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f10553a.isInteractive() && view.getVisibility() == 0 && view.isShown() && view.getLocalVisibleRect(new Rect()) && view.getGlobalVisibleRect(new Rect()) && (z13 || !this.f10554b.isKeyguardLocked());
    }
}
