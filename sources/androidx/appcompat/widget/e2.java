package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: g, reason: collision with root package name */
    public static e2 f16552g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f16554a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f16555b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f16556c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16557d;

    /* renamed from: e, reason: collision with root package name */
    public x f16558e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f16551f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final d2 f16553h = new d2(6);

    public static synchronized e2 d() {
        e2 e2Var;
        synchronized (e2.class) {
            try {
                if (f16552g == null) {
                    f16552g = new e2();
                }
                e2Var = f16552g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return e2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i13, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (e2.class) {
            d2 d2Var = f16553h;
            d2Var.getClass();
            int i14 = (31 + i13) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) d2Var.c(Integer.valueOf(mode.hashCode() + i14));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i13, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j13, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                g1.p pVar = (g1.p) this.f16555b.get(context);
                if (pVar == null) {
                    pVar = new g1.p((Object) null);
                    this.f16555b.put(context, pVar);
                }
                pVar.j(j13, new WeakReference(constantState));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void b(Context context, int i13, ColorStateList colorStateList) {
        if (this.f16554a == null) {
            this.f16554a = new WeakHashMap();
        }
        g1.p0 p0Var = (g1.p0) this.f16554a.get(context);
        if (p0Var == null) {
            p0Var = new g1.p0(0);
            this.f16554a.put(context, p0Var);
        }
        p0Var.a(i13, colorStateList);
    }

    public final Drawable c(Context context, int i13) {
        if (this.f16556c == null) {
            this.f16556c = new TypedValue();
        }
        TypedValue typedValue = this.f16556c;
        context.getResources().getValue(i13, typedValue, true);
        long j13 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e13 = e(context, j13);
        if (e13 != null) {
            return e13;
        }
        LayerDrawable layerDrawable = null;
        if (this.f16558e != null) {
            if (i13 == i.e.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{g(context, i.e.abc_cab_background_internal_bg), g(context, i.e.abc_cab_background_top_mtrl_alpha)});
            } else if (i13 == i.e.abc_ratingbar_material) {
                layerDrawable = x.n(this, context, i.d.abc_star_big);
            } else if (i13 == i.e.abc_ratingbar_indicator_material) {
                layerDrawable = x.n(this, context, i.d.abc_star_medium);
            } else if (i13 == i.e.abc_ratingbar_small_material) {
                layerDrawable = x.n(this, context, i.d.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j13, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j13) {
        g1.p pVar = (g1.p) this.f16555b.get(context);
        if (pVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) pVar.c(j13);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            pVar.k(j13);
        }
        return null;
    }

    public final synchronized Drawable f(int i13, Context context, boolean z13) {
        Drawable c13;
        if (!this.f16557d) {
            this.f16557d = true;
            Drawable g13 = g(context, k.a.abc_vector_test);
            if (g13 == null || (!(g13 instanceof va.p) && !"android.graphics.drawable.VectorDrawable".equals(g13.getClass().getName()))) {
                this.f16557d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        c13 = c(context, i13);
        if (c13 == null) {
            Object obj = d5.a.f53679a;
            c13 = context.getDrawable(i13);
        }
        if (c13 != null) {
            ColorStateList i14 = i(context, i13);
            if (i14 != null) {
                c13 = c13.mutate();
                c13.setTintList(i14);
                PorterDuff.Mode j13 = j(i13);
                if (j13 != null) {
                    c13.setTintMode(j13);
                }
            } else {
                if (this.f16558e != null) {
                    if (i13 == i.e.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) c13;
                        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                        int c14 = x2.c(context, i.a.colorControlNormal);
                        PorterDuff.Mode mode = y.f16734b;
                        x.B(findDrawableByLayerId, c14, mode);
                        x.B(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), x2.c(context, i.a.colorControlNormal), mode);
                        x.B(layerDrawable.findDrawableByLayerId(R.id.progress), x2.c(context, i.a.colorControlActivated), mode);
                    } else if (i13 == i.e.abc_ratingbar_material || i13 == i.e.abc_ratingbar_indicator_material || i13 == i.e.abc_ratingbar_small_material) {
                        LayerDrawable layerDrawable2 = (LayerDrawable) c13;
                        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                        int b13 = x2.b(context, i.a.colorControlNormal);
                        PorterDuff.Mode mode2 = y.f16734b;
                        x.B(findDrawableByLayerId2, b13, mode2);
                        x.B(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), x2.c(context, i.a.colorControlActivated), mode2);
                        x.B(layerDrawable2.findDrawableByLayerId(R.id.progress), x2.c(context, i.a.colorControlActivated), mode2);
                    }
                }
                if (!k(i13, context, c13) && z13) {
                    c13 = null;
                }
            }
        }
        if (c13 != null) {
            c1.a(c13);
        }
        return c13;
    }

    public final synchronized Drawable g(Context context, int i13) {
        return f(i13, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i13) {
        ColorStateList colorStateList;
        g1.p0 p0Var;
        WeakHashMap weakHashMap = this.f16554a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (p0Var = (g1.p0) weakHashMap.get(context)) == null) ? null : (ColorStateList) p0Var.g(i13);
        if (colorStateList == null) {
            x xVar = this.f16558e;
            if (xVar != null) {
                colorStateList2 = xVar.o(context, i13);
            }
            if (colorStateList2 != null) {
                b(context, i13, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final PorterDuff.Mode j(int i13) {
        x xVar = this.f16558e;
        if (xVar == null) {
            return null;
        }
        xVar.getClass();
        if (i13 == i.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r8, android.content.Context r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.x r0 = r7.f16558e
            r1 = 0
            if (r0 == 0) goto L68
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.y.f16734b
            java.lang.Object r3 = r0.f16708a
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.x.d(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L18
            int r8 = i.a.colorControlNormal
        L15:
            r3 = r4
        L16:
            r0 = r5
            goto L51
        L18:
            java.lang.Object r3 = r0.f16710c
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.x.d(r3, r8)
            if (r3 == 0) goto L25
            int r8 = i.a.colorControlActivated
            goto L15
        L25:
            java.lang.Object r0 = r0.f16711d
            int[] r0 = (int[]) r0
            boolean r0 = androidx.appcompat.widget.x.d(r0, r8)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L36
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L34:
            r8 = r3
            goto L15
        L36:
            int r0 = i.e.abc_list_divider_mtrl_alpha
            if (r8 != r0) goto L49
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r8
            r8 = r6
            goto L51
        L49:
            int r0 = i.e.abc_dialog_material_background
            if (r8 != r0) goto L4e
            goto L34
        L4e:
            r8 = r1
            r3 = r8
            goto L16
        L51:
            if (r3 == 0) goto L68
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = androidx.appcompat.widget.x2.c(r9, r8)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.y.c(r8, r2)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L67
            r10.setAlpha(r0)
        L67:
            r1 = r4
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e2.k(int, android.content.Context, android.graphics.drawable.Drawable):boolean");
    }
}
