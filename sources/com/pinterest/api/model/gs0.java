package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gs0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38129b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f38130c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38131d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38132e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f38133f;

    public gs0(boolean z13, String str, boolean z14, String str2, String str3, Integer num) {
        this.f38128a = z13;
        this.f38129b = str;
        this.f38130c = z14;
        this.f38131d = str2;
        this.f38132e = str3;
        this.f38133f = num;
    }

    public final boolean a() {
        return this.f38128a;
    }

    public final String b() {
        return this.f38131d;
    }

    public final String c() {
        return this.f38132e;
    }

    public final Integer d() {
        return this.f38133f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0)) {
            return false;
        }
        gs0 gs0Var = (gs0) obj;
        return this.f38128a == gs0Var.f38128a && Intrinsics.d(this.f38129b, gs0Var.f38129b) && this.f38130c == gs0Var.f38130c && Intrinsics.d(this.f38131d, gs0Var.f38131d) && Intrinsics.d(this.f38132e, gs0Var.f38132e) && Intrinsics.d(this.f38133f, gs0Var.f38133f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f38128a) * 31;
        String str = this.f38129b;
        int e13 = ep.b.e(this.f38130c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f38131d;
        int hashCode2 = (e13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38132e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f38133f;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurveySurveyAnswerData(endSurvey=");
        sb3.append(this.f38128a);
        sb3.append(", feedForward=");
        sb3.append(this.f38129b);
        sb3.append(", isExclusive=");
        sb3.append(this.f38130c);
        sb3.append(", skipTo=");
        sb3.append(this.f38131d);
        sb3.append(", text=");
        sb3.append(this.f38132e);
        sb3.append(", value=");
        return a.c.i(sb3, this.f38133f, ")");
    }
}
