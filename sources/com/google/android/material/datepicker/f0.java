package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
public final class f0 extends g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f32516i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f32517j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f32518k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d0 f32519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f32520m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, u uVar, int i13) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f32516i = i13;
        this.f32520m = rangeDateSelector;
        this.f32517j = textInputLayout2;
        this.f32518k = textInputLayout3;
        this.f32519l = uVar;
    }

    @Override // com.google.android.material.datepicker.g
    public final void a() {
        int i13 = this.f32516i;
        TextInputLayout textInputLayout = this.f32517j;
        d0 d0Var = this.f32519l;
        TextInputLayout textInputLayout2 = this.f32518k;
        RangeDateSelector rangeDateSelector = this.f32520m;
        switch (i13) {
            case 0:
                rangeDateSelector.f32496d = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, d0Var);
                break;
            default:
                rangeDateSelector.f32497e = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, d0Var);
                break;
        }
    }

    @Override // com.google.android.material.datepicker.g
    public final void b(Long l13) {
        int i13 = this.f32516i;
        TextInputLayout textInputLayout = this.f32517j;
        d0 d0Var = this.f32519l;
        TextInputLayout textInputLayout2 = this.f32518k;
        RangeDateSelector rangeDateSelector = this.f32520m;
        switch (i13) {
            case 0:
                rangeDateSelector.f32496d = l13;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, d0Var);
                break;
            default:
                rangeDateSelector.f32497e = l13;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, d0Var);
                break;
        }
    }
}
