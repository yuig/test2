package rg0;

import android.view.View;
import df.j1;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes5.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f108084b;

    public /* synthetic */ q0(n nVar, int i13) {
        this.f108083a = i13;
        this.f108084b = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f108083a;
        n experienceValue = this.f108084b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(experienceValue, "$experienceValue");
                s0.f108088a.b();
                Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
                ((vy.m) ((oa) ((t0) s0.f108091d.getValue())).M1.get()).l(j1.W("%s_%s_%d_%d", "SURVEY", experienceValue.f108063e, Integer.valueOf(experienceValue.f108060b), 1), z0.d());
                break;
            default:
                int i14 = com.pinterest.schoolTeenPrompt.g.f50465k0;
                experienceValue.b(y0.b(new Pair("complete_trigger", "dismiss_button")));
                break;
        }
    }
}
