package ln1;

import android.graphics.drawable.Drawable;
import com.airbnb.lottie.v;
import com.airbnb.lottie.x;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.jvm.internal.Intrinsics;
import ps0.y;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestaltSpinner f83996b;

    public /* synthetic */ a(GestaltSpinner gestaltSpinner, int i13) {
        this.f83995a = i13;
        this.f83996b = gestaltSpinner;
    }

    @Override // com.airbnb.lottie.x
    public final void onResult(Object obj) {
        int i13 = this.f83995a;
        GestaltSpinner this$0 = this.f83996b;
        com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) obj;
        switch (i13) {
            case 0:
                y yVar = GestaltSpinner.B;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f49600u.t(hVar);
                this$0.f49600u.f28447b.setRepeatCount(0);
                return;
            case 1:
                y yVar2 = GestaltSpinner.B;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Drawable drawable = this$0.f49601v;
                if (drawable == null) {
                    Intrinsics.r("spinnerDrawable");
                    throw null;
                }
                ((v) drawable).t(hVar);
                Drawable drawable2 = this$0.f49601v;
                if (drawable2 != null) {
                    ((v) drawable2).f28447b.setRepeatCount(-1);
                    return;
                } else {
                    Intrinsics.r("spinnerDrawable");
                    throw null;
                }
            default:
                y yVar3 = GestaltSpinner.B;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f49600u.t(hVar);
                this$0.f49600u.f28447b.setRepeatCount(0);
                return;
        }
    }
}
