package com.google.android.material.datepicker;

import android.os.Bundle;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final long f32501f = i0.a(Month.b(1900, 0).f32491f);

    /* renamed from: g, reason: collision with root package name */
    public static final long f32502g = i0.a(Month.b(2100, 11).f32491f);

    /* renamed from: c, reason: collision with root package name */
    public Long f32505c;

    /* renamed from: d, reason: collision with root package name */
    public int f32506d;

    /* renamed from: a, reason: collision with root package name */
    public long f32503a = f32501f;

    /* renamed from: b, reason: collision with root package name */
    public long f32504b = f32502g;

    /* renamed from: e, reason: collision with root package name */
    public CalendarConstraints.DateValidator f32507e = new DateValidatorPointForward(Long.MIN_VALUE);

    public final CalendarConstraints a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f32507e);
        Month d2 = Month.d(this.f32503a);
        Month d13 = Month.d(this.f32504b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l13 = this.f32505c;
        return new CalendarConstraints(d2, d13, dateValidator, l13 == null ? null : Month.d(l13.longValue()), this.f32506d);
    }
}
