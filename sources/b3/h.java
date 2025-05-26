package b3;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class h implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f21320a;

    public h(Bitmap bitmap) {
        this.f21320a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f21320a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            if (config == Bitmap.Config.RGBA_F16) {
                return 3;
            }
            if (config == Bitmap.Config.HARDWARE) {
                return 4;
            }
        }
        return 0;
    }
}
