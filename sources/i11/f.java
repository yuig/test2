package i11;

import a.z0;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.p0;
import androidx.fragment.app.s0;
import androidx.fragment.app.w0;
import androidx.lifecycle.b0;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import df.j1;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;
import m60.x0;
import pk.a0;
import rq.o2;

/* loaded from: classes5.dex */
public final class f extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f70971b;

    public f(m mVar, int i13) {
        this.f70970a = i13;
        this.f70971b = mVar;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        switch (this.f70970a) {
            case 0:
                h((l11.o) nVar, (v7) obj, i13);
                break;
            case 1:
                h((l11.o) nVar, (v7) obj, i13);
                break;
            default:
                l11.e view = (l11.e) nVar;
                v7 model = (v7) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                m mVar = this.f70971b;
                mVar.getClass();
                a0.p(view.f81409c, "");
                view.f81410d = "";
                GestaltDivider gestaltDivider = view.f81407a;
                j1.A0(gestaltDivider);
                l11.d dVar = l11.d.f81398j;
                GestaltText gestaltText = view.f81408b;
                gestaltText.i(dVar);
                view.f81411e = i13 - mVar.P;
                String title = model.j1();
                Intrinsics.checkNotNullExpressionValue(title, "getName(...)");
                Intrinsics.checkNotNullParameter(title, "title");
                a0.p(view.f81409c, title);
                view.f81410d = title;
                if (i13 == mVar.P) {
                    if (i13 == 0) {
                        Integer valueOf = Integer.valueOf(i13);
                        HashMap hashMap = mVar.f70992b0;
                        int i14 = e02.e.tap_to_create_a_new_board_top_header_no_translate;
                        yk1.a aVar = (yk1.a) mVar.f71003h;
                        hashMap.put(valueOf, aVar.f139224a.getString(i14));
                        String text = aVar.f139224a.getString(e02.e.tap_to_create_a_new_board_top_header);
                        Intrinsics.checkNotNullParameter(text, "text");
                        a0.p(view.f81408b, text);
                    }
                    j1.W1(gestaltDivider);
                    gestaltText.i(l11.d.f81399k);
                }
                view.f81412f = mVar;
                break;
        }
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ String g(int i13, Object obj) {
        switch (this.f70970a) {
            case 0:
                i((v7) obj);
                break;
            case 1:
                i((v7) obj);
                break;
            default:
                i((v7) obj);
                break;
        }
        return null;
    }

    public final void h(l11.o view, v7 model, int i13) {
        int i14 = 4;
        int i15 = this.f70970a;
        final m mVar = this.f70971b;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                int i16 = e02.e.add_to_collage_title;
                view.getClass();
                view.f81461b.i(new zx0.d(i16, i14));
                rm1.q icon = rm1.q.SCISSORS;
                Intrinsics.checkNotNullParameter(icon, "icon");
                dl2.b.z(view.f81462c, new o2(icon, 14));
                final int i17 = 0;
                view.setOnClickListener(new View.OnClickListener() { // from class: i11.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String g23;
                        int i18 = i17;
                        m this$0 = mVar;
                        switch (i18) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                l11.j jVar = (l11.j) ((f11.d) this$0.getView());
                                String str = jVar.T0;
                                Navigation navigation = jVar.I;
                                String str2 = "";
                                if (navigation != null && (g23 = navigation.g2("com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT", "")) != null) {
                                    str2 = g23;
                                }
                                d32.a aVar = d32.c.Companion;
                                d32.c cVar = d32.c.UNKNOWN;
                                int O = com.bumptech.glide.d.O(jVar, "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE", cVar.getValue());
                                aVar.getClass();
                                d32.c a13 = d32.a.a(O);
                                if (a13 != null) {
                                    cVar = a13;
                                }
                                NavigationImpl r03 = m2.r0(cVar, this$0.f71013n, str, str2);
                                if (jVar.U6()) {
                                    jVar.M1(r03);
                                    return;
                                }
                                w0 parentFragmentManager = jVar.getParentFragmentManager();
                                z0 z0Var = new z0(jVar, 8);
                                parentFragmentManager.getClass();
                                androidx.lifecycle.s lifecycle = jVar.getLifecycle();
                                if (((b0) lifecycle).f18588d != androidx.lifecycle.r.DESTROYED) {
                                    p0 p0Var = new p0(parentFragmentManager, z0Var, lifecycle);
                                    s0 s0Var = (s0) parentFragmentManager.f18460l.put("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE", new s0(lifecycle, z0Var, p0Var));
                                    if (s0Var != null) {
                                        s0Var.c();
                                    }
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "Setting FragmentResultListener with key com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE lifecycleOwner " + lifecycle + " and listener " + z0Var);
                                    }
                                    lifecycle.a(p0Var);
                                }
                                il1.a aVar2 = jVar.L0;
                                if (aVar2 == null) {
                                    Intrinsics.r("fragmentFactory");
                                    throw null;
                                }
                                nl1.d dVar = (nl1.d) aVar2.e(m3.e());
                                w0 supportFragmentManager = jVar.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                ViewParent parent = jVar.requireView().getParent();
                                Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                                int id3 = ((ViewGroup) parent).getId();
                                dVar.R7(r03);
                                Unit unit = Unit.f80348a;
                                mo1.c.c(supportFragmentManager, id3, dVar, true, mo1.a.MODAL, 32);
                                return;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.T3();
                                return;
                        }
                    }
                });
                mVar.N.getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                if (mVar.f71005i.a("enabled_alphabetically_as_add_to_profile", z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                    int i18 = e02.e.add_to_profile;
                    view.getClass();
                    view.f81461b.i(new zx0.d(i18, i14));
                } else {
                    int i19 = x0.profile;
                    view.getClass();
                    view.f81461b.i(new zx0.d(i19, i14));
                }
                rm1.q icon2 = rm1.q.PERSON;
                view.getClass();
                Intrinsics.checkNotNullParameter(icon2, "icon");
                dl2.b.z(view.f81462c, new o2(icon2, 14));
                String text = mVar.H3(i13);
                if (text != null) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    view.f81460a.i(new zu0.c(text, 22));
                }
                final int i23 = 1;
                view.setOnClickListener(new View.OnClickListener() { // from class: i11.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String g23;
                        int i182 = i23;
                        m this$0 = mVar;
                        switch (i182) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                l11.j jVar = (l11.j) ((f11.d) this$0.getView());
                                String str = jVar.T0;
                                Navigation navigation = jVar.I;
                                String str2 = "";
                                if (navigation != null && (g23 = navigation.g2("com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT", "")) != null) {
                                    str2 = g23;
                                }
                                d32.a aVar = d32.c.Companion;
                                d32.c cVar = d32.c.UNKNOWN;
                                int O = com.bumptech.glide.d.O(jVar, "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE", cVar.getValue());
                                aVar.getClass();
                                d32.c a13 = d32.a.a(O);
                                if (a13 != null) {
                                    cVar = a13;
                                }
                                NavigationImpl r03 = m2.r0(cVar, this$0.f71013n, str, str2);
                                if (jVar.U6()) {
                                    jVar.M1(r03);
                                    return;
                                }
                                w0 parentFragmentManager = jVar.getParentFragmentManager();
                                z0 z0Var = new z0(jVar, 8);
                                parentFragmentManager.getClass();
                                androidx.lifecycle.s lifecycle = jVar.getLifecycle();
                                if (((b0) lifecycle).f18588d != androidx.lifecycle.r.DESTROYED) {
                                    p0 p0Var = new p0(parentFragmentManager, z0Var, lifecycle);
                                    s0 s0Var = (s0) parentFragmentManager.f18460l.put("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE", new s0(lifecycle, z0Var, p0Var));
                                    if (s0Var != null) {
                                        s0Var.c();
                                    }
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "Setting FragmentResultListener with key com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE lifecycleOwner " + lifecycle + " and listener " + z0Var);
                                    }
                                    lifecycle.a(p0Var);
                                }
                                il1.a aVar2 = jVar.L0;
                                if (aVar2 == null) {
                                    Intrinsics.r("fragmentFactory");
                                    throw null;
                                }
                                nl1.d dVar = (nl1.d) aVar2.e(m3.e());
                                w0 supportFragmentManager = jVar.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                ViewParent parent = jVar.requireView().getParent();
                                Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                                int id3 = ((ViewGroup) parent).getId();
                                dVar.R7(r03);
                                Unit unit = Unit.f80348a;
                                mo1.c.c(supportFragmentManager, id3, dVar, true, mo1.a.MODAL, 32);
                                return;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.T3();
                                return;
                        }
                    }
                });
                f1 f1Var = f1.VIEW;
                String str = mVar.L;
                ArrayList arrayList = mVar.S;
                BoardFeed boardFeed = mVar.R;
                f30 f30Var = mVar.K;
                mVar.N.o(f1Var, str, arrayList, boardFeed, mVar.f71023x, f30Var != null ? f30Var.z4() : null);
                break;
        }
    }

    public final String i(v7 model) {
        switch (this.f70970a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return null;
    }
}
