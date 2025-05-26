package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
public final class g0 extends g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0 f32529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f32530j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SingleDateSelector f32531k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, u uVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f32531k = singleDateSelector;
        this.f32529i = uVar;
        this.f32530j = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.g
    public final void a() {
        this.f32530j.m();
        this.f32531k.getClass();
        this.f32529i.a();
    }

    @Override // com.google.android.material.datepicker.g
    public final void b(Long l13) {
        SingleDateSelector singleDateSelector = this.f32531k;
        if (l13 == null) {
            singleDateSelector.f32498a = null;
        } else {
            singleDateSelector.f32498a = l13;
        }
        singleDateSelector.getClass();
        this.f32529i.b(singleDateSelector.f32498a);
    }
}
