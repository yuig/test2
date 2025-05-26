package androidx.appcompat.app;

import a.ig;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final r f16128a = new r(0, new s(0));

    /* renamed from: b, reason: collision with root package name */
    public static int f16129b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static j5.h f16130c = null;

    /* renamed from: d, reason: collision with root package name */
    public static j5.h f16131d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f16132e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f16133f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final g1.h f16134g = new g1.h();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f16135h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f16136i = new Object();

    public static boolean e(Context context) {
        if (f16132e == null) {
            try {
                int i13 = u0.f16139a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) u0.class), t0.a() | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).metaData;
                if (bundle != null) {
                    f16132e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f16132e = Boolean.FALSE;
            }
        }
        return f16132e.booleanValue();
    }

    public static void i(t tVar) {
        synchronized (f16135h) {
            try {
                g1.h hVar = f16134g;
                hVar.getClass();
                g1.f fVar = new g1.f(hVar);
                while (fVar.hasNext()) {
                    t tVar2 = (t) ((WeakReference) fVar.next()).get();
                    if (tVar2 == tVar || tVar2 == null) {
                        fVar.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void n(int i13) {
        if (i13 != -1 && i13 != 0 && i13 != 1 && i13 != 2 && i13 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f16129b != i13) {
            f16129b = i13;
            synchronized (f16135h) {
                try {
                    g1.h hVar = f16134g;
                    hVar.getClass();
                    g1.f fVar = new g1.f(hVar);
                    while (fVar.hasNext()) {
                        t tVar = (t) ((WeakReference) fVar.next()).get();
                        if (tVar != null) {
                            tVar.a();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static void q(Context context) {
        if (e(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f16133f) {
                    return;
                }
                f16128a.execute(new ig(context, 4));
                return;
            }
            synchronized (f16136i) {
                try {
                    j5.h hVar = f16130c;
                    if (hVar == null) {
                        if (f16131d == null) {
                            f16131d = j5.h.a(c5.f.b(context));
                        }
                        if (f16131d.d()) {
                        } else {
                            f16130c = f16131d;
                        }
                    } else if (!hVar.equals(f16131d)) {
                        j5.h hVar2 = f16130c;
                        f16131d = hVar2;
                        c5.f.a(context, ((j5.j) hVar2.f74680a).f74681a.toLanguageTags());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public abstract boolean a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void f(Bundle bundle);

    public abstract void g();

    public abstract boolean j(int i13);

    public abstract void k(int i13);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);

    public abstract m.c p(m.b bVar);
}
