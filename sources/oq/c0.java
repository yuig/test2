package oq;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.um;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.PinchToZoomTransitionContext;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.a4;
import h32.d4;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.z3;
import sf1.e1;
import so.bb;
import v.c2;

/* loaded from: classes3.dex */
public class c0 extends FrameLayout implements sf1.v0, e0, af2.c {
    public static final /* synthetic */ int W = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final nx.d0 E;
    public GestaltSpinner F;
    public final View G;
    public ImageView H;
    public final o I;

    /* renamed from: J, reason: collision with root package name */
    public final xk2.v f96975J;
    public final xk2.v K;
    public final boolean L;
    public final xk2.v M;
    public View.OnClickListener N;
    public View.OnTouchListener O;
    public final float P;
    public final Handler Q;
    public ArrayList R;
    public jq.j S;
    public final uk2.f T;
    public final uk2.f U;
    public final ek2.j V;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f96976a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96977b;

    /* renamed from: c, reason: collision with root package name */
    public final lh0.b0 f96978c;

    /* renamed from: d, reason: collision with root package name */
    public final hf0.c f96979d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f96980e;

    /* renamed from: f, reason: collision with root package name */
    public final yk1.j f96981f;

    /* renamed from: g, reason: collision with root package name */
    public final hs.d f96982g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f96983h;

    /* renamed from: i, reason: collision with root package name */
    public final tb0.h f96984i;

    /* renamed from: j, reason: collision with root package name */
    public final bb f96985j;

    /* renamed from: k, reason: collision with root package name */
    public final is1.f f96986k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f96987l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f96988m;

    /* renamed from: n, reason: collision with root package name */
    public float f96989n;

    /* renamed from: o, reason: collision with root package name */
    public FrameLayout f96990o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.k f96991p;

    /* renamed from: q, reason: collision with root package name */
    public final sp.d f96992q;

    /* renamed from: r, reason: collision with root package name */
    public d4 f96993r;

    /* renamed from: s, reason: collision with root package name */
    public a4 f96994s;

    /* renamed from: t, reason: collision with root package name */
    public final j f96995t;

    /* renamed from: u, reason: collision with root package name */
    public final e1 f96996u;

    /* renamed from: v, reason: collision with root package name */
    public um f96997v;

