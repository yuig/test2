package com.google.android.material.datepicker;

import a.l2;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.w0;
import com.google.android.material.internal.CheckableImageButton;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import q5.d2;
import q5.e2;
import q5.f2;
import q5.m0;
import q5.v0;

/* loaded from: classes3.dex */
public final class w<S> extends androidx.fragment.app.q {
    public int A;
    public CharSequence B;
    public boolean C;
    public int D;
    public int E;
    public CharSequence F;
    public int G;
    public CharSequence H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public CharSequence f32579J;
    public int K;
    public CharSequence L;
    public TextView M;
    public TextView N;
    public CheckableImageButton O;
    public bk.i P;
    public Button Q;
    public boolean R;
    public CharSequence S;
    public CharSequence T;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashSet f32580q = new LinkedHashSet();

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f32581r = new LinkedHashSet();

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f32582s = new LinkedHashSet();

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f32583t = new LinkedHashSet();

    /* renamed from: u, reason: collision with root package name */
    public int f32584u;

    /* renamed from: v, reason: collision with root package name */
    public DateSelector f32585v;

    /* renamed from: w, reason: collision with root package name */
    public e0 f32586w;

    /* renamed from: x, reason: collision with root package name */
    public CalendarConstraints f32587x;

    /* renamed from: y, reason: collision with root package name */
    public DayViewDecorator f32588y;

    /* renamed from: z, reason: collision with root package name */
    public s f32589z;

    public static int V6(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(fj.e.mtrl_calendar_content_padding);
        Month month = new Month(i0.f());
        int dimensionPixelSize = resources.getDimensionPixelSize(fj.e.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(fj.e.mtrl_calendar_month_horizontal_padding);
        int i13 = month.f32489d;
        return ((i13 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i13) + (dimensionPixelOffset * 2);
    }

    public static boolean W6(Context context, int i13) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.bumptech.glide.c.Y0(fj.c.materialCalendarStyle, context, s.class.getCanonicalName()).data, new int[]{i13});
        boolean z13 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z13;
    }

