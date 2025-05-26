package pp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import m60.x0;
import mf0.f;
import mf0.n;
import mf0.o;
import nx.f0;
import pk.a0;
import so.oa;
import so.x8;
import ye2.h;
import ye2.m;

/* loaded from: classes3.dex */
public class c extends f {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f100902g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public m f100903c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f100904d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f100905e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public lu1.b f100906f0;

    @Override // mf0.f
    public final void Y6() {
        if (this.f100905e0) {
            return;
        }
        this.f100905e0 = true;
        x8 x8Var = (x8) ((d) generatedComponent());
        oa oaVar = x8Var.f114707a;
        this.Z = (f0) oaVar.f113747j2.get();
        this.f100906f0 = (lu1.b) oaVar.f113961v5.get();
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f100904d0) {
            return null;
        }
        p7();
        return this.f100903c0;
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c7(LayoutInflater.from(E4()).inflate(o.dialog_simple_text, (ViewGroup) null), this.f87104w);
        h7(getString(cs1.d.suspicious_link));
        a0.q((GestaltText) this.P.findViewById(n.dialog_body_tv), bs1.c.h2(j1.a0(getString(cs1.d.block_source))));
        String string = getString(cs1.d.go_to_pinterest);
        final int i13 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: pp.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f100900b;

            {
                this.f100900b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                c cVar = this.f100900b;
                switch (i14) {
                    case 0:
                        int i15 = c.f100902g0;
                        cVar.N6(false, false);
                        if (cVar.E4() != null) {
                            ((lu1.c) cVar.f100906f0).k(cVar.E4(), false);
                            break;
                        }
                        break;
                    default:
                        int i16 = c.f100902g0;
                        cVar.N6(false, false);
                        break;
                }
            }
        };
        this.R = string;
        this.S = onClickListener;
        m7();
        String string2 = getString(x0.okay);
        final int i14 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: pp.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f100900b;

            {
                this.f100900b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                c cVar = this.f100900b;
                switch (i142) {
                    case 0:
                        int i15 = c.f100902g0;
                        cVar.N6(false, false);
                        if (cVar.E4() != null) {
                            ((lu1.c) cVar.f100906f0).k(cVar.E4(), false);
                            break;
                        }
                        break;
                    default:
                        int i16 = c.f100902g0;
                        cVar.N6(false, false);
                        break;
                }
            }
        };
        this.T = string2;
        this.U = onClickListener2;
        l7();
        T6(new mf0.b() { // from class: pp.b
            @Override // mf0.b
            public final void onDismiss() {
                int i15 = c.f100902g0;
                c cVar = c.this;
                if (cVar.E4() != null) {
                    cVar.E4().finish();
                }
            }
        });
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p7();
        Y6();
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new m(onGetLayoutInflater, this));
    }

    public final void p7() {
        if (this.f100903c0 == null) {
            this.f100903c0 = new m(super.getContext(), this);
            this.f100904d0 = ue.c.x(super.getContext());
        }
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        m mVar = this.f100903c0;
        d7.b.q(mVar == null || h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p7();
        Y6();
    }
}
