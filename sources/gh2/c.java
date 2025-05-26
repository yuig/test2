package gh2;

import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import bp1.h;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh2.e;
import lh2.g;
import nf2.o;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f65024a;

    /* renamed from: b, reason: collision with root package name */
    public final uh2.b f65025b;

    /* renamed from: c, reason: collision with root package name */
    public final o f65026c;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.b f65027d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f65028e;

    /* renamed from: f, reason: collision with root package name */
    public String f65029f;

    /* renamed from: g, reason: collision with root package name */
    public final List f65030g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65031h;

    /* renamed from: i, reason: collision with root package name */
    public final v f65032i;

    public c(WindowManager windowManager, uh2.b preferencesService, ki2.a backgroundWorker, o systemInfo, lh2.b logger) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(systemInfo, "systemInfo");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f65024a = windowManager;
        this.f65025b = preferencesService;
        this.f65026c = systemInfo;
        this.f65027d = logger;
        this.f65029f = "";
        this.f65030g = f0.j("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");
        if (this.f65028e == null) {
            final int i13 = 1;
            backgroundWorker.b(new Runnable(this) { // from class: gh2.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f65022b;

                {
                    this.f65022b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    int i14 = i13;
                    boolean z13 = true;
                    Display display = null;
                    c cVar = this.f65022b;
                    switch (i14) {
                        case 0:
                            String string = ((uh2.a) cVar.f65025b).f122252a.getString("io.embrace.screen.resolution", null);
                            if (string == null) {
                                WindowManager windowManager2 = cVar.f65024a;
                                if (windowManager2 != null) {
                                    try {
                                        display = windowManager2.getDefaultDisplay();
                                    } catch (Exception e13) {
                                        ((e) cVar.f65027d).b(g.SCREEN_RES_CAPTURE_FAIL, e13);
                                        str = "";
                                    }
                                }
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                if (display != null) {
                                    display.getMetrics(displayMetrics);
                                }
                                str = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)}, 2));
                                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                Intrinsics.checkNotNullParameter(str, "<set-?>");
                                cVar.f65029f = str;
                                uh2.a.d(((uh2.a) cVar.f65025b).f122252a, "io.embrace.screen.resolution", str);
                                break;
                            } else {
                                Intrinsics.checkNotNullParameter(string, "<set-?>");
                                cVar.f65029f = string;
                                break;
                            }
                        default:
                            SharedPreferences sharedPreferences = ((uh2.a) cVar.f65025b).f122252a;
                            Boolean valueOf = sharedPreferences.contains("io.embrace.is_jailbroken") ? Boolean.valueOf(sharedPreferences.getBoolean("io.embrace.is_jailbroken", false)) : null;
                            if (valueOf != null) {
                                cVar.f65028e = valueOf;
                                break;
                            } else {
                                if (!h.t(cVar.f65026c)) {
                                    Iterator it = cVar.f65030g.iterator();
                                    while (it.hasNext()) {
                                        if (new File(a.a.C((String) it.next(), "su")).exists()) {
                                            cVar.f65028e = Boolean.valueOf(z13);
                                            SharedPreferences.Editor edit = ((uh2.a) cVar.f65025b).f122252a.edit();
                                            edit.putBoolean("io.embrace.is_jailbroken", z13);
                                            edit.apply();
                                            break;
                                        }
                                    }
                                }
                                z13 = false;
                                cVar.f65028e = Boolean.valueOf(z13);
                                SharedPreferences.Editor edit2 = ((uh2.a) cVar.f65025b).f122252a.edit();
                                edit2.putBoolean("io.embrace.is_jailbroken", z13);
                                edit2.apply();
                            }
                    }
                }
            });
        }
        if (this.f65029f.length() <= 0) {
            final int i14 = 0;
            backgroundWorker.b(new Runnable(this) { // from class: gh2.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f65022b;

                {
                    this.f65022b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    int i142 = i14;
                    boolean z13 = true;
                    Display display = null;
                    c cVar = this.f65022b;
                    switch (i142) {
                        case 0:
                            String string = ((uh2.a) cVar.f65025b).f122252a.getString("io.embrace.screen.resolution", null);
                            if (string == null) {
                                WindowManager windowManager2 = cVar.f65024a;
                                if (windowManager2 != null) {
                                    try {
                                        display = windowManager2.getDefaultDisplay();
                                    } catch (Exception e13) {
                                        ((e) cVar.f65027d).b(g.SCREEN_RES_CAPTURE_FAIL, e13);
                                        str = "";
                                    }
                                }
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                if (display != null) {
                                    display.getMetrics(displayMetrics);
                                }
                                str = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)}, 2));
                                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                Intrinsics.checkNotNullParameter(str, "<set-?>");
                                cVar.f65029f = str;
                                uh2.a.d(((uh2.a) cVar.f65025b).f122252a, "io.embrace.screen.resolution", str);
                                break;
                            } else {
                                Intrinsics.checkNotNullParameter(string, "<set-?>");
                                cVar.f65029f = string;
                                break;
                            }
                        default:
                            SharedPreferences sharedPreferences = ((uh2.a) cVar.f65025b).f122252a;
                            Boolean valueOf = sharedPreferences.contains("io.embrace.is_jailbroken") ? Boolean.valueOf(sharedPreferences.getBoolean("io.embrace.is_jailbroken", false)) : null;
                            if (valueOf != null) {
                                cVar.f65028e = valueOf;
                                break;
                            } else {
                                if (!h.t(cVar.f65026c)) {
                                    Iterator it = cVar.f65030g.iterator();
                                    while (it.hasNext()) {
                                        if (new File(a.a.C((String) it.next(), "su")).exists()) {
                                            cVar.f65028e = Boolean.valueOf(z13);
                                            SharedPreferences.Editor edit2 = ((uh2.a) cVar.f65025b).f122252a.edit();
                                            edit2.putBoolean("io.embrace.is_jailbroken", z13);
                                            edit2.apply();
                                            break;
                                        }
                                    }
                                }
                                z13 = false;
                                cVar.f65028e = Boolean.valueOf(z13);
                                SharedPreferences.Editor edit22 = ((uh2.a) cVar.f65025b).f122252a.edit();
                                edit22.putBoolean("io.embrace.is_jailbroken", z13);
                                edit22.apply();
                            }
                    }
                }
            });
        }
        this.f65031h = Runtime.getRuntime().availableProcessors();
        this.f65032i = m.b(b.f65023i);
    }
}
