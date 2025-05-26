package ml0;

import android.view.View;
import com.pinterest.gestalt.text.GestaltText;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f87469b;

    public /* synthetic */ l(w wVar, int i13) {
        this.f87468a = i13;
        this.f87469b = wVar;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i13, int i14, int i15, int i16) {
        int i17 = this.f87468a;
        w this$0 = this.f87469b;
        switch (i17) {
            case 0:
                int i18 = w.f87509e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2((r0) this$0.O0.getValue(), h.f87455a);
                return;
            default:
                int i19 = w.f87509e1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2((r0) this$0.O0.getValue(), e.f87447a);
                GestaltText gestaltText = this$0.W0;
                if (gestaltText == null) {
                    Intrinsics.r("repositionText");
                    throw null;
                }
                gestaltText.setAlpha(0.0f);
                kk2.l lVar = this$0.Z0;
                if (lVar != null) {
                    lVar.dispose();
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                uj2.a0 a0Var = tk2.e.f118016b;
                ck2.i.b(timeUnit, "unit is null");
                ck2.i.b(a0Var, "scheduler is null");
                this$0.Z0 = (kk2.l) new kk2.y(100L, timeUnit, a0Var).r(tk2.e.f118017c).l(wj2.c.a()).o(new zk0.b(27, new m(this$0, 0)), new zk0.b(28, n.f87479j));
                return;
        }
    }
}
