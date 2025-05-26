package fu0;

import h32.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62956i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f62957j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f62956i = i13;
        this.f62957j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f62956i;
        d dVar = this.f62957j;
        switch (i13) {
            case 0:
                return Float.valueOf((hf0.b.f69002b - ((Number) dVar.f62975m0.getValue()).intValue()) / 2);
            case 1:
                uk1.e eVar = dVar.f62967e0;
                if (eVar == null) {
                    Intrinsics.r("presenterPinalyticsFactory");
                    throw null;
                }
                uk1.d g13 = ((uk1.a) eVar).g();
                g13.d(dVar.getQ0(), dVar.getR0(), null, g0.PIN_STORY_PIN_PAGE, null);
                return g13;
            default:
                return Integer.valueOf(dVar.getResources().getDimensionPixelOffset(aq1.b.story_pin_video_trimmer_preview_width));
        }
    }
}
