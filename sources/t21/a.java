package t21;

import af2.c;
import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ky.h;
import ll.j;
import nx.v;
import rl1.n;
import vn1.g;
import ye2.o;

/* loaded from: classes5.dex */
public final class a extends LinearLayout implements r21.a, v, h, c {

    /* renamed from: a, reason: collision with root package name */
    public o f115819a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115820b;

    /* renamed from: c, reason: collision with root package name */
    public s21.c f115821c;

    /* renamed from: d, reason: collision with root package name */
    public final ImpressionableUserRep f115822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f115820b) {
            this.f115820b = true;
        }
        int Y = bs1.c.Y(context, eo1.c.lego_spacing_vertical_small);
        Intrinsics.checkNotNullParameter(context, "context");
        ImpressionableUserRep impressionableUserRep = new ImpressionableUserRep(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = Y;
        impressionableUserRep.setLayoutParams(layoutParams);
        impressionableUserRep.y1(ze0.a.ContentList);
        g gVar = vn1.h.f126278d;
        impressionableUserRep.M1(gVar);
        impressionableUserRep.T0(gVar);
        impressionableUserRep.H0(n.f(context));
        addView(impressionableUserRep);
        this.f115822d = impressionableUserRep;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f115819a == null) {
            this.f115819a = new o(this);
        }
        return this.f115819a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f115819a == null) {
            this.f115819a = new o(this);
        }
        return this.f115819a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return e0.b(this.f115822d);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        s21.a aVar;
        String str;
        s21.c cVar = this.f115821c;
        if (cVar == null || (aVar = cVar.f110721c) == null || (str = aVar.f110715a) == null) {
            return null;
        }
        List list = aVar.f110717c;
        return j.x(cVar.f110720b, str, list != null ? list.size() : 0, 0, null, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        s21.c cVar = this.f115821c;
        if (cVar != null) {
            return cVar.f110720b.y(cVar.f110722d);
        }
        return null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
