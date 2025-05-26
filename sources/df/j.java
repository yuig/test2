package df;

import android.content.Intent;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements le.m {

    /* renamed from: b, reason: collision with root package name */
    public static final me.f f54763b = new me.f(21, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f54764c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f54765a = new HashMap();

    public final boolean a(int i13, int i14, Intent intent) {
        h hVar;
        h hVar2 = (h) this.f54765a.get(Integer.valueOf(i13));
        if (hVar2 != null) {
            hVar2.a(intent, i14);
            return true;
        }
        synchronized (f54763b) {
            hVar = (h) f54764c.get(Integer.valueOf(i13));
        }
        if (hVar == null) {
            return false;
        }
        hVar.a(intent, i14);
        return true;
    }

    public final void b(int i13, com.facebook.login.t callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f54765a.put(Integer.valueOf(i13), callback);
    }

    public final void c(int i13) {
        this.f54765a.remove(Integer.valueOf(i13));
    }
}
