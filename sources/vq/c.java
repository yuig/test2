package vq;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import k22.m;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq/c;", "Lmf0/f;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class c extends f {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f126398p0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public String f126399f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f126400g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f126401h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f126402i0;

    /* renamed from: k0, reason: collision with root package name */
    public lp.a f126404k0;

    /* renamed from: m0, reason: collision with root package name */
    public m f126406m0;

    /* renamed from: n0, reason: collision with root package name */
    public no1.d f126407n0;

    /* renamed from: o0, reason: collision with root package name */
    public i92.k f126408o0;

    /* renamed from: j0, reason: collision with root package name */
    public List f126403j0 = q0.f80391a;

    /* renamed from: l0, reason: collision with root package name */
    public final xj2.b f126405l0 = new xj2.b();

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f126405l0.dispose();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        lp.a aVar = new lp.a(getContext(), true);
        this.f126404k0 = aVar;
        List list = this.f126403j0;
        aVar.f84202c = list;
        ((List) aVar.f84205f).addAll(list);
        lp.a aVar2 = this.f126404k0;
        if (aVar2 == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        this.V = aVar2;
        this.W = null;
        j7();
        String string = getString(xc0.i.contact_request_block_user_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        h7(string);
        g7(getString(xc0.i.contact_request_block_user_message));
        String string2 = getString(x0.done);
        tq.j jVar = new tq.j(this, 3);
        this.R = string2;
        this.S = jVar;
        m7();
        this.T = null;
        this.U = null;
        l7();
    }
}
