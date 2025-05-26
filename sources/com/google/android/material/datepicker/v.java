package com.google.android.material.datepicker;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final DateSelector f32574a;

    /* renamed from: c, reason: collision with root package name */
    public CalendarConstraints f32576c;

    /* renamed from: b, reason: collision with root package name */
    public int f32575b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f32577d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f32578e = null;

    public v(SingleDateSelector singleDateSelector) {
        this.f32574a = singleDateSelector;
    }

    public static v b() {
        return new v(new SingleDateSelector());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r2.compareTo(r3.f32472b) <= 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.material.datepicker.w a() {
        /*
            r5 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r5.f32576c
            if (r0 != 0) goto Lf
            com.google.android.material.datepicker.b r0 = new com.google.android.material.datepicker.b
            r0.<init>()
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.a()
            r5.f32576c = r0
        Lf:
            int r0 = r5.f32577d
            com.google.android.material.datepicker.DateSelector r1 = r5.f32574a
            if (r0 != 0) goto L1b
            int r0 = r1.n0()
            r5.f32577d = r0
        L1b:
            java.lang.Object r0 = r5.f32578e
            if (r0 == 0) goto L22
            r1.j1(r0)
        L22:
            com.google.android.material.datepicker.CalendarConstraints r0 = r5.f32576c
            com.google.android.material.datepicker.Month r2 = r0.f32474d
            if (r2 != 0) goto L7d
            java.util.ArrayList r2 = r1.T1()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            java.util.ArrayList r2 = r1.T1()
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            com.google.android.material.datepicker.Month r2 = com.google.android.material.datepicker.Month.d(r2)
            com.google.android.material.datepicker.CalendarConstraints r3 = r5.f32576c
            com.google.android.material.datepicker.Month r4 = r3.f32471a
            int r4 = r2.compareTo(r4)
            if (r4 < 0) goto L5b
            com.google.android.material.datepicker.Month r3 = r3.f32472b
            int r3 = r2.compareTo(r3)
            if (r3 > 0) goto L5b
            goto L7b
        L5b:
            com.google.android.material.datepicker.Month r2 = new com.google.android.material.datepicker.Month
            java.util.Calendar r3 = com.google.android.material.datepicker.i0.f()
            r2.<init>(r3)
            com.google.android.material.datepicker.CalendarConstraints r3 = r5.f32576c
            com.google.android.material.datepicker.Month r4 = r3.f32471a
            int r4 = r2.compareTo(r4)
            if (r4 < 0) goto L77
            com.google.android.material.datepicker.Month r3 = r3.f32472b
            int r3 = r2.compareTo(r3)
            if (r3 > 0) goto L77
            goto L7b
        L77:
            com.google.android.material.datepicker.CalendarConstraints r2 = r5.f32576c
            com.google.android.material.datepicker.Month r2 = r2.f32471a
        L7b:
            r0.f32474d = r2
        L7d:
            com.google.android.material.datepicker.w r0 = new com.google.android.material.datepicker.w
            r0.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            int r3 = r5.f32575b
            java.lang.String r4 = "OVERRIDE_THEME_RES_ID"
            r2.putInt(r4, r3)
            java.lang.String r3 = "DATE_SELECTOR_KEY"
            r2.putParcelable(r3, r1)
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r3 = r5.f32576c
            r2.putParcelable(r1, r3)
            java.lang.String r1 = "DAY_VIEW_DECORATOR_KEY"
            r3 = 0
            r2.putParcelable(r1, r3)
            java.lang.String r1 = "TITLE_TEXT_RES_ID_KEY"
            int r4 = r5.f32577d
            r2.putInt(r1, r4)
            java.lang.String r1 = "TITLE_TEXT_KEY"
            r2.putCharSequence(r1, r3)
            java.lang.String r1 = "INPUT_MODE_KEY"
            r4 = 0
            r2.putInt(r1, r4)
            java.lang.String r1 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            r2.putInt(r1, r4)
            java.lang.String r1 = "POSITIVE_BUTTON_TEXT_KEY"
            r2.putCharSequence(r1, r3)
            java.lang.String r1 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            r2.putInt(r1, r4)
            java.lang.String r1 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            r2.putCharSequence(r1, r3)
            java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            r2.putInt(r1, r4)
            java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_KEY"
            r2.putCharSequence(r1, r3)
            java.lang.String r1 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            r2.putInt(r1, r4)
            java.lang.String r1 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            r2.putCharSequence(r1, r3)
            r0.setArguments(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.v.a():com.google.android.material.datepicker.w");
    }
}
