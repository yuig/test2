package com.pinterest.ui.menu;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bs1.c;
import cb2.f;
import cb2.h;
import cb2.j;
import cb2.k;
import cb2.l;
import cb2.o;
import cb2.u;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdSize;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pincarouselads.view.x;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.u0;
import hf0.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.e0;
import m60.r0;
import m60.s0;
import m60.t0;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import ql2.s;
import vb0.i;
import wc0.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/menu/ContextMenuView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bk/f", "cb2/u", "contextMenuLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ContextMenuView extends FrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final int f52599w = (int) (b.f69001a * 85);

    /* renamed from: x, reason: collision with root package name */
    public static final int f52600x;

    /* renamed from: y, reason: collision with root package name */
    public static final float f52601y;

    /* renamed from: z, reason: collision with root package name */
    public static final double f52602z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f52603a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f52604b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f52605c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f52606d;

    /* renamed from: e, reason: collision with root package name */
    public final f f52607e;

    /* renamed from: f, reason: collision with root package name */
    public final o f52608f;

    /* renamed from: g, reason: collision with root package name */
    public final h f52609g;

    /* renamed from: h, reason: collision with root package name */
    public View f52610h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f52611i;

    /* renamed from: j, reason: collision with root package name */
    public int f52612j;

    /* renamed from: k, reason: collision with root package name */
    public int f52613k;

    /* renamed from: l, reason: collision with root package name */
    public float f52614l;

    /* renamed from: m, reason: collision with root package name */
    public float f52615m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52616n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f52617o;

    /* renamed from: p, reason: collision with root package name */
    public String f52618p;

    /* renamed from: q, reason: collision with root package name */
    public u f52619q;

    /* renamed from: r, reason: collision with root package name */
    public d0 f52620r;

    /* renamed from: s, reason: collision with root package name */
    public HashMap f52621s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f52622t;

    /* renamed from: u, reason: collision with root package name */
    public final x f52623u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f52624v;

    static {
        f52600x = n1.f83436b.c().f() ? AdSize.MEDIUM_RECTANGLE_WIDTH : 100;
        f52601y = 20.0f * b.f69001a;
        f52602z = 8000 * r0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextMenuView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static float[] f(float[] fArr, float[] fArr2, float f13, int i13, int i14, float f14, float f15) {
        if (i13 == 0) {
            return fArr2;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(f13, f14, f15);
        matrix.mapPoints(fArr);
        fArr2[i14] = fArr[0];
        fArr2[i14 + 1] = fArr[1];
        return f(fArr, fArr2, f13, i13 - 1, i14 + 2, f14, f15);
    }

    public final void a(List options) {
        String str;
        int i13;
        String str2;
        float[] f13;
        float f14;
        String str3;
        int i14 = 1;
        Intrinsics.checkNotNullParameter(options, "options");
        i();
        ArrayList arrayList = this.f52604b;
        arrayList.clear();
        View inflate = LayoutInflater.from(getContext()).inflate(d.contextmenu_item, (ViewGroup) null);
        ContextMenuItemView contextMenuItemView = inflate instanceof ContextMenuItemView ? (ContextMenuItemView) inflate : null;
        ArrayList arrayList2 = this.f52603a;
        if (contextMenuItemView != null) {
            contextMenuItemView.j(s0.contextual_origin);
            arrayList2.add(contextMenuItemView);
            addView(contextMenuItemView);
        }
        int i15 = 0;
        for (Object obj : options) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                f0.p();
                throw null;
            }
            ContextMenuItemView contextMenuItemView2 = (ContextMenuItemView) obj;
            if (contextMenuItemView2.getId() != -1) {
                contextMenuItemView2.setId(contextMenuItemView2.getId());
            } else {
                contextMenuItemView2.setId(i15);
            }
            addView(contextMenuItemView2);
            arrayList2.add(contextMenuItemView2);
            i15 = i16;
        }
        if (!arrayList2.isEmpty()) {
            ContextMenuItemView contextMenuItemView3 = (ContextMenuItemView) CollectionsKt.U(arrayList2.size() - 1, arrayList2);
            if (contextMenuItemView3 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                contextMenuItemView3.measure(makeMeasureSpec, makeMeasureSpec);
                this.f52612j = (int) (contextMenuItemView3.getMeasuredWidth() * 0.79f);
                this.f52613k = (int) (contextMenuItemView3.getMeasuredHeight() * 0.79f);
            }
            float f15 = this.f52614l;
            float f16 = this.f52615m;
            int size = arrayList2.size();
            int i17 = size - 1;
            float[] fArr = new float[size * 2];
            fArr[0] = f15;
            fArr[1] = f16;
            if (i17 > 0) {
                int i18 = i17 % 2;
                int i19 = 4;
                int i23 = f52599w;
                if (i18 != 0) {
                    fArr[2] = f15;
                    float f17 = f16 - i23;
                    fArr[3] = f17;
                    int i24 = (size - 2) / 2;
                    float[] fArr2 = {f15, f17};
                    i13 = 3;
                    f13 = f(fArr2, new float[i24 * 2], 42.0f, i24, 0, f15, f16);
                    str2 = "toString(...)";
                } else {
                    i13 = 3;
                    str2 = "toString(...)";
                    float[] f18 = f(new float[]{f15, f16 - i23}, new float[2], 21.0f, 1, 0, f15, f16);
                    float f19 = f18[0];
                    fArr[2] = f19;
                    float f23 = f18[1];
                    fArr[3] = f23;
                    fArr[4] = (2 * f15) - f19;
                    fArr[5] = f23;
                    int i25 = (size - 2) / 2;
                    f13 = f(f18, new float[i25 * 2], 42.0f, i25, 0, f15, f16);
                    i19 = 6;
                }
                int length = i19 + f13.length;
                for (int i26 = i19; i26 < length; i26++) {
                    fArr[i26] = f13[i26 - i19];
                }
                int length2 = i19 + f13.length;
                int length3 = f13.length;
                for (int i27 = 0; i27 < length3; i27++) {
                    if (i27 % 2 == 0) {
                        fArr[length2] = (2 * f15) - f13[i27];
                    } else {
                        fArr[length2] = f13[i27];
                    }
                    length2++;
                }
                str = str2;
                Intrinsics.checkNotNullExpressionValue(Arrays.toString(fArr), str);
                Matrix matrix = new Matrix();
                Rect rect = this.f52605c;
                int width = rect.width();
                float f24 = width / 2;
                if (f15 < f24) {
                    f14 = (1 - (f15 / f24)) * 42.0f;
                    str3 = "left";
                } else {
                    float f25 = width;
                    f14 = 360 - ((1 - ((f25 - f15) / (f25 - f24))) * 42.0f);
                    str3 = "right";
                }
                Pair create = Pair.create(str3, Float.valueOf(f14));
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Float f26 = (Float) create.second;
                String str4 = (String) create.first;
                Intrinsics.f(f26);
                matrix.setRotate(f26.floatValue(), f15, f16);
                b(fArr);
                Iterator it = arrayList.iterator();
                int i28 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Rect rect2 = (Rect) it.next();
                        float height = rect2.height();
                        float width2 = rect2.width();
                        if (!rect.contains(rect2)) {
                            if (rect2.intersect(rect)) {
                                float f27 = i14;
                                if (f27 - (rect2.height() / height) > f27 - (rect2.width() / width2)) {
                                    break;
                                }
                            } else {
                                i28 += i14;
                            }
                        }
                        i14 = 1;
                    } else if (i28 != i13) {
                        matrix.mapPoints(fArr);
                        b(fArr);
                        Intrinsics.f(str4);
                        fArr = (float[]) ((float[]) q(42.0f, str4, fArr, false, f15, f16).first).clone();
                    }
                }
                b(fArr);
                Intrinsics.f(str4);
                Pair q13 = q(20.0f, str4, fArr, true, f15, f16);
                Float f28 = (Float) q13.second;
                Object first = q13.first;
                Intrinsics.checkNotNullExpressionValue(first, "first");
                Float f29 = f28;
                float[] fArr3 = (float[]) first;
                for (int i29 = 0; i29 < 9; i29++) {
                    Object first2 = q13.first;
                    Intrinsics.checkNotNullExpressionValue(first2, "first");
                    q13 = q(20.0f, str4, (float[]) first2, true, f15, f16);
                    Object second = q13.second;
                    Intrinsics.checkNotNullExpressionValue(second, "second");
                    float floatValue = ((Number) second).floatValue();
                    Intrinsics.f(f29);
                    if (floatValue > f29.floatValue()) {
                        fArr3 = (float[]) ((float[]) q13.first).clone();
                        f29 = (Float) q13.second;
                    }
                    Object second2 = q13.second;
                    Intrinsics.checkNotNullExpressionValue(second2, "second");
                    float floatValue2 = ((Number) second2).floatValue();
                    Intrinsics.f(f29);
                    if (floatValue2 < f29.floatValue()) {
                        break;
                    }
                }
                fArr = fArr3;
            } else {
                str = "toString(...)";
            }
            this.f52611i = fArr;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(fArr), str);
        }
    }

    public final void b(float[] fArr) {
        ArrayList arrayList = this.f52604b;
        arrayList.clear();
        a p13 = s.p(s.q(2, fArr.length), 2);
        int i13 = p13.f80453a;
        int i14 = p13.f80454b;
        int i15 = p13.f80455c;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return;
        }
        while (true) {
            float f13 = fArr[i13];
            float f14 = this.f52612j / 2;
            float f15 = fArr[i13 + 1];
            float f16 = this.f52613k / 2;
            arrayList.add(new Rect((int) (f13 - f14), (int) (f15 - f16), (int) (f13 + f14), (int) (f15 + f16)));
            if (i13 == i14) {
                return;
            } else {
                i13 += i15;
            }
        }
    }

    public final float c(int i13) {
        Float H;
        float[] fArr = this.f52611i;
        if (fArr == null || (H = c0.H(i13 * 2, fArr)) == null) {
            return 0.0f;
        }
        return H.floatValue();
    }

    public final float d(int i13) {
        Float H;
        float[] fArr = this.f52611i;
        if (fArr == null || (H = c0.H((i13 * 2) + 1, fArr)) == null) {
            return 0.0f;
        }
        return H.floatValue();
    }

    public final d0 e() {
        d0 d0Var = this.f52620r;
        return d0Var == null ? sh.f.a() : d0Var;
    }

    public final void g() {
        d0 e13;
        u uVar = this.f52619q;
        if (uVar != null) {
            uVar.a();
            this.f52619q = null;
        }
        if (this.f52616n && (e13 = e()) != null) {
            e13.h0(f1.CONTEXTUAL_MENU_CLOSE, u0.PIN_SOURCE_IMAGE, null, this.f52618p, this.f52621s, null, null, false);
        }
        this.f52616n = false;
        this.f52624v = false;
        this.f52617o = false;
        i();
        f fVar = this.f52607e;
        fVar.setAlpha(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar, (Property<f, Float>) FrameLayout.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(f52600x);
        ofFloat.addListener(new k(this, 0));
        ofFloat.start();
        h();
        j();
        this.f52618p = null;
        this.f52610h = null;
    }

    public final void h() {
        h hVar = this.f52609g;
        hVar.setAlpha(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hVar, (Property<h, Float>) FrameLayout.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(f52600x);
        ofFloat.addListener(new k(this, 1));
        ofFloat.start();
    }

    public final void i() {
        ArrayList arrayList = this.f52603a;
        if (!arrayList.isEmpty()) {
            ContextMenuItemView contextMenuItemView = (ContextMenuItemView) CollectionsKt.firstOrNull(arrayList);
            if (contextMenuItemView != null) {
                contextMenuItemView.f();
            }
            Iterator it = arrayList.iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                ContextMenuItemView contextMenuItemView2 = (ContextMenuItemView) it.next();
                contextMenuItemView2.f();
                contextMenuItemView2.d(3, 1.0f, 0.0f, 0.9f, 0.25f, new l(this, contextMenuItemView2));
                z13 = true;
            }
            arrayList.clear();
            if (z13) {
                return;
            }
            removeView(contextMenuItemView);
        }
    }

    @Override // android.view.View
    public final boolean isShown() {
        return super.isShown() && this.f52616n;
    }

    public final void j() {
        this.f52606d.i(j.f27333k);
        l(null);
    }

    public final ContextMenuItemView k(int i13, int i14) {
        int i15;
        o oVar = this.f52608f;
        ArrayList arrayList = this.f52603a;
        int size = arrayList.size();
        int i16 = 1;
        for (int i17 = 1; i17 < size; i17++) {
            ((ContextMenuItemView) arrayList.get(i17)).k(false);
        }
        int size2 = arrayList.size();
        float f13 = Float.MAX_VALUE;
        int i18 = -1;
        int i19 = 1;
        ContextMenuItemView contextMenuItemView = null;
        float f14 = 0.0f;
        while (i19 < size2) {
            ContextMenuItemView contextMenuItemView2 = (ContextMenuItemView) arrayList.get(i19);
            float c13 = c(i19);
            float d2 = d(i19);
            ArrayList arrayList2 = arrayList;
            int i23 = size2;
            float f15 = f14;
            double d13 = 2.0f;
            int i24 = i19;
            float pow = ((float) Math.pow(this.f52614l - c13, d13)) + ((float) Math.pow(this.f52615m - d2, d13));
            float pow2 = ((float) Math.pow(i13 - c13, d13)) + ((float) Math.pow(i14 - d2, d13));
            if (contextMenuItemView2.i(i13, i14)) {
                if (contextMenuItemView != null) {
                    contextMenuItemView.m(c(i18), d(i18), 0.79f);
                }
                contextMenuItemView = contextMenuItemView2;
                f14 = f15;
                i18 = i24;
                i15 = 1;
                f13 = 0.0f;
            } else {
                if (pow2 >= f13 || pow2 > pow) {
                    contextMenuItemView2.m(c13, d2, 0.79f);
                    f14 = f15;
                } else {
                    if (contextMenuItemView != null) {
                        contextMenuItemView.m(c(i18), d(i18), 0.79f);
                    }
                    f14 = pow2 / (((float) Math.pow(this.f52614l - c13, d13)) + ((float) Math.pow(this.f52615m - d2, d13)));
                    f13 = pow2;
                    contextMenuItemView = contextMenuItemView2;
                    i18 = i24;
                }
                i15 = 1;
            }
            i19 = i24 + 1;
            i16 = i15;
            arrayList = arrayList2;
            size2 = i23;
        }
        int i25 = i16;
        float f16 = f14;
        if (contextMenuItemView != null) {
            float f17 = i25 - f16;
            float c14 = c(0);
            float d14 = d(0);
            float c15 = c(i18);
            float d15 = d(i18);
            double d16 = 2.0f;
            float sqrt = f52601y / ((float) Math.sqrt(((float) Math.pow(this.f52614l - c15, d16)) + ((float) Math.pow(this.f52615m - d15, d16))));
            contextMenuItemView.m(((c15 - c14) * sqrt * f17) + c15, ((d15 - d14) * sqrt * f17) + d15, (float) Math.max(0.7900000214576721d, (f17 * 0.20999998f) + 0.79f));
            if (f13 < f52602z) {
                contextMenuItemView.k(true);
                if (oVar != null) {
                    int f52587j = contextMenuItemView.getF52587j();
                    if (!this.f52617o && f52587j == t0.context_visual_search) {
                        this.f52617o = true;
                        Handler handler = oVar.getHandler();
                        if (handler != null) {
                            handler.removeCallbacks(oVar.f27352l);
                        }
                        if (oVar.b().f28364d.o()) {
                            oVar.b().f2();
                            c.X0(oVar.b());
                        }
                        ValueAnimator valueAnimator = oVar.f27349i;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(200L);
                        ofFloat.addUpdateListener(new androidx.media3.ui.c(oVar, 23));
                        oVar.f27349i = ofFloat;
                        ofFloat.start();
                        LottieAnimationView a13 = oVar.a();
                        a13.setVisibility(0);
                        a13.k2();
                    } else if (f52587j != t0.context_visual_search && oVar != null) {
                        this.f52617o = false;
                        oVar.c();
                    }
                }
                l(contextMenuItemView.getF52586i());
                return contextMenuItemView;
            }
        }
        if (oVar != null) {
            this.f52617o = false;
            oVar.c();
        }
        l(null);
        return null;
    }

    public final void l(String str) {
        if (str == null || str.length() == 0) {
            str = "";
        }
        List list = e0.f85899a;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            str = ((Object) str) + " ";
        }
        GestaltText gestaltText = this.f52606d;
        String R = a0.R(gestaltText);
        if (str.length() == R.length() && Intrinsics.d(str, R)) {
            return;
        }
        a0.q(gestaltText, c.h2(str));
        gestaltText.clearAnimation();
        if (z.j(str)) {
            j();
            h();
            return;
        }
        p();
        if (this.f52617o && this.f52622t) {
            h();
        } else {
            o();
        }
    }

    public final boolean m(dl1.s sVar) {
        return (sVar instanceof f30) && ig1.b.d1((f30) sVar) && this.f52622t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f1, code lost:
    
        if (r15 < r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        if ((r14 + r1) > r11) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(m10.d r27, cb2.u r28) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.menu.ContextMenuView.n(m10.d, cb2.u):void");
    }

    public final void o() {
        View view = this.f52610h;
        h hVar = this.f52609g;
        Path path = hVar.f27323b;
        path.reset();
        Rect rect = hVar.f27325d;
        if (view != null) {
            Rect rect2 = hVar.f27324c;
            hVar.getGlobalVisibleRect(rect2);
            view.getGlobalVisibleRect(rect);
            rect.top -= rect2.top;
            int i13 = rect.bottom - rect2.top;
            rect.bottom = i13;
            int min = Math.min(i13, hVar.getMeasuredHeight() - ((int) r70.b.f106349i.k0().b()));
            rect.bottom = min;
            path.addRect(rect.left, rect.top, rect.right, min, Path.Direction.CW);
        } else {
            rect.setEmpty();
        }
        hVar.requestLayout();
        ObjectAnimator.ofFloat(hVar, (Property<h, Float>) FrameLayout.ALPHA, 0.0f, 1.0f).setDuration(f52600x).start();
        hVar.setVisibility(0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52619q = null;
        g();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            this.f52614l = event.getX();
            this.f52615m = event.getY();
        }
        if (!this.f52616n) {
            return false;
        }
        this.f52623u.onTouch(null, event);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        this.f52605c.set(0, 0, b.f69002b, b.f69003c);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
        if (i13 == 8) {
            g();
        }
    }

    public final void p() {
        this.f52606d.i(cb2.b.f27295m);
    }

    public final Pair q(float f13, String str, float[] fArr, boolean z13, float f14, float f15) {
        Rect rect;
        int width;
        int height;
        ArrayList arrayList = this.f52604b;
        Iterator it = arrayList.iterator();
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (true) {
            boolean hasNext = it.hasNext();
            rect = this.f52605c;
            if (!hasNext) {
                break;
            }
            Rect rect2 = (Rect) it.next();
            float width2 = rect2.width();
            if (z13) {
                f17 = 1.0f;
            } else if (!rect.contains(rect2)) {
                f17 += rect2.intersect(rect) ? 1 - (rect2.width() / width2) : 1.0f;
            }
        }
        Matrix matrix = new Matrix();
        if (Intrinsics.d(str, "left")) {
            matrix.setRotate(f17 * f13, f14, f15);
        } else if (Intrinsics.d(str, "right")) {
            matrix.setRotate(360 - (f17 * f13), f14, f15);
        }
        matrix.mapPoints(fArr);
        arrayList.clear();
        b(fArr);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect3 = (Rect) it2.next();
            if (rect.contains(rect3)) {
                width = rect3.width();
                height = rect3.height();
            } else if (rect3.intersect(rect)) {
                width = rect3.width();
                height = rect3.height();
            }
            f16 += height * width;
        }
        Intrinsics.checkNotNullExpressionValue(Arrays.toString(fArr), "toString(...)");
        Pair create = Pair.create(fArr, Float.valueOf(f16));
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52603a = new ArrayList();
        this.f52604b = new ArrayList();
        this.f52605c = new Rect();
        boolean z13 = true;
        z13 = true;
        x xVar = new x(this, z13 ? 1 : 0);
        this.f52623u = xVar;
        i iVar = n1.f83436b;
        n1 c13 = iVar.c();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) c13.f83439a;
        if (!g1Var.o("visual_search_in_long_press_android", "enabled", z3Var) && !g1Var.l("visual_search_in_long_press_android")) {
            z13 = false;
        }
        this.f52622t = z13;
        f fVar = new f(context);
        this.f52607e = fVar;
        fVar.setVisibility(4);
        addView(fVar, -1, -1);
        if (z13) {
            o oVar = new o(context, iVar.c().f());
            this.f52608f = oVar;
            addView(oVar, -1, -1);
        }
        h hVar = new h(context);
        this.f52609g = hVar;
        hVar.setVisibility(4);
        addView(hVar, -1, -1);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        this.f52606d = gestaltText;
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        gestaltText.i(j.f27332j);
        List list = e0.f85899a;
        gestaltText.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0 ? dimensionPixelSize / 2 : dimensionPixelSize, dimensionPixelSize);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(gestaltText);
        setLayoutDirection(0);
        setOnTouchListener(xVar);
    }
}
