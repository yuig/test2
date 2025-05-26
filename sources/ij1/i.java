package ij1;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ua2.d1;
import ua2.z0;
import ui1.p;

/* loaded from: classes2.dex */
public final class i extends d1 implements ui1.a {

    /* renamed from: h, reason: collision with root package name */
    public final int f72353h;

    /* renamed from: i, reason: collision with root package name */
    public final j f72354i;

    /* renamed from: j, reason: collision with root package name */
    public o f72355j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View pinRepView, int i13) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        this.f72353h = i13;
        this.f72354i = new j(pinRepView);
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        return this.f72354i.getBounds().contains(i13, i14) ? p.f122303a : ui1.b.f122290a;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f72354i;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f72353h;
        int i18 = i13 + i17;
        int i19 = this.f121483f;
        int i23 = i15 - i17;
        int i24 = this.f121484g;
        j jVar = this.f72354i;
        jVar.setBounds(i18, i19, i23, i24);
        jVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        CharSequence text;
        int i15 = i13 - (this.f72353h * 2);
        j jVar = this.f72354i;
        jVar.getClass();
        jVar.f72366v = i15 - (jVar.f72361q + jVar.f72365u);
        jVar.f72367w = 0;
        m mVar = jVar.f72359o.f72375a.f72349a;
        boolean z13 = mVar instanceof l;
        k kVar = k.f72371a;
        Context context = jVar.f72358n;
        if (z13) {
            l lVar = (l) mVar;
            CharSequence a13 = lVar.f72372a.a(context);
            StaticLayout staticLayout = jVar.f72369y;
            if (!Intrinsics.d(a13, (staticLayout == null || (text = staticLayout.getText()) == null) ? null : text.toString())) {
                CharSequence a14 = lVar.f72372a.a(context);
                int length = a14.length();
                int i16 = jVar.f72366v;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextDirectionHeuristic textDirectionHeuristic = jVar.f72360p;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic, "textDirectionHeuristic");
                jVar.f72369y = com.bumptech.glide.d.y(a14, length, jVar.f72363s, i16, alignment, truncateAt, i16, lVar.f72373b, textDirectionHeuristic);
            }
            StaticLayout staticLayout2 = jVar.f72369y;
            jVar.f72367w += staticLayout2 != null ? staticLayout2.getHeight() : 0;
        } else if (Intrinsics.d(mVar, kVar)) {
            jVar.f72369y = null;
        }
        m mVar2 = jVar.f72359o.f72375a.f72350b;
        if (mVar2 instanceof l) {
            l lVar2 = (l) mVar2;
            CharSequence a15 = lVar2.f72372a.a(context);
            int length2 = a15.length();
            int i17 = jVar.f72366v;
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            TextDirectionHeuristic textDirectionHeuristic2 = jVar.f72360p;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic2, "textDirectionHeuristic");
            StaticLayout y13 = com.bumptech.glide.d.y(a15, length2, jVar.f72364t, i17, alignment2, truncateAt2, i17, lVar2.f72373b, textDirectionHeuristic2);
            jVar.f72370z = y13;
            int height = y13 != null ? y13.getHeight() : 0;
            jVar.f72368x = height;
            jVar.f72367w += height;
        } else if (Intrinsics.d(mVar2, kVar)) {
            jVar.f72370z = null;
        }
        int i18 = jVar.f72367w;
        o oVar = jVar.f72359o;
        int i19 = i18 + oVar.f72375a.f72351c;
        jVar.f72367w = i19;
        g gVar = oVar.f72381g;
        if (gVar instanceof e) {
            jVar.e(Math.max(jVar.f72361q, i19));
        } else if (gVar instanceof f) {
            jVar.e(i19 - ((f) gVar).a().a(context).intValue());
        }
        return new z0(i13, jVar.f128842e);
    }
}
