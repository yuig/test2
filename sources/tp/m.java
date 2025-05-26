package tp;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.media3.ui.q;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.h1;
import com.pinterest.ui.brio.view.BasicListCell;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.ArrayList;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.v0;
import lh0.z3;
import m60.u;
import m60.w;
import m60.x0;
import nx.d0;
import oh1.r;
import x02.p1;

/* loaded from: classes3.dex */
public final class m extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f118757k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f118758a;

    /* renamed from: b, reason: collision with root package name */
    public final az0 f118759b;

    /* renamed from: c, reason: collision with root package name */
    public final oh1.b f118760c;

    /* renamed from: d, reason: collision with root package name */
    public final f30 f118761d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f118762e;

    /* renamed from: f, reason: collision with root package name */
    public final qh1.e f118763f;

    /* renamed from: g, reason: collision with root package name */
    public final xj2.b f118764g;

    /* renamed from: h, reason: collision with root package name */
    public final p1 f118765h;

    /* renamed from: i, reason: collision with root package name */
    public final r f118766i;

    /* renamed from: j, reason: collision with root package name */
    public final v0 f118767j;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(qh1.e r1, com.pinterest.api.model.az0 r2, nx.j0 r3, oh1.b r4, xj2.b r5, x02.p1 r6, b60.b r7, oh1.r r8, boolean r9, boolean r10, boolean r11, boolean r12, lh0.v0 r13) {
        /*
            r0 = this;
            r0.<init>()
            r0.f118763f = r1
            r0.f118759b = r2
            r0.f118760c = r4
            r0.f118766i = r8
            r0.f118764g = r5
            r0.f118765h = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f118758a = r1
            com.pinterest.api.model.f30 r4 = r2.O()
            r0.f118761d = r4
            r0.f118762e = r3
            r0.f118767j = r13
            com.pinterest.api.model.wy0 r2 = r2.U()
            if (r10 == 0) goto L3f
            if (r11 == 0) goto L33
            tp.l r3 = new tp.l
            int r5 = m60.x0.comment_overflow_highlight
            r3.<init>(r5)
            r1.add(r3)
            goto L3f
        L33:
            if (r12 == 0) goto L3f
            tp.l r3 = new tp.l
            int r5 = m60.x0.comment_overflow_remove_highlight
            r3.<init>(r5)
            r1.add(r3)
        L3f:
            if (r4 == 0) goto L4b
            tp.l r3 = new tp.l
            int r5 = rf0.c.did_it_go_to_pin
            r3.<init>(r5)
            r1.add(r3)
        L4b:
            b60.d r7 = (b60.d) r7
            com.pinterest.api.model.wy0 r3 = r7.f()
            if (r3 == 0) goto L64
            if (r2 == 0) goto L5a
            java.lang.String r2 = r2.getUid()
            goto L5c
        L5a:
            java.lang.String r2 = ""
        L5c:
            boolean r2 = dl2.b.S1(r3, r2)
            if (r2 == 0) goto L64
            r2 = 1
            goto L65
        L64:
            r2 = 0
        L65:
            if (r2 == 0) goto L71
            tp.l r3 = new tp.l
            int r5 = m60.x0.edit
            r3.<init>(r5)
            r1.add(r3)
        L71:
            if (r10 == 0) goto L7f
            if (r9 == 0) goto L7f
            tp.l r3 = new tp.l
            int r5 = m60.x0.delete_confirm
            r3.<init>(r5)
            r1.add(r3)
        L7f:
            if (r2 != 0) goto L8b
            tp.l r3 = new tp.l
            int r5 = rf0.c.did_it_report
            r3.<init>(r5)
            r1.add(r3)
        L8b:
            if (r2 != 0) goto L9f
            if (r4 == 0) goto L9f
            com.pinterest.api.model.f3 r2 = r4.z3()
            if (r2 == 0) goto L9f
            tp.l r2 = new tp.l
            int r3 = m60.x0.comment_block_user
            r2.<init>(r3)
            r1.add(r2)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tp.m.<init>(qh1.e, com.pinterest.api.model.az0, nx.j0, oh1.b, xj2.b, x02.p1, b60.b, oh1.r, boolean, boolean, boolean, boolean, lh0.v0):void");
    }

    public final void a() {
        f30 f30Var = this.f118761d;
        this.f118764g.a(this.f118765h.a0(this.f118759b, f30Var != null ? f30Var.getUid() : "", true).i(new i(this, 0), new xo.l(9)));
    }

    public final void b() {
        f30 f30Var = this.f118761d;
        this.f118764g.a(this.f118765h.a0(this.f118759b, f30Var != null ? f30Var.getUid() : "", false).i(new i(this, 1), new xo.l(10)));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f118758a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return this.f118758a.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        BasicListCell basicListCell;
        if (view != null) {
            int i14 = BasicListCell.f52225b;
            if (view instanceof BasicListCell) {
                basicListCell = (BasicListCell) view;
                basicListCell.f52226a.setText(((l) this.f118758a.get(i13)).f118756a);
                basicListCell.setLayoutDirection(viewGroup.getResources().getConfiguration().getLayoutDirection());
                return basicListCell;
            }
        }
        basicListCell = new BasicListCell(viewGroup.getContext(), null);
        basicListCell.f52226a.setText(((l) this.f118758a.get(i13)).f118756a);
        basicListCell.setLayoutDirection(viewGroup.getResources().getConfiguration().getLayoutDirection());
        return basicListCell;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        wy0 U;
        w wVar = u.f85943a;
        a.c.y(wVar);
        l lVar = (l) this.f118758a.get(i13);
        String string = adapterView.getResources().getString(x0.comment_block_user_confirm_description_both_names);
        String string2 = adapterView.getResources().getString(x0.comment_block_user_confirm_description_one_name);
        int i14 = lVar.f118756a;
        if (i14 == x0.comment_overflow_highlight) {
            a();
            return;
        }
        if (i14 == x0.comment_overflow_remove_highlight) {
            b();
            return;
        }
        int i15 = rf0.c.did_it_go_to_pin;
        f30 f30Var = this.f118761d;
        if (i14 == i15) {
            if (f30Var != null) {
                wVar.d(Navigation.r0((ScreenLocation) h1.f50891b.getValue(), f30Var));
                return;
            }
            return;
        }
        int i16 = x0.edit;
        az0 az0Var = this.f118759b;
        if (i14 == i16) {
            f30 O = az0Var.O();
            if (O != null) {
                v0 v0Var = this.f118767j;
                v0Var.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) v0Var.f83490a;
                if (!g1Var.o("ce_android_comment_composer_redesign", "enabled", z3Var) && !g1Var.l("ce_android_comment_composer_redesign")) {
                    this.f118763f.n(this.f118762e, O.getUid(), O.z3().getUid(), null, null, az0Var.getUid(), "userdiditdata", null, null, null, false, null, null, Boolean.FALSE, false, false, false);
                    return;
                }
                r rVar = this.f118766i;
                if (rVar != null) {
                    rVar.a(new rp0.c(az0Var));
                }
                a.c.y(wVar);
                return;
            }
            return;
        }
        if (i14 == x0.delete_confirm) {
            Context context = view.getContext();
            final int i17 = 0;
            View.OnClickListener confirmClickListener = new View.OnClickListener(this) { // from class: tp.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f118755b;

                {
                    this.f118755b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i18 = i17;
                    m mVar = this.f118755b;
                    switch (i18) {
                        case 0:
                            oh1.b bVar = mVar.f118760c;
                            az0 az0Var2 = bVar.f94480a;
                            if (az0Var2 != null) {
                                oh1.m mVar2 = bVar.f94481b;
                                mVar2.getPinalytics().F(g0.DID_IT_MODAL_FULL_SHEET, u0.DID_IT_CONFIRM_DELETE);
                                p1 p1Var = mVar2.f94523e;
                                p1Var.getClass();
                                String uid = az0Var2.getUid();
                                if (uid == null) {
                                    uid = "";
                                }
                                f30 O2 = az0Var2.O();
                                if (O2 == null) {
                                    O2 = f30.r3().a();
                                }
                                ek2.f i19 = p1Var.m(new x02.h1(O2, uid), az0Var2).i(new qb1.a(2, mVar2, az0Var2), new dh1.b(14, oh1.e.f94489m));
                                Intrinsics.checkNotNullExpressionValue(i19, "subscribe(...)");
                                mVar2.addDisposable(i19);
                                break;
                            }
                            break;
                        default:
                            mVar.getClass();
                            i0 p13 = sh.f.a().p();
                            if (p13 != null) {
                                sh.f.a().K(f1.COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP, mVar.f118759b.getUid(), p13, null, false);
                                break;
                            }
                            break;
                    }
                }
            };
            int i18 = x0.confirm;
            int i19 = rf0.c.delete_did_it_confirmation;
            int i23 = x0.delete_confirm;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(confirmClickListener, "confirmClickListener");
            j1.v1(context, confirmClickListener, null, i18, i19, i23, x0.cancel);
            return;
        }
        if (i14 == rf0.c.did_it_report) {
            if (f30Var != null) {
                NavigationImpl z03 = Navigation.z0((ScreenLocation) h1.f50890a.getValue(), az0Var.getUid());
                z03.m0("com.pinterest.EXTRA_COMMENT_TYPE", "userdiditdata");
                z03.y0(f30Var.getUid(), "com.pinterest.EXTRA_PIN_ID");
                if (az0Var.U() != null && az0Var.U().z4() != null) {
                    z03.y0(az0Var.U().z4(), "com.pinterest.EXTRA_USERNAME");
                }
                wVar.d(z03);
                return;
            }
            return;
        }
        if (i14 != x0.comment_block_user || (U = az0Var.U()) == null) {
            return;
        }
        String i110 = dl2.b.i1(U);
        String z43 = U.z4();
        if (z43 == null) {
            z43 = "";
        }
        final int i24 = 1;
        boolean z13 = !i110.isEmpty();
        boolean z14 = !z43.isEmpty();
        String str = z13 ? i110 : z43;
        j1.u1(view.getContext(), new q(this, adapterView, U, str, 3), new View.OnClickListener(this) { // from class: tp.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f118755b;

            {
                this.f118755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i182 = i24;
                m mVar = this.f118755b;
                switch (i182) {
                    case 0:
                        oh1.b bVar = mVar.f118760c;
                        az0 az0Var2 = bVar.f94480a;
                        if (az0Var2 != null) {
                            oh1.m mVar2 = bVar.f94481b;
                            mVar2.getPinalytics().F(g0.DID_IT_MODAL_FULL_SHEET, u0.DID_IT_CONFIRM_DELETE);
                            p1 p1Var = mVar2.f94523e;
                            p1Var.getClass();
                            String uid = az0Var2.getUid();
                            if (uid == null) {
                                uid = "";
                            }
                            f30 O2 = az0Var2.O();
                            if (O2 == null) {
                                O2 = f30.r3().a();
                            }
                            ek2.f i192 = p1Var.m(new x02.h1(O2, uid), az0Var2).i(new qb1.a(2, mVar2, az0Var2), new dh1.b(14, oh1.e.f94489m));
                            Intrinsics.checkNotNullExpressionValue(i192, "subscribe(...)");
                            mVar2.addDisposable(i192);
                            break;
                        }
                        break;
                    default:
                        mVar.getClass();
                        i0 p13 = sh.f.a().p();
                        if (p13 != null) {
                            sh.f.a().K(f1.COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP, mVar.f118759b.getUid(), p13, null, false);
                            break;
                        }
                        break;
                }
            }
        }, df.j1.X(adapterView.getResources().getString(x0.comment_block_user_confirm_title), str), (z13 && z14) ? Html.fromHtml(df.j1.X(string, i110, z43)).toString() : Html.fromHtml(df.j1.X(string2, str)).toString(), adapterView.getResources().getString(x0.block), adapterView.getResources().getString(x0.cancel));
    }
}
