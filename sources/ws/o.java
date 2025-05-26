package ws;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.navigation.Navigation;
import java.util.Iterator;
import java.util.List;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mq.e0;
import mq.f0;
import mq.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lws/o;", "Lpu/j0;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends b0 {
    public static final /* synthetic */ int C0 = 0;
    public final xk2.v A0;
    public final xk2.v B0;

    /* renamed from: y0, reason: collision with root package name */
    public final m1 f131069y0;

    /* renamed from: z0, reason: collision with root package name */
    public zs.a f131070z0;

    public o() {
        int i13 = 3;
        xk2.k q13 = jq.b.q(3, new q1(this, 4), xk2.n.NONE);
        this.f131069y0 = a1.s(this, k0.f80436a.b(a0.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
        this.A0 = xk2.m.b(new l(this, 0));
        this.B0 = xk2.m.b(new l(this, 1));
    }

    public static final void h8(o oVar, List list) {
        oVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (Intrinsics.d(bVar, a.f131035a)) {
                super.getF103154e0();
            } else if (Intrinsics.d(bVar, a.f131036b)) {
                oVar.a8().b();
            }
        }
        if (!list.isEmpty()) {
            ((l82.c) oVar.j8().c()).a(d.f131054a);
        }
    }

    @Override // pu.j0, mu.p0
    public final ru.b b8() {
        return (ru.b) this.B0.getValue();
    }

    @Override // pu.j0
    public final wb.c e8() {
        return new wb.c(j8().f131047l.d(), 3);
    }

    @Override // pu.j0
    public final mq.z f8() {
        return new mq.z(j8().f131047l.e(), 3);
    }

    @Override // pu.j0, mu.p0, nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ((l82.c) j8().c()).a(new f(System.currentTimeMillis() * 1000000));
        return true;
    }

    @Override // pu.j0, mu.p0
    /* renamed from: i8, reason: merged with bridge method [inline-methods] */
    public final xs.g a8() {
        return (xs.g) this.A0.getValue();
    }

    public final a0 j8() {
        return (a0) this.f131069y0.getValue();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.CLOSEUP_PIN_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        j8().h(v03, hf0.b.i(E4()), dl2.b.z1(getContext(), "com.android.chrome"));
    }

    @Override // pu.j0, mu.p0, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        hf0.b.t(requireActivity());
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new n(this, null), 3);
    }
}
