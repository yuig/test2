package androidx.media3.ui;

import a7.a1;
import a7.b1;
import a7.z0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated
/* loaded from: classes.dex */
public class LegacyPlayerControlView extends FrameLayout {

    /* renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f18906b0 = 0;
    public final Drawable A;
    public final float B;
    public final float C;
    public final String D;
    public final String E;
    public a7.v0 F;
    public boolean G;
    public final boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f18907J;
    public final int K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public long R;
    public long[] S;
    public boolean[] T;
    public final long[] U;
    public final boolean[] V;
    public long W;

    /* renamed from: a, reason: collision with root package name */
    public final e f18908a;

    /* renamed from: a0, reason: collision with root package name */
    public long f18909a0;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f18910b;

    /* renamed from: c, reason: collision with root package name */
    public final View f18911c;

    /* renamed from: d, reason: collision with root package name */
    public final View f18912d;

    /* renamed from: e, reason: collision with root package name */
    public final View f18913e;

    /* renamed from: f, reason: collision with root package name */
    public final View f18914f;

    /* renamed from: g, reason: collision with root package name */
    public final View f18915g;

    /* renamed from: h, reason: collision with root package name */
    public final View f18916h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f18917i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f18918j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f18919k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f18920l;

    /* renamed from: m, reason: collision with root package name */
    public final t0 f18921m;

    /* renamed from: n, reason: collision with root package name */
    public final StringBuilder f18922n;

    /* renamed from: o, reason: collision with root package name */
    public final Formatter f18923o;

    /* renamed from: p, reason: collision with root package name */
    public final z0 f18924p;

    /* renamed from: q, reason: collision with root package name */
    public final a1 f18925q;

    /* renamed from: r, reason: collision with root package name */
    public final d f18926r;

    /* renamed from: s, reason: collision with root package name */
    public final d f18927s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f18928t;

    /* renamed from: u, reason: collision with root package name */
    public final Drawable f18929u;

    /* renamed from: v, reason: collision with root package name */
    public final Drawable f18930v;

    /* renamed from: w, reason: collision with root package name */
    public final String f18931w;

    /* renamed from: x, reason: collision with root package name */
    public final String f18932x;

    /* renamed from: y, reason: collision with root package name */
    public final String f18933y;

    /* renamed from: z, reason: collision with root package name */
    public final Drawable f18934z;

