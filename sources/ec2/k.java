package ec2;

import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.k4;
import lh0.z3;

/* loaded from: classes2.dex */
public final class k extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58456i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f58457j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(PinterestVideoView pinterestVideoView, int i13) {
        super(0);
        this.f58456i = i13;
        this.f58457j = pinterestVideoView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f58456i;
        boolean z13 = true;
        PinterestVideoView pinterestVideoView = this.f58457j;
        switch (i13) {
            case 1:
                k4 k4Var = pinterestVideoView.f52756k0;
                if (k4Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) k4Var.f83410a;
                if (!g1Var.o("android_video_cache_purge", "enabled", z3Var) && !g1Var.l("android_video_cache_purge")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                k4 k4Var2 = pinterestVideoView.f52756k0;
                if (k4Var2 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) k4Var2.f83410a;
                if (!g1Var2.o("android_video_performance_kibana", "enabled", z3Var2) && !g1Var2.l("android_video_performance_kibana")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f58456i) {
        }
        return invoke();
    }
}
