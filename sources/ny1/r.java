package ny1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf0.s f92693b;

    public /* synthetic */ r(mf0.s sVar, int i13) {
        this.f92692a = i13;
        this.f92693b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f92692a;
        mf0.s this_apply = this.f92693b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.N6(false, false);
                break;
            default:
                String[] strArr = qy1.d.f105359a;
                this_apply.N6(false, false);
                break;
        }
    }
}
