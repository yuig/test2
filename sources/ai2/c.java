package ai2;

import android.app.ActivityManager;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lh2.e;
import lh2.g;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f15249a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f15250b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f15251c;

    /* renamed from: d, reason: collision with root package name */
    public volatile a f15252d;

    public c(ActivityManager activityManager, lh2.b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f15249a = activityManager;
        this.f15250b = logger;
        this.f15251c = new CopyOnWriteArraySet();
    }

    public final String a() {
        a aVar = this.f15252d;
        if (aVar != null) {
            return aVar.f15247a;
        }
        return null;
    }

    public final void b(String str, boolean z13) {
        a aVar = str != null ? new a(str, z13) : null;
        this.f15252d = aVar;
        Iterator it = this.f15251c.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(aVar != null ? aVar.f15247a : null);
        }
        if (!z13 || Build.VERSION.SDK_INT < 30 || str == null) {
            return;
        }
        try {
            ActivityManager activityManager = this.f15249a;
            if (activityManager != null) {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                activityManager.setProcessStateSummary(bytes);
            }
        } catch (Throwable th3) {
            ((e) this.f15250b).b(g.PROCESS_STATE_SUMMARY_FAIL, th3);
        }
    }
}
