package fr0;

import android.content.Context;
import android.widget.RelativeLayout;
import b70.b;
import com.pinterest.design.brio.widget.IconView;
import df.j1;
import fm1.c;
import java.util.ArrayList;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.r0;
import m60.t0;
import u50.k0;
import vn1.e;
import vn1.g;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f62805j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f62806k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f62807l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f62808m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f62809n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f62810o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f62811p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f62812q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f62813r = new a(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f62814i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f62814i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.BODY_100, 0, c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097071);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.HEADING_700, 0, null, null, null, null, false, b.pin_count, null, null, null, null, null, false, null, null, 2095087);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = cd0.b.desc;
                return rn1.a.y(it, null, null, null, e0.b(e.BOLD), g.BODY_100, 0, null, null, null, null, false, i13, null, null, null, null, null, false, null, null, 2095079);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                g gVar = g.BODY_100;
                int i14 = cd0.c.creator_stats_unavailable;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i14, new ArrayList(0)), vn1.c.INVERSE, e0.b(vn1.b.CENTER), null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 4:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g gVar2 = g.BODY_100;
                return rn1.a.y(it, bs1.c.j2(new String[0], cd0.c.creator_stats_unavailable), vn1.c.INVERSE, e0.b(vn1.b.CENTER), null, gVar2, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.BODY_100, 0, c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097071);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, g.HEADING_700, 0, null, null, null, null, false, b.pin_count, null, null, null, null, null, false, null, null, 2095087);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = cd0.b.desc;
                return rn1.a.y(it, null, null, e0.b(vn1.b.CENTER_HORIZONTAL), null, g.BODY_100, 0, null, null, null, null, false, i15, null, null, null, null, null, false, null, null, 2095083);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62814i) {
            case 4:
                IconView iconView = (IconView) obj;
                Intrinsics.checkNotNullParameter(iconView, "$this$iconView");
                iconView.setId(t0.image);
                Context context = iconView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iconView.f2(j1.K(context));
                iconView.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iconView.getResources().getDimensionPixelSize(cd0.a.analytics_icon_width), iconView.getResources().getDimensionPixelSize(cd0.a.analytics_icon_width));
                layoutParams.addRule(10);
                layoutParams.topMargin = iconView.getResources().getDimensionPixelSize(r0.margin_quarter);
                iconView.setLayoutParams(layoutParams);
                break;
        }
        return b((rn1.a) obj);
    }
}