    /* renamed from: w, reason: collision with root package name */
    public final f30 f96998w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f96999x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f97000y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f97001z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c0(android.content.Context r19, com.pinterest.api.model.f30 r20, boolean r21, java.lang.String r22, oq.d1 r23, nx.d0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c0.<init>(android.content.Context, com.pinterest.api.model.f30, boolean, java.lang.String, oq.d1, nx.d0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(oq.c0 r16, java.util.List r17, int r18, boolean r19, boolean r20, java.lang.String r21, float r22, float r23, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c0.s(oq.c0, java.util.List, int, boolean, boolean, java.lang.String, float, float, boolean, int):void");
    }

    public static void x(c0 c0Var, um umVar, boolean z13, Float f13, boolean z14, int i13) {
        f30 f30Var;
        ViewGroup.LayoutParams layoutParams;
        WebImageView webImageView;
        e0 e0Var;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        Number valueOf;
        ViewGroup.LayoutParams layoutParams4;
        boolean z15 = (i13 & 2) != 0 ? false : z13;
        Float f14 = (i13 & 4) != 0 ? null : f13;
        boolean z16 = (i13 & 16) != 0 ? false : z14;
        if (umVar != null) {
            c0Var.getClass();
            f30Var = umVar.f42584a;
        } else {
            f30Var = null;
        }
        boolean p13 = c0Var.p(f30Var);
        if ((c0Var.j() != null || p13) && umVar != null) {
            if (!Intrinsics.d(umVar, c0Var.f96997v) || z15) {
                c0Var.f96997v = umVar;
                f30 f30Var2 = umVar.f42584a;
                Boolean m53 = f30Var2.m5();
                Intrinsics.checkNotNullExpressionValue(m53, "getIsVideo(...)");
                boolean booleanValue = m53.booleanValue();
                boolean F0 = b40.F0(f30Var2);
                if (b40.D0(f30Var2) || booleanValue || n60.o.B(f30Var2, "getIsPromoted(...)")) {
                    c0Var.f96999x = false;
                }
                if (b40.W0(f30Var2) || F0) {
                    c0Var.f96999x = false;
                    c0Var.B = false;
                }
                if (p13) {
                    c0Var.U.c(new u());
                    return;
                }
                boolean v13 = c0Var.v();
                View view = c0Var.G;
                j jVar = c0Var.f96995t;
                int i14 = umVar.f42587d;
                if (v13 && !c0Var.o() && jVar != null) {
                    float l13 = c0Var.l();
                    int k13 = c0Var.k(umVar);
                    float f15 = i14;
                    int l14 = (int) (f15 * (c0Var.l() / f15));
                    if (!jVar.b()) {
                        Float S0 = bs1.c.S0(l13, f14);
                        if (S0 != null) {
                            k13 = (int) S0.floatValue();
                        }
                        float dimension = jVar.f97063i ? jVar.getResources().getDimension(r80.a.pin_closeup_image_max_height) : jVar.f97058d ? hf0.b.f69003c * 0.45f : 2.1474836E9f;
                        boolean z17 = jVar.f97064j;
                        if (z17) {
                            k13 = Math.min(k13, (int) dimension);
                        }
                        if (z17) {
                            valueOf = f14 != null ? Float.valueOf(f14.floatValue() * k13) : null;
                            if (valueOf == null) {
                                valueOf = Integer.valueOf(l14);
                            }
                        } else {
                            valueOf = Float.valueOf(l13);
                        }
                        WebImageView webImageView2 = jVar.f97065k;
                        int i15 = (webImageView2 == null || (layoutParams4 = webImageView2.getLayoutParams()) == null) ? 0 : layoutParams4.height;
                        if (1 > i15 || i15 > k13 || !jVar.f97057c) {
                            if (webImageView2 != null) {
                                webImageView2.setTranslationX(0.0f);
                            }
                            if (webImageView2 != null) {
                                ViewGroup.LayoutParams layoutParams5 = webImageView2.getLayoutParams();
                                if (layoutParams5 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                                layoutParams5.height = k13;
                                layoutParams5.width = valueOf.intValue();
                                webImageView2.setLayoutParams(layoutParams5);
                            }
                            if (z17 && k13 == ((int) dimension)) {
                                jVar.setBackground(new ColorDrawable(Color.parseColor(f30Var2.i4())));
                            }
                        }
                    }
                    if (view != null) {
                        view.setTranslationX(0.0f);
                    }
                    WebImageView j13 = c0Var.j();
                    if (j13 != null && (layoutParams3 = j13.getLayoutParams()) != null && view != null) {
                        ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                        if (layoutParams6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams6.width = layoutParams3.width;
                        layoutParams6.height = layoutParams3.height;
                        view.setLayoutParams(layoutParams6);
                    }
                }
                if (jVar != null && (webImageView = jVar.f97065k) != null && (!Intrinsics.d(umVar, jVar.f97067m) || z15)) {
                    jVar.f97067m = umVar;
                    jVar.f97070p = false;
                    String pinUid = f30Var2.getUid();
                    Intrinsics.checkNotNullExpressionValue(pinUid, "getUid(...)");
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new jy.e(pinUid).i();
                    boolean m13 = qb0.b.m(Integer.valueOf(i14), Integer.valueOf(webImageView.getLayoutParams().height));
                    boolean z18 = !m13 && webImageView.x2(umVar.f42586c);
                    boolean z19 = (z18 || qb0.b.m(Integer.valueOf(umVar.f42590g), Integer.valueOf(umVar.f42591h)) || !webImageView.x2(umVar.f42589f)) ? false : true;
                    if (!z19 && !z18 && (e0Var = jVar.f97072r) != null) {
                        c0 c0Var2 = (c0) e0Var;
                        if (!c0Var2.o() && c0Var2.F == null) {
                            Context context = c0Var2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            GestaltSpinner gestaltSpinner = new GestaltSpinner(6, context, (AttributeSet) null);
                            c0Var2.c();
                            int i16 = hf0.b.f69003c;
                            WebImageView j14 = c0Var2.j();
                            boolean z23 = ((j14 == null || (layoutParams2 = j14.getLayoutParams()) == null) ? 0 : layoutParams2.height) > i16;
                            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams7.gravity = z23 ? 49 : 17;
                            if (z23) {
                                layoutParams7.setMargins(0, i16 / 2, 0, 0);
                            }
                            gestaltSpinner.setLayoutParams(layoutParams7);
                            dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
                            c0Var2.addView(gestaltSpinner);
                            c0Var2.F = gestaltSpinner;
                        }
                    }
                    if (z19) {
                        jVar.e(false);
                    }
                    if (z18) {
                        jVar.e(true);
                    } else {
                        jVar.post(new c2(m13, umVar, jVar));
                    }
                }
                WebImageView j15 = c0Var.j();
                if (j15 != null && (layoutParams = j15.getLayoutParams()) != null && view != null) {
                    ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
                    if (layoutParams8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams8.width = layoutParams.width;
                    layoutParams8.height = layoutParams.height;
                    view.setLayoutParams(layoutParams8);
                }
                if (booleanValue && !z16 && c0Var.H == null) {
                    ImageView imageView = new ImageView(c0Var.getContext());
                    imageView.setImageResource(q80.a.ic_video_overlay_closeup_nonpds);
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams9.gravity = 17;
                    imageView.setLayoutParams(layoutParams9);
                    c0Var.addView(imageView);
                    c0Var.H = imageView;
                }
            }
        }
    }

    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r4.l("android_visual_search_unified_entry_point_row") == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c0.b():void");
    }

    public final hf0.c c() {
        hf0.c cVar = this.f96979d;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("deviceInfoProvider");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f96976a == null) {
            this.f96976a = new ye2.o(this);
        }
        return this.f96976a;
    }

    public final m60.w d() {
        m60.w wVar = this.f96980e;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r3 = j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r3.dispatchTouchEvent(r8) != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0025, code lost:
    
        if (r7.f97001z != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r8.getPointerCount() < 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r7.f97000y = r3;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = super.dispatchTouchEvent(r8)
            boolean r1 = r7.B
            if (r1 == 0) goto L48
            r1 = 0
            r2 = 1
            int r3 = r8.getPointerCount()     // Catch: java.lang.IllegalArgumentException -> L17
            r4 = 2
            if (r3 >= r4) goto L29
            goto L23
        L17:
            r3 = move-exception
            tb0.h r4 = r7.f96984i
            if (r4 == 0) goto L41
            java.lang.String r5 = "error getting pointer count in dispatchTouchEvent in PinCloseupImageView"
            tb0.p r6 = tb0.p.CLOSEUP
            r4.q(r3, r5, r6)
        L23:
            boolean r3 = r7.f97001z
            if (r3 != 0) goto L29
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            r7.f97000y = r3
            if (r3 != 0) goto L48
            com.pinterest.ui.imageview.WebImageView r3 = r7.j()
            if (r3 == 0) goto L3b
            boolean r8 = r3.dispatchTouchEvent(r8)
            if (r8 != r2) goto L3b
            goto L3d
        L3b:
            if (r0 == 0) goto L3f
        L3d:
            r0 = r2
            goto L48
        L3f:
            r0 = r1
            goto L48
        L41:
            java.lang.String r8 = "crashReporting"
            kotlin.jvm.internal.Intrinsics.r(r8)
            r8 = 0
            throw r8
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final lh0.b0 e() {
        lh0.b0 b0Var = this.f96978c;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final int f() {
        return k(this.f96997v);
    }

    public final int g() {
        um umVar = this.f96997v;
        if (umVar == null) {
            return 0;
        }
        c();
        float f13 = hf0.b.f69002b / umVar.f42587d;
        float f14 = umVar.f42588e;
        float f15 = hf0.b.f69001a;
        return (int) ((f14 / f15) * f13 * f15);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f96976a == null) {
            this.f96976a = new ye2.o(this);
        }
        return this.f96976a.generatedComponent();
    }

    public final f30 getPin() {
        f30 f30Var;
        um umVar = this.f96997v;
        return (umVar == null || (f30Var = umVar.f42584a) == null) ? this.f96998w : f30Var;
    }

    public final um h() {
        return this.f96997v;
    }

    public final pq.d i() {
        return (pq.d) this.M.getValue();
    }

    public final WebImageView j() {
        if (!p(getPin())) {
            j jVar = this.f96995t;
            if (jVar != null) {
                return jVar.f97065k;
            }
            return null;
        }
        e1 e1Var = this.f96996u;
        if (e1Var == null) {
            return null;
        }
        sf1.s C = e1Var.F.C(e1Var.f112558q.f19924d);
        if (C != null) {
            return C.L;
        }
        return null;
    }

    public final int k(um umVar) {
        if (umVar == null) {
            return 0;
        }
        return (int) (umVar.f42588e * (l() / umVar.f42587d));
    }

    public float l() {
        int j13;
        c();
        boolean q13 = hf0.b.q();
        float f13 = this.P;
        if (q13) {
            j13 = com.bumptech.glide.c.G();
        } else {
            c();
            j13 = hf0.b.j(getContext());
        }
        return j13 - (f13 * 2);
    }

    public final boolean m() {
        return ((Boolean) this.f96975J.getValue()).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) this.K.getValue()).booleanValue();
    }

    public final boolean o() {
        WebImageView j13 = j();
        return j13 != null && j13.getVisibility() == 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.G;
        if (view != null) {
            view.setOnClickListener(this.N);
            lh0.b0 e13 = e();
            z3 z3Var = lh0.a4.f83297a;
            g1 g1Var = (g1) e13.f83300a;
            if (g1Var.o("android_image_ctr_removal", "enabled", z3Var) || g1Var.l("android_image_ctr_removal") || e().b()) {
                view.setOnTouchListener(this.O);
            }
            view.setOnLongClickListener(this.f96992q);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        x(this, this.f96997v, true, null, false, 28);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        View view = this.G;
        if (view != null) {
            view.setOnClickListener(null);
            lh0.b0 e13 = e();
            z3 z3Var = lh0.a4.f83297a;
            g1 g1Var = (g1) e13.f83300a;
            if (g1Var.o("android_image_ctr_removal", "enabled", z3Var) || g1Var.l("android_image_ctr_removal") || e().b()) {
                view.setOnTouchListener(null);
            }
            view.setOnLongClickListener(null);
        }
        this.Q.removeCallbacksAndMessages(null);
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            arrayList.clear();
        }
        GestaltSpinner gestaltSpinner = this.F;
        if (gestaltSpinner != null) {
            removeView(gestaltSpinner);
            this.F = null;
        }
        ek2.j jVar = this.V;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        super.onDetachedFromWindow();
    }

    public boolean p(f30 f30Var) {
        return f30Var != null && b40.P0(f30Var);
    }

    @Override // android.view.View
    public final boolean performClick() {
        View.OnClickListener onClickListener = this.N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        return this.N != null;
    }

    public final void q(f30 pin, ArrayList flashlightStelaDots) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(flashlightStelaDots, "flashlightStelaDots");
        if (!this.A || this.R != null || b40.W0(getPin()) || b40.N0(getPin())) {
            return;
        }
        lh0.b0 e13 = e();
        z3 z3Var = lh0.a4.f83298b;
        g1 g1Var = (g1) e13.f83300a;
        if (g1Var.o("android_visual_closeup_entry_point", "enabled", z3Var) || g1Var.l("android_visual_closeup_entry_point")) {
            return;
        }
        this.A = false;
        this.Q.postDelayed(new ja.y(this, pin, flashlightStelaDots, 8), 20L);
    }

    public final void r(List list, int i13, boolean z13, boolean z14, String requestParams, float f13, float f14, boolean z15) {
        PinchToZoomTransitionContext pinchToZoomTransitionContext;
        f30 f30Var;
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        m60.w wVar = m60.u.f85943a;
        new uy.i().i();
        NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.e0.f50675b.getValue());
        boolean z16 = i13 != -1;
        um umVar = this.f96997v;
        if (umVar == null || (f30Var = umVar.f42584a) == null) {
            pinchToZoomTransitionContext = null;
        } else {
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            pinchToZoomTransitionContext = new PinchToZoomTransitionContext(uid, f30Var.z4(), 1.0f, 0, getHeight(), g(), false, null, Float.valueOf(0.0f), true, false, z13, z16, kh2.b0.z0(f30Var), z14, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        w13.y0(pinchToZoomTransitionContext, "com.pinterest.PINCH_TO_ZOOM_TRANSITION");
        if (list != null) {
            w13.y0(list, "com.pinterest.EXTRA_VISUAL_OBJECT_DATA");
        }
        if (z16) {
            w13.z(i13, "com.pinterest.EXTRA_FLASHLIGHT_DOT_INDEX");
        }
        if (requestParams.length() > 0) {
            w13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", requestParams);
        }
        if (f13 >= 0.0f && f14 >= 0.0f) {
            Intrinsics.checkNotNullParameter("x", "key");
            Bundle bundle = w13.f49942d;
            bundle.putFloat("x", f13);
            Intrinsics.checkNotNullParameter("y", "key");
            bundle.putFloat("y", f14);
        }
        w13.Y1("com.pinterest.EXTRA_FROM_IMAGE_CLICK_INTO_IMAGE_SEARCH", z15);
        wVar.d(w13);
    }

    public final void t(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!this.D && z13) {
            Intrinsics.checkNotNullParameter(pin, "<this>");
            if (b40.N0(pin) || j1.a1(pin)) {
                nx.d0 d0Var = this.E;
                if (d0Var != null) {
                    f1 f1Var = f1.PIN_TAGS_LOAD;
                    String uid = pin.getUid();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    nm.u uVar = new nm.u();
                    uVar.u("pin_is_shop_the_look", String.valueOf(b40.N0(pin)));
                    uVar.u("pin_is_stela", String.valueOf(j1.a1(pin)));
                    HashMap hashMap = new HashMap();
                    String sVar = uVar.toString();
                    Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                    hashMap.put("commerce_data", sVar);
                    d0Var.g(f1Var, uid, hashMap, false);
                }
                this.D = true;
            }
        }
        if (z13) {
            i().b();
            return;
        }
        s71.l lVar = i().f100979l;
        if (!(lVar instanceof s71.l)) {
            lVar = null;
        }
        if (lVar == null || !lVar.f111382k) {
            return;
        }
        if (lVar.f111383l) {
            lVar.c().d();
        } else {
            lVar.b().f2();
        }
    }

    public final void u(jq.j jVar, int i13) {
        if (i13 >= 2500 || jVar == null) {
            return;
        }
        this.S = jVar;
        WebImageView j13 = j();
        if (j13 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j13.G = new o80.k(context, jVar);
        }
    }

    public boolean v() {
        return !p(getPin());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(pq.d r6, float r7) {
        /*
            r5 = this;
            r5.f96989n = r7
            r0 = 0
            if (r6 != 0) goto L6
            return r0
        L6:
            int[] r1 = r5.f96987l
            r5.getLocationOnScreen(r1)
            r2 = 1
            r1 = r1[r2]
            float r1 = (float) r1
            int r3 = r5.getHeight()
            float r3 = (float) r3
            float r1 = r1 + r3
            r5.c()
            boolean r3 = hf0.b.m()
            if (r3 == 0) goto L29
            r5.c()
            boolean r3 = hf0.b.q()
            if (r3 == 0) goto L29
            r3 = r2
            goto L2a
        L29:
            r3 = r0
        L2a:
            r4 = 0
            if (r3 != 0) goto L40
            boolean r3 = r5.m()
            if (r3 != 0) goto L40
            boolean r3 = r5.n()
            if (r3 == 0) goto L3a
            goto L40
        L3a:
            float r7 = r7 - r1
            float r4 = java.lang.Math.min(r7, r4)
            goto L50
        L40:
            android.app.Activity r7 = bs1.c.l0(r5)
            if (r7 == 0) goto L50
            int r7 = hf0.b.d(r7)
            float r7 = (float) r7
            float r7 = r7 - r1
            float r4 = java.lang.Math.min(r7, r4)
        L50:
            float r7 = java.lang.Math.abs(r4)
            int r1 = r5.getHeight()
            float r1 = (float) r1
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L5e
            return r0
        L5e:
            r6.setTranslationY(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c0.w(pq.d, float):boolean");
    }
}
