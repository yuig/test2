package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class RangeDateSelector implements DateSelector<p5.b> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new y(3);

    /* renamed from: a, reason: collision with root package name */
    public String f32493a;

    /* renamed from: b, reason: collision with root package name */
    public Long f32494b;

    /* renamed from: c, reason: collision with root package name */
    public Long f32495c;

    /* renamed from: d, reason: collision with root package name */
    public Long f32496d;

    /* renamed from: e, reason: collision with root package name */
    public Long f32497e;

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, d0 d0Var) {
        Long l13 = rangeDateSelector.f32496d;
        if (l13 == null || rangeDateSelector.f32497e == null) {
            if (textInputLayout.m() != null && rangeDateSelector.f32493a.contentEquals(textInputLayout.m())) {
                textInputLayout.G(null);
            }
            if (textInputLayout2.m() != null && " ".contentEquals(textInputLayout2.m())) {
                textInputLayout2.G(null);
            }
            d0Var.a();
        } else if (l13.longValue() <= rangeDateSelector.f32497e.longValue()) {
            Long l14 = rangeDateSelector.f32496d;
            rangeDateSelector.f32494b = l14;
            Long l15 = rangeDateSelector.f32497e;
            rangeDateSelector.f32495c = l15;
            d0Var.b(new p5.b(l14, l15));
        } else {
            textInputLayout.G(rangeDateSelector.f32493a);
            textInputLayout2.G(" ");
            d0Var.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.m())) {
            textInputLayout.m();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.m())) {
                return;
            }
            textInputLayout2.m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if ((r0 != null ? r0.toLowerCase(java.util.Locale.ENGLISH) : "").equals("samsung") != false) goto L12;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View K1(android.view.LayoutInflater r21, android.view.ViewGroup r22, com.google.android.material.datepicker.CalendarConstraints r23, com.google.android.material.datepicker.u r24) {
        /*
            r20 = this;
            r10 = r20
            int r0 = fj.i.mtrl_picker_text_input_date_range
            r1 = 0
            r2 = r21
            r3 = r22
            android.view.View r11 = r2.inflate(r0, r3, r1)
            int r0 = fj.g.mtrl_picker_text_input_range_start
            android.view.View r0 = r11.findViewById(r0)
            r12 = r0
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            int r0 = fj.g.mtrl_picker_text_input_range_end
            android.view.View r0 = r11.findViewById(r0)
            r13 = r0
            com.google.android.material.textfield.TextInputLayout r13 = (com.google.android.material.textfield.TextInputLayout) r13
            android.widget.EditText r14 = r12.f33167d
            android.widget.EditText r15 = r13.f33167d
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L30
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
            goto L31
        L30:
            r2 = r1
        L31:
            java.lang.String r3 = "lge"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L49
            if (r0 == 0) goto L41
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
        L41:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L51
        L49:
            r0 = 17
            r14.setInputType(r0)
            r15.setInputType(r0)
        L51:
            android.content.res.Resources r0 = r11.getResources()
            int r1 = fj.k.mtrl_picker_invalid_range
            java.lang.String r0 = r0.getString(r1)
            r10.f32493a = r0
            java.text.SimpleDateFormat r9 = com.google.android.material.datepicker.i0.d()
            java.lang.Long r0 = r10.f32494b
            if (r0 == 0) goto L70
            java.lang.String r0 = r9.format(r0)
            r14.setText(r0)
            java.lang.Long r0 = r10.f32494b
            r10.f32496d = r0
        L70:
            java.lang.Long r0 = r10.f32495c
            if (r0 == 0) goto L7f
            java.lang.String r0 = r9.format(r0)
            r15.setText(r0)
            java.lang.Long r0 = r10.f32495c
            r10.f32497e = r0
        L7f:
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r8 = com.google.android.material.datepicker.i0.e(r0, r9)
            r12.P(r8)
            r13.P(r8)
            com.google.android.material.datepicker.f0 r7 = new com.google.android.material.datepicker.f0
            r16 = 0
            r0 = r7
            r1 = r20
            r2 = r8
            r3 = r9
            r4 = r12
            r5 = r23
            r6 = r12
            r17 = r7
            r7 = r13
            r18 = r8
            r8 = r24
            r19 = r9
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r14.addTextChangedListener(r0)
            com.google.android.material.datepicker.f0 r9 = new com.google.android.material.datepicker.f0
            r16 = 1
            r0 = r9
            r2 = r18
            r3 = r19
            r4 = r13
            r12 = r9
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.addTextChangedListener(r12)
            android.widget.EditText[] r0 = new android.widget.EditText[]{r14, r15}
            com.google.android.material.datepicker.DateSelector.z1(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.RangeDateSelector.K1(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.u):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean N1() {
        Long l13 = this.f32494b;
        return (l13 == null || this.f32495c == null || l13.longValue() > this.f32495c.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList T1() {
        ArrayList arrayList = new ArrayList();
        Long l13 = this.f32494b;
        if (l13 != null) {
            arrayList.add(l13);
        }
        Long l14 = this.f32495c;
        if (l14 != null) {
            arrayList.add(l14);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object X1() {
        return new p5.b(this.f32494b, this.f32495c);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String d1(Context context) {
        Resources resources = context.getResources();
        Long l13 = this.f32494b;
        if (l13 == null && this.f32495c == null) {
            return resources.getString(fj.k.mtrl_picker_range_header_unselected);
        }
        Long l14 = this.f32495c;
        if (l14 == null) {
            return resources.getString(fj.k.mtrl_picker_range_header_only_start_selected, ph.a.G(l13.longValue()));
        }
        if (l13 == null) {
            return resources.getString(fj.k.mtrl_picker_range_header_only_end_selected, ph.a.G(l14.longValue()));
        }
        p5.b F = ph.a.F(l13, l14);
        return resources.getString(fj.k.mtrl_picker_range_header_selected, F.f98855a, F.f98856b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList h1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p5.b(this.f32494b, this.f32495c));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void h2(long j13) {
        Long l13 = this.f32494b;
        if (l13 == null) {
            this.f32494b = Long.valueOf(j13);
        } else if (this.f32495c == null && l13.longValue() <= j13) {
            this.f32495c = Long.valueOf(j13);
        } else {
            this.f32495c = null;
            this.f32494b = Long.valueOf(j13);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void j1(Object obj) {
        p5.b bVar = (p5.b) obj;
        Object obj2 = bVar.f98855a;
        Object obj3 = bVar.f98856b;
        if (obj2 != null && obj3 != null) {
            com.bumptech.glide.d.h(((Long) obj2).longValue() <= ((Long) obj3).longValue());
        }
        Object obj4 = bVar.f98855a;
        this.f32494b = obj4 == null ? null : Long.valueOf(i0.a(((Long) obj4).longValue()));
        this.f32495c = obj3 != null ? Long.valueOf(i0.a(((Long) obj3).longValue())) : null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int n0() {
        return fj.k.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String q0(Context context) {
        Resources resources = context.getResources();
        p5.b F = ph.a.F(this.f32494b, this.f32495c);
        Object obj = F.f98855a;
        String string = obj == null ? resources.getString(fj.k.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = F.f98856b;
        return resources.getString(fj.k.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(fj.k.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int s0(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return com.bumptech.glide.c.Y0(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(fj.e.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? fj.c.materialCalendarTheme : fj.c.materialCalendarFullscreenTheme, context, w.class.getCanonicalName()).data;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeValue(this.f32494b);
        parcel.writeValue(this.f32495c);
    }
}
