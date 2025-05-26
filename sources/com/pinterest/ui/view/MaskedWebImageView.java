package com.pinterest.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import c72.o;
import com.pinterest.ui.imageview.WebImageView;
import h32.f1;
import hb2.b0;
import hb2.c0;
import hb2.f0;
import hb2.i;
import hb2.x;
import ib2.c;
import ib2.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k81.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l81.k;
import lf.a;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import q5.x0;
import r72.i1;
import r72.j1;
import st1.b;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\t\n\u000bB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/view/MaskedWebImageView;", "Lcom/pinterest/ui/imageview/WebImageView;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gi2/b", "hb2/i", "l81/k", "visualSearchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MaskedWebImageView extends WebImageView implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f52675x0 = 0;

    /* renamed from: J, reason: collision with root package name */
    public final float f52676J;
    public final float K;
    public a L;
    public boolean M;
    public Rect N;
    public i O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;

    /* renamed from: a0, reason: collision with root package name */
    public final v f52677a0;

    /* renamed from: b0, reason: collision with root package name */
    public final o f52678b0;

    /* renamed from: c0, reason: collision with root package name */
    public final RectF f52679c0;

    /* renamed from: d0, reason: collision with root package name */
    public RectF f52680d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f52681e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int f52682f0;

    /* renamed from: g0, reason: collision with root package name */
    public b f52683g0;

    /* renamed from: h0, reason: collision with root package name */
    public final ScaleGestureDetector f52684h0;

    /* renamed from: i0, reason: collision with root package name */
    public k f52685i0;

    /* renamed from: j0, reason: collision with root package name */
    public d f52686j0;

    /* renamed from: k0, reason: collision with root package name */
    public st1.a f52687k0;

    /* renamed from: l0, reason: collision with root package name */
    public List f52688l0;

    /* renamed from: m0, reason: collision with root package name */
    public List f52689m0;

    /* renamed from: n0, reason: collision with root package name */
    public List f52690n0;

    /* renamed from: o0, reason: collision with root package name */
    public final Matrix f52691o0;

    /* renamed from: p0, reason: collision with root package name */
    public f0 f52692p0;

    /* renamed from: q0, reason: collision with root package name */
    public c f52693q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f52694r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f52695s0;

    /* renamed from: t0, reason: collision with root package name */
    public final float f52696t0;

    /* renamed from: u0, reason: collision with root package name */
    public final float f52697u0;

    /* renamed from: v0, reason: collision with root package name */
    public float f52698v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f52699w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedWebImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        float W = bs1.c.W(this, vc2.a.cutout_mask_stroke_width);
        this.f52676J = W;
        this.K = W;
        this.L = x.f68625b;
        this.N = new Rect();
        this.O = i.NONE;
        this.f52677a0 = a.c.n(context, 16);
        m.b(new em1.k(context, 15));
        this.f52678b0 = new o(this, 23);
        this.f52679c0 = new RectF();
        this.f52680d0 = new RectF();
        this.f52681e0 = ViewConfiguration.get(context).getScaledTouchSlop();
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f52682f0 = scaledTouchSlop * scaledTouchSlop;
        this.f52684h0 = new ScaleGestureDetector(context, this);
        q0 q0Var = q0.f80391a;
        this.f52688l0 = q0Var;
        this.f52689m0 = q0Var;
        this.f52690n0 = q0Var;
        this.f52691o0 = new Matrix();
        this.f52695s0 = 1.0f;
        float f13 = hf0.b.f69003c;
        this.f52696t0 = f13;
        this.f52697u0 = hf0.b.f69002b;
        this.f52698v0 = f13;
        this.f52699w0 = true;
    }

    public final void A2() {
        if (this.f52695s0 == 0.0f) {
            return;
        }
        float W = bs1.c.W(this, vc2.a.visual_search_borderless_cropper_radius) / this.f52695s0;
        c cVar = this.f52693q0;
        if (cVar != null) {
            cVar.f72033a = W;
            cVar.invalidateSelf();
        }
    }

    public final int D2() {
        return ((Number) this.f52677a0.getValue()).intValue();
    }

    public final void E2(float f13, float f14, int i13, int i14) {
        Object next;
        Unit unit;
        WebImageView j13;
        i81.c cVar;
        i81.c cVar2;
        int i15 = i13;
        int i16 = i14;
        e3(i15, i16);
        List list = this.f52690n0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Region) obj).contains((int) f13, (int) f14)) {
                arrayList.add(obj);
            }
        }
        j0.a comparator = al2.a.a(hb2.b.f68539m, hb2.b.f68540n);
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    next = next2;
                }
            }
        } else {
            next = null;
        }
        Region region = (Region) next;
        if (region != null) {
            p3((st1.a) CollectionsKt.U(this.f52690n0.indexOf(region), this.f52688l0));
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            if (i15 < 1) {
                i15 = 1;
            }
            float f15 = f13 / i15;
            if (i16 < 1) {
                i16 = 1;
            }
            float f16 = f14 / i16;
            if (this.f52694r0 && (this.f52679c0.contains(f13, f14) || this.f52680d0.contains(f15, f16))) {
                k kVar = this.f52685i0;
                if (kVar != null && (cVar2 = kVar.f82147a.f82177p1) != null) {
                    ((l) cVar2).R3();
                }
                M2();
                return;
            }
            if (this.f52694r0) {
                int b03 = bs1.c.b0(this, vc2.a.visual_search_cropper_corner_padding);
                float f17 = this.f52697u0;
                float f18 = 0.3f * f17;
                Rect rect = (Rect) this.f52678b0.invoke();
                float f19 = rect.left;
                float f23 = rect.top;
                float width = rect.width();
                float height = rect.height();
                if (width <= 0.0f || height <= 0.0f) {
                    return;
                }
                float f24 = f13 + f19;
                float f25 = f18 / 2;
                float f26 = f24 - f25;
                float f27 = f14 + f23;
                float f28 = f27 - f25;
                float f29 = f24 + f25;
                float f33 = f27 + f25;
                float f34 = b03;
                float max = Math.max(f23 + f34, f34);
                float f35 = f17 - f34;
                float min = Math.min(rect.bottom - f34, this.f52698v0 - f34);
                if (f26 < f34) {
                    f29 += f34 - f26;
                    f26 = f34;
                }
                if (f29 > f35) {
                    f26 -= f29 - f35;
                } else {
                    f35 = f29;
                }
                if (f28 < max) {
                    f33 += max - f28;
                    f28 = max;
                }
                if (f33 > min) {
                    f28 -= f33 - min;
                } else {
                    min = f33;
                }
                RectF rectF = new RectF(f26, f28, f35, min);
                RectF rectF2 = new RectF((rectF.left - f19) / width, (rectF.top - f23) / height, (rectF.right - f19) / width, (rectF.bottom - f23) / height);
                this.f52680d0 = rectF2;
                k kVar2 = this.f52685i0;
                if (kVar2 != null) {
                    Rect imageBounds = gi2.b.i0(this);
                    float f36 = rectF2.left;
                    float f37 = rectF2.top;
                    float width2 = rectF2.width();
                    float height2 = rectF2.height();
                    Intrinsics.checkNotNullParameter(imageBounds, "imageBounds");
                    l81.l lVar = kVar2.f82147a;
                    f91.b bVar = lVar.E1;
                    if (bVar != null && (j13 = bVar.j()) != null && (cVar = lVar.f82177p1) != null) {
                        Rect imageBounds2 = gi2.b.i0(j13);
                        int i17 = lVar.f82158f2;
                        com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
                        int i18 = mVar != null ? mVar.f47997h.f47953a : 0;
                        l lVar2 = (l) cVar;
                        Intrinsics.checkNotNullParameter(imageBounds2, "imageBounds");
                        d0 d0Var = lVar2.getPresenterPinalytics().f122379a;
                        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                        d0.v(d0Var, f1.FLASHLIGHT_CROPPER_MOVE, lVar2.f78611c, false, 12);
                        Pair u33 = lVar2.u3(f36, f37, width2, height2, imageBounds2, i17, i18);
                        lVar2.B3(f36, f37, width2, height2, (RectF) u33.f80346a, (RectF) u33.f80347b, null, null, true, true);
                    }
                }
                this.f52687k0 = null;
            }
        }
    }

    public final boolean G2(float f13, float f14, int i13, int i14) {
        return Math.abs(f13 - ((float) i13)) < ((float) D2()) && Math.abs(f14 - ((float) i14)) < ((float) D2());
    }

    public final void H2(float f13) {
        this.f52695s0 = f13;
        A2();
        invalidate();
    }

    public final void M2() {
        this.f52680d0.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.f52679c0.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.f52687k0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void O2(b bVar) {
        st1.a aVar;
        ?? mask;
        List list;
        Object obj;
        if (bVar != null) {
            this.f52683g0 = bVar;
        }
        b0 b0Var = null;
        if (bVar == null || (list = bVar.f115174b) == null) {
            aVar = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((st1.a) obj).f115171a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            aVar = (st1.a) obj;
        }
        f0 f0Var = this.f52692p0;
        if (f0Var != null) {
            f0Var.stop();
        }
        f0 f0Var2 = this.f52692p0;
        if (f0Var2 != null) {
            i1 i1Var = aVar != null ? aVar.f115172b : null;
            b0 b0Var2 = f0Var2.f68565l;
            if (b0Var2 != null) {
                List list2 = b0Var2.f68542a;
                if (list2 != null) {
                    List<c0> list3 = list2;
                    mask = new ArrayList(g0.q(list3, 10));
                    for (c0 c0Var : list3) {
                        boolean d2 = Intrinsics.d(c0Var.f68547c, i1Var);
                        Path path = c0Var.f68545a;
                        Intrinsics.checkNotNullParameter(path, "path");
                        j1 rBounds = c0Var.f68546b;
                        Intrinsics.checkNotNullParameter(rBounds, "rBounds");
                        i1 mask2 = c0Var.f68547c;
                        Intrinsics.checkNotNullParameter(mask2, "mask");
                        mask.add(new c0(path, rBounds, mask2, d2));
                    }
                } else {
                    mask = q0.f80391a;
                }
                Intrinsics.checkNotNullParameter(mask, "mask");
                b0Var = new b0(mask);
            }
            f0Var2.f68565l = b0Var;
            f0Var2.invalidateSelf();
        }
        g3();
    }

    public final void R2(r72.a aVar, boolean z13) {
        if (aVar != null) {
            j1 j1Var = aVar.f106431a;
            float f13 = j1Var.f106506a;
            float f14 = j1Var.f106508c + f13;
            float f15 = j1Var.f106507b;
            this.f52680d0 = new RectF(f13, f15, f14, j1Var.f106509d + f15);
            k kVar = this.f52685i0;
            if (kVar != null) {
                Rect imageBounds = gi2.b.i0(this);
                Intrinsics.checkNotNullParameter(imageBounds, "imageBounds");
                float f16 = j1Var.f106506a;
                if (f16 >= 0.0f) {
                    float f17 = j1Var.f106507b;
                    if (f17 >= 0.0f) {
                        float f18 = j1Var.f106508c;
                        if (f18 >= 0.0f) {
                            float f19 = j1Var.f106509d;
                            if (f19 < 0.0f) {
                                return;
                            }
                            int i13 = l81.l.Q2;
                            l81.l lVar = kVar.f82147a;
                            if (lVar.x9() && !z13) {
                                kVar.f82147a.H9(f16, f17, f18, f19, false, null);
                                return;
                            }
                            com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
                            if (mVar != null) {
                                mVar.b();
                            }
                            i81.c cVar = lVar.f82177p1;
                            if (cVar != null) {
                                int i14 = lVar.f82158f2;
                                com.pinterest.feature.search.visual.cropper.m mVar2 = lVar.K1;
                                int i15 = mVar2 != null ? mVar2.f47997h.f47953a : 0;
                                Boolean bool = Boolean.FALSE;
                                l lVar2 = (l) cVar;
                                Intrinsics.checkNotNullParameter(imageBounds, "imageBounds");
                                Pair u33 = lVar2.u3(f16, f17, f18, f19, imageBounds, i14, i15);
                                lVar2.B3(f16, f17, f18, f19, (RectF) u33.f80346a, (RectF) u33.f80347b, bool, null, false, false);
                                lVar2.K3(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void W2() {
        i81.c cVar;
        c cVar2 = this.f52693q0;
        if (cVar2 != null) {
            cVar2.c(false);
        }
        k kVar = this.f52685i0;
        if (kVar != null && (cVar = kVar.f82147a.f82177p1) != null) {
            l lVar = (l) cVar;
            if (lVar.f78621h) {
                lVar.f78649v = null;
                lVar.f78630l0 = false;
            }
        }
        O2(null);
        M2();
    }

    public final void X2(b maskModel, boolean z13, float f13, float f14) {
        st1.a aVar;
        i1 i1Var;
        Object next;
        i1 i1Var2;
        r72.a aVar2;
        Object obj;
        Intrinsics.checkNotNullParameter(maskModel, "maskModel");
        this.f52683g0 = maskModel;
        List list = maskModel.f115174b;
        List list2 = list == null ? q0.f80391a : list;
        if (this.f52688l0.isEmpty() || this.f52689m0.isEmpty()) {
            Collection collection = maskModel.f115173a;
            if (collection == null) {
                collection = q0.f80391a;
            }
            List<st1.a> list3 = list2;
            ArrayList arrayList = new ArrayList(g0.q(list3, 10));
            for (st1.a aVar3 : list3) {
                arrayList.add(st1.a.a(aVar3, aVar3.f115171a && z13));
            }
            this.f52689m0 = arrayList;
            yk2.b bVar = new yk2.b();
            bVar.addAll(this.f52689m0);
            bVar.addAll(collection);
            this.f52688l0 = e0.a(bVar);
        }
        j1 j1Var = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((st1.a) obj).f115171a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            aVar = (st1.a) obj;
        } else {
            aVar = null;
        }
        if (aVar == null || (i1Var = aVar.f115172b) == null) {
            i1Var = i1.f106497c;
        }
        if (this.f52692p0 == null) {
            f0 f0Var = new f0(list2, com.bumptech.glide.c.I(getContext(), vc2.b.cutout_background_gradient));
            f0Var.f68563j = this.f52676J;
            f0Var.invalidateSelf();
            f0Var.f68564k = this.K;
            f0Var.invalidateSelf();
            f0Var.f68556c.setColor(0);
            f0Var.f68566m = Color.alpha(0) / 255.0f;
            f0Var.invalidateSelf();
            a contour = this.L;
            Intrinsics.checkNotNullParameter(contour, "contour");
            f0Var.f68568o = contour;
            Drawable drawable = getDrawable();
            if (drawable != null) {
                f0Var.setBounds(drawable.getBounds());
            }
            f0Var.setCallback(this);
            f0Var.start();
            this.f52692p0 = f0Var;
            invalidate();
        }
        if (z13) {
            if (f13 < 0.0f || f14 < 0.0f) {
                r72.a aVar4 = i1Var.f106499b;
                R2(aVar4, true);
                O2(maskModel);
                if (aVar4 != null) {
                    j1Var = aVar4.f106431a;
                }
            } else {
                Rect i03 = gi2.b.i0(this);
                float f15 = f13 - i03.left;
                float f16 = f14 - i03.top;
                e3(i03.width(), i03.height());
                x0 x0Var = (x0) CollectionsKt.M0(this.f52690n0).iterator();
                if (x0Var.hasNext()) {
                    next = x0Var.next();
                    if (x0Var.hasNext()) {
                        IndexedValue indexedValue = (IndexedValue) next;
                        float hypot = (float) Math.hypot(((Region) indexedValue.f80350b).getBounds().centerX() - f15, ((Region) indexedValue.f80350b).getBounds().centerY() - f16);
                        do {
                            Object next2 = x0Var.next();
                            IndexedValue indexedValue2 = (IndexedValue) next2;
                            float hypot2 = (float) Math.hypot(((Region) indexedValue2.f80350b).getBounds().centerX() - f15, ((Region) indexedValue2.f80350b).getBounds().centerY() - f16);
                            if (Float.compare(hypot, hypot2) > 0) {
                                next = next2;
                                hypot = hypot2;
                            }
                        } while (x0Var.hasNext());
                    }
                } else {
                    next = null;
                }
                IndexedValue indexedValue3 = (IndexedValue) next;
                int i13 = indexedValue3 != null ? indexedValue3.f80349a : -1;
                st1.a aVar5 = (i13 == -1 || !(this.f52688l0.isEmpty() ^ true)) ? null : (st1.a) CollectionsKt.U(i13, this.f52688l0);
                p3(aVar5);
                if (aVar5 != null && (i1Var2 = aVar5.f115172b) != null && (aVar2 = i1Var2.f106499b) != null) {
                    j1Var = aVar2.f106431a;
                }
            }
            if (j1Var != null) {
                float f17 = j1Var.f106508c;
                float f18 = j1Var.f106506a;
                float f19 = j1Var.f106509d;
                float f23 = j1Var.f106507b;
                this.f52680d0 = new RectF(f18, f23, f17 + f18, f19 + f23);
            }
        }
    }

    public final void Z2(l81.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52686j0 = listener;
    }

    public final void b3(boolean z13) {
        this.f52699w0 = z13;
    }

    public final void d3(k listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52685i0 = listener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0571, code lost:
    
        if (r5 != 3) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r1 != 3) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0406  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.view.MaskedWebImageView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e3(int i13, int i14) {
        Path path;
        if (this.f52690n0.isEmpty() || this.M) {
            List<st1.a> list = this.f52688l0;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            for (st1.a aVar : list) {
                RectF rectF = new RectF();
                String str = aVar.f115172b.f106498a;
                if (str != null) {
                    path = kh2.b0.T1(i13, i14, str);
                    path.computeBounds(rectF, true);
                } else {
                    path = new Path();
                }
                Region region = new Region();
                Rect rect = new Rect();
                rectF.roundOut(rect);
                region.setPath(path, new Region(rect));
                arrayList.add(region);
            }
            this.f52690n0 = arrayList;
        }
    }

    public final void g3() {
        f0 f0Var = this.f52692p0;
        if (f0Var != null) {
            f0Var.start();
        }
    }

    public final void h3() {
        f0 f0Var = this.f52692p0;
        if (f0Var != null) {
            f0Var.stop();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable dr2) {
        Intrinsics.checkNotNullParameter(dr2, "dr");
        if (Intrinsics.d(getDrawable(), this.f52692p0)) {
            invalidate();
        } else {
            super.invalidateDrawable(getDrawable());
        }
    }

    public final void j3(RectF objectNormalizedBounds) {
        Intrinsics.checkNotNullParameter(objectNormalizedBounds, "bounds");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c cVar = new c(context);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            cVar.setBounds(drawable.getBounds());
        }
        cVar.setCallback(this);
        this.f52693q0 = cVar;
        cVar.c(true);
        k kVar = this.f52685i0;
        if (kVar != null) {
            i81.c cVar2 = kVar.f82147a.f82177p1;
        }
        A2();
        c cVar3 = this.f52693q0;
        if (cVar3 != null) {
            Intrinsics.checkNotNullParameter(objectNormalizedBounds, "objectNormalizedBounds");
            if (cVar3.getBounds().isEmpty() || cVar3.getBounds().width() <= 0 || cVar3.getBounds().height() <= 0) {
                return;
            }
            float f13 = objectNormalizedBounds.left;
            if (f13 < 0.0f || objectNormalizedBounds.top < 0.0f || objectNormalizedBounds.right > 1.0f || objectNormalizedBounds.bottom > 1.0f) {
                return;
            }
            float height = objectNormalizedBounds.top * cVar3.getBounds().height();
            float width = objectNormalizedBounds.right * cVar3.getBounds().width();
            float height2 = objectNormalizedBounds.bottom * cVar3.getBounds().height();
            cVar3.c(true);
            RectF rectF = new RectF();
            rectF.left = f13 * cVar3.getBounds().width();
            rectF.top = height;
            rectF.right = width;
            rectF.bottom = height2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float f14 = 2;
            float width2 = rectF.width() / f14;
            float height3 = rectF.height() / f14;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new OvershootInterpolator(1.5f));
            ofFloat.addUpdateListener(new ib2.a(width2, height3, centerX, centerY, 1, cVar3));
            ofFloat.start();
            if (cVar3.f72045m) {
                return;
            }
            cVar3.f72045m = true;
            cVar3.f72044l.post(cVar3.f72046n);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g3();
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onDetachedFromWindow();
        this.f52685i0 = null;
        this.f52686j0 = null;
        h3();
        f0 f0Var = this.f52692p0;
        if (f0Var != null) {
            f0Var.f68575v.cancel();
            f0Var.f68576w.cancel();
            f0Var.d();
            f0Var.f68565l = null;
        }
        c cVar = this.f52693q0;
        if (cVar != null) {
            Drawable drawable = cVar.f72040h;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap2 = bitmapDrawable.getBitmap()) != null) {
                bitmap2.recycle();
            }
            Drawable drawable2 = cVar.f72041i;
            BitmapDrawable bitmapDrawable2 = drawable2 instanceof BitmapDrawable ? (BitmapDrawable) drawable2 : null;
            if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
                bitmap.recycle();
            }
            cVar.f72040h = null;
            cVar.f72041i = null;
        }
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, com.makeramen.RoundedImageView, android.widget.ImageView, android.view.View, eo.d
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f52692p0 == null && this.f52693q0 == null) {
            return;
        }
        float paddingStart = getPaddingStart();
        float paddingTop = getPaddingTop();
        int save = canvas.save();
        canvas.translate(paddingStart, paddingTop);
        try {
            Matrix imageMatrix = getImageMatrix();
            Intrinsics.checkNotNullExpressionValue(imageMatrix, "getImageMatrix(...)");
            int save2 = canvas.save();
            canvas.concat(imageMatrix);
            try {
                f0 f0Var = this.f52692p0;
                if (f0Var != null) {
                    f0Var.draw(canvas);
                }
                c cVar = this.f52693q0;
                if (cVar != null) {
                    cVar.b(canvas);
                }
                canvas.restoreToCount(save2);
                canvas.restoreToCount(save);
                if (this.f52694r0) {
                    c cVar2 = this.f52693q0;
                    if (cVar2 == null || (rectF = cVar2.f72039g) == null) {
                        rectF = new RectF();
                    }
                    RectF rectF2 = new RectF(rectF);
                    getImageMatrix().mapRect(rectF2);
                    canvas.save();
                    canvas.setMatrix(new Matrix());
                    c cVar3 = this.f52693q0;
                    if (cVar3 != null) {
                        cVar3.a(canvas, rectF2);
                    }
                    canvas.restore();
                }
            } catch (Throwable th3) {
                canvas.restoreToCount(save2);
                throw th3;
            }
        } catch (Throwable th4) {
            canvas.restoreToCount(save);
            throw th4;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
    }

    public final void p3(st1.a aVar) {
        i1 i1Var;
        Object obj;
        i81.c cVar;
        if (aVar == null) {
            return;
        }
        invalidate();
        Iterator it = this.f52689m0.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i1Var = aVar.f115172b;
            if (!hasNext) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((st1.a) obj).f115172b, i1Var)) {
                    break;
                }
            }
        }
        st1.a aVar2 = (st1.a) obj;
        List list = this.f52689m0;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            boolean z13 = false;
            if (!it2.hasNext()) {
                break;
            }
            st1.a aVar3 = (st1.a) it2.next();
            if (!com.bumptech.glide.d.o0(aVar2 != null ? Boolean.valueOf(aVar2.f115171a) : null) || !this.f52694r0) {
                z13 = Intrinsics.d(aVar3, aVar2);
            }
            arrayList.add(st1.a.a(aVar3, z13));
        }
        this.f52689m0 = arrayList;
        b bVar = this.f52683g0;
        O2(bVar != null ? new b(bVar.f115173a, arrayList) : new b(null, null));
        if (!this.f52694r0 || !Intrinsics.d(aVar, this.f52687k0)) {
            R2(i1Var.f106499b, false);
            this.f52687k0 = aVar;
            return;
        }
        k kVar = this.f52685i0;
        if (kVar != null && (cVar = kVar.f82147a.f82177p1) != null) {
            ((l) cVar).R3();
        }
        this.f52687k0 = null;
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, com.makeramen.RoundedImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        f0 f0Var = this.f52692p0;
        Rect bounds = drawable != null ? drawable.getBounds() : null;
        if (f0Var != null && bounds != null) {
            f0Var.setBounds(bounds);
            invalidate();
        }
        c cVar = this.f52693q0;
        Rect bounds2 = drawable != null ? drawable.getBounds() : null;
        if (cVar != null && bounds2 != null) {
            cVar.setBounds(bounds2);
            invalidate();
        }
        super.setImageDrawable(drawable);
    }
}
