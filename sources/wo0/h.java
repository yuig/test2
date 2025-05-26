package wo0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ck2.i;
import com.pinterest.api.model.xk;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import m60.w;
import rq.o2;
import tq.f0;
import uj2.q;
import x02.x2;
import xo0.p;
import xo0.x;
import yk1.r;
import z32.n1;

/* loaded from: classes5.dex */
public final class h extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final w f130652a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f130653b;

    /* renamed from: c, reason: collision with root package name */
    public final j f130654c;

    /* renamed from: d, reason: collision with root package name */
    public final String f130655d;

    /* renamed from: e, reason: collision with root package name */
    public final pb0.a f130656e;

    /* renamed from: f, reason: collision with root package name */
    public String f130657f;

    /* renamed from: g, reason: collision with root package name */
    public String f130658g;

    /* renamed from: h, reason: collision with root package name */
    public List f130659h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f130660i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f130661j;

    /* renamed from: k, reason: collision with root package name */
    public String f130662k;

    /* renamed from: l, reason: collision with root package name */
    public n1 f130663l;

    /* renamed from: m, reason: collision with root package name */
    public String f130664m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap f130665n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uk1.d presenterPinalytics, q networkStateStream, w eventManager, x2 userRepository, j storyImpressionHelper, String defaultReferrerSource) {
        super(presenterPinalytics, networkStateStream);
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        Intrinsics.checkNotNullParameter(defaultReferrerSource, "defaultReferrerSource");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f130652a = eventManager;
        this.f130653b = userRepository;
        this.f130654c = storyImpressionHelper;
        this.f130655d = defaultReferrerSource;
        this.f130656e = clock;
        this.f130657f = "";
        this.f130658g = defaultReferrerSource;
        this.f130659h = q0.f80391a;
        this.f130660i = new LinkedHashSet();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((xo0.q) ((uo0.e) getView())).removeAllViews();
        this.f130660i.clear();
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(uo0.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        String titleText = this.f130662k;
        int i13 = -2;
        int i14 = 1;
        if (titleText != null) {
            n1 n1Var = this.f130663l;
            xo0.q qVar = (xo0.q) view;
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Context context = qVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rm1.q qVar2 = null;
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.i(new f0(gestaltText, titleText, i14));
            int i15 = n1Var == null ? -1 : p.f135618a[n1Var.ordinal()];
            if (i15 == 1) {
                qVar2 = rm1.q.TAG;
            } else if (i15 == 2) {
                qVar2 = rm1.q.SHOPPING_BAG;
            }
            if (qVar2 != null) {
                gestaltText.i(new o2(qVar2, 6));
                gestaltText.setCompoundDrawablePadding(gestaltText.getResources().getDimensionPixelSize(c80.b.bubble_title_icon_padding));
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = qVar.getResources().getDimensionPixelSize(eo1.c.margin_three_quarter);
            layoutParams.gravity = 17;
            Unit unit = Unit.f80348a;
            qVar.addView(gestaltText, layoutParams);
        }
        int size = this.f130659h.size();
        int i16 = 0;
        while (i16 < size) {
            xk xkVar = (xk) this.f130659h.get(i16);
            uo0.e eVar = (uo0.e) getView();
            boolean z13 = i16 == this.f130659h.size() - 1;
            xo0.q qVar3 = (xo0.q) eVar;
            qVar3.getClass();
            Context context2 = qVar3.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            x xVar = new x(context2);
            if (!z13) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i13);
                Context context3 = qVar3.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                layoutParams2.bottomMargin = dl2.b.F0(context3, eo1.a.item_vertical_spacing);
                xVar.setLayoutParams(layoutParams2);
            }
            qVar3.addView(xVar);
            a listener = new a(this, xkVar, i16, xVar);
            Intrinsics.checkNotNullParameter(listener, "listener");
            xVar.f135631j = listener;
            String b13 = n10.b.b(xkVar);
            uo0.g.f122925a.getClass();
            xVar.k(b13, n10.b.d(xkVar, uo0.f.f122924b));
            String n13 = xkVar.n();
            Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
            xVar.l(n13, false);
            String str = xkVar.f43721m;
            if (str == null || str.length() == 0) {
                xVar.f();
            } else {
                String str2 = xkVar.f43721m;
                Intrinsics.checkNotNullExpressionValue(str2, "getCuratorUid(...)");
                xj2.c F = this.f130653b.L(str2).F(new go0.j(21, new b(xVar, 2)), new go0.j(22, new b(xVar, 3)), i.f27923c, i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                addDisposable(F);
            }
            i16++;
            i13 = -2;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((xo0.q) view).f135621c = this;
    }
}
