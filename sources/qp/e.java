package qp;

import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f104678b;

    public /* synthetic */ e(k kVar, int i13) {
        this.f104677a = i13;
        this.f104678b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f104677a;
        k this$0 = this.f104678b;
        switch (i13) {
            case 0:
                int i14 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.I3();
                return;
            default:
                int i15 = k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GestaltButton gestaltButton = this$0.f104702k0;
                if (gestaltButton == null) {
                    Intrinsics.r("nextButton");
                    throw null;
                }
                if (gestaltButton.isEnabled()) {
                    this$0.Y7(new ArrayList(this$0.f104711t0));
                    return;
                }
                return;
        }
    }
}
