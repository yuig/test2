package nr;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.activity.user.UserImageView;
import com.pinterest.api.model.wy0;
import h32.d4;
import java.util.HashSet;
import m60.u;
import m60.w;
import nx.f0;
import pk.a0;
import so.oa;
import so.x8;
import x02.x2;

/* loaded from: classes3.dex */
public class d extends mf0.f {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f91838m0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public ye2.m f91839c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f91840d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f91841e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public final xj2.b f91842f0 = new xj2.b();

    /* renamed from: g0, reason: collision with root package name */
    public final w f91843g0 = u.f85943a;

    /* renamed from: h0, reason: collision with root package name */
    public final c f91844h0 = new c(this);

    /* renamed from: i0, reason: collision with root package name */
    public wy0 f91845i0;

    /* renamed from: j0, reason: collision with root package name */
    public x2 f91846j0;

    /* renamed from: k0, reason: collision with root package name */
    public String f91847k0;

    /* renamed from: l0, reason: collision with root package name */
    public UserImageView f91848l0;

    public static d r7(String str, x2 x2Var) {
        d dVar = new d();
        dVar.f91847k0 = str;
        dVar.f91846j0 = x2Var;
        return dVar;
    }

    @Override // mf0.f
    public final void Y6() {
        if (this.f91841e0) {
            return;
        }
        this.f91841e0 = true;
        x8 x8Var = (x8) ((h) generatedComponent());
        this.Z = (f0) x8Var.f114707a.f113747j2.get();
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f91840d0) {
            return null;
        }
        q7();
        return this.f91839c0;
    }

    @Override // mf0.f, uk1.c
    /* renamed from: getViewType */
    public final d4 getG0() {
        return d4.USER;
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        q7();
        Y6();
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f91847k0 == null) {
            p7("");
            return;
        }
        if (getContext() != null) {
            UserImageView userImageView = new UserImageView((ye2.m) getContext());
            this.f91848l0 = userImageView;
            userImageView.f35224i.u(new xo.k(this, 16));
        }
        this.f91843g0.h(this.f91844h0);
        String str = this.f91847k0;
        if (this.f91846j0 == null) {
            this.f91846j0 = ((oa) ((g) f.f91850a.getValue())).G2();
        }
        this.f91842f0.a(this.f91846j0.L(str).A(wj2.c.a()).F(new xo.a(this, 8), new b(0, this, str), ck2.i.f27923c, ck2.i.f27924d));
        c7(this.f91848l0, 0);
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f91842f0.dispose();
        this.f91843g0.j(this.f91844h0);
        super.onDestroy();
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        wy0 wy0Var = this.f91845i0;
        if (wy0Var != null) {
            bundle.putString("com.pinterest.EXTRA_USER_ID", wy0Var.getId());
        }
    }

    public final void p7(String str) {
        M6();
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.o("UserImageDialog", new IllegalStateException("User Is Null,  Is userId empty: " + a0.x0(str)));
    }

    public final void q7() {
        if (this.f91839c0 == null) {
            this.f91839c0 = new ye2.m(super.getContext(), this);
            this.f91840d0 = ue.c.x(super.getContext());
        }
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f91839c0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q7();
        Y6();
    }
}
