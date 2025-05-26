package jd0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.y2;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubStatsRow;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import su0.r;
import su0.s;

/* loaded from: classes5.dex */
public final class i extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75497d;

    /* renamed from: e, reason: collision with root package name */
    public List f75498e;

    public i(int i13) {
        this.f75497d = i13;
        if (i13 == 1) {
            this.f75498e = q0.f80391a;
        } else if (i13 != 2) {
            this.f75498e = new ArrayList();
        } else {
            this.f75498e = q0.f80391a;
        }
    }

    public final void C(List value) {
        switch (this.f75497d) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                this.f75498e = value;
                h();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                this.f75498e = value;
                h();
                break;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                w e13 = a0.e(new vs.c(2, this.f75498e, value));
                Intrinsics.checkNotNullExpressionValue(e13, "calculateDiff(...)");
                this.f75498e = value;
                e13.b(this);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        switch (this.f75497d) {
        }
        return this.f75498e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (((pu0.p) r8).f101409k == ((pu0.p) r0).f101409k) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (r8.e() != r0.e()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r7.L(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        r7.f115221e = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (((pu0.q) r8).f101415k == ((pu0.q) r0).f101415k) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    @Override // androidx.recyclerview.widget.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.recyclerview.widget.y2 r7, int r8) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jd0.i.r(androidx.recyclerview.widget.y2, int):void");
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        switch (this.f75497d) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Activity context2 = bs1.c.k0(context);
                Intrinsics.checkNotNullParameter(context2, "context");
                g gVar = new g(context2);
                View.inflate(context2, rd0.c.view_creator_news_module_card, gVar);
                gVar.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
                int i14 = eo1.d.lego_card;
                Object obj = d5.a.f53679a;
                gVar.setBackground(context2.getDrawable(i14));
                gVar.setBackgroundTintList(d5.a.b(context2, eo1.b.color_themed_background_elevation_floating));
                int dimensionPixelSize = gVar.getResources().getDimensionPixelSize(eo1.c.space_600);
                gVar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                View findViewById = gVar.findViewById(rd0.b.news_card_title);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                gVar.f75492a = (GestaltText) findViewById;
                View findViewById2 = gVar.findViewById(rd0.b.news_card_message);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                gVar.f75493b = (GestaltText) findViewById2;
                View findViewById3 = gVar.findViewById(rd0.b.news_card_button_group);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                gVar.f75494c = (GestaltButtonGroup) findViewById3;
                return new h(gVar);
            case 1:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new ld0.e(new CreatorHubStatsRow(bs1.c.k0(context3)));
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return new s(new r(bs1.c.k0(context4)));
        }
    }
}
