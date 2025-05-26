package uu;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu/h;", "Lpu/j0;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f123123z0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public final m1 f123124y0;

    public h() {
        xk2.k q13 = jq.b.q(8, new q1(this, 8), n.NONE);
        int i13 = 7;
        this.f123124y0 = a1.s(this, k0.f80436a.b(k.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
    }

    @Override // pu.j0
    public final wb.c e8() {
        return new wb.c(((k) this.f123124y0.getValue()).f123127d.d(), 7);
    }

    @Override // pu.j0
    public final z f8() {
        return new z(((k) this.f123124y0.getValue()).f123127d.e(), 12);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.CLOSEUP_PIN_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        ((k) this.f123124y0.getValue()).h(v03, hf0.b.i(E4()), dl2.b.z1(getContext(), "com.android.chrome"));
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
