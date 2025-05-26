package az0;

import android.content.Context;
import h32.d4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m.h;
import nx.d0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f20698c;

    /* renamed from: a, reason: collision with root package name */
    public final d4 f20699a;

    /* renamed from: b, reason: collision with root package name */
    public final h f20700b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("haptic", 1);
        hashMap.put("sound", 1);
        f20698c = hashMap;
    }

    public b(d4 viewType, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f20699a = viewType;
        this.f20700b = new h(pinalytics, "feedback_ui_event_logger", f20698c);
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean t13 = ig1.b.t(context);
        boolean t03 = ig1.b.t0(context);
        HashMap hashMap = new HashMap();
        hashMap.put("haptic", String.valueOf(t03));
        hashMap.put("sound", String.valueOf(t13));
        Intrinsics.checkNotNullParameter("save_haptic_sound_settings", "name");
        HashMap hashMap2 = new HashMap();
        String lowerCase = this.f20699a.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap2.put("source", lowerCase);
        h hVar = this.f20700b;
        hVar.F(hashMap2, hashMap);
        hVar.D("save_haptic_sound_settings", null, hashMap2);
    }
}
