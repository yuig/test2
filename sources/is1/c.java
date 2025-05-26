package is1;

import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73577i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ lh0.j f73578j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(lh0.j jVar, int i13) {
        super(0);
        this.f73577i = i13;
        this.f73578j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = true;
        int i13 = this.f73577i;
        lh0.j jVar = this.f73578j;
        switch (i13) {
            case 0:
                jVar.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) jVar.f83394a;
                if (!g1Var.o("android_max_video_audio_overlay", "enabled", z3Var) && !g1Var.l("android_max_video_audio_overlay")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 1:
                return Boolean.valueOf(jVar.a());
            case 2:
                return Boolean.valueOf(jVar.a());
            case 3:
                return Boolean.valueOf(jVar.d());
            case 4:
                jVar.getClass();
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) jVar.f83394a;
                if (!g1Var2.o("ads_dl_video_fullscreen_audio_overlay", "enabled", z3Var2) && !g1Var2.l("ads_dl_video_fullscreen_audio_overlay")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                return Boolean.valueOf(jVar.a());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f73577i) {
        }
        return invoke();
    }
}