    @Override // androidx.fragment.app.q
    public final Dialog O6(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i13 = this.f32584u;
        if (i13 == 0) {
            i13 = U6().s0(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i13);
        Context context = dialog.getContext();
        this.C = W6(context, R.attr.windowFullscreen);
        this.P = new bk.i(context, null, fj.c.materialCalendarStyle, fj.l.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, fj.m.MaterialCalendar, fj.c.materialCalendarStyle, fj.l.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(fj.m.MaterialCalendar_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        this.P.o(context);
        this.P.t(ColorStateList.valueOf(color));
        bk.i iVar = this.P;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = v0.f102521a;
        iVar.s(m0.e(decorView));
        return dialog;
    }

    public final void T6(p11.j jVar) {
        this.f32580q.add(jVar);
    }

    public final DateSelector U6() {
        if (this.f32585v == null) {
            this.f32585v = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f32585v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.Fragment, com.google.android.material.datepicker.x] */
    public final void X6() {
        Context requireContext = requireContext();
        int i13 = this.f32584u;
        if (i13 == 0) {
            i13 = U6().s0(requireContext);
        }
        DateSelector U6 = U6();
        CalendarConstraints calendarConstraints = this.f32587x;
        DayViewDecorator dayViewDecorator = this.f32588y;
        s sVar = new s();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i13);
        bundle.putParcelable("GRID_SELECTOR_KEY", U6);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f32474d);
        sVar.setArguments(bundle);
        this.f32589z = sVar;
        if (this.D == 1) {
            DateSelector U62 = U6();
            CalendarConstraints calendarConstraints2 = this.f32587x;
            ?? xVar = new x();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i13);
            bundle2.putParcelable("DATE_SELECTOR_KEY", U62);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            xVar.setArguments(bundle2);
            sVar = xVar;
        }
        this.f32586w = sVar;
        this.M.setText((this.D == 1 && getResources().getConfiguration().orientation == 2) ? this.T : this.S);
        String d13 = U6().d1(getContext());
        this.N.setContentDescription(U6().q0(requireContext()));
        this.N.setText(d13);
        w0 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.l(fj.g.mtrl_calendar_frame, this.f32586w, null);
        aVar.f();
        this.f32586w.M6(new u(this, 0));
    }

    public final void Y6(CheckableImageButton checkableImageButton) {
        this.O.setContentDescription(this.D == 1 ? checkableImageButton.getContext().getString(fj.k.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(fj.k.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f32582s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32584u = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f32585v = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f32587x = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f32588y = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.A = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.B = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.D = bundle.getInt("INPUT_MODE_KEY");
        this.E = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.F = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.G = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.H = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.I = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f32579J = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.K = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.L = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.B;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.A);
        }
        this.S = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.T = charSequence;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.C ? fj.i.mtrl_picker_fullscreen : fj.i.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.f32588y;
        if (dayViewDecorator != null) {
            dayViewDecorator.getClass();
        }
        if (this.C) {
            inflate.findViewById(fj.g.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(V6(context), -2));
        } else {
            inflate.findViewById(fj.g.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(V6(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(fj.g.mtrl_picker_header_selection_text);
        this.N = textView;
        WeakHashMap weakHashMap = v0.f102521a;
        int i13 = 1;
        textView.setAccessibilityLiveRegion(1);
        this.O = (CheckableImageButton) inflate.findViewById(fj.g.mtrl_picker_header_toggle);
        this.M = (TextView) inflate.findViewById(fj.g.mtrl_picker_title_text);
        this.O.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.O;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, com.bumptech.glide.c.I(context, fj.f.material_ic_calendar_black_24dp));
        int i14 = 0;
        stateListDrawable.addState(new int[0], com.bumptech.glide.c.I(context, fj.f.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.O.setChecked(this.D != 0);
        v0.o(this.O, null);
        Y6(this.O);
        this.O.setOnClickListener(new l2(this, 8));
        this.Q = (Button) inflate.findViewById(fj.g.confirm_button);
        if (U6().N1()) {
            this.Q.setEnabled(true);
        } else {
            this.Q.setEnabled(false);
        }
        this.Q.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.F;
        if (charSequence != null) {
            this.Q.setText(charSequence);
        } else {
            int i15 = this.E;
            if (i15 != 0) {
                this.Q.setText(i15);
            }
        }
        CharSequence charSequence2 = this.H;
        if (charSequence2 != null) {
            this.Q.setContentDescription(charSequence2);
        } else if (this.G != 0) {
            this.Q.setContentDescription(getContext().getResources().getText(this.G));
        }
        this.Q.setOnClickListener(new t(this, i14));
        Button button = (Button) inflate.findViewById(fj.g.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f32579J;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i16 = this.I;
            if (i16 != 0) {
                button.setText(i16);
            }
        }
        CharSequence charSequence4 = this.L;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.K != 0) {
            button.setContentDescription(getContext().getResources().getText(this.K));
        }
        button.setOnClickListener(new t(this, i13));
        return inflate;
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f32583t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f32584u);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f32585v);
        CalendarConstraints calendarConstraints = this.f32587x;
        b bVar = new b();
        bVar.f32503a = b.f32501f;
        bVar.f32504b = b.f32502g;
        bVar.f32507e = new DateValidatorPointForward(Long.MIN_VALUE);
        bVar.f32503a = calendarConstraints.f32471a.f32491f;
        bVar.f32504b = calendarConstraints.f32472b.f32491f;
        bVar.f32505c = Long.valueOf(calendarConstraints.f32474d.f32491f);
        bVar.f32506d = calendarConstraints.f32475e;
        bVar.f32507e = calendarConstraints.f32473c;
        s sVar = this.f32589z;
        Month month = sVar == null ? null : sVar.f32561f;
        if (month != null) {
            bVar.f32505c = Long.valueOf(month.f32491f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f32588y);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.A);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.B);
        bundle.putInt("INPUT_MODE_KEY", this.D);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.E);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.F);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.G);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.H);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.I);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f32579J);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.K);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.L);
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = P6().getWindow();
        if (this.C) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.P);
            if (!this.R) {
                View findViewById = requireView().findViewById(fj.g.fullscreen_header);
                ColorStateList P = d7.b.P(findViewById.getBackground());
                Integer valueOf = P != null ? Integer.valueOf(P.getDefaultColor()) : null;
                int i13 = Build.VERSION.SDK_INT;
                boolean z13 = false;
                boolean z14 = valueOf == null || valueOf.intValue() == 0;
                int t13 = b7.c.t(window.getContext(), R.attr.colorBackground, -16777216);
                if (z14) {
                    valueOf = Integer.valueOf(t13);
                }
                lb.l0.j1(window, false);
                window.getContext();
                int j13 = i13 < 27 ? f5.c.j(b7.c.t(window.getContext(), R.attr.navigationBarColor, -16777216), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(j13);
                boolean z15 = b7.c.B(0) || b7.c.B(valueOf.intValue());
                h1.b bVar = new h1.b(window.getDecorView());
                int i14 = Build.VERSION.SDK_INT;
                (i14 >= 35 ? new f2(window, bVar) : i14 >= 30 ? new e2(window, bVar) : new d2(window, bVar)).j(z15);
                boolean B = b7.c.B(t13);
                if (b7.c.B(j13) || (j13 == 0 && B)) {
                    z13 = true;
                }
                h1.b bVar2 = new h1.b(window.getDecorView());
                int i15 = Build.VERSION.SDK_INT;
                (i15 >= 35 ? new f2(window, bVar2) : i15 >= 30 ? new e2(window, bVar2) : new d2(window, bVar2)).i(z13);
                int paddingTop = findViewById.getPaddingTop();
                int i16 = findViewById.getLayoutParams().height;
                g.i iVar = new g.i();
                iVar.f63181d = this;
                iVar.f63178a = i16;
                iVar.f63180c = findViewById;
                iVar.f63179b = paddingTop;
                WeakHashMap weakHashMap = v0.f102521a;
                m0.n(findViewById, iVar);
                this.R = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(fj.e.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.P, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new pj.a(P6(), rect));
        }
        X6();
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f32586w.f32515a.clear();
        super.onStop();
    }
}
