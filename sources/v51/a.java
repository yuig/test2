package v51;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import yb0.d;
import yb0.n;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f124166b;

    public /* synthetic */ a(n nVar, int i13) {
        this.f124165a = i13;
        this.f124166b = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f124165a;
        n this_apply = this.f124166b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.g(d.CONFIRM_BUTTON_CLICK);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.g(d.CONFIRM_BUTTON_CLICK);
                break;
            default:
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.g(d.CONFIRM_BUTTON_CLICK);
                break;
        }
    }
}
