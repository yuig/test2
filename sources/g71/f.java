package g71;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import d71.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import zp.y0;

/* loaded from: classes5.dex */
public final class f extends LinearLayout implements g {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f63895l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d71.b f63896a;

    /* renamed from: b, reason: collision with root package name */
    public d71.e f63897b;

    /* renamed from: c, reason: collision with root package name */
    public b f63898c;

    /* renamed from: d, reason: collision with root package name */
    public b f63899d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f63900e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f63901f;

    /* renamed from: g, reason: collision with root package name */
    public final int f63902g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f63903h;

    /* renamed from: i, reason: collision with root package name */
    public List f63904i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f63905j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f63906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r6, d71.b r7, lh0.c4 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "inclusiveFilterHostScreenType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r5.<init>(r6)
            r5.f63896a = r7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r6)
            r5.f63900e = r7
            r0 = 0
            if (r6 == 0) goto L1b
            com.pinterest.gestalt.text.GestaltText r1 = new com.pinterest.gestalt.text.GestaltText
            r2 = 6
            r1.<init>(r2, r6, r0)
            r0 = r1
        L1b:
            r5.f63901f = r0
            android.content.res.Resources r6 = r5.getResources()
            int r1 = d82.a.try_on_skintone_filters_width
            int r6 = r6.getDimensionPixelSize(r1)
            r5.f63902g = r6
            android.app.Activity r6 = bs1.c.l0(r5)
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L45
            boolean r3 = hf0.b.q()
            if (r3 == 0) goto L45
            boolean r3 = hf0.b.m()
            if (r3 == 0) goto L45
            boolean r6 = r6.isInMultiWindowMode()
            if (r6 != 0) goto L45
            r6 = r2
            goto L46
        L45:
            r6 = r1
        L46:
            r5.f63903h = r6
            if (r8 == 0) goto L62
            lh0.z3 r6 = lh0.a4.f83297a
            lh0.z0 r8 = r8.f83319a
            lh0.g1 r8 = (lh0.g1) r8
            java.lang.String r3 = "enabled"
            java.lang.String r4 = "android_search_unify_tap_back_behavior"
            boolean r6 = r8.o(r4, r3, r6)
            if (r6 != 0) goto L60
            boolean r6 = r8.l(r4)
            if (r6 == 0) goto L62
        L60:
            r6 = r2
            goto L63
        L62:
            r6 = r1
        L63:
            r5.f63906k = r6
            int r6 = d82.b.skin_tone_selector
            r5.setId(r6)
            r5.setOrientation(r2)
            r6 = 17
            r5.setGravity(r6)
            if (r0 == 0) goto L98
            g71.d r8 = g71.d.f63893i
            r0.i(r8)
            android.content.res.Resources r8 = r0.getResources()
            int r2 = eo1.c.space_200
            int r8 = r8.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r0.getResources()
            int r3 = eo1.c.space_100
            int r2 = r2.getDimensionPixelSize(r3)
            int r3 = r0.getPaddingStart()
            int r4 = r0.getPaddingEnd()
            r0.setPaddingRelative(r3, r8, r4, r2)
        L98:
            r5.addView(r0)
            r7.setOrientation(r1)
            r7.setGravity(r6)
            r5.addView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g71.f.<init>(android.content.Context, d71.b, lh0.c4):void");
    }

    public final void a(e71.b bVar, d71.a aVar, List list) {
        if (getContext() == null) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_quarter);
        int i13 = Intrinsics.d(CollectionsKt.d0(list), aVar) ? dimensionPixelSize : 0;
        int size = list.size();
        Integer num = aVar.f53905k;
        int intValue = ((num != null ? num.intValue() : hf0.b.f69002b) - ((size + 1) * dimensionPixelSize)) / size;
        int i14 = this.f63902g;
        int min = Math.min(intValue, i14);
        boolean z13 = this.f63903h;
        int i15 = z13 ? i14 : min;
        int i16 = e.f63894a[bVar.ordinal()];
        LinearLayout.LayoutParams layoutParams = null;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 17;
                }
            } else if (z13) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388611;
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
            }
        } else if (getLayoutParams() instanceof LinearLayout.LayoutParams) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
        }
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b bVar2 = new b(context, i15, aVar.f53906l, dimensionPixelSize, i13);
        bVar2.setOnClickListener(new y0(this, bVar2, aVar, 22));
        if (aVar.f53904j) {
            this.f63898c = bVar2;
        }
        Resources resources = bVar2.getResources();
        int i17 = d82.c.content_description_search_skin_tone_unselected;
        String str = aVar.f53902h;
        String contentDescription = resources.getString(i17, str);
        Intrinsics.f(contentDescription);
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        bVar2.setContentDescription(contentDescription);
        bVar2.setTag(aVar.f53907m);
        this.f63900e.addView(bVar2);
        if (Intrinsics.d(this.f63898c, bVar2)) {
            if (!this.f63906k || this.f63896a != d71.b.SEARCH) {
                e(bVar2, false, str, aVar.f53903i);
                return;
            }
            b bVar3 = this.f63898c;
            if (bVar3 != null) {
                bVar3.a(true);
            }
        }
    }

    public final void b(e71.b swatchType, ArrayList skinToneFilters) {
        Intrinsics.checkNotNullParameter(swatchType, "swatchType");
        Intrinsics.checkNotNullParameter(skinToneFilters, "skinToneFilters");
        ArrayList arrayList = new ArrayList();
        for (Object obj : skinToneFilters) {
            if (((d71.a) obj).f53904j) {
                arrayList.add(obj);
            }
        }
        this.f63905j = arrayList.isEmpty() ^ true ? Integer.valueOf(((d71.a) arrayList.get(0)).f53903i) : null;
        Iterator it = skinToneFilters.iterator();
        while (it.hasNext()) {
            a(swatchType, (d71.a) it.next(), skinToneFilters);
        }
    }

    public final void e(b bVar, boolean z13, String str, int i13) {
        String contentDescription = bVar.getResources().getString(d82.c.content_description_search_skin_tone_selected, str);
        Intrinsics.checkNotNullExpressionValue(contentDescription, "getString(...)");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        bVar.setContentDescription(contentDescription);
        boolean z14 = this.f63906k;
        if (z14) {
            bVar.a(true);
        } else if (z13) {
            Intrinsics.d(this.f63898c, bVar);
            ArrayList G = kg.a.G(bVar, 1.0f, 0.85f, 250L, 250L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(G);
            animatorSet.start();
        } else {
            bVar.a(true);
        }
        d71.e eVar = this.f63897b;
        if (eVar != null) {
            eVar.o1(i13, this.f63905j, z13);
        }
        if (!Intrinsics.d(this.f63898c, bVar) || !z13) {
            this.f63899d = this.f63898c;
            this.f63898c = bVar;
        } else {
            if (z14) {
                return;
            }
            this.f63898c = null;
            d71.e eVar2 = this.f63897b;
            if (eVar2 != null) {
                eVar2.v0();
            }
        }
    }

    public final void g(d71.e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f63897b = listener;
    }

    public final void i(CharSequence charSequence) {
        GestaltText gestaltText = this.f63901f;
        if (gestaltText != null) {
            gestaltText.i(new ip.d(19, charSequence));
        }
    }

    public final void j() {
        b bVar = this.f63898c;
        if (bVar != null) {
            bVar.a(false);
        }
    }

    public final void k() {
        this.f63898c = this.f63899d;
    }

    public final void l(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        b bVar = this.f63898c;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            bVar.setContentDescription(contentDescription);
        }
    }

    public final void m() {
        this.f63900e.removeAllViews();
        List list = this.f63904i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a(e71.b.ROUNDED_RECT, (d71.a) it.next(), list);
            }
        }
    }
}
