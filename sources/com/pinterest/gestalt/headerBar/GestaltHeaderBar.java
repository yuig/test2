package com.pinterest.gestalt.headerBar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import cn1.f0;
import cn1.v;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import df.j1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nm1.a1;
import nm1.b1;
import nm1.c;
import nm1.c0;
import nm1.c1;
import nm1.d0;
import nm1.e;
import nm1.f;
import nm1.f1;
import nm1.g;
import nm1.h;
import nm1.h1;
import nm1.i1;
import nm1.j;
import nm1.j0;
import nm1.k;
import nm1.l;
import nm1.m;
import nm1.n;
import nm1.o;
import nm1.r0;
import nm1.s0;
import nm1.u;
import nm1.u0;
import nm1.v0;
import nm1.z;
import nm1.z0;
import om1.p;
import org.jetbrains.annotations.NotNull;
import rl1.a0;
import rl1.d;
import rl1.r;
import rm1.q;
import rn1.i;
import u50.h0;
import u50.i0;
import u50.k0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u000b\f\r\u0003\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/pinterest/gestalt/headerBar/GestaltHeaderBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lnm1/m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nm1/l", "al1/n", "GestaltHeaderBarException", "nm1/n", "nm1/u", "nm1/z", "nm1/d0", "nm1/e0", "nm1/f0", "nm1/h0", "headerBar_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall", "GestaltNoEventTypeCheckInEventHandler"})
/* loaded from: classes5.dex */
public final class GestaltHeaderBar extends ConstraintLayout implements gm1.b {

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f49371d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f49372e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f49373f;

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f49374g;

    /* renamed from: a, reason: collision with root package name */
    public u f49375a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.q f49376b;

