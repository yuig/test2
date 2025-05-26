package sw0;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public int f115562a;

    /* renamed from: b, reason: collision with root package name */
    public int f115563b;

    /* renamed from: c, reason: collision with root package name */
    public int f115564c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f115565d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f115566e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f115567f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f115568g;

    public r0(d4 viewType, a4 viewParameterType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        this.f115566e = viewType;
        this.f115567f = viewParameterType;
        this.f115568g = null;
        this.f115563b = -1;
        this.f115564c = -1;
    }

    public static void d() {
        new oy.x(1, 0).i();
    }

    public final void a() {
        int i13 = this.f115562a;
        int i14 = this.f115563b;
        if (i14 < 0 || i14 > i13) {
            return;
        }
        this.f115565d = true;
        new oy.s((d4) this.f115566e, (a4) this.f115567f, s92.o.COMPLETE, i14, i13).i();
    }

    public final void b() {
        if (this.f115565d) {
            return;
        }
        this.f115565d = true;
        new oy.s((d4) this.f115566e, (a4) this.f115567f, s92.o.ABORTED, this.f115563b, this.f115562a).i();
    }

    public final void c(int i13) {
        if (this.f115565d) {
            return;
        }
        new oy.w(i13).i();
        int i14 = this.f115563b;
        if (i14 != -1) {
            i13 = Math.min(i14, i13);
        }
        this.f115563b = i13;
        a();
    }

    public final void e(String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueId");
        if (this.f115565d) {
            return;
        }
        this.f115562a++;
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        new oy.y(uniqueIdentifier, 0, 0).i();
        a();
    }

    public r0(String appPackageName, int i13, int i14, int i15, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        this.f115566e = appPackageName;
        this.f115562a = i13;
        this.f115563b = i14;
        this.f115564c = i15;
        this.f115567f = num;
        this.f115568g = num2;
        this.f115565d = Intrinsics.d(appPackageName, "com.facebook.katana") || Intrinsics.d(appPackageName, "com.facebook.lite");
    }
}
