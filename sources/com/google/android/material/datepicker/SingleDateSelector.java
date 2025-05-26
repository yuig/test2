package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new y(4);

    /* renamed from: a, reason: collision with root package name */
    public Long f32498a;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if ((r0 != null ? r0.toLowerCase(java.util.Locale.ENGLISH) : "").equals("samsung") != false) goto L12;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View K1(android.view.LayoutInflater r10, android.view.ViewGroup r11, com.google.android.material.datepicker.CalendarConstraints r12, com.google.android.material.datepicker.u r13) {
        /*
            r9 = this;
            int r0 = fj.i.mtrl_picker_text_input_date
            r1 = 0
            android.view.View r10 = r10.inflate(r0, r11, r1)
            int r11 = fj.g.mtrl_picker_text_input_date
            android.view.View r11 = r10.findViewById(r11)
            r7 = r11
            com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7
            android.widget.EditText r11 = r7.f33167d
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L1f
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
            goto L20
        L1f:
            r2 = r1
        L20:
            java.lang.String r3 = "lge"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L38
            if (r0 == 0) goto L30
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
        L30:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
        L38:
            r0 = 17
            r11.setInputType(r0)
        L3d:
            java.text.SimpleDateFormat r3 = com.google.android.material.datepicker.i0.d()
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r2 = com.google.android.material.datepicker.i0.e(r0, r3)
            r7.P(r2)
            java.lang.Long r0 = r9.f32498a
            if (r0 == 0) goto L57
            java.lang.String r0 = r3.format(r0)
            r11.setText(r0)
        L57:
            com.google.android.material.datepicker.g0 r8 = new com.google.android.material.datepicker.g0
            r0 = r8
            r1 = r9
            r4 = r7
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.addTextChangedListener(r8)
            android.widget.EditText[] r11 = new android.widget.EditText[]{r11}
            com.google.android.material.datepicker.DateSelector.z1(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.SingleDateSelector.K1(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.u):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean N1() {
        return this.f32498a != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList T1() {
        ArrayList arrayList = new ArrayList();
        Long l13 = this.f32498a;
        if (l13 != null) {
            arrayList.add(l13);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object X1() {
        return this.f32498a;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String d1(Context context) {
        Resources resources = context.getResources();
        Long l13 = this.f32498a;
        if (l13 == null) {
            return resources.getString(fj.k.mtrl_picker_date_header_unselected);
        }
        return resources.getString(fj.k.mtrl_picker_date_header_selected, ph.a.d0(l13.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList h1() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void h2(long j13) {
        this.f32498a = Long.valueOf(j13);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void j1(Object obj) {
        Long l13 = (Long) obj;
        this.f32498a = l13 == null ? null : Long.valueOf(i0.a(l13.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int n0() {
        return fj.k.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String q0(Context context) {
        Resources resources = context.getResources();
        Long l13 = this.f32498a;
        return resources.getString(fj.k.mtrl_picker_announce_current_selection, l13 == null ? resources.getString(fj.k.mtrl_picker_announce_current_selection_none) : ph.a.d0(l13.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int s0(Context context) {
        return com.bumptech.glide.c.Y0(fj.c.materialCalendarTheme, context, w.class.getCanonicalName()).data;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeValue(this.f32498a);
    }
}
