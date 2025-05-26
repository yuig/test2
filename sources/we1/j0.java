package we1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends LinearLayout implements u, nx.v {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f129439d = kotlin.collections.g1.b(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP));

    /* renamed from: a, reason: collision with root package name */
    public final v2 f129440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129441b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout[] f129442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v2 params, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129440a = params;
        this.f129441b = params.f129653d;
        LinearLayout[] linearLayoutArr = new LinearLayout[2];
        for (int i13 = 0; i13 < 2; i13++) {
            LinearLayout linearLayout = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            Unit unit = Unit.f80348a;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(0);
            linearLayout.setVisibility(8);
            linearLayoutArr[i13] = linearLayout;
        }
        this.f129442c = linearLayoutArr;
        setGravity(17);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        setLayoutParams(layoutParams2);
        for (int i14 = 0; i14 < 2; i14++) {
            addView(linearLayoutArr[i14]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[SYNTHETIC] */
    @Override // we1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "storyItems"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L12:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lcd
            java.lang.Object r5 = r2.next()
            int r6 = r4 + 1
            if (r4 < 0) goto Lc8
            ue1.a0 r5 = (ue1.a0) r5
            int r8 = r0.f129441b
            int r8 = r4 / r8
            we1.v2 r9 = r0.f129440a
            int r10 = r9.f129653d
            if (r4 >= r10) goto L2e
            r10 = 1
            goto L2f
        L2e:
            r10 = r3
        L2f:
            int r12 = r17.size()
            int r13 = r9.f129653d
            int r12 = r12 - r13
            if (r4 < r12) goto L3a
            r12 = 1
            goto L3b
        L3a:
            r12 = r3
        L3b:
            int r13 = r5.m()
            r14 = 180(0xb4, float:2.52E-43)
            if (r13 != r14) goto L61
            we1.p r13 = new we1.p
            android.content.Context r15 = r16.getContext()
            java.lang.String r7 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r7)
            r13.<init>(r15)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            int r11 = r9.f129652c
            r7.<init>(r11, r15)
            r11 = 17
            r7.gravity = r11
            r13.setLayoutParams(r7)
            goto L62
        L61:
            r13 = 0
        L62:
            if (r13 == 0) goto L7a
            int r7 = r5.m()
            if (r7 != r14) goto L72
            ac1.j r7 = new ac1.j
            r11 = 29
            r7.<init>(r11)
            goto L73
        L72:
            r7 = 0
        L73:
            if (r7 == 0) goto L7a
            r7.c(r13, r5, r4)
            r7 = r13
            goto L7b
        L7a:
            r7 = 0
        L7b:
            if (r7 == 0) goto Lc5
            ue1.o r4 = r9.f129655f
            int r5 = r4.f122048b
            int r4 = r4.f122047a
            r7.setPaddingRelative(r5, r4, r5, r4)
            if (r10 == 0) goto L97
            int r4 = r7.getPaddingStart()
            int r5 = r7.getPaddingEnd()
            int r9 = r7.getPaddingBottom()
            r7.setPaddingRelative(r4, r3, r5, r9)
        L97:
            if (r12 == 0) goto La8
            int r4 = r7.getPaddingStart()
            int r5 = r7.getPaddingTop()
            int r9 = r7.getPaddingEnd()
            r7.setPaddingRelative(r4, r5, r9, r3)
        La8:
            android.widget.LinearLayout[] r4 = r0.f129442c
            if (r8 == 0) goto Lbb
            r5 = 1
            if (r8 == r5) goto Lb0
            goto Lc5
        Lb0:
            r8 = r4[r5]
            r8.setVisibility(r3)
            r4 = r4[r5]
            r4.addView(r7)
            goto Lc5
        Lbb:
            r5 = r4[r3]
            r5.setVisibility(r3)
            r4 = r4[r3]
            r4.addView(r7)
        Lc5:
            r4 = r6
            goto L12
        Lc8:
            kotlin.collections.f0.p()
            r1 = 0
            throw r1
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.j0.a(java.util.List):void");
    }

    @Override // we1.u
    public final ViewGroup b() {
        return this;
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return yn2.c0.t(d7.b.O(this));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }
}
