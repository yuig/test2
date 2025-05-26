package tp;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.media3.ui.q;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
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
import jc0.s;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.v0;
import lh0.z3;
import m60.w;
import m60.x0;
import nx.d0;
import oh1.r;
import x02.u;
import yb0.n;

/* loaded from: classes3.dex */
public final class g extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f118732l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f118733a;

    /* renamed from: b, reason: collision with root package name */
    public final z2 f118734b;

    /* renamed from: c, reason: collision with root package name */
    public final u f118735c;

    /* renamed from: d, reason: collision with root package name */
    public final xj2.b f118736d;

    /* renamed from: e, reason: collision with root package name */
    public final wp0.g f118737e;

    /* renamed from: f, reason: collision with root package name */
    public final r f118738f;

    /* renamed from: g, reason: collision with root package name */
    public final String f118739g;

    /* renamed from: h, reason: collision with root package name */
    public final String f118740h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f118741i;

    /* renamed from: j, reason: collision with root package name */
    public final qh1.e f118742j;

    /* renamed from: k, reason: collision with root package name */
    public final v0 f118743k;

    public g(qh1.e eVar, z2 z2Var, u uVar, b60.b bVar, d0 d0Var, boolean z13, boolean z14, xj2.b bVar2, boolean z15, wp0.g gVar, r rVar, String str, String str2, boolean z16, boolean z17, v0 v0Var) {
        this.f118742j = eVar;
        this.f118734b = z2Var;
        this.f118743k = v0Var;
        ArrayList arrayList = new ArrayList();
        this.f118733a = arrayList;
        wy0 b03 = z2Var.b0();
        if (z14) {
            if (z16) {
                arrayList.add(new f(x0.comment_overflow_highlight));
            } else if (z17) {
                arrayList.add(new f(x0.comment_overflow_remove_highlight));
            }
        }
        if (bVar.d(b03)) {
            arrayList.add(new f(x0.edit));
        }
        if (z14 && z13) {
            arrayList.add(new f(x0.delete_confirm));
        }
        if (bVar.c(b03)) {
            arrayList.add(new f(rf0.c.did_it_report));
        }
        if (bVar.c(b03)) {
            arrayList.add(new f(x0.comment_block_user));
        }
        if (z15) {
            arrayList.add(new f(x0.pin_overflow_remove_mention));
        }
        this.f118736d = bVar2;
        this.f118735c = uVar;
        this.f118741i = d0Var;
        this.f118737e = gVar;
        this.f118738f = rVar;
        this.f118739g = str;
        this.f118740h = str2;
    }

    public final void a() {
        this.f118736d.a(this.f118735c.d0(this.f118734b, this.f118739g, true).i(new a(this, 0), new xo.l(3)));
    }

    public final void b() {
        this.f118736d.a(this.f118735c.d0(this.f118734b, this.f118739g, false).i(new a(this, 1), new xo.l(5)));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f118733a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return this.f118733a.get(i13);
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
                basicListCell.f52226a.setText(((f) this.f118733a.get(i13)).f118731a);
                basicListCell.setLayoutDirection(viewGroup.getResources().getConfiguration().getLayoutDirection());
                return basicListCell;
            }
        }
        basicListCell = new BasicListCell(viewGroup.getContext(), null);
        basicListCell.f52226a.setText(((f) this.f118733a.get(i13)).f118731a);
        basicListCell.setLayoutDirection(viewGroup.getResources().getConfiguration().getLayoutDirection());
        return basicListCell;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        wy0 b03;
        Resources resources = adapterView.getResources();
        f fVar = (f) this.f118733a.get(i13);
        w wVar = m60.u.f85943a;
        int i14 = fVar.f118731a;
        if (i14 == x0.comment_overflow_highlight) {
            a();
            return;
        }
        if (i14 == x0.comment_overflow_remove_highlight) {
            b();
            return;
        }
        if (i14 == x0.delete_confirm) {
            Context context = view.getContext();
            Intrinsics.checkNotNullParameter(context, "context");
            n nVar = new n(context);
            nVar.w(resources.getString(x0.confirm));
            nVar.u(resources.getString(x0.comment_delete_confirmation_modal_subtitle));
            nVar.q(resources.getString(x0.delete_confirm));
            nVar.m(resources.getString(x0.cancel));
            final int i15 = 0;
            nVar.f138513j = new View.OnClickListener(this) { // from class: tp.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f118728b;

                {
                    this.f118728b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    g gVar = this.f118728b;
                    switch (i16) {
                        case 0:
                            u uVar = gVar.f118735c;
                            uVar.getClass();
                            z2 model = gVar.f118734b;
                            Intrinsics.checkNotNullParameter(model, "model");
                            String pinId = gVar.f118739g;
                            Intrinsics.checkNotNullParameter(pinId, "pinId");
                            uVar.j0(-1, pinId);
                            String uid = model.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                            uj2.b m13 = uVar.m(new x02.i(uid, pinId), model);
                            e eVar = new e(gVar, 0);
                            m13.j(eVar);
                            gVar.f118736d.a(eVar);
                            break;
                        default:
                            i0 p13 = gVar.f118741i.p();
                            if (p13 != null) {
                                gVar.f118741i.K(f1.COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP, gVar.f118734b.getUid(), p13, null, false);
                                break;
                            }
                            break;
                    }
                }
            };
            cb.x(nVar, wVar);
            return;
        }
        int i16 = rf0.c.did_it_report;
        String str = this.f118739g;
        z2 model = this.f118734b;
        if (i14 == i16) {
            a.c.y(wVar);
            this.f118741i.F(g0.NAVIGATION, u0.AGGREGATED_COMMENT_REPORT);
            NavigationImpl z03 = Navigation.z0((ScreenLocation) h1.f50890a.getValue(), model.getUid());
            z03.m0("com.pinterest.EXTRA_COMMENT_TYPE", "aggregatedcomment");
            z03.y0(str, "com.pinterest.EXTRA_PIN_ID");
            if (model.b0() != null && model.b0().z4() != null) {
                z03.y0(model.b0().z4(), "com.pinterest.EXTRA_USERNAME");
            }
            wVar.d(z03);
            return;
        }
        if (i14 == x0.edit) {
            v0 v0Var = this.f118743k;
            v0Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) v0Var.f83490a;
            if (!g1Var.o("ce_android_comment_composer_redesign", "enabled", z3Var) && !g1Var.l("ce_android_comment_composer_redesign")) {
                this.f118742j.n(this.f118741i, this.f118739g, this.f118740h, null, null, model.getUid(), "aggregatedcomment", null, null, null, false, null, null, Boolean.FALSE, false, false, false);
                return;
            } else {
                this.f118738f.a(new rp0.b(model));
                wVar.d(new s());
                return;
            }
        }
        if (i14 == x0.pin_overflow_remove_mention) {
            u uVar = this.f118735c;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            String uid = model.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            uj2.l G = uVar.G(new x02.j(uid, str), model);
            G.getClass();
            hk2.u uVar2 = new hk2.u(G);
            Intrinsics.checkNotNullExpressionValue(uVar2, "ignoreElement(...)");
            this.f118736d.a(uVar2.i(new xo.c(this, view, wVar, 4), new xo.l(7)));
            return;
        }
        if (i14 != x0.comment_block_user || (b03 = model.b0()) == null) {
            return;
        }
        String i17 = dl2.b.i1(b03);
        String z43 = b03.z4();
        if (z43 == null) {
            z43 = "";
        }
        final int i18 = 1;
        String str2 = i17.isEmpty() ^ true ? i17 : z43;
        j1.u1(view.getContext(), new q(this, adapterView, b03, str2, 2), new View.OnClickListener(this) { // from class: tp.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f118728b;

            {
                this.f118728b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i162 = i18;
                g gVar = this.f118728b;
                switch (i162) {
                    case 0:
                        u uVar3 = gVar.f118735c;
                        uVar3.getClass();
                        z2 model2 = gVar.f118734b;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        String pinId = gVar.f118739g;
                        Intrinsics.checkNotNullParameter(pinId, "pinId");
                        uVar3.j0(-1, pinId);
                        String uid2 = model2.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        uj2.b m13 = uVar3.m(new x02.i(uid2, pinId), model2);
                        e eVar = new e(gVar, 0);
                        m13.j(eVar);
                        gVar.f118736d.a(eVar);
                        break;
                    default:
                        i0 p13 = gVar.f118741i.p();
                        if (p13 != null) {
                            gVar.f118741i.K(f1.COMMENT_BLOCK_USER_CONFIRMATION_CANCEL_TAP, gVar.f118734b.getUid(), p13, null, false);
                            break;
                        }
                        break;
                }
            }
        }, df.j1.X(adapterView.getResources().getString(x0.comment_block_user_confirm_title), str2), adapterView.getResources().getString(p60.d.block_user_message_alt), adapterView.getResources().getString(x0.block), adapterView.getResources().getString(p60.d.never_mind));
    }
}
