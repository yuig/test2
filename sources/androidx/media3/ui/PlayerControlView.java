package androidx.media3.ui;

import a7.z0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import java.util.Collections;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] U;
    public final Drawable A;
    public final Drawable B;
    public final Drawable C;
    public final String D;
    public final Drawable E;
    public final float F;
    public final float G;
    public final String H;
    public final Drawable I;

    /* renamed from: J */
    public final Drawable f18956J;
    public final String K;
    public final String L;
    public boolean M;
    public boolean N;
    public final boolean O;
    public boolean P;
    public int Q;
    public final int R;
    public final int S;
    public boolean T;

    /* renamed from: a */
    public final x f18957a;

    /* renamed from: b */
    public final Resources f18958b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f18959c;

    /* renamed from: d */
    public final RecyclerView f18960d;

    /* renamed from: e */
    public final n f18961e;

    /* renamed from: f */
    public final l f18962f;

    /* renamed from: g */
    public final i f18963g;

    /* renamed from: h */
    public final i f18964h;

    /* renamed from: i */
    public final PopupWindow f18965i;

    /* renamed from: j */
    public final int f18966j;

    /* renamed from: k */
    public final ImageView f18967k;

    /* renamed from: l */
    public final ImageView f18968l;

    /* renamed from: m */
    public final ImageView f18969m;

    /* renamed from: n */
    public final View f18970n;

    /* renamed from: o */
    public final View f18971o;

    /* renamed from: p */
    public final ImageView f18972p;

    /* renamed from: q */
    public final ImageView f18973q;

    /* renamed from: r */
    public final ImageView f18974r;

    /* renamed from: s */
    public final ImageView f18975s;

    /* renamed from: t */
    public final ImageView f18976t;

    /* renamed from: u */
    public final View f18977u;

    /* renamed from: v */
    public final TextView f18978v;

    /* renamed from: w */
    public final t0 f18979w;

    /* renamed from: x */
    public final StringBuilder f18980x;

    /* renamed from: y */
    public final Formatter f18981y;

    /* renamed from: z */
    public final u0.n f18982z;

    static {
        a7.j0.a("media3.ui");
        U = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(b2 b2Var, View view) {
        this.f18960d.H2(b2Var);
        i();
        this.T = false;
        PopupWindow popupWindow = this.f18965i;
        popupWindow.dismiss();
        this.T = true;
        int width = getWidth() - popupWindow.getWidth();
        int i13 = this.f18966j;
        popupWindow.showAsDropDown(view, width - i13, (-popupWindow.getHeight()) - i13);
    }

    public final boolean b() {
        x xVar = this.f18957a;
        return xVar.f19141z == 0 && xVar.f19116a.c();
    }

    public final boolean c() {
        return getVisibility() == 0;
    }

    public final void d(View view, boolean z13) {
        if (view == null) {
            return;
        }
        view.setEnabled(z13);
        view.setAlpha(z13 ? this.F : this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (c() && this.N) {
            d(this.f18967k, false);
            d(this.f18971o, false);
            d(this.f18970n, false);
            d(this.f18968l, false);
            t0 t0Var = this.f18979w;
            if (t0Var != null) {
                t0Var.setEnabled(false);
            }
        }
    }

    public final void f() {
        ImageView imageView;
        if (c() && this.N && (imageView = this.f18969m) != null) {
            boolean i03 = d7.n0.i0(null, this.O);
            Drawable drawable = i03 ? this.A : this.B;
            int i13 = i03 ? k0.exo_controls_play_description : k0.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f18958b.getString(i13));
            d(imageView, false);
        }
    }

    public final void g() {
        if (c() && this.N) {
            TextView textView = this.f18978v;
            if (textView != null && !this.P) {
                textView.setText(d7.n0.I(this.f18980x, this.f18981y, 0L));
            }
            t0 t0Var = this.f18979w;
            if (t0Var != null) {
                t0Var.a(0L);
                ((DefaultTimeBar) t0Var).j(0L);
            }
            removeCallbacks(this.f18982z);
        }
    }

    public final void h() {
        ImageView imageView;
        if (c() && this.N && (imageView = this.f18972p) != null) {
            if (this.S == 0) {
                d(imageView, false);
                return;
            }
            d(imageView, false);
            imageView.setImageDrawable(this.C);
            imageView.setContentDescription(this.D);
        }
    }

    public final void i() {
        RecyclerView recyclerView = this.f18960d;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i13 = this.f18966j;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i13 * 2));
        PopupWindow popupWindow = this.f18965i;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i13 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void j() {
        ImageView imageView;
        if (c() && this.N && (imageView = this.f18973q) != null) {
            if (!this.f18957a.f19140y.contains(imageView)) {
                d(imageView, false);
                return;
            }
            d(imageView, false);
            imageView.setImageDrawable(this.E);
            imageView.setContentDescription(this.H);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x xVar = this.f18957a;
        xVar.f19116a.addOnLayoutChangeListener(xVar.f19139x);
        this.N = true;
        if (b()) {
            xVar.g();
        }
        f();
        e();
        h();
        j();
        i iVar = this.f18963g;
        iVar.getClass();
        iVar.f19102d = Collections.emptyList();
        i iVar2 = this.f18964h;
        iVar2.getClass();
        iVar2.f19102d = Collections.emptyList();
        d(this.f18974r, iVar.e() > 0);
        n nVar = this.f18961e;
        nVar.getClass();
        nVar.f19058g.getClass();
        d(this.f18977u, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x xVar = this.f18957a;
        xVar.f19116a.removeOnLayoutChangeListener(xVar.f19139x);
        this.N = false;
        removeCallbacks(this.f18982z);
        xVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        View view = this.f18957a.f19117b;
        if (view != null) {
            view.layout(0, 0, i15 - i13, i16 - i14);
        }
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i13, AttributeSet attributeSet2) {
        super(context, attributeSet, i13);
        int i14;
        final PlayerControlView playerControlView;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i33;
        boolean z18;
        boolean z19;
        boolean z23;
        int i34;
        int i35;
        j jVar;
        boolean z24;
        int i36;
        ImageView imageView;
        int i37;
        boolean z25;
        int i38;
        boolean z26;
        PlayerControlView playerControlView2;
        j jVar2;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        int resourceId5;
        int resourceId6;
        int resourceId7;
        int resourceId8;
        int resourceId9;
        int resourceId10;
        int resourceId11;
        int resourceId12;
        int resourceId13;
        int resourceId14;
        int resourceId15;
        int i39 = j0.exo_player_control_view;
        int i43 = f0.exo_styled_controls_play;
        int i44 = f0.exo_styled_controls_pause;
        int i45 = f0.exo_styled_controls_next;
        int i46 = f0.exo_styled_controls_simple_fastforward;
        int i47 = f0.exo_styled_controls_previous;
        int i48 = f0.exo_styled_controls_simple_rewind;
        int i49 = f0.exo_styled_controls_fullscreen_exit;
        int i53 = f0.exo_styled_controls_fullscreen_enter;
        int i54 = f0.exo_styled_controls_repeat_off;
        int i55 = f0.exo_styled_controls_repeat_one;
        int i56 = f0.exo_styled_controls_repeat_all;
        int i57 = f0.exo_styled_controls_shuffle_on;
        int i58 = f0.exo_styled_controls_shuffle_off;
        int i59 = f0.exo_styled_controls_subtitle_on;
        int i63 = f0.exo_styled_controls_subtitle_off;
        int i64 = f0.exo_styled_controls_vr;
        this.O = true;
        this.Q = 5000;
        this.S = 0;
        this.R = 200;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, m0.PlayerControlView, i13, 0);
            try {
                resourceId = obtainStyledAttributes.getResourceId(m0.PlayerControlView_controller_layout_id, i39);
                resourceId2 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_play_icon, i43);
                i44 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_pause_icon, i44);
                resourceId3 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_next_icon, i45);
                resourceId4 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_fastforward_icon, i46);
                resourceId5 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_previous_icon, i47);
                resourceId6 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_rewind_icon, i48);
                resourceId7 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_fullscreen_exit_icon, i49);
                resourceId8 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_fullscreen_enter_icon, i53);
                i54 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_repeat_off_icon, i54);
                resourceId9 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_repeat_one_icon, i55);
                resourceId10 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_repeat_all_icon, i56);
                resourceId11 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_shuffle_on_icon, i57);
                resourceId12 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_shuffle_off_icon, i58);
                resourceId13 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_subtitle_on_icon, i59);
                resourceId14 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_subtitle_off_icon, i63);
                resourceId15 = obtainStyledAttributes.getResourceId(m0.PlayerControlView_vr_icon, i64);
                playerControlView = this;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                playerControlView.Q = obtainStyledAttributes.getInt(m0.PlayerControlView_show_timeout, playerControlView.Q);
                playerControlView.S = obtainStyledAttributes.getInt(m0.PlayerControlView_repeat_toggle_modes, 0);
                boolean z27 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_show_rewind_button, true);
                boolean z28 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_show_fastforward_button, true);
                boolean z29 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_show_previous_button, true);
                boolean z33 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_show_next_button, true);
                boolean z34 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_show_shuffle_button, false);
                boolean z35 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_show_subtitle_button, false);
                boolean z36 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_show_vr_button, false);
                playerControlView.R = d7.n0.i(obtainStyledAttributes.getInt(m0.PlayerControlView_time_bar_min_update_interval, playerControlView.R), 16, 1000);
                boolean z37 = obtainStyledAttributes.getBoolean(m0.PlayerControlView_animation_enabled, true);
                obtainStyledAttributes.recycle();
                i25 = resourceId;
                i16 = resourceId13;
                z17 = z37;
                i17 = resourceId9;
                i18 = resourceId10;
                i19 = resourceId11;
                i23 = resourceId12;
                i24 = resourceId14;
                i14 = resourceId3;
                i15 = resourceId15;
                z13 = z27;
                z18 = z28;
                z14 = z34;
                z15 = z35;
                z16 = z36;
                i26 = resourceId4;
                i27 = resourceId5;
                i28 = resourceId6;
                i29 = resourceId7;
                i33 = resourceId8;
                z19 = z29;
                z23 = z33;
                i34 = resourceId2;
            } catch (Throwable th4) {
                th = th4;
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i14 = i45;
            playerControlView = this;
            i15 = i64;
            i16 = i59;
            i17 = i55;
            i18 = i56;
            i19 = i57;
            i23 = i58;
            i24 = i63;
            z13 = true;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = true;
            i25 = i39;
            i26 = i46;
            i27 = i47;
            i28 = i48;
            i29 = i49;
            i33 = i53;
            z18 = true;
            z19 = true;
            z23 = true;
            i34 = i43;
        }
        int i65 = i54;
        int i66 = i44;
        LayoutInflater.from(context).inflate(i25, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        j jVar3 = new j(playerControlView);
        playerControlView.f18959c = new CopyOnWriteArrayList();
        new z0();
        StringBuilder sb3 = new StringBuilder();
        playerControlView.f18980x = sb3;
        int i67 = i33;
        playerControlView.f18981y = new Formatter(sb3, Locale.getDefault());
        playerControlView.f18982z = new u0.n(playerControlView, 23);
        playerControlView.f18978v = (TextView) playerControlView.findViewById(h0.exo_position);
        ImageView imageView2 = (ImageView) playerControlView.findViewById(h0.exo_subtitle);
        playerControlView.f18974r = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(jVar3);
        }
        ImageView imageView3 = (ImageView) playerControlView.findViewById(h0.exo_fullscreen);
        playerControlView.f18975s = imageView3;
        final int i68 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(playerControlView) { // from class: androidx.media3.ui.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlayerControlView f19037b;

            {
                this.f19037b = playerControlView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i69 = i68;
                PlayerControlView playerControlView3 = this.f19037b;
                switch (i69) {
                    case 0:
                        boolean z38 = playerControlView3.M;
                        boolean z39 = !z38;
                        if (z38 != z39) {
                            playerControlView3.M = z39;
                            String str = playerControlView3.L;
                            Drawable drawable = playerControlView3.f18956J;
                            String str2 = playerControlView3.K;
                            Drawable drawable2 = playerControlView3.I;
                            ImageView imageView4 = playerControlView3.f18975s;
                            if (imageView4 != null) {
                                if (z39) {
                                    imageView4.setImageDrawable(drawable2);
                                    imageView4.setContentDescription(str2);
                                } else {
                                    imageView4.setImageDrawable(drawable);
                                    imageView4.setContentDescription(str);
                                }
                            }
                            ImageView imageView5 = playerControlView3.f18976t;
                            if (imageView5 != null) {
                                if (!z39) {
                                    imageView5.setImageDrawable(drawable);
                                    imageView5.setContentDescription(str);
                                    break;
                                } else {
                                    imageView5.setImageDrawable(drawable2);
                                    imageView5.setContentDescription(str2);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        boolean z43 = playerControlView3.M;
                        boolean z44 = !z43;
                        if (z43 != z44) {
                            playerControlView3.M = z44;
                            String str3 = playerControlView3.L;
                            Drawable drawable3 = playerControlView3.f18956J;
                            String str4 = playerControlView3.K;
                            Drawable drawable4 = playerControlView3.I;
                            ImageView imageView6 = playerControlView3.f18975s;
                            if (imageView6 != null) {
                                if (z44) {
                                    imageView6.setImageDrawable(drawable4);
                                    imageView6.setContentDescription(str4);
                                } else {
                                    imageView6.setImageDrawable(drawable3);
                                    imageView6.setContentDescription(str3);
                                }
                            }
                            ImageView imageView7 = playerControlView3.f18976t;
                            if (imageView7 != null) {
                                if (!z44) {
                                    imageView7.setImageDrawable(drawable3);
                                    imageView7.setContentDescription(str3);
                                    break;
                                } else {
                                    imageView7.setImageDrawable(drawable4);
                                    imageView7.setContentDescription(str4);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(onClickListener);
        }
        ImageView imageView4 = (ImageView) playerControlView.findViewById(h0.exo_minimal_fullscreen);
        playerControlView.f18976t = imageView4;
        final int i69 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(playerControlView) { // from class: androidx.media3.ui.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlayerControlView f19037b;

            {
                this.f19037b = playerControlView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i692 = i69;
                PlayerControlView playerControlView3 = this.f19037b;
                switch (i692) {
                    case 0:
                        boolean z38 = playerControlView3.M;
                        boolean z39 = !z38;
                        if (z38 != z39) {
                            playerControlView3.M = z39;
                            String str = playerControlView3.L;
                            Drawable drawable = playerControlView3.f18956J;
                            String str2 = playerControlView3.K;
                            Drawable drawable2 = playerControlView3.I;
                            ImageView imageView42 = playerControlView3.f18975s;
                            if (imageView42 != null) {
                                if (z39) {
                                    imageView42.setImageDrawable(drawable2);
                                    imageView42.setContentDescription(str2);
                                } else {
                                    imageView42.setImageDrawable(drawable);
                                    imageView42.setContentDescription(str);
                                }
                            }
                            ImageView imageView5 = playerControlView3.f18976t;
                            if (imageView5 != null) {
                                if (!z39) {
                                    imageView5.setImageDrawable(drawable);
                                    imageView5.setContentDescription(str);
                                    break;
                                } else {
                                    imageView5.setImageDrawable(drawable2);
                                    imageView5.setContentDescription(str2);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        boolean z43 = playerControlView3.M;
                        boolean z44 = !z43;
                        if (z43 != z44) {
                            playerControlView3.M = z44;
                            String str3 = playerControlView3.L;
                            Drawable drawable3 = playerControlView3.f18956J;
                            String str4 = playerControlView3.K;
                            Drawable drawable4 = playerControlView3.I;
                            ImageView imageView6 = playerControlView3.f18975s;
                            if (imageView6 != null) {
                                if (z44) {
                                    imageView6.setImageDrawable(drawable4);
                                    imageView6.setContentDescription(str4);
                                } else {
                                    imageView6.setImageDrawable(drawable3);
                                    imageView6.setContentDescription(str3);
                                }
                            }
                            ImageView imageView7 = playerControlView3.f18976t;
                            if (imageView7 != null) {
                                if (!z44) {
                                    imageView7.setImageDrawable(drawable3);
                                    imageView7.setContentDescription(str3);
                                    break;
                                } else {
                                    imageView7.setImageDrawable(drawable4);
                                    imageView7.setContentDescription(str4);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(onClickListener2);
        }
        View findViewById = playerControlView.findViewById(h0.exo_settings);
        playerControlView.f18977u = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(jVar3);
        }
        View findViewById2 = playerControlView.findViewById(h0.exo_playback_speed);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(jVar3);
        }
        View findViewById3 = playerControlView.findViewById(h0.exo_audio_track);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(jVar3);
        }
        t0 t0Var = (t0) playerControlView.findViewById(h0.exo_progress);
        View findViewById4 = playerControlView.findViewById(h0.exo_progress_placeholder);
        if (t0Var != null) {
            playerControlView.f18979w = t0Var;
            i35 = i17;
            jVar = jVar3;
            z24 = z23;
            i36 = i67;
            imageView = imageView2;
            i37 = i65;
            z25 = z13;
            i38 = i29;
            z26 = z19;
            playerControlView2 = playerControlView;
        } else if (findViewById4 != null) {
            i35 = i17;
            jVar = jVar3;
            z24 = z23;
            imageView = imageView2;
            i37 = i65;
            z26 = z19;
            playerControlView2 = playerControlView;
            i36 = i67;
            z25 = z13;
            i38 = i29;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, l0.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(h0.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            playerControlView2.f18979w = defaultTimeBar;
        } else {
            i35 = i17;
            jVar = jVar3;
            z24 = z23;
            i36 = i67;
            imageView = imageView2;
            i37 = i65;
            z25 = z13;
            i38 = i29;
            z26 = z19;
            playerControlView2 = playerControlView;
            playerControlView2.f18979w = null;
        }
        t0 t0Var2 = playerControlView2.f18979w;
        if (t0Var2 != null) {
            jVar2 = jVar;
            ((DefaultTimeBar) t0Var2).f18903x.add(jVar2);
        } else {
            jVar2 = jVar;
        }
        Resources resources = context.getResources();
        playerControlView2.f18958b = resources;
        ImageView imageView5 = (ImageView) playerControlView2.findViewById(h0.exo_play_pause);
        playerControlView2.f18969m = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(jVar2);
        }
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(h0.exo_prev);
        playerControlView2.f18967k = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i27, context.getTheme()));
            imageView6.setOnClickListener(jVar2);
        }
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(h0.exo_next);
        playerControlView2.f18968l = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            imageView7.setOnClickListener(jVar2);
        }
        Typeface a13 = e5.n.a(context, g0.roboto_medium_numbers);
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(h0.exo_rew);
        TextView textView = (TextView) playerControlView2.findViewById(h0.exo_rew_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i28, context.getTheme()));
            playerControlView2.f18971o = imageView8;
        } else if (textView != null) {
            textView.setTypeface(a13);
            playerControlView2.f18971o = textView;
        } else {
            playerControlView2.f18971o = null;
        }
        View view = playerControlView2.f18971o;
        if (view != null) {
            view.setOnClickListener(jVar2);
        }
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(h0.exo_ffwd);
        TextView textView2 = (TextView) playerControlView2.findViewById(h0.exo_ffwd_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(resources.getDrawable(i26, context.getTheme()));
            playerControlView2.f18970n = imageView9;
        } else if (textView2 != null) {
            textView2.setTypeface(a13);
            playerControlView2.f18970n = textView2;
        } else {
            playerControlView2.f18970n = null;
        }
        View view2 = playerControlView2.f18970n;
        if (view2 != null) {
            view2.setOnClickListener(jVar2);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(h0.exo_repeat_toggle);
        playerControlView2.f18972p = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(jVar2);
        }
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(h0.exo_shuffle);
        playerControlView2.f18973q = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(jVar2);
        }
        playerControlView2.F = resources.getInteger(i0.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.G = resources.getInteger(i0.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView12 = (ImageView) playerControlView2.findViewById(h0.exo_vr);
        if (imageView12 != null) {
            imageView12.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            playerControlView2.d(imageView12, false);
        }
        x xVar = new x(playerControlView2);
        playerControlView2.f18957a = xVar;
        xVar.C = z17;
        n nVar = new n(playerControlView2, new String[]{resources.getString(k0.exo_controls_playback_speed), resources.getString(k0.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(f0.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(f0.exo_styled_controls_audiotrack, context.getTheme())});
        playerControlView2.f18961e = nVar;
        playerControlView2.f18966j = resources.getDimensionPixelSize(e0.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(j0.exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.f18960d = recyclerView;
        recyclerView.H2(nVar);
        getContext();
        recyclerView.R2(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.f18965i = popupWindow;
        if (d7.n0.f53866a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(jVar2);
        playerControlView2.T = true;
        getResources().getClass();
        resources.getDrawable(i16, context.getTheme());
        resources.getDrawable(i24, context.getTheme());
        resources.getString(k0.exo_controls_cc_enabled_description);
        resources.getString(k0.exo_controls_cc_disabled_description);
        int i73 = 0;
        playerControlView2.f18963g = new i(playerControlView2, 1, i73);
        playerControlView2.f18964h = new i(playerControlView2, i73, i73);
        playerControlView2.f18962f = new l(playerControlView2, resources.getStringArray(c0.exo_controls_playback_speeds), U);
        playerControlView2.A = resources.getDrawable(i34, context.getTheme());
        playerControlView2.B = resources.getDrawable(i66, context.getTheme());
        playerControlView2.I = resources.getDrawable(i38, context.getTheme());
        playerControlView2.f18956J = resources.getDrawable(i36, context.getTheme());
        playerControlView2.C = resources.getDrawable(i37, context.getTheme());
        resources.getDrawable(i35, context.getTheme());
        resources.getDrawable(i18, context.getTheme());
        resources.getDrawable(i19, context.getTheme());
        playerControlView2.E = resources.getDrawable(i23, context.getTheme());
        playerControlView2.K = resources.getString(k0.exo_controls_fullscreen_exit_description);
        playerControlView2.L = resources.getString(k0.exo_controls_fullscreen_enter_description);
        playerControlView2.D = resources.getString(k0.exo_controls_repeat_off_description);
        resources.getString(k0.exo_controls_repeat_one_description);
        resources.getString(k0.exo_controls_repeat_all_description);
        resources.getString(k0.exo_controls_shuffle_on_description);
        playerControlView2.H = resources.getString(k0.exo_controls_shuffle_off_description);
        xVar.h((ViewGroup) playerControlView2.findViewById(h0.exo_bottom_bar), true);
        xVar.h(playerControlView2.f18970n, z18);
        xVar.h(playerControlView2.f18971o, z25);
        xVar.h(imageView6, z26);
        xVar.h(imageView7, z24);
        xVar.h(imageView11, z14);
        xVar.h(imageView, z15);
        xVar.h(imageView12, z16);
        xVar.h(imageView10, playerControlView2.S != 0);
        playerControlView2.addOnLayoutChangeListener(new h(playerControlView2, 0));
    }
}
