package ly0;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import pk.a0;
import ql2.k;
import ql2.s;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class h extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f85134m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f85135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85136b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85137c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f85138d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f85139e;

    /* renamed from: f, reason: collision with root package name */
    public final List f85140f;

    /* renamed from: g, reason: collision with root package name */
    public final v f85141g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer[] f85142h;

    /* renamed from: i, reason: collision with root package name */
    public final int f85143i;

    /* renamed from: j, reason: collision with root package name */
    public final a f85144j;

    /* renamed from: k, reason: collision with root package name */
    public final RoundedCornersLayout f85145k;

    /* renamed from: l, reason: collision with root package name */
    public final WebImageView f85146l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i13, int i14, Context context, String interestImage) {
        super(context);
        boolean z13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interestImage, "interestImage");
        this.f85135a = interestImage;
        this.f85136b = i13;
        this.f85137c = i14;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setVisibility(4);
        this.f85138d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setAlpha(0.0f);
        int i15 = jv1.a.mod_nux_background;
        Object obj = d5.a.f53679a;
        frameLayout2.setBackgroundColor(context.getColor(i15));
        frameLayout2.forceHasOverlappingRendering(false);
        this.f85139e = frameLayout2;
        this.f85140f = f0.j(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP));
        this.f85141g = m.b(g.f85133i);
        int b13 = b();
        Integer[] numArr = new Integer[b13];
        for (int i16 = 0; i16 < b13; i16++) {
            numArr[i16] = 0;
        }
        this.f85142h = numArr;
        this.f85143i = ((b() * 12) - (b() * 3)) - 1;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.f85138d);
        int b14 = b() * 12;
        float f13 = hf0.b.f69002b;
        Context context2 = getContext();
        String str = "getContext(...)";
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int E = (((int) j1.E(f13, context2)) - ((b() + 1) * 14)) / b();
        k it = s.q(0, b14).iterator();
        while (true) {
            boolean z14 = it.f104109c;
            FrameLayout frameLayout3 = this.f85138d;
            Integer[] numArr2 = this.f85142h;
            if (!z14) {
                View view = this.f85139e;
                Resources resources = view.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                view.setLayoutParams(new FrameLayout.LayoutParams((int) f13, a0.K(numArr2[a()].intValue(), resources)));
                frameLayout3.addView(view);
                this.f85138d.post(new vs0.b(this, 13));
                return;
            }
            int b15 = it.b();
            int a13 = a();
            List list = this.f85140f;
            int intValue = ((Number) list.get(b15 % list.size())).intValue();
            int i17 = (a13 * E) + ((a13 + 1) * 14);
            int intValue2 = numArr2[a13].intValue();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, str);
            RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context3);
            Resources resources2 = roundedCornersLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            int K = a0.K(E, resources2);
            k kVar = it;
            Resources resources3 = roundedCornersLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(K, a0.K(intValue, resources3));
            Resources resources4 = roundedCornersLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            int K2 = a0.K(i17, resources4);
            Resources resources5 = roundedCornersLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
            int K3 = a0.K(intValue2, resources5);
            int marginEnd = marginLayoutParams.getMarginEnd();
            String str2 = str;
            int i18 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(K2);
            marginLayoutParams.topMargin = K3;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i18;
            Context context4 = roundedCornersLayout.getContext();
            int i19 = jv1.a.mod_nux_background_70;
            Object obj2 = d5.a.f53679a;
            roundedCornersLayout.a(context4.getColor(i19));
            ef0.a cornerSettings = new ef0.a(roundedCornersLayout.getResources().getDimension(eo1.c.lego_corner_radius_medium), 6);
            Intrinsics.checkNotNullParameter(cornerSettings, "cornerSettings");
            roundedCornersLayout.f44944e = cornerSettings;
            roundedCornersLayout.setLayoutParams(marginLayoutParams);
            if (this.f85143i == b15) {
                this.f85144j = new a(i17, intValue2, E, intValue);
                this.f85145k = roundedCornersLayout;
                WebImageView webImageView = new WebImageView(getContext());
                z13 = false;
                webImageView.setAlpha(0.0f);
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                webImageView.loadUrl(this.f85135a);
                this.f85146l = webImageView;
                RoundedCornersLayout roundedCornersLayout2 = this.f85145k;
                if (roundedCornersLayout2 != null) {
                    roundedCornersLayout2.addView(webImageView);
                }
            } else {
                z13 = false;
            }
            numArr2[a13] = Integer.valueOf(numArr2[a13].intValue() + intValue + 14);
            frameLayout3.addView(roundedCornersLayout);
            it = kVar;
            str = str2;
        }
    }

    public final int a() {
        Integer num;
        Integer[] numArr = this.f85142h;
        Integer[] numArr2 = numArr;
        Intrinsics.checkNotNullParameter(numArr2, "<this>");
        if (numArr2.length == 0) {
            num = null;
        } else {
            num = numArr2[0];
            Intrinsics.checkNotNullParameter(numArr2, "<this>");
            k it = new IntRange(1, numArr2.length - 1, 1).iterator();
            while (it.f104109c) {
                Integer num2 = numArr2[it.b()];
                if (num.compareTo(num2) > 0) {
                    num = num2;
                }
            }
        }
        Integer num3 = num;
        if (num3 == null) {
            return 0;
        }
        int K = c0.K(numArr, num3);
        Integer valueOf = K >= 0 ? Integer.valueOf(K) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final int b() {
        return ((Number) this.f85141g.getValue()).intValue();
    }
}
