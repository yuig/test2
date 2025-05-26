package k5;

import a7.j;
import android.os.Build;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.z0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f78307a;

    /* renamed from: b, reason: collision with root package name */
    public int f78308b;

    /* renamed from: c, reason: collision with root package name */
    public int f78309c;

    /* renamed from: d, reason: collision with root package name */
    public int f78310d;

    /* renamed from: e, reason: collision with root package name */
    public int f78311e;

    /* renamed from: f, reason: collision with root package name */
    public Object f78312f;

    public a(int i13) {
        if (i13 == 1) {
            this.f78307a = -1;
            this.f78308b = -1;
            this.f78309c = -1;
            this.f78310d = -1;
            this.f78311e = -1;
            return;
        }
        this.f78307a = 30;
        this.f78308b = 31;
        this.f78309c = 33;
        this.f78312f = z0.f(new Pair("robolectric-BrandX/ProductX/Device30:11", 30), new Pair("robolectric-BrandX/ProductX/Device31:12", Integer.valueOf(this.f78308b)), new Pair("OPPO/CPH2025EEA/OP4BA2L1:12", Integer.valueOf(this.f78307a)), new Pair("OPPO/CPH2207EEA/OP4F0BL1:12", Integer.valueOf(this.f78307a)), new Pair("OPPO/PENM00/OP4EC1:11", Integer.valueOf(this.f78307a)), new Pair("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", Integer.valueOf(this.f78307a)), new Pair("OnePlus/OnePlus8_BETA/OnePlus8:11", Integer.valueOf(this.f78307a)), new Pair("Xiaomi/umi_global/umi:11", Integer.valueOf(this.f78307a)), new Pair("realme/RMX2085/RMX2085L1:11", Integer.valueOf(this.f78307a)), new Pair("samsung/c1qsqw/c1q:12", Integer.valueOf(this.f78307a)), new Pair("samsung/o1quew/o1q:12", Integer.valueOf(this.f78307a)), new Pair("samsung/r0quew/r0q:12", Integer.valueOf(this.f78307a)), new Pair("samsung/r0sxxx/r0s:12", Integer.valueOf(this.f78307a)));
        int i14 = Build.VERSION.SDK_INT >= 31 ? Build.VERSION.MEDIA_PERFORMANCE_CLASS : this.f78310d;
        if (i14 < this.f78307a && (i14 = b()) < this.f78307a) {
            i14 = this.f78310d;
        }
        this.f78311e = i14;
    }

    public final j a() {
        return new j(this.f78307a, this.f78308b, this.f78309c, (byte[]) this.f78312f, this.f78310d, this.f78311e);
    }

    public final int b() {
        Integer num = (Integer) ((HashMap) this.f78312f).get(Build.BRAND + '/' + Build.PRODUCT + '/' + Build.DEVICE + ':' + Build.VERSION.RELEASE);
        if (num == null) {
            num = Integer.valueOf(this.f78310d);
        }
        return num.intValue();
    }

    public final void c(int i13) {
        this.f78311e = i13;
    }

    public final void d(int i13) {
        this.f78308b = i13;
    }

    public final void e(int i13) {
        this.f78307a = i13;
    }

    public final void f(int i13) {
        this.f78309c = i13;
    }

    public final void g(int i13) {
        this.f78310d = i13;
    }
}
