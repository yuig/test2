package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: classes3.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: a, reason: collision with root package name */
    public final f f32480a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32481b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f32478c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final d f32479d = new d();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new e();

    public CompositeDateValidator(List list, f fVar) {
        this.f32481b = list;
        this.f32480a = fVar;
    }

    public static CompositeDateValidator a(List list) {
        return new CompositeDateValidator(list, f32479d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f32481b.equals(compositeDateValidator.f32481b) && this.f32480a.getId() == compositeDateValidator.f32480a.getId();
    }

    public final int hashCode() {
        return this.f32481b.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean u0(long j13) {
        return this.f32480a.a(j13, this.f32481b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeList(this.f32481b);
        parcel.writeInt(this.f32480a.getId());
    }
}
