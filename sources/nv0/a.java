package nv0;

import android.content.Context;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.pinterest.api.model.dr;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zq;
import java.util.ArrayList;
import java.util.List;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import qv0.b0;
import qv0.e0;
import qv0.r;
import qv0.t;

/* loaded from: classes5.dex */
public final class a extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92349a;

    /* renamed from: b, reason: collision with root package name */
    public final b f92350b;

    public a(b actionListener, int i13) {
        this.f92349a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(actionListener, "actionListener");
            this.f92350b = actionListener;
        } else if (i13 == 2) {
            Intrinsics.checkNotNullParameter(actionListener, "actionListener");
            this.f92350b = actionListener;
        } else if (i13 != 3) {
            Intrinsics.checkNotNullParameter(actionListener, "actionListener");
            this.f92350b = actionListener;
        } else {
            Intrinsics.checkNotNullParameter(actionListener, "actionListener");
            this.f92350b = actionListener;
        }
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        int i14 = this.f92349a;
        b actionListener = this.f92350b;
        switch (i14) {
            case 0:
                qv0.m view = (qv0.m) nVar;
                vh model = (vh) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                List list = model.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList stickers = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof zq) {
                        stickers.add(obj2);
                    }
                }
                view.getClass();
                Intrinsics.checkNotNullParameter(stickers, "stickers");
                Intrinsics.checkNotNullParameter(actionListener, "actionListener");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                view.f105194c.setAdapter((ListAdapter) new lp.a(context, stickers, actionListener, view.f105192a));
                a0.p(view.f105193b, bs1.c.f2(view, aq1.h.idea_pin_recently_used_sticker_section_title));
                break;
            case 1:
                qv0.l view2 = (qv0.l) nVar;
                vh model2 = (vh) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                List list2 = model2.f42865w;
                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                ArrayList categoryList = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof dr) {
                        categoryList.add(obj3);
                    }
                }
                view2.getClass();
                Intrinsics.checkNotNullParameter(categoryList, "categoryList");
                Intrinsics.checkNotNullParameter(actionListener, "actionListener");
                Context context2 = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                view2.f105189a.setAdapter((ListAdapter) new b0(context2, categoryList, actionListener));
                view2.f105190b.e(new np0.h(actionListener, 17));
                kj kjVar = model2.f42855m;
                String title = kjVar != null ? kjVar.b() : null;
                if (title == null) {
                    title = "";
                }
                Intrinsics.checkNotNullParameter(title, "title");
                a0.p(view2.f105191c, title);
                break;
            case 2:
                r view3 = (r) nVar;
                zq model3 = (zq) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                if (g0.e0(model3)) {
                    String y13 = model3.y();
                    Intrinsics.checkNotNullExpressionValue(y13, "getThumbnailImageURL(...)");
                    view3.a(y13);
                } else {
                    String y14 = model3.y();
                    Intrinsics.checkNotNullExpressionValue(y14, "getThumbnailImageURL(...)");
                    view3.b(y14);
                }
                view3.setOnClickListener(new xa0.m(26, this, model3));
                break;
            default:
                t view4 = (t) nVar;
                vh model4 = (vh) obj;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                List list3 = model4.f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                ArrayList stickers2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof zq) {
                        stickers2.add(obj4);
                    }
                }
                view4.getClass();
                Intrinsics.checkNotNullParameter(stickers2, "stickers");
                Intrinsics.checkNotNullParameter(actionListener, "actionListener");
                GridView gridView = view4.f105205b;
                Context context3 = view4.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                gridView.setAdapter((ListAdapter) new e0(context3, stickers2, actionListener, view4.f105204a));
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f92349a) {
            case 0:
                h((vh) obj);
                return null;
            case 1:
                h((vh) obj);
                return null;
            case 2:
                zq model = (zq) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                String s13 = model.s();
                Intrinsics.checkNotNullExpressionValue(s13, "getDisplayName(...)");
                return s13;
            default:
                h((vh) obj);
                return null;
        }
    }

    public final String h(vh model) {
        switch (this.f92349a) {
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
