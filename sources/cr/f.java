package cr;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.google.android.gms.common.api.internal.q;
import com.pinterest.api.model.qe;
import com.pinterest.api.model.ta;
import com.pinterest.api.model.vh;
import com.pinterest.feature.boardpreview.view.BaseBoardPreviewContainer;
import com.pinterest.gestalt.text.GestaltText;
import cp.i;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import xo.j;

/* loaded from: classes3.dex */
public final class f extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53073d = 1;

    /* renamed from: e, reason: collision with root package name */
    public List f53074e;

    /* renamed from: f, reason: collision with root package name */
    public Object f53075f;

    /* renamed from: g, reason: collision with root package name */
    public Object f53076g;

    /* renamed from: h, reason: collision with root package name */
    public Object f53077h;

    public f() {
        q0 q0Var = q0.f80391a;
        this.f53074e = q0Var;
        this.f53075f = q0Var;
        this.f53076g = "";
        this.f53077h = "";
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        switch (this.f53073d) {
        }
        return this.f53074e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        switch (this.f53073d) {
            case 0:
                g gVar = (g) y2Var;
                qe qeVar = (qe) this.f53074e.get(i13);
                if (qeVar != null) {
                    c cVar = gVar.f53078u;
                    cVar.f53069b = qeVar;
                    b bVar = (b) cVar;
                    switch (bVar.f53065d) {
                        case 0:
                            Context context = bVar.getContext();
                            Resources resources = bVar.getResources();
                            GestaltText gestaltText = new GestaltText(context);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                            marginLayoutParams.bottomMargin = a0.K(12, resources);
                            gestaltText.i(new j(15));
                            Intrinsics.checkNotNullParameter(gestaltText, "<this>");
                            dl2.b.y2(gestaltText);
                            gestaltText.setLayoutParams(marginLayoutParams);
                            bVar.f53066e = gestaltText;
                            bVar.f53067f = new FrameLayout(context);
                            ((FrameLayout) bVar.f53067f).setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                            ((FrameLayout) bVar.f53067f).addView(bVar.f53066e);
                            bVar.addView((FrameLayout) bVar.f53067f);
                            qe qeVar2 = bVar.f53069b;
                            if (qeVar2 == null || a0.x0(qeVar2.f41279b)) {
                                return;
                            }
                            bVar.f53066e.i(new i(bVar, 3));
                            ((FrameLayout) bVar.f53067f).setOnTouchListener(new a(bVar, context));
                            return;
                        default:
                            View.inflate(bVar.getContext(), k42.e.view_related_searches_one_column, bVar);
                            View findViewById = bVar.findViewById(k42.d.related_searches_pill_tv);
                            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                            bVar.f53066e = (GestaltText) findViewById;
                            q qVar = bVar.f53070c;
                            if (qVar == null || bVar.f53069b == null) {
                                return;
                            }
                            bVar.f53067f = ve.h.A(bVar.getContext().getResources().getDimensionPixelSize(ga2.b.lego_button_small_corner_radius), qVar.b());
                            String str = bVar.f53069b.f41279b;
                            Intrinsics.checkNotNullExpressionValue(str, "getDisplay(...)");
                            if (str.length() > 0) {
                                GestaltText gestaltText2 = bVar.f53066e;
                                if (gestaltText2 == null) {
                                    Intrinsics.r("relatedSearchTextView");
                                    throw null;
                                }
                                gestaltText2.i(new tq.a0(bVar, 2));
                            }
                            ShapeDrawable shapeDrawable = (ShapeDrawable) bVar.f53067f;
                            if (shapeDrawable != null) {
                                Paint paint = shapeDrawable.getPaint();
                                if (paint != null) {
                                    List list = (List) qVar.f30859c;
                                    paint.setColor(((Integer) list.get(i13 % list.size())).intValue());
                                }
                                bVar.setBackgroundDrawable(shapeDrawable);
                            }
                            bVar.setOnClickListener(new tq.j(bVar, 5));
                            return;
                    }
                }
                return;
            default:
                w52.a holder = (w52.a) y2Var;
                Intrinsics.checkNotNullParameter(holder, "holder");
                ta template = (ta) this.f53074e.get(i13);
                List pins = (List) this.f53075f;
                String boardName = (String) this.f53076g;
                String userName = (String) this.f53077h;
                Intrinsics.checkNotNullParameter(template, "template");
                Intrinsics.checkNotNullParameter(pins, "pins");
                Intrinsics.checkNotNullParameter(boardName, "boardName");
                Intrinsics.checkNotNullParameter(userName, "userName");
                yk1.i iVar = yk1.i.LOADING;
                BaseBoardPreviewContainer baseBoardPreviewContainer = holder.f128105u;
                baseBoardPreviewContainer.setLoadState(iVar);
                Intrinsics.checkNotNullParameter(template, "template");
                Intrinsics.checkNotNullParameter(pins, "pins");
                Intrinsics.checkNotNullParameter(boardName, "boardName");
                Intrinsics.checkNotNullParameter(userName, "userName");
                ll.j jVar = baseBoardPreviewContainer.f45331e;
                if (jVar != null) {
                    baseBoardPreviewContainer.b(jVar.w(template, pins, boardName, userName, 0, baseBoardPreviewContainer.f45340n, false));
                    return;
                } else {
                    Intrinsics.r("templateMapper");
                    throw null;
                }
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        switch (this.f53073d) {
            case 0:
                int i14 = e.f53072a[((h) this.f53077h).f53087h.ordinal()];
                return new g(i14 != 1 ? i14 != 2 ? null : new b((Context) this.f53075f, (vh) this.f53076g) : new b((Context) this.f53075f, (vh) this.f53076g, ((h) this.f53077h).f53090k));
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                BaseBoardPreviewContainer baseBoardPreviewContainer = new BaseBoardPreviewContainer(context, null, 0, Integer.valueOf(parent.getHeight()), 6);
                baseBoardPreviewContainer.setLoadState(yk1.i.LOADING);
                return new w52.a(baseBoardPreviewContainer);
        }
    }

    public f(h hVar, Context context, List list, vh vhVar) {
        this.f53077h = hVar;
        this.f53074e = list;
        this.f53075f = context;
        this.f53076g = vhVar;
    }
}
