package e21;

import kotlin.jvm.internal.Intrinsics;
import q91.o0;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ va.f f56941b;

    public /* synthetic */ d(va.f fVar, int i13) {
        this.f56940a = i13;
        this.f56941b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f56940a;
        va.f animatedVectorDrawableCompat = this.f56941b;
        switch (i13) {
            case 0:
                if (animatedVectorDrawableCompat != null) {
                    animatedVectorDrawableCompat.start();
                    break;
                }
                break;
            case 1:
                if (animatedVectorDrawableCompat != null) {
                    animatedVectorDrawableCompat.start();
                    break;
                }
                break;
            default:
                int i14 = o0.f103151s0;
                Intrinsics.checkNotNullParameter(animatedVectorDrawableCompat, "$animatedVectorDrawableCompat");
                animatedVectorDrawableCompat.start();
                break;
        }
    }
}
