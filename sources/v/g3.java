package v;

import a.sc;
import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* loaded from: classes2.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final w.l f123478a;

    /* renamed from: b, reason: collision with root package name */
    public final k0.d f123479b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f123480c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f123481d = false;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f123482e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f123483f;

    /* renamed from: g, reason: collision with root package name */
    public c0.c1 f123484g;

    /* renamed from: h, reason: collision with root package name */
    public c0.q0 f123485h;

    /* renamed from: i, reason: collision with root package name */
    public c0.k1 f123486i;

    /* renamed from: j, reason: collision with root package name */
    public ImageWriter f123487j;

    public g3(w.l lVar) {
        boolean z13;
        this.f123482e = false;
        this.f123483f = false;
        this.f123478a = lVar;
        int[] iArr = (int[]) lVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i13 : iArr) {
                if (i13 == 4) {
                    z13 = true;
                    break;
                }
            }
        }
        z13 = false;
        this.f123482e = z13;
        this.f123483f = y.b.f136245a.b(ZslDisablerQuirk.class) != null;
        this.f123479b = new k0.d(3, new sc(20));
    }
}
