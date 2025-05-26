package com.pinterest.schoolTeenPrompt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import i32.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mm1.k;
import pk.a0;
import rf1.y;
import rg0.j0;
import rg0.n;
import rg0.q0;
import rg0.s;
import xk2.m;
import xk2.v;
import zp.y0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/schoolTeenPrompt/g;", "Lmm1/l;", "<init>", "()V", "schoolTeenPrompt_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f50465k0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public nu1.a f50466g0;

    /* renamed from: h0, reason: collision with root package name */
    public s f50467h0;

    /* renamed from: i0, reason: collision with root package name */
    public final v f50468i0 = m.b(new yv1.i(this, 17));

    /* renamed from: j0, reason: collision with root package name */
    public final d4 f50469j0 = d4.ACTION_SHEET;

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(c.school_teen_prompt_sheet_content, false, 0, 0, false, false, new e(this), 766);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF50469j0() {
        return this.f50469j0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        requireContext().setTheme(d.SchoolTeenPrompt);
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        n nVar = (n) this.f50468i0.getValue();
        ag2.e eVar = nVar != null ? nVar.f108068j : null;
        j0 j0Var = eVar instanceof j0 ? (j0) eVar : null;
        if (nVar != null) {
            if (nVar.f108060b == l.SCHOOL_TEEN_PROMPT.getValue() && j0Var != null) {
                View findViewById = v13.findViewById(b.body_text);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                GestaltText gestaltText = (GestaltText) findViewById;
                String a13 = j0Var.a();
                if (a13 == null) {
                    a13 = "";
                }
                a0.p(gestaltText, a13);
                a8(new f(j0Var, 0));
                Z7(new f(j0Var, 1));
                q0 q0Var = new q0(nVar, 1);
                k kVar = this.f87627c0;
                if (kVar == null) {
                    Intrinsics.r("delegate");
                    throw null;
                }
                kVar.b(q0Var);
                Y7(new y0(this, j0Var, nVar, 28));
                y listener = new y(nVar, 3);
                Intrinsics.checkNotNullParameter(listener, "listener");
                k kVar2 = this.f87627c0;
                if (kVar2 == null) {
                    Intrinsics.r("delegate");
                    throw null;
                }
                kVar2.c(listener);
                nVar.g();
                return;
            }
        }
        D5();
    }
}
