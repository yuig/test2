package qa2;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pinterest.api.model.iq0;
import com.pinterest.api.model.zk0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 implements wa2.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f103278a;

    public j1(k1 k1Var) {
        this.f103278a = k1Var;
    }

    @Override // wa2.q
    public final void a() {
        int i13;
        int i14;
        TextView textView;
        k1 k1Var = this.f103278a;
        wa2.a pinDrawable = k1Var.f103297s.getPinDrawable();
        if (pinDrawable == null || (i13 = pinDrawable.f128841d) == 0 || (i14 = pinDrawable.f128842e) == 0) {
            return;
        }
        pg1.c cVar = k1Var.f103292n;
        cVar.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        int i15 = 0;
        com.bumptech.glide.c.a1(layoutParams, 0, 0, 0, 0);
        cVar.setLayoutParams(layoutParams);
        cVar.I = i13;
        cVar.f100097J = i14;
        ArrayList arrayList = cVar.A;
        Iterator it = arrayList.iterator();
        int i16 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList2 = cVar.E;
            if (!hasNext) {
                for (Object obj : arrayList) {
                    int i17 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    TextView textView2 = (TextView) obj;
                    Context context = cVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    iq0 iq0Var = (iq0) CollectionsKt.U(i15, arrayList2);
                    String str = (String) CollectionsKt.U(i15, cVar.D);
                    if (str == null) {
                        str = "";
                    }
                    kh2.d.i(context, iq0Var, textView2, true, str, cVar.f100109s, cVar.f100110t, null, i13);
                    i15 = i17;
                }
                cVar.L();
                return;
            }
            Object next = it.next();
            int i18 = i16 + 1;
            if (i16 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            TextView textView3 = (TextView) next;
            Float f13 = (Float) CollectionsKt.U(i16, cVar.G);
            float floatValue = f13 != null ? f13.floatValue() : 0.0f;
            zk0 zk0Var = (zk0) CollectionsKt.U(i16, cVar.F);
            iq0 iq0Var2 = (iq0) CollectionsKt.U(i16, arrayList2);
            Context context2 = cVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            float s22 = c0.d.s2(floatValue, cVar.getWidth(), context2);
            if (zk0Var != null) {
                String m13 = iq0Var2 != null ? iq0Var2.m() : null;
                boolean z13 = true ^ (m13 == null || m13.length() == 0);
                Double k13 = zk0Var.k();
                Intrinsics.checkNotNullExpressionValue(k13, "getXCoord(...)");
                float w13 = c0.d.w(k13.doubleValue(), cVar.I);
                Double j13 = zk0Var.j();
                Intrinsics.checkNotNullExpressionValue(j13, "getWidth(...)");
                int x13 = c0.d.x(j13.doubleValue(), cVar.I);
                float f14 = s22 / 5;
                float f15 = 2 * f14;
                if (z13) {
                    w13 -= f15;
                }
                float f16 = w13;
                int i19 = z13 ? (((int) f14) * 4) + x13 : x13;
                Double l13 = zk0Var.l();
                Intrinsics.checkNotNullExpressionValue(l13, "getYCoord(...)");
                float w14 = c0.d.w(l13.doubleValue(), cVar.f100097J);
                Double h10 = zk0Var.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
                textView = textView3;
                cVar.D(textView3, f16, w14, i19, c0.d.x(h10.doubleValue(), cVar.f100097J));
            } else {
                textView = textView3;
            }
            textView.setTextSize(0, s22);
            i16 = i18;
        }
    }
}