    /* renamed from: c, reason: collision with root package name */
    public final c f49377c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/gestalt/headerBar/GestaltHeaderBar$GestaltHeaderBarException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "headerBar_release"}, k = 1, mv = {1, 9, 0})
    public static final class GestaltHeaderBarException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GestaltHeaderBarException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    static {
        h0 h0Var = h0.f120562a;
        f49371d = q0.f80391a;
        f49372e = new c0(0, h0Var);
        f49373f = q.FILL_TRANSPARENT;
        f49374g = h0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [nm1.c] */
    public GestaltHeaderBar(Context context, m initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        final int i13 = 1;
        this.f49377c = new gm1.a(this) { // from class: nm1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GestaltHeaderBar f91389b;

            {
                this.f91389b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                GestaltHeaderBar.L(this.f91389b, cVar);
            }
        };
        z0();
        this.f49376b = new com.google.firebase.messaging.q(this, initialDisplayState);
        B0(null, r0());
    }

    public static void F0(GestaltHeaderBar gestaltHeaderBar, GestaltSearchField gestaltSearchField, int i13, int i14) {
        gestaltHeaderBar.getClass();
        View findViewById = gestaltSearchField.findViewById(i13);
        if (findViewById == null) {
            return;
        }
        findViewById.setPaddingRelative(i14, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        pp2.a.P0(marginLayoutParams, 0, 0, 0, 0);
    }

    public static void L(GestaltHeaderBar this$0, gm1.c event) {
        s0 s0Var;
        gm1.a aVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        gm1.c cVar = null;
        u0 u0Var = null;
        cVar = null;
        cVar = null;
        if (event.j() != f1.start_container_icon_bt || !(event instanceof p)) {
            if (event.j() == f1.start_container_start_icon_bt && (event instanceof p)) {
                int id3 = this$0.getId();
                u0 u0Var2 = u0.START;
                cVar = new s0(id3, u0Var2, u0Var2, (p) event);
            } else if (event.j() == f1.start_container_end_icon_bt && (event instanceof p)) {
                cVar = new s0(this$0.getId(), u0.START, u0.END, (p) event);
            } else if (event.j() == f1.end_container_icon_bt && (event instanceof p)) {
                s0Var = new s0(this$0.getId(), u0.END, null, (p) event);
            } else if (event.j() == f1.end_container_start_icon_bt && (event instanceof p)) {
                cVar = new s0(this$0.getId(), u0.END, u0.START, (p) event);
            } else if (event.j() == f1.end_container_end_icon_bt && (event instanceof p)) {
                int id4 = this$0.getId();
                u0 u0Var3 = u0.END;
                cVar = new s0(id4, u0Var3, u0Var3, (p) event);
            } else if (event.j() == f0.gestalt_end_action_one && (event instanceof p)) {
                m r03 = this$0.r0();
                Intrinsics.g(r03, "null cannot be cast to non-null type com.pinterest.gestalt.headerBar.GestaltHeaderBar.Search");
                int id5 = this$0.getId();
                u0 u0Var4 = u0.END;
                l lVar = ((z) r03).f91515c;
                if (lVar instanceof e) {
                    u0Var = u0.START;
                } else {
                    boolean z13 = lVar instanceof g;
                }
                cVar = new s0(id5, u0Var4, u0Var, (p) event);
            } else if (event.j() == f0.gestalt_end_action_two && (event instanceof p)) {
                m r04 = this$0.r0();
                Intrinsics.g(r04, "null cannot be cast to non-null type com.pinterest.gestalt.headerBar.GestaltHeaderBar.Search");
                if (((z) r04).f91515c instanceof e) {
                    int id6 = this$0.getId();
                    u0 u0Var5 = u0.END;
                    cVar = new s0(id6, u0Var5, u0Var5, (p) event);
                }
            } else if (event.j() == f1.start_container_text_button && (event instanceof xl1.b)) {
                cVar = new r0(this$0.getId(), u0.START, (xl1.b) event);
            } else if (event.j() == f1.end_container_text_button && (event instanceof xl1.b)) {
                cVar = new r0(this$0.getId(), u0.END, (xl1.b) event);
            } else if (event.j() == f1.start_container_avatar && (event instanceof a0)) {
                cVar = new nm1.q0(this$0.getId(), u0.START, (a0) event);
            } else if (event.j() == f1.end_container_avatar && (event instanceof a0)) {
                cVar = new nm1.q0(this$0.getId(), u0.END, (a0) event);
            } else if (event.j() == f1.title_container_title && (event instanceof i)) {
                cVar = new a1(this$0.getId(), (i) event);
            } else if (event.j() == f1.title_container_subtitle && (event instanceof i)) {
                cVar = new z0(this$0.getId(), (i) event);
            } else if (event.j() == f1.user_and_actions_avatar && (event instanceof a0)) {
                cVar = new b1(this$0.getId(), (a0) event);
            } else if (event.j() == f1.user_and_actions_user_name && (event instanceof i)) {
                cVar = new c1(this$0.getId(), (i) event);
            } else if (event.j() == f1.search_field && (event instanceof v)) {
                cVar = new v0(this$0.getId(), (v) event);
            }
            if (cVar != null || (aVar = (gm1.a) this$0.f49376b.f33804b) == null) {
            }
            aVar.h3(cVar);
            return;
        }
        s0Var = new s0(this$0.getId(), u0.START, null, (p) event);
        cVar = s0Var;
        if (cVar != null) {
        }
    }

    public static final void T(GestaltHeaderBar gestaltHeaderBar, List list, l lVar, boolean z13) {
        gestaltHeaderBar.getClass();
        if (lVar instanceof f) {
            return;
        }
        boolean z14 = lVar instanceof g;
        c cVar = gestaltHeaderBar.f49377c;
        if (z14) {
            Context context = gestaltHeaderBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int F0 = dl2.b.F0(context, eo1.a.sema_space_100);
            Context context2 = gestaltHeaderBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i13 = z13 ? f1.start_container_icon_bt : f1.end_container_icon_bt;
            n nVar = ((g) lVar).f91428a;
            q qVar = nVar.f91449a;
            om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
            i0 i0Var = nVar.f91450b;
            if (i0Var == null) {
                i0Var = new k0(h1.content_description_icon_button_default);
            }
            GestaltIconButton gestaltIconButton = new GestaltIconButton(context2, new om1.c(qVar, null, fVar, null, i0Var, false, i13, 746));
            if (z13) {
                gestaltIconButton.setPaddingRelative(0, 0, F0, 0);
            } else {
                gestaltIconButton.setPaddingRelative(F0, 0, 0, 0);
            }
            GestaltIconButton u13 = gestaltIconButton.u(cVar);
            u13.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            list.add(u13);
            gestaltHeaderBar.addView(u13);
            return;
        }
        if (!(lVar instanceof e)) {
            if (lVar instanceof h) {
                Context context3 = gestaltHeaderBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltButton e13 = new GestaltButton(0, 14, context3, (AttributeSet) null).d(new qf1.f0(z13, lVar, 7)).e(cVar);
                list.add(e13);
                gestaltHeaderBar.addView(e13);
                return;
            }
            if (lVar instanceof nm1.i) {
                Context context4 = gestaltHeaderBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int i14 = z13 ? f1.start_container_avatar : f1.end_container_avatar;
                nm1.i iVar = (nm1.i) lVar;
                GestaltAvatar M2 = new GestaltAvatar(context4, new rl1.q(iVar.f91432b, iVar.f91433c, false, r.LG, (i0) new k0(new String[]{iVar.f91433c}, h1.content_description_user_avatar), false, (fm1.c) null, i14, (rl1.c) new d(iVar.f91431a), (fm1.a) null, 1252)).M2(cVar);
                list.add(M2);
                gestaltHeaderBar.addView(M2);
                return;
            }
            if (!(lVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context5 = gestaltHeaderBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            int i15 = z13 ? f1.start_container_avatar : f1.end_container_avatar;
            j jVar = (j) lVar;
            String str = jVar.f91437b;
            String userId = jVar.f91436a;
            Intrinsics.checkNotNullParameter(userId, "userId");
            GestaltAvatar M22 = new GestaltAvatar(context5, new rl1.q(str, jVar.f91438c, false, r.LG, (i0) new k0(new String[]{jVar.f91438c}, h1.content_description_user_avatar), false, (fm1.c) null, i15, (rl1.c) new rl1.e(userId), (fm1.a) null, 1252)).M2(cVar);
            list.add(M22);
            gestaltHeaderBar.addView(M22);
            return;
        }
        Context context6 = gestaltHeaderBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int F02 = dl2.b.F0(context6, eo1.a.sema_space_100);
        Context context7 = gestaltHeaderBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        int i16 = z13 ? f1.start_container_start_icon_bt : f1.end_container_start_icon_bt;
        e eVar = (e) lVar;
        n nVar2 = eVar.f91412a;
        q qVar2 = nVar2.f91449a;
        om1.f fVar2 = om1.f.TRANSPARENT_DARK_GRAY;
        i0 i0Var2 = nVar2.f91450b;
        if (i0Var2 == null) {
            i0Var2 = new k0(h1.content_description_icon_button_default);
        }
        GestaltIconButton gestaltIconButton2 = new GestaltIconButton(context7, new om1.c(qVar2, null, fVar2, null, i0Var2, false, i16, 746));
        if (z13) {
            gestaltIconButton2.setPaddingRelative(0, 0, F02, 0);
        } else {
            gestaltIconButton2.setPaddingRelative(F02, 0, 0, 0);
        }
        GestaltIconButton u14 = gestaltIconButton2.u(cVar);
        Context context8 = gestaltHeaderBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        int i17 = z13 ? f1.start_container_end_icon_bt : f1.end_container_end_icon_bt;
        n nVar3 = eVar.f91413b;
        q qVar3 = nVar3.f91449a;
        i0 i0Var3 = nVar3.f91450b;
        if (i0Var3 == null) {
            i0Var3 = new k0(h1.content_description_icon_button_default);
        }
        GestaltIconButton gestaltIconButton3 = new GestaltIconButton(context8, new om1.c(qVar3, null, fVar2, null, i0Var3, false, i17, 746));
        if (z13) {
            gestaltIconButton3.setPaddingRelative(0, 0, F02, 0);
        } else {
            gestaltIconButton3.setPaddingRelative(F02, 0, 0, 0);
        }
        GestaltIconButton u15 = gestaltIconButton3.u(cVar);
        list.add(u14);
        gestaltHeaderBar.addView(u14);
        list.add(u15);
        gestaltHeaderBar.addView(u15);
    }

    public static final void X(GestaltHeaderBar gestaltHeaderBar, List list, GestaltHeaderBar gestaltHeaderBar2) {
        gestaltHeaderBar.getClass();
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        pVar.j(gestaltHeaderBar2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof o) {
                pVar.h(oVar.f91454a, oVar.f91455b);
            }
        }
        pVar.b(gestaltHeaderBar2);
    }

    public static final void Z(GestaltHeaderBar gestaltHeaderBar, List list, l lVar, boolean z13) {
        gestaltHeaderBar.getClass();
        if (lVar instanceof f) {
            return;
        }
        if (lVar instanceof g) {
            if (z13) {
                int i13 = f1.start_container_icon_bt;
                kotlin.collections.k0.v(list, new o[]{new o(i13, 6, 0, 6), new o(i13, 3, 0, 3), new o(i13, 4, 0, 4)});
            } else {
                int i14 = f1.end_container_icon_bt;
                kotlin.collections.k0.v(list, new o[]{new o(i14, 7, 0, 7), new o(i14, 3, 0, 3), new o(i14, 4, 0, 4)});
            }
        } else if (lVar instanceof e) {
            if (z13) {
                int i15 = f1.start_container_start_icon_bt;
                o oVar = new o(i15, 6, 0, 6);
                o oVar2 = new o(i15, 3, 0, 3);
                o oVar3 = new o(i15, 4, 0, 4);
                int i16 = f1.start_container_end_icon_bt;
                kotlin.collections.k0.v(list, new o[]{oVar, oVar2, oVar3, new o(i16, 6, i15, 7), new o(i16, 3, 0, 3), new o(i16, 4, 0, 4)});
            } else {
                int i17 = f1.end_container_end_icon_bt;
                o oVar4 = new o(i17, 7, 0, 7);
                o oVar5 = new o(i17, 3, 0, 3);
                o oVar6 = new o(i17, 4, 0, 4);
                int i18 = f1.end_container_start_icon_bt;
                kotlin.collections.k0.v(list, new o[]{oVar4, oVar5, oVar6, new o(i18, 7, i17, 6), new o(i18, 3, 0, 3), new o(i18, 4, 0, 4)});
            }
        } else if (lVar instanceof h) {
            if (z13) {
                int i19 = f1.start_container_text_button;
                kotlin.collections.k0.v(list, new o[]{new o(i19, 6, 0, 6), new o(i19, 3, 0, 3), new o(i19, 4, 0, 4)});
            } else {
                int i23 = f1.end_container_text_button;
                kotlin.collections.k0.v(list, new o[]{new o(i23, 7, 0, 7), new o(i23, 3, 0, 3), new o(i23, 4, 0, 4)});
            }
        } else if (lVar instanceof k) {
            if (z13) {
                int i24 = f1.start_container_avatar;
                kotlin.collections.k0.v(list, new o[]{new o(i24, 6, 0, 6), new o(i24, 3, 0, 3), new o(i24, 4, 0, 4)});
            } else {
                int i25 = f1.end_container_avatar;
                kotlin.collections.k0.v(list, new o[]{new o(i25, 7, 0, 7), new o(i25, 3, 0, 3), new o(i25, 4, 0, 4)});
            }
        }
        d0(list, gestaltHeaderBar);
    }

    public static void d0(List list, ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        pVar.j(constraintLayout);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof o) {
                pVar.l(oVar.f91454a, oVar.f91455b, oVar.f91456c, oVar.f91457d);
            }
        }
        pVar.b(constraintLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(nm1.m r37, nm1.m r38) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.headerBar.GestaltHeaderBar.B0(nm1.m, nm1.m):void");
    }

    public final void a0(d0 d0Var, d0 d0Var2, GestaltTabLayout gestaltTabLayout, Map map, Map map2) {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        int i13 = 0;
        if (d0Var == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int F0 = dl2.b.F0(context, eo1.a.sema_space_200);
            j0 j0Var = new j0(map, this);
            setPaddingRelative(F0, F0, F0, F0);
            gestaltTabLayout.setPaddingRelative(0, 0, 0, 0);
            gestaltTabLayout.b(j0Var);
        }
        if (d0Var2.getId() != Integer.MIN_VALUE) {
            j1.v(d0Var, d0Var2, nm1.d.f91395k, new nm1.i0(this, i13));
        }
        j1.v(d0Var, d0Var2, nm1.d.f91396l, new nm1.i0(this, 1));
        j1.v(d0Var, d0Var2, nm1.d.f91397m, new a(this, d0Var2, map, map2, gestaltTabLayout, f0Var));
        if (f0Var.f80424a) {
            return;
        }
        j1.v(d0Var, d0Var2, nm1.d.f91398n, new b(map2, gestaltTabLayout));
    }

    public final GestaltHeaderBar g0(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltHeaderBar) this.f49376b.d(nextState, new com.pinterest.framework.screens.q(25, this, r0()));
    }

    public final void k0(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f49376b.c(eventHandler, nm1.d.f91400p);
    }

    public final void o0() {
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        pVar.j(this);
        Iterator it = d7.b.O(this).iterator();
        while (it.hasNext()) {
            pVar.g(((View) it.next()).getId());
        }
        pVar.b(this);
        removeAllViewsInLayout();
    }

    public final m r0() {
        return (m) ((u50.o) this.f49376b.f33803a);
    }

    public final u t0() {
        u uVar = this.f49375a;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.r("layoutElements");
        throw null;
    }

    public final void z0() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setMinHeight(dl2.b.F0(context, eo1.a.sema_space_1600));
        setImportantForAccessibility(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltHeaderBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v1, types: [nm1.c] */
    public GestaltHeaderBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 0;
        this.f49377c = new gm1.a(this) { // from class: nm1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GestaltHeaderBar f91389b;

            {
                this.f91389b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i142 = i14;
                GestaltHeaderBar.L(this.f91389b, cVar);
            }
        };
        z0();
        int[] GestaltHeaderBar = i1.GestaltHeaderBar;
        Intrinsics.checkNotNullExpressionValue(GestaltHeaderBar, "GestaltHeaderBar");
        this.f49376b = new com.google.firebase.messaging.q(this, attributeSet, i13, GestaltHeaderBar, nm1.d.f91394j);
        B0(null, r0());
    }
}
