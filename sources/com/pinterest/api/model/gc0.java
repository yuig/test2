package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class gc0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38034a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38035b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("happy_survey_id")
    private Integer f38036c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("neutral_survey_id")
    private Integer f38037d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("sad_survey_id")
    private Integer f38038e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f38039f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38040g;

    public /* synthetic */ gc0(String str, String str2, Integer num, Integer num2, Integer num3, String str3, boolean[] zArr, int i13) {
        this(str, str2, num, num2, num3, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        return Objects.equals(this.f38038e, gc0Var.f38038e) && Objects.equals(this.f38037d, gc0Var.f38037d) && Objects.equals(this.f38036c, gc0Var.f38036c) && Objects.equals(this.f38034a, gc0Var.f38034a) && Objects.equals(this.f38035b, gc0Var.f38035b) && Objects.equals(this.f38039f, gc0Var.f38039f);
    }

    public final Integer g() {
        Integer num = this.f38036c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer h() {
        Integer num = this.f38037d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f38034a, this.f38035b, this.f38036c, this.f38037d, this.f38038e, this.f38039f);
    }

    public final Integer i() {
        Integer num = this.f38038e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String j() {
        return this.f38039f;
    }

    public gc0() {
        this.f38040g = new boolean[6];
    }

    private gc0(@NonNull String str, String str2, Integer num, Integer num2, Integer num3, String str3, boolean[] zArr) {
        this.f38034a = str;
        this.f38035b = str2;
        this.f38036c = num;
        this.f38037d = num2;
        this.f38038e = num3;
        this.f38039f = str3;
        this.f38040g = zArr;
    }
}
