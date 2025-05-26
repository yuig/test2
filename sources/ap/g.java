package ap;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.z0;
import m60.u;
import m60.x0;
import nx.f0;
import ny1.w;
import ny1.x;
import so.oa;
import so.s8;
import so.x8;
import tb0.p;

/* loaded from: classes3.dex */
public class g extends mf0.f {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f20259k0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public ye2.m f20260c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f20261d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f20262e0;

    /* renamed from: f0, reason: collision with root package name */
    public final xj2.b f20263f0;

    /* renamed from: g0, reason: collision with root package name */
    public final c f20264g0;

    /* renamed from: h0, reason: collision with root package name */
    public se2.a f20265h0;

    /* renamed from: i0, reason: collision with root package name */
    public w f20266i0;

    /* renamed from: j0, reason: collision with root package name */
    public o f20267j0;

    public g() {
        this.f20262e0 = false;
        this.f20263f0 = new xj2.b();
        this.f20264g0 = new q(this, 0);
    }

    @Override // mf0.f
    public final void Y6() {
        if (this.f20262e0) {
            return;
        }
        this.f20262e0 = true;
        x8 x8Var = (x8) ((h) generatedComponent());
        oa oaVar = x8Var.f114707a;
        this.Z = (f0) oaVar.f113747j2.get();
        s8 s8Var = x8Var.f114708b;
        this.f20265h0 = bf2.b.a(oaVar.M1);
        this.f20266i0 = s8Var.A5();
        z0 experimentsActivator = (z0) oaVar.D0.get();
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f20267j0 = (o) s8Var.I0.get();
    }

