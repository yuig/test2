package me;

import android.content.SharedPreferences;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f87030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f87031c;

    public /* synthetic */ v(String str, String str2, int i13) {
        this.f87029a = i13;
        this.f87030b = str;
        this.f87031c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f87029a;
        String value = this.f87031c;
        String key = this.f87030b;
        switch (i13) {
            case 0:
                if (p001if.a.b(w.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(key, "$key");
                    Intrinsics.checkNotNullParameter(value, "$value");
                    if (!w.f87035d.get()) {
                        w.f87032a.b();
                    }
                    SharedPreferences sharedPreferences = w.f87034c;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString(key, value).apply();
                        return;
                    } else {
                        Intrinsics.r("sharedPreferences");
                        throw null;
                    }
                } catch (Throwable th3) {
                    p001if.a.a(w.class, th3);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(key, "$queriedEvent");
                Intrinsics.checkNotNullParameter(value, "$buttonText");
                HashSet hashSet = ye.f.f138834e;
                f.p(key, value, new float[0]);
                return;
        }
    }
}
