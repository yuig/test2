package te;

import df.a0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import ve.d;
import ve.g;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f117476a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f117477b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f117478c;

    public static final void a() {
        if (p001if.a.b(a.class)) {
            return;
        }
        try {
            f117477b = true;
            AtomicBoolean atomicBoolean = a0.f54697a;
            f117478c = a0.b("FBSDKFeatureIntegritySample", v.b(), false);
        } catch (Throwable th3) {
            p001if.a.a(a.class, th3);
        }
    }

    public final boolean b(String str) {
        if (p001if.a.b(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!p001if.a.b(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i13 = 0; i13 < 30; i13++) {
                        fArr[i13] = 0.0f;
                    }
                    g gVar = g.f125671a;
                    String[] g13 = g.g(d.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                    if (g13 != null) {
                        String str3 = g13[0];
                        if (str3 != null) {
                            str2 = str3;
                        }
                    }
                    str2 = "none";
                } catch (Throwable th3) {
                    p001if.a.a(this, th3);
                }
            }
            return !Intrinsics.d("none", str2);
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return false;
        }
    }
}
