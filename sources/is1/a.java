package is1;

import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73569i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ lh0.j f73570j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(lh0.j jVar, int i13) {
        super(0);
        this.f73569i = i13;
        this.f73570j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f73569i;
        lh0.j jVar = this.f73570j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(jVar.d());
            case 1:
                return Boolean.valueOf(jVar.d());
            case 2:
                jVar.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) jVar.f83394a;
                return Boolean.valueOf(g1Var.o("ads_dl_video_fullscreen_audio_overlay", "enabled", z3Var) || g1Var.l("ads_dl_video_fullscreen_audio_overlay"));
            default:
                return Boolean.valueOf(jVar.a());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f73569i) {
        }
        return invoke();
    }
}
