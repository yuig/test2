package yq1;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyq1/e2;", "Lyq1/l2;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e2 extends n0 {
    public static final /* synthetic */ int C0 = 0;

    @Override // zq1.h0
    public final void N2() {
        if (e8().F0() > 200) {
            G1(vq1.d.signup_name_too_long, false);
            return;
        }
        ar1.a aVar = this.f139907m0;
        if (aVar != null) {
            aVar.I0(e8().B0(), ar1.d.NAME_STEP);
        }
    }

    @Override // yq1.l2
    public final String f8() {
        String string = getString(vq1.d.name_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final String h8() {
        String string = getString(vq1.d.whats_your_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final void l8() {
        e8().Z(new gh1.e(this, 11));
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_SIGNUP_NAME", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            this.f139915u0 = string;
            arguments.remove("EXTRA_SIGNUP_NAME");
        }
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        e8().X(c.f139801J);
        j8(new wq1.a(this, 5));
        i8();
    }
}