    static {
        a7.j0.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a7.v0 v0Var = this.F;
        if (v0Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (v0Var.L() != 4) {
                    v0Var.T();
                }
            } else if (keyCode == 89) {
                v0Var.U();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (d7.n0.i0(v0Var, this.H)) {
                        d7.n0.N(v0Var);
                    } else if (v0Var.r(1)) {
                        v0Var.pause();
                    }
                } else if (keyCode == 87) {
                    v0Var.x();
                } else if (keyCode == 88) {
                    v0Var.m();
                } else if (keyCode == 126) {
                    d7.n0.N(v0Var);
                } else if (keyCode == 127) {
                    int i13 = d7.n0.f53866a;
                    if (v0Var.r(1)) {
                        v0Var.pause();
                    }
                }
            }
        }
        return true;
    }

    public final int b() {
        return this.f18907J;
    }

    public final void c() {
        if (e()) {
            setVisibility(8);
            Iterator it = this.f18910b.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                getVisibility();
                fVar.getClass();
                fVar.f19035c.G();
            }
            removeCallbacks(this.f18926r);
            removeCallbacks(this.f18927s);
            this.R = -9223372036854775807L;
        }
    }

    public final void d() {
        d dVar = this.f18927s;
        removeCallbacks(dVar);
        if (this.f18907J <= 0) {
            this.R = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j13 = this.f18907J;
        this.R = uptimeMillis + j13;
        if (this.G) {
            postDelayed(dVar, j13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f18927s);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        return getVisibility() == 0;
    }

    public final void f() {
        View view;
        View view2;
        boolean i03 = d7.n0.i0(this.F, this.H);
        if (i03 && (view2 = this.f18913e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (i03 || (view = this.f18914f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    public void g(a7.v0 v0Var) {
        bf.b.t(Looper.myLooper() == Looper.getMainLooper());
        bf.b.i(v0Var == null || v0Var.w() == Looper.getMainLooper());
        a7.v0 v0Var2 = this.F;
        if (v0Var2 == v0Var) {
            return;
        }
        e eVar = this.f18908a;
        if (v0Var2 != null) {
            v0Var2.j(eVar);
        }
        this.F = v0Var;
        if (v0Var != null) {
            v0Var.M(eVar);
        }
        j();
        i();
        l();
        m();
        n();
    }

    public final void h(View view, boolean z13, boolean z14) {
        if (view == null) {
            return;
        }
        view.setEnabled(z14);
        view.setAlpha(z14 ? this.B : this.C);
        view.setVisibility(z13 ? 0 : 8);
    }

    public final void i() {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        if (e() && this.G) {
            a7.v0 v0Var = this.F;
            if (v0Var != null) {
                z13 = v0Var.r(5);
                z15 = v0Var.r(7);
                z16 = v0Var.r(11);
                z17 = v0Var.r(12);
                z14 = v0Var.r(9);
            } else {
                z13 = false;
                z14 = false;
                z15 = false;
                z16 = false;
                z17 = false;
            }
            h(this.f18911c, this.O, z15);
            h(this.f18916h, this.M, z16);
            h(this.f18915g, this.N, z17);
            h(this.f18912d, this.P, z14);
            t0 t0Var = this.f18921m;
            if (t0Var != null) {
                t0Var.setEnabled(z13);
            }
        }
    }

    public final void j() {
        boolean z13;
        boolean z14;
        if (e() && this.G) {
            boolean i03 = d7.n0.i0(this.F, this.H);
            View view = this.f18913e;
            if (view != null) {
                z13 = !i03 && view.isFocused();
                z14 = !i03 && view.isAccessibilityFocused();
                view.setVisibility(i03 ? 0 : 8);
            } else {
                z13 = false;
                z14 = false;
            }
            View view2 = this.f18914f;
            if (view2 != null) {
                z13 |= i03 && view2.isFocused();
                z14 |= i03 && view2.isAccessibilityFocused();
                view2.setVisibility(i03 ? 8 : 0);
            }
            if (z13) {
                boolean i04 = d7.n0.i0(this.F, this.H);
                if (i04 && view != null) {
                    view.requestFocus();
                } else if (!i04 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z14) {
                f();
            }
        }
    }

    public final void k() {
        long j13;
        long j14;
        if (e() && this.G) {
            a7.v0 v0Var = this.F;
            if (v0Var != null) {
                j13 = v0Var.I() + this.W;
                j14 = v0Var.S() + this.W;
            } else {
                j13 = 0;
                j14 = 0;
            }
            boolean z13 = j13 != this.f18909a0;
            this.f18909a0 = j13;
            TextView textView = this.f18920l;
            if (textView != null && !this.I && z13) {
                textView.setText(d7.n0.I(this.f18922n, this.f18923o, j13));
            }
            t0 t0Var = this.f18921m;
            if (t0Var != null) {
                t0Var.a(j13);
                ((DefaultTimeBar) t0Var).j(j14);
            }
            d dVar = this.f18926r;
            removeCallbacks(dVar);
            int L = v0Var == null ? 1 : v0Var.L();
            if (v0Var != null && v0Var.f()) {
                long min = Math.min(t0Var != null ? ((DefaultTimeBar) t0Var).f() : 1000L, 1000 - (j13 % 1000));
                float f13 = v0Var.d().f1164a;
                postDelayed(dVar, d7.n0.j(f13 > 0.0f ? (long) (min / f13) : 1000L, this.K, 1000L));
            } else {
                if (L == 4 || L == 1) {
                    return;
                }
                postDelayed(dVar, 1000L);
            }
        }
    }

    public final void l() {
        ImageView imageView;
        if (e() && this.G && (imageView = this.f18917i) != null) {
            if (this.L == 0) {
                h(imageView, false, false);
                return;
            }
            a7.v0 v0Var = this.F;
            String str = this.f18931w;
            Drawable drawable = this.f18928t;
            if (v0Var == null) {
                h(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            h(imageView, true, true);
            int Q = v0Var.Q();
            if (Q == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (Q == 1) {
                imageView.setImageDrawable(this.f18929u);
                imageView.setContentDescription(this.f18932x);
            } else if (Q == 2) {
                imageView.setImageDrawable(this.f18930v);
                imageView.setContentDescription(this.f18933y);
            }
            imageView.setVisibility(0);
        }
    }

    public final void m() {
        ImageView imageView;
        if (e() && this.G && (imageView = this.f18918j) != null) {
            a7.v0 v0Var = this.F;
            if (!this.Q) {
                h(imageView, false, false);
                return;
            }
            String str = this.E;
            Drawable drawable = this.A;
            if (v0Var == null) {
                h(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            h(imageView, true, true);
            if (v0Var.R()) {
                drawable = this.f18934z;
            }
            imageView.setImageDrawable(drawable);
            if (v0Var.R()) {
                str = this.D;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void n() {
        long j13;
        int i13;
        a7.v0 v0Var = this.F;
        if (v0Var == null) {
            return;
        }
        this.W = 0L;
        b1 v13 = v0Var.v();
        boolean z13 = false;
        if (v13.q()) {
            j13 = 0;
            i13 = 0;
        } else {
            int N = v0Var.N();
            int i14 = N;
            long j14 = 0;
            i13 = 0;
            while (i14 <= N) {
                if (i14 == N) {
                    this.W = d7.n0.o0(j14);
                }
                a1 a1Var = this.f18925q;
                v13.o(i14, a1Var);
                long j15 = -9223372036854775807L;
                if (a1Var.f941m == -9223372036854775807L) {
                    break;
                }
                int i15 = a1Var.f942n;
                while (i15 <= a1Var.f943o) {
                    z0 z0Var = this.f18924p;
                    v13.g(i15, z0Var, z13);
                    a7.b bVar = z0Var.f1257g;
                    int i16 = bVar.f951e;
                    while (i16 < bVar.f948b) {
                        long d2 = z0Var.d(i16);
                        if (d2 == Long.MIN_VALUE) {
                            d2 = z0Var.f1254d;
                            if (d2 == j15) {
                                i16++;
                                j15 = -9223372036854775807L;
                            }
                        }
                        long j16 = d2 + z0Var.f1255e;
                        if (j16 >= 0) {
                            long[] jArr = this.S;
                            if (i13 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.S = Arrays.copyOf(jArr, length);
                                this.T = Arrays.copyOf(this.T, length);
                            }
                            this.S[i13] = d7.n0.o0(j16 + j14);
                            this.T[i13] = z0Var.l(i16);
                            i13++;
                        }
                        i16++;
                        j15 = -9223372036854775807L;
                    }
                    i15++;
                    z13 = false;
                    j15 = -9223372036854775807L;
                }
                j14 += a1Var.f941m;
                i14++;
                z13 = false;
            }
            j13 = j14;
        }
        long o03 = d7.n0.o0(j13);
        TextView textView = this.f18919k;
        if (textView != null) {
            textView.setText(d7.n0.I(this.f18922n, this.f18923o, o03));
        }
        t0 t0Var = this.f18921m;
        if (t0Var != null) {
            t0Var.b(o03);
            long[] jArr2 = this.U;
            int length2 = jArr2.length;
            int i17 = i13 + length2;
            long[] jArr3 = this.S;
            if (i17 > jArr3.length) {
                this.S = Arrays.copyOf(jArr3, i17);
                this.T = Arrays.copyOf(this.T, i17);
            }
            System.arraycopy(jArr2, 0, this.S, i13, length2);
            System.arraycopy(this.V, 0, this.T, i13, length2);
            ((DefaultTimeBar) t0Var).i(this.S, this.T, i17);
        }
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        long j13 = this.R;
        if (j13 != -9223372036854775807L) {
            long uptimeMillis = j13 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.f18927s, uptimeMillis);
            }
        } else if (e()) {
            d();
        }
        j();
        i();
        l();
        m();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        removeCallbacks(this.f18926r);
        removeCallbacks(this.f18927s);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.media3.ui.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.media3.ui.d] */
    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i13, AttributeSet attributeSet2) {
        super(context, attributeSet, i13);
        int i14 = j0.exo_legacy_player_control_view;
        final int i15 = 1;
        this.H = true;
        this.f18907J = 5000;
        final int i16 = 0;
        this.L = 0;
        this.K = 200;
        this.R = -9223372036854775807L;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, m0.LegacyPlayerControlView, i13, 0);
            try {
                this.f18907J = obtainStyledAttributes.getInt(m0.LegacyPlayerControlView_show_timeout, this.f18907J);
                i14 = obtainStyledAttributes.getResourceId(m0.LegacyPlayerControlView_controller_layout_id, i14);
                this.L = obtainStyledAttributes.getInt(m0.LegacyPlayerControlView_repeat_toggle_modes, 0);
                this.M = obtainStyledAttributes.getBoolean(m0.LegacyPlayerControlView_show_rewind_button, true);
                this.N = obtainStyledAttributes.getBoolean(m0.LegacyPlayerControlView_show_fastforward_button, true);
                this.O = obtainStyledAttributes.getBoolean(m0.LegacyPlayerControlView_show_previous_button, true);
                this.P = obtainStyledAttributes.getBoolean(m0.LegacyPlayerControlView_show_next_button, true);
                this.Q = obtainStyledAttributes.getBoolean(m0.LegacyPlayerControlView_show_shuffle_button, false);
                this.K = d7.n0.i(obtainStyledAttributes.getInt(m0.LegacyPlayerControlView_time_bar_min_update_interval, this.K), 16, 1000);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f18910b = new CopyOnWriteArrayList();
        this.f18924p = new z0();
        this.f18925q = new a1();
        StringBuilder sb3 = new StringBuilder();
        this.f18922n = sb3;
        this.f18923o = new Formatter(sb3, Locale.getDefault());
        this.S = new long[0];
        this.T = new boolean[0];
        this.U = new long[0];
        this.V = new boolean[0];
        e eVar = new e(this);
        this.f18908a = eVar;
        this.f18926r = new Runnable(this) { // from class: androidx.media3.ui.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyPlayerControlView f19031b;

            {
                this.f19031b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i17 = i16;
                LegacyPlayerControlView legacyPlayerControlView = this.f19031b;
                switch (i17) {
                    case 0:
                        int i18 = LegacyPlayerControlView.f18906b0;
                        legacyPlayerControlView.k();
                        break;
                    default:
                        legacyPlayerControlView.c();
                        break;
                }
            }
        };
        this.f18927s = new Runnable(this) { // from class: androidx.media3.ui.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyPlayerControlView f19031b;

            {
                this.f19031b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i17 = i15;
                LegacyPlayerControlView legacyPlayerControlView = this.f19031b;
                switch (i17) {
                    case 0:
                        int i18 = LegacyPlayerControlView.f18906b0;
                        legacyPlayerControlView.k();
                        break;
                    default:
                        legacyPlayerControlView.c();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(i14, this);
        setDescendantFocusability(262144);
        t0 t0Var = (t0) findViewById(h0.exo_progress);
        View findViewById = findViewById(h0.exo_progress_placeholder);
        if (t0Var != null) {
            this.f18921m = t0Var;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, attributeSet2, (Object) null);
            defaultTimeBar.setId(h0.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f18921m = defaultTimeBar;
        } else {
            this.f18921m = null;
        }
        this.f18919k = (TextView) findViewById(h0.exo_duration);
        this.f18920l = (TextView) findViewById(h0.exo_position);
        t0 t0Var2 = this.f18921m;
        if (t0Var2 != null) {
            ((DefaultTimeBar) t0Var2).c(eVar);
        }
        View findViewById2 = findViewById(h0.exo_play);
        this.f18913e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(eVar);
        }
        View findViewById3 = findViewById(h0.exo_pause);
        this.f18914f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(eVar);
        }
        View findViewById4 = findViewById(h0.exo_prev);
        this.f18911c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(eVar);
        }
        View findViewById5 = findViewById(h0.exo_next);
        this.f18912d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(eVar);
        }
        View findViewById6 = findViewById(h0.exo_rew);
        this.f18916h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(eVar);
        }
        View findViewById7 = findViewById(h0.exo_ffwd);
        this.f18915g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(eVar);
        }
        ImageView imageView = (ImageView) findViewById(h0.exo_repeat_toggle);
        this.f18917i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(eVar);
        }
        ImageView imageView2 = (ImageView) findViewById(h0.exo_shuffle);
        this.f18918j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(eVar);
        }
        View findViewById8 = findViewById(h0.exo_vr);
        if (findViewById8 != null) {
            findViewById8.setVisibility(8);
        }
        h(findViewById8, false, false);
        Resources resources = context.getResources();
        this.B = resources.getInteger(i0.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.C = resources.getInteger(i0.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f18928t = resources.getDrawable(f0.exo_legacy_controls_repeat_off, context.getTheme());
        this.f18929u = resources.getDrawable(f0.exo_legacy_controls_repeat_one, context.getTheme());
        this.f18930v = resources.getDrawable(f0.exo_legacy_controls_repeat_all, context.getTheme());
        this.f18934z = resources.getDrawable(f0.exo_legacy_controls_shuffle_on, context.getTheme());
        this.A = resources.getDrawable(f0.exo_legacy_controls_shuffle_off, context.getTheme());
        this.f18931w = resources.getString(k0.exo_controls_repeat_off_description);
        this.f18932x = resources.getString(k0.exo_controls_repeat_one_description);
        this.f18933y = resources.getString(k0.exo_controls_repeat_all_description);
        this.D = resources.getString(k0.exo_controls_shuffle_on_description);
        this.E = resources.getString(k0.exo_controls_shuffle_off_description);
        this.f18909a0 = -9223372036854775807L;
    }
}
