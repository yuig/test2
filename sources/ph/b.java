package ph;

import android.content.Context;
import h6.q;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b */
    public static final b f100155b;

    /* renamed from: a */
    public q f100156a;

    static {
        b bVar = new b();
        bVar.f100156a = null;
        f100155b = bVar;
    }

    public static q a(Context context) {
        q qVar;
        b bVar = f100155b;
        synchronized (bVar) {
            try {
                if (bVar.f100156a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f100156a = new q(context);
                }
                qVar = bVar.f100156a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return qVar;
    }
}
