package hz;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.ur0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import pk.a0;
import u50.i0;
import u50.k0;
import uj2.q;
import yk1.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhz/h;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Ldz/a;", "Lez/b;", "Lcz/c;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends k<dz.a> implements ez.b, cz.c {
    public static final /* synthetic */ int B0 = 0;
    public final d4 A0 = d4.IN_APP_SURVEY;

    /* renamed from: r0, reason: collision with root package name */
    public cz.e f70614r0;

    /* renamed from: s0, reason: collision with root package name */
    public f0 f70615s0;

    /* renamed from: t0, reason: collision with root package name */
    public wk2.a f70616t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f70617u0;

    /* renamed from: v0, reason: collision with root package name */
    public ca2.e f70618v0;

    /* renamed from: w0, reason: collision with root package name */
    public kz.a f70619w0;

    /* renamed from: x0, reason: collision with root package name */
    public bh.b f70620x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltButton f70621y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltButton f70622z0;

    public static final void j8(h hVar, gm1.c cVar) {
        kz.a aVar;
        hVar.getClass();
        int j13 = cVar.j();
        if (j13 == cz.k.btn_next) {
            bh.b bVar = hVar.f70620x0;
            if (bVar == null) {
                Intrinsics.r("pagerDelegate");
                throw null;
            }
            if (bVar.p()) {
                kz.a aVar2 = hVar.f70619w0;
                if (aVar2 != null) {
                    aVar2.q3();
                    return;
                }
                return;
            }
            bh.b bVar2 = hVar.f70620x0;
            if (bVar2 != null) {
                bVar2.s();
                return;
            } else {
                Intrinsics.r("pagerDelegate");
                throw null;
            }
        }
        if (j13 != cz.k.btn_back) {
            if (j13 != cz.k.btn_close || (aVar = hVar.f70619w0) == null) {
                return;
            }
            aVar.p3();
            return;
        }
        bh.b bVar3 = hVar.f70620x0;
        if (bVar3 == null) {
            Intrinsics.r("pagerDelegate");
            throw null;
        }
        if (bVar3.o()) {
            kz.a aVar3 = hVar.f70619w0;
            if (aVar3 != null) {
                aVar3.p3();
                return;
            }
            return;
        }
        bh.b bVar4 = hVar.f70620x0;
        if (bVar4 != null) {
            bVar4.t();
        } else {
            Intrinsics.r("pagerDelegate");
            throw null;
        }
    }

    @Override // ez.b
    public final void B1(kz.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f70619w0 = listener;
    }

    @Override // yk1.k
    public final m V7() {
        cz.e k83 = k8();
        q p73 = p7();
        f0 f0Var = this.f70615s0;
        if (f0Var != null) {
            return new kz.a(k83, p73, new uk1.d(f0Var));
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF103166q0() {
        return this.A0;
    }

    public final cz.e k8() {
        cz.e eVar = this.f70614r0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("anketManager");
        throw null;
    }

    public final void l8() {
        i0 i0Var;
        bh.b bVar = this.f70620x0;
        if (bVar == null) {
            Intrinsics.r("pagerDelegate");
            throw null;
        }
        jz.f m13 = bVar.m();
        if (!(m13 instanceof jz.e)) {
            m13 = null;
        }
        jz.e eVar = (jz.e) m13;
        if (eVar == null || (i0Var = eVar.b()) == null) {
            bh.b bVar2 = this.f70620x0;
            if (bVar2 == null) {
                Intrinsics.r("pagerDelegate");
                throw null;
            }
            jz.f m14 = bVar2.m();
            if (!(m14 instanceof jz.d)) {
                m14 = null;
            }
            if (((jz.d) m14) != null) {
                int i13 = cz.m.back;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(formatArgs.length);
                for (String str : formatArgs) {
                    arrayList.add(new u50.f0(str));
                }
                i0Var = new k0(i13, arrayList);
            } else {
                i0Var = null;
            }
        }
        GestaltButton gestaltButton = this.f70622z0;
        if (gestaltButton == null) {
            Intrinsics.r("btnBack");
            throw null;
        }
        gestaltButton.d(new fx.e(1, i0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8() {
        /*
            r9 = this;
            bh.b r0 = r9.f70620x0
            java.lang.String r1 = "pagerDelegate"
            r2 = 0
            if (r0 == 0) goto Lbb
            jz.f r0 = r0.m()
            boolean r3 = r0 instanceof jz.d
            if (r3 != 0) goto L10
            r0 = r2
        L10:
            jz.d r0 = (jz.d) r0
            java.lang.String r3 = "formatArgs"
            r4 = 0
            if (r0 == 0) goto L48
            bh.b r5 = r9.f70620x0
            if (r5 == 0) goto L44
            boolean r5 = r5.q()
            if (r5 == 0) goto L48
            int r1 = cz.m.submit
            java.lang.String[] r5 = new java.lang.String[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = r5.length
            r3.<init>(r6)
            int r6 = r5.length
        L2f:
            if (r4 >= r6) goto L3e
            r7 = r5[r4]
            u50.f0 r8 = new u50.f0
            r8.<init>(r7)
            r3.add(r8)
            int r4 = r4 + 1
            goto L2f
        L3e:
            u50.k0 r4 = new u50.k0
            r4.<init>(r1, r3)
            goto L9b
        L44:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        L48:
            if (r0 == 0) goto L6d
            int r1 = cz.m.next
            java.lang.String[] r5 = new java.lang.String[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = r5.length
            r3.<init>(r6)
            int r6 = r5.length
        L58:
            if (r4 >= r6) goto L67
            r7 = r5[r4]
            u50.f0 r8 = new u50.f0
            r8.<init>(r7)
            r3.add(r8)
            int r4 = r4 + 1
            goto L58
        L67:
            u50.k0 r4 = new u50.k0
            r4.<init>(r1, r3)
            goto L9b
        L6d:
            bh.b r3 = r9.f70620x0
            if (r3 == 0) goto Lb7
            jz.f r3 = r3.m()
            boolean r4 = r3 instanceof jz.e
            if (r4 != 0) goto L7a
            r3 = r2
        L7a:
            jz.e r3 = (jz.e) r3
            if (r3 == 0) goto L84
            u50.i0 r4 = r3.a()
            if (r4 != 0) goto L9b
        L84:
            bh.b r3 = r9.f70620x0
            if (r3 == 0) goto Lb3
            jz.f r1 = r3.m()
            boolean r3 = r1 instanceof jz.c
            if (r3 != 0) goto L91
            r1 = r2
        L91:
            jz.c r1 = (jz.c) r1
            if (r1 == 0) goto L9a
            u50.i0 r4 = r1.a()
            goto L9b
        L9a:
            r4 = r2
        L9b:
            if (r4 != 0) goto L9f
            u50.h0 r4 = u50.h0.f120562a
        L9f:
            com.pinterest.gestalt.button.view.GestaltButton r1 = r9.f70621y0
            if (r1 == 0) goto Lad
            sv.y r2 = new sv.y
            r3 = 1
            r2.<init>(r4, r0, r9, r3)
            r1.d(r2)
            return
        Lad:
            java.lang.String r0 = "btnNext"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r2
        Lb3:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        Lb7:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        Lbb:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.h.m8():void");
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = cz.l.view_anket_questions;
        wk2.a aVar = this.f70616t0;
        if (aVar == null) {
            Intrinsics.r("adapterProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        f8((jr.a) obj);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.btn_next);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f70621y0 = gestaltButton;
        if (gestaltButton == null) {
            Intrinsics.r("btnNext");
            throw null;
        }
        int i13 = 0;
        a0.m(gestaltButton, new f(this, i13));
        View findViewById2 = onCreateView.findViewById(cz.k.btn_back);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        this.f70622z0 = gestaltButton2;
        if (gestaltButton2 == null) {
            Intrinsics.r("btnBack");
            throw null;
        }
        a0.m(gestaltButton2, new f(this, 1));
        View findViewById3 = onCreateView.findViewById(cz.k.btn_close);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById3;
        if (gestaltIconButton == null) {
            Intrinsics.r("btnClose");
            throw null;
        }
        com.bumptech.glide.c.m(gestaltIconButton, new f(this, 2));
        ca2.e eVar = new ca2.e(true, null, 0, 0, null, 0, null, new bh.b(s7(), new g(this, i13)), false, false, 382);
        this.f70618v0 = eVar;
        eVar.m(onCreateView.findViewById(cz.k.anket_bottom_sheet));
        ca2.e eVar2 = this.f70618v0;
        if (eVar2 != null) {
            eVar2.r();
            return onCreateView;
        }
        Intrinsics.r("bottomSheetController");
        throw null;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        bh.b bVar = this.f70620x0;
        if (bVar == null) {
            Intrinsics.r("pagerDelegate");
            throw null;
        }
        bVar.f();
        ca2.e eVar = this.f70618v0;
        if (eVar == null) {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
        eVar.l();
        super.onDestroyView();
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ur0 ur0Var = k8().f53460h;
        jz.b H1 = ur0Var != null ? j1.H1(ur0Var) : null;
        Intrinsics.f(H1);
        dz.a aVar = (dz.a) a8();
        List a13 = H1.a();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        aVar.H(requireContext, a13, false);
        boolean z13 = true;
        z13 = true;
        z13 = true;
        this.f70620x0 = new bh.b(b8(), H1.a(), new g(this, z13 ? 1 : 0));
        if (H1.a().size() <= 1) {
            bh.b bVar = this.f70620x0;
            if (bVar == null) {
                Intrinsics.r("pagerDelegate");
                throw null;
            }
            jz.d l13 = bVar.l();
            if (!Intrinsics.d(l13 != null ? l13.b() : null, cz.f.MULTIPLE.getType())) {
                bh.b bVar2 = this.f70620x0;
                if (bVar2 == null) {
                    Intrinsics.r("pagerDelegate");
                    throw null;
                }
                jz.d l14 = bVar2.l();
                if (!Intrinsics.d(l14 != null ? l14.b() : null, cz.f.TEXT.getType())) {
                    z13 = false;
                }
            }
        }
        this.f70617u0 = z13;
        m8();
        l8();
        f7().d(new r70.h(false, false));
        cz.e k83 = k8();
        Intrinsics.checkNotNullParameter(this, "answersListener");
        k83.f53462j = this;
        ca2.e eVar = this.f70618v0;
        if (eVar != null) {
            eVar.s("initial_slide_up", true);
        } else {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
    }

    @Override // cz.c
    public final void p1() {
        if (this.f70617u0) {
            m8();
            return;
        }
        kz.a aVar = this.f70619w0;
        if (aVar != null) {
            aVar.q3();
        }
    }
}
