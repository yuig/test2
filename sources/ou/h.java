package ou;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.navigation.Navigation;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mq.e0;
import mq.f0;
import mq.g0;
import mq.z;
import xk2.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lou/h;", "Lpu/j0;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f97692z0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public final m1 f97693y0;

    public h() {
        xk2.k q13 = jq.b.q(7, new q1(this, 7), n.NONE);
        int i13 = 6;
        this.f97693y0 = a1.s(this, k0.f80436a.b(l.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
    }

    @Override // pu.j0
    public final wb.c e8() {
        return new wb.c(((l) this.f97693y0.getValue()).f97698d.d(), 5);
    }

    @Override // pu.j0
    public final z f8() {
        return new z(((l) this.f97693y0.getValue()).f97698d.e(), 8);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.CLOSEUP_PIN_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        ((l) this.f97693y0.getValue()).h(v03, hf0.b.i(E4()), dl2.b.z1(getContext(), "com.android.chrome"));
    }

    @Override // pu.j0, mu.p0, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new g(this, null), 3);
    }
}
