package eh;

import android.content.Context;
import com.google.android.gms.common.api.f;
import sh.d;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public static int f58902k = 1;

    public final synchronized int e() {
        int i13;
        try {
            i13 = f58902k;
            if (i13 == 1) {
                Context context = this.f30761a;
                ih.c cVar = ih.c.f72257d;
                int c13 = cVar.c(context, 12451000);
                if (c13 == 0) {
                    i13 = 4;
                    f58902k = 4;
                } else if (cVar.a(c13, context, null) != null || d.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i13 = 2;
                    f58902k = 2;
                } else {
                    i13 = 3;
                    f58902k = 3;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return i13;
    }
}
