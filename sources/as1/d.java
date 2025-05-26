package as1;

import android.content.res.Resources;
import pk.a0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static d f20429c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f20430d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int f20431a;

    /* renamed from: b, reason: collision with root package name */
    public int f20432b;

    public static d a() {
        if (f20429c == null) {
            synchronized (f20430d) {
                try {
                    if (f20429c == null) {
                        f20429c = new d();
                    }
                } finally {
                }
            }
        }
        return f20429c;
    }

    public static void b(Resources resources) {
        f20429c = null;
        d a13 = a();
        a13.getClass();
        if (hf0.b.q()) {
            a13.f20432b = a0.L(resources, 48.0f);
        } else {
            a13.f20432b = a0.L(resources, 16.0f);
        }
        a13.f20431a = resources.getDimensionPixelSize(wf0.a.dimen_col_span);
    }
}
