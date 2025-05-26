package df2;

import android.graphics.Bitmap;
import ao2.w;
import do2.f2;
import do2.g2;
import do2.z1;
import kotlin.jvm.internal.Intrinsics;
import ue.c;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f54897a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f54898b;

    public b() {
        f2 b13 = g2.b(0, 1, null, 5);
        this.f54897a = b13;
        this.f54898b = new z1(b13);
    }

    public static w a(b bVar) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        w a13 = c.a();
        bVar.f54897a.b(new a(a13, config));
        return a13;
    }
}
