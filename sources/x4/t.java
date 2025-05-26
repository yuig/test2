package x4;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f131830a = Float.NaN;

    /* renamed from: b, reason: collision with root package name */
    public float f131831b = Float.NaN;

    /* renamed from: c, reason: collision with root package name */
    public int f131832c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f131833d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f131834e;

    public t(MotionLayout motionLayout) {
        this.f131834e = motionLayout;
    }

    public final void a() {
        int i13 = this.f131832c;
        MotionLayout motionLayout = this.f131834e;
        if (i13 != -1 || this.f131833d != -1) {
            if (i13 == -1) {
                motionLayout.n1(this.f131833d);
            } else {
                int i14 = this.f131833d;
                if (i14 == -1) {
                    motionLayout.setState(i13, -1, -1);
                } else {
                    motionLayout.S0(i13, i14);
                }
            }
            motionLayout.P0(v.SETUP);
        }
        if (Float.isNaN(this.f131831b)) {
            if (Float.isNaN(this.f131830a)) {
                return;
            }
            motionLayout.K0(this.f131830a);
        } else {
            motionLayout.L0(this.f131830a, this.f131831b);
            this.f131830a = Float.NaN;
            this.f131831b = Float.NaN;
            this.f131832c = -1;
            this.f131833d = -1;
        }
    }
}
