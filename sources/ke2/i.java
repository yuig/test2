package ke2;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: l */
    public static final AtomicInteger f79332l = new AtomicInteger(1);

    /* renamed from: a */
    public final int f79333a = f79332l.incrementAndGet();

    /* renamed from: b */
    public float f79334b;

    /* renamed from: c */
    public float f79335c;

    /* renamed from: d */
    public boolean f79336d;

    /* renamed from: e */
    public boolean f79337e;

    /* renamed from: f */
    public Bitmap f79338f;

    /* renamed from: g */
    public float f79339g;

    /* renamed from: h */
    public final gd2.c f79340h;

    /* renamed from: i */
    public final gd2.c f79341i;

    /* renamed from: j */
    public final gd2.c f79342j;

    /* renamed from: k */
    public od2.c f79343k;

    public i() {
        c(null);
        this.f79339g = 1.0f;
        this.f79340h = new gd2.c(null, new h(this, 2), 3);
        this.f79341i = new gd2.c(null, new h(this, 1), 3);
        this.f79342j = new gd2.c(null, new h(this, 0), 3);
    }

    public float a() {
        return this.f79335c;
    }

    public float b() {
        return this.f79334b;
    }

    public final void c(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f79334b = bitmap.getWidth();
            this.f79335c = bitmap.getHeight();
        }
        if (!Intrinsics.d(this.f79338f, bitmap)) {
            this.f79337e = true;
        }
        this.f79338f = bitmap;
    }

    public void d(float f13) {
        this.f79335c = f13;
        if (this.f79338f != null) {
            this.f79334b = (r3.getWidth() * this.f79335c) / r3.getHeight();
        }
    }

    public final void e(float f13) {
        float f14 = this.f79339g;
        if (0.0f <= f14 && f14 <= 1.0f) {
            this.f79339g = f13;
        } else {
            throw new IllegalArgumentException(("Sticker opacity should be in range [0.0, 1.0], got " + this.f79339g).toString());
        }
    }

    public void f(float f13) {
        this.f79334b = f13;
        if (this.f79338f != null) {
            this.f79335c = (r3.getHeight() * this.f79334b) / r3.getWidth();
        }
    }
}
