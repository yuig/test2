package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class g extends com.google.android.material.internal.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f32521a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32522b;

    /* renamed from: c, reason: collision with root package name */
    public final DateFormat f32523c;

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f32524d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32525e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.ui.z f32526f;

    /* renamed from: g, reason: collision with root package name */
    public l7.b0 f32527g;

    /* renamed from: h, reason: collision with root package name */
    public int f32528h = 0;

    public g(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f32522b = str;
        this.f32523c = simpleDateFormat;
        this.f32521a = textInputLayout;
        this.f32524d = calendarConstraints;
        this.f32525e = textInputLayout.getContext().getString(fj.k.mtrl_picker_out_of_range);
        this.f32526f = new androidx.media3.ui.z(20, this, str);
    }

    public abstract void a();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f32522b;
        if (length >= str.length() || editable.length() < this.f32528h) {
            return;
        }
        char charAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(charAt)) {
            return;
        }
        editable.append(charAt);
    }

    public abstract void b(Long l13);

    @Override // com.google.android.material.internal.c0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f32528h = charSequence.length();
    }

    @Override // com.google.android.material.internal.c0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        CalendarConstraints calendarConstraints = this.f32524d;
        TextInputLayout textInputLayout = this.f32521a;
        androidx.media3.ui.z zVar = this.f32526f;
        textInputLayout.removeCallbacks(zVar);
        textInputLayout.removeCallbacks(this.f32527g);
        textInputLayout.G(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f32522b.length()) {
            return;
        }
        try {
            Date parse = this.f32523c.parse(charSequence.toString());
            textInputLayout.G(null);
            long time = parse.getTime();
            if (calendarConstraints.f32473c.u0(time)) {
                Calendar c13 = i0.c(calendarConstraints.f32471a.f32486a);
                c13.set(5, 1);
                if (c13.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f32472b;
                    int i16 = month.f32490e;
                    Calendar c14 = i0.c(month.f32486a);
                    c14.set(5, i16);
                    if (time <= c14.getTimeInMillis()) {
                        b(Long.valueOf(parse.getTime()));
                        return;
                    }
                }
            }
            l7.b0 b0Var = new l7.b0(this, time, 3);
            this.f32527g = b0Var;
            textInputLayout.post(b0Var);
        } catch (ParseException unused) {
            textInputLayout.post(zVar);
        }
    }
}
