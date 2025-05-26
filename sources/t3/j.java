package t3;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f116039a;

    public j(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f116039a = (ClipboardManager) systemService;
    }

    public final boolean a() {
        ClipDescription primaryClipDescription = this.f116039a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
