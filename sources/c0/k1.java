package c0;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class k1 extends androidx.camera.core.impl.z0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f24279o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final Object f24280p;

    public k1(Surface surface) {
        super(0, androidx.camera.core.impl.z0.f17001k);
        this.f24280p = surface;
    }

    @Override // androidx.camera.core.impl.z0
    public final com.google.common.util.concurrent.c0 f() {
        int i13 = this.f24279o;
        Object obj = this.f24280p;
        switch (i13) {
            case 0:
                return ((p1) obj).f24305g;
            default:
                return g0.m.e((Surface) obj);
        }
    }

    public k1(Surface surface, Size size, int i13) {
        super(i13, size);
        this.f24280p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p1 p1Var, Size size) {
        super(34, size);
        this.f24280p = p1Var;
    }
}