    @Override // mf0.f
    public final void Z6(LayoutInflater layoutInflater) {
        this.H = vc0.d.want_to_send_things_update;
        this.I = vc0.d.contacts_upload_explanation_update;
        final int i13 = 0;
        this.f18411g = false;
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        int i14 = x0.not_now;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: ap.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f20255b;

            {
                this.f20255b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                final int i16 = 0;
                g gVar = this.f20255b;
                switch (i15) {
                    case 0:
                        int i17 = g.f20259k0;
                        gVar.getClass();
                        u.f85943a.d(new k());
                        vy.m mVar = (vy.m) ((bf2.b) gVar.f20265h0).get();
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter("permissions_contact_reject", "event");
                        mVar.l("permissions_contact_reject", kotlin.collections.z0.d());
                        gVar.N6(false, false);
                        break;
                    default:
                        int i18 = g.f20259k0;
                        gVar.getClass();
                        final int i19 = 1;
                        final q qVar = new q(gVar, i19);
                        w wVar = gVar.f20266i0;
                        Activity k03 = bs1.c.k0(gVar.requireContext());
                        x xVar = x.f92714f;
                        String obj = p.CONTACTS_UPLOAD.toString();
                        e eVar = new e(i16);
                        xo.j jVar = new xo.j(i19);
                        e eVar2 = new e(i19);
                        Function0 function0 = new Function0() { // from class: ap.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i23 = i16;
                                c cVar = qVar;
                                switch (i23) {
                                    case 0:
                                        int i24 = g.f20259k0;
                                        cVar.u();
                                        return null;
                                    case 1:
                                        return Boolean.valueOf(cVar.r());
                                    default:
                                        int i25 = g.f20259k0;
                                        cVar.o();
                                        return null;
                                }
                            }
                        };
                        Function0 function02 = new Function0() { // from class: ap.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i23 = i19;
                                c cVar = qVar;
                                switch (i23) {
                                    case 0:
                                        int i24 = g.f20259k0;
                                        cVar.u();
                                        return null;
                                    case 1:
                                        return Boolean.valueOf(cVar.r());
                                    default:
                                        int i25 = g.f20259k0;
                                        cVar.o();
                                        return null;
                                }
                            }
                        };
                        final int i23 = 2;
                        wVar.c(k03, xVar, obj, null, eVar, jVar, eVar2, function0, function02, new e(i23), new Function0() { // from class: ap.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i232 = i23;
                                c cVar = qVar;
                                switch (i232) {
                                    case 0:
                                        int i24 = g.f20259k0;
                                        cVar.u();
                                        return null;
                                    case 1:
                                        return Boolean.valueOf(cVar.r());
                                    default:
                                        int i25 = g.f20259k0;
                                        cVar.o();
                                        return null;
                                }
                            }
                        });
                        gVar.N6(false, false);
                        break;
                }
            }
        };
        this.f87096J = i14;
        this.U = onClickListener;
        l7();
        String string = getString(vc0.d.allow_access);
        final int i15 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: ap.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f20255b;

            {
                this.f20255b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                final int i16 = 0;
                g gVar = this.f20255b;
                switch (i152) {
                    case 0:
                        int i17 = g.f20259k0;
                        gVar.getClass();
                        u.f85943a.d(new k());
                        vy.m mVar = (vy.m) ((bf2.b) gVar.f20265h0).get();
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter("permissions_contact_reject", "event");
                        mVar.l("permissions_contact_reject", kotlin.collections.z0.d());
                        gVar.N6(false, false);
                        break;
                    default:
                        int i18 = g.f20259k0;
                        gVar.getClass();
                        final int i19 = 1;
                        final q qVar = new q(gVar, i19);
                        w wVar = gVar.f20266i0;
                        Activity k03 = bs1.c.k0(gVar.requireContext());
                        x xVar = x.f92714f;
                        String obj = p.CONTACTS_UPLOAD.toString();
                        e eVar = new e(i16);
                        xo.j jVar = new xo.j(i19);
                        e eVar2 = new e(i19);
                        Function0 function0 = new Function0() { // from class: ap.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i232 = i16;
                                c cVar = qVar;
                                switch (i232) {
                                    case 0:
                                        int i24 = g.f20259k0;
                                        cVar.u();
                                        return null;
                                    case 1:
                                        return Boolean.valueOf(cVar.r());
                                    default:
                                        int i25 = g.f20259k0;
                                        cVar.o();
                                        return null;
                                }
                            }
                        };
                        Function0 function02 = new Function0() { // from class: ap.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i232 = i19;
                                c cVar = qVar;
                                switch (i232) {
                                    case 0:
                                        int i24 = g.f20259k0;
                                        cVar.u();
                                        return null;
                                    case 1:
                                        return Boolean.valueOf(cVar.r());
                                    default:
                                        int i25 = g.f20259k0;
                                        cVar.o();
                                        return null;
                                }
                            }
                        };
                        final int i23 = 2;
                        wVar.c(k03, xVar, obj, null, eVar, jVar, eVar2, function0, function02, new e(i23), new Function0() { // from class: ap.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i232 = i23;
                                c cVar = qVar;
                                switch (i232) {
                                    case 0:
                                        int i24 = g.f20259k0;
                                        cVar.u();
                                        return null;
                                    case 1:
                                        return Boolean.valueOf(cVar.r());
                                    default:
                                        int i25 = g.f20259k0;
                                        cVar.o();
                                        return null;
                                }
                            }
                        });
                        gVar.N6(false, false);
                        break;
                }
            }
        };
        this.R = string;
        this.S = onClickListener2;
        m7();
        super.Z6(layoutInflater);
        GestaltButton gestaltButton = this.E;
        if (gestaltButton != null) {
            Context requireContext = requireContext();
            int i16 = eo1.b.color_themed_base_red_300;
            Object obj = d5.a.f53679a;
            gestaltButton.setTextColor(requireContext.getColor(i16));
        }
        vy.m mVar = (vy.m) ((bf2.b) this.f20265h0).get();
        mVar.getClass();
        Intrinsics.checkNotNullParameter("permissions_contact_popup", "event");
        mVar.l("permissions_contact_popup", kotlin.collections.z0.d());
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f20261d0) {
            return null;
        }
        p7();
        return this.f20260c0;
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p7();
        Y6();
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f20263f0.d();
        super.onDestroy();
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    public final void p7() {
        if (this.f20260c0 == null) {
            this.f20260c0 = new ye2.m(super.getContext(), this);
            this.f20261d0 = ue.c.x(super.getContext());
        }
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f20260c0;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p7();
        Y6();
    }

    public g(c cVar) {
        this.f20262e0 = false;
        this.f20263f0 = new xj2.b();
        this.f20264g0 = cVar;
    }
}
