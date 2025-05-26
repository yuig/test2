package ol0;

import android.view.View;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements r5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f96353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f96354c;

    public /* synthetic */ c(f fVar, d dVar, int i13) {
        this.f96352a = i13;
        this.f96353b = fVar;
        this.f96354c = dVar;
    }

    @Override // r5.p
    public final boolean l(View view) {
        int i13 = this.f96352a;
        Function0 handler = this.f96354c;
        f this$0 = this.f96353b;
        switch (i13) {
            case 0:
                int i14 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(handler, "$handler");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                GestaltSwitch gestaltSwitch = this$0.H0;
                if (gestaltSwitch == null) {
                    Intrinsics.r("allowHomefeedRecommendationsSwitch");
                    throw null;
                }
                gestaltSwitch.i(e.f96361n);
                handler.invoke();
                this$0.e8();
                return true;
            default:
                int i15 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(handler, "$handler");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                GestaltSwitch gestaltSwitch2 = this$0.F0;
                if (gestaltSwitch2 == null) {
                    Intrinsics.r("secretToggleSwitch");
                    throw null;
                }
                gestaltSwitch2.i(e.f96362o);
                handler.invoke();
                this$0.f8();
                return true;
        }
    }
}
