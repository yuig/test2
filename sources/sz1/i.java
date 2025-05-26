package sz1;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import ny1.n;
import vr1.j;

/* loaded from: classes2.dex */
public abstract class i extends n {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f115655f;

    public i(boolean z13, List list, List list2) {
        super(e0.b("android.permission.POST_NOTIFICATIONS"), list, list2, null, 8);
        this.f115655f = z13;
    }

    @Override // ny1.n
    public final j c(Context context, String explanationText) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(explanationText, "explanationText");
        if (!(this instanceof d)) {
            if (this instanceof f) {
                List b13 = e0.b(kh2.j.G(((f) this).f115653g));
                CharSequence a03 = j1.a0(explanationText);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return new j(b13, a03, context);
            }
            if (this instanceof b) {
                return new j(kh2.j.j(((b) this).f115649g), explanationText, context);
            }
            if (this instanceof c) {
                return new j(kh2.j.j(((c) this).f115650g), explanationText, context);
            }
            if (!(this instanceof e)) {
                if ((this instanceof g) || (this instanceof h)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            List list = ((e) this).f115652g;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kh2.j.G((wy0) it.next()));
            }
            return new j(arrayList, explanationText, context);
        }
        String imageUrl = bs1.c.p0(((d) this).f115651g);
        if (imageUrl == null) {
            imageUrl = "";
        }
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(explanationText, "explanationText");
        Intrinsics.checkNotNullParameter(context, "context");
        j jVar = new j(context);
        int W = bs1.c.W(jVar, py1.a.permissions_explanation_alert_image_size);
        jVar.i().removeAllViews();
        LinearLayout i13 = jVar.i();
        WebImageView webImageView = new WebImageView(context);
        webImageView.loadUrl(imageUrl);
        webImageView.U1(py1.a.permissions_explanation_alert_corner_radius);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(W, W);
        layoutParams.gravity = 1;
        Unit unit = Unit.f80348a;
        i13.addView(webImageView, layoutParams);
        i13.addView(jVar.j());
        i13.addView(jVar.h());
        jVar.u(explanationText);
        String string = jVar.getResources().getString(py1.b.notify_me);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        jVar.q(string);
        String string2 = jVar.getResources().getString(py1.b.no_thanks);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        jVar.m(string2);
        jVar.f();
        jVar.u(explanationText);
        return jVar;
    }

    public i(List list, int i13) {
        this(true, e0.b(Integer.valueOf(i13)), e0.b(list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i() {
        /*
            r2 = this;
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
            r1 = 0
            r2.<init>(r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sz1.i.<init>():void");
    }
}
