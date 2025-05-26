package rq;

import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3 f109376b;

    public /* synthetic */ m3(r3 r3Var, int i13) {
        this.f109375a = i13;
        this.f109376b = r3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hh t53;
        int i13 = this.f109375a;
        r3 this$0 = this.f109376b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f30 pin = this$0.getPin();
                if ((pin != null ? pin.t5() : null) == null) {
                    this$0.g();
                    break;
                } else {
                    Intrinsics.f(view);
                    this$0.i();
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f30 pin2 = this$0.getPin();
                if (((pin2 == null || (t53 = pin2.t5()) == null) ? null : t53.d()) == null) {
                    f30 pin3 = this$0.getPin();
                    if (!Intrinsics.d("Uploaded by user", pin3 != null ? pin3.h4() : null)) {
                        this$0.j();
                        break;
                    } else {
                        this$0.g();
                        break;
                    }
                } else {
                    Intrinsics.f(view);
                    this$0.i();
                    break;
                }
                break;
        }
    }
}
