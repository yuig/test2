package oi;

import com.google.android.gms.internal.measurement.r7;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k4 f94934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94935c;

    public /* synthetic */ l4(k4 k4Var, String str, int i13) {
        this.f94933a = i13;
        this.f94934b = k4Var;
        this.f94935c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f94935c;
        k4 k4Var = this.f94934b;
        switch (this.f94933a) {
            case 0:
                return new r7(new bh.b(6, k4Var, str), 0);
            case 1:
                p4 d03 = k4Var.r().d0(str);
                HashMap x13 = a.a.x("platform", "android", "package_name", str);
                x13.put("gmp_version", 82001L);
                if (d03 != null) {
                    String d2 = d03.d();
                    if (d2 != null) {
                        x13.put("app_version", d2);
                    }
                    x13.put("app_version_int", Long.valueOf(d03.l()));
                    x13.put("dynamite_version", Long.valueOf(d03.C()));
                }
                return x13;
            default:
                return new com.google.android.gms.internal.measurement.t6(new l4(k4Var, str, 1));
        }
    }
}
