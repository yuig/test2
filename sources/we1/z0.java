package we1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class z0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ re1.e f129711b;

    public /* synthetic */ z0(re1.e eVar, int i13) {
        this.f129710a = i13;
        this.f129711b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f129710a;
        re1.e act = this.f129711b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(act, "$act");
                act.f107576d.invoke();
                break;
            default:
                int i14 = d1.f129322f;
                Intrinsics.checkNotNullParameter(act, "$this_with");
                act.f107576d.invoke();
                break;
        }
    }
}
