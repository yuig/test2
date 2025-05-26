package ads_mobile_sdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o90 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9187a;

    public o90(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9187a = context;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.DISPLAY_COUNT;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        DisplayManager displayManager = (DisplayManager) this.f9187a.getSystemService(DisplayManager.class);
        return displayManager != null ? new pk0(new n90(displayManager.getDisplays().length)) : new nk0("Unable to get display service", yx0.f14443a);
    }
}
