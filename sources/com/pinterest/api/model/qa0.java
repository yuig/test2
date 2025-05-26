package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class qa0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41245a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41246b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("pole0")
    private String f41247c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pole1")
    private String f41248d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("score0")
    private Integer f41249e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("score1")
    private Integer f41250f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41251g;

    public /* synthetic */ qa0(String str, String str2, String str3, String str4, Integer num, Integer num2, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, num, num2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return Objects.equals(this.f41250f, qa0Var.f41250f) && Objects.equals(this.f41249e, qa0Var.f41249e) && Objects.equals(this.f41245a, qa0Var.f41245a) && Objects.equals(this.f41246b, qa0Var.f41246b) && Objects.equals(this.f41247c, qa0Var.f41247c) && Objects.equals(this.f41248d, qa0Var.f41248d);
    }

    public final int hashCode() {
        return Objects.hash(this.f41245a, this.f41246b, this.f41247c, this.f41248d, this.f41249e, this.f41250f);
    }

    public qa0() {
        this.f41251g = new boolean[6];
    }

    private qa0(@NonNull String str, String str2, String str3, String str4, Integer num, Integer num2, boolean[] zArr) {
        this.f41245a = str;
        this.f41246b = str2;
        this.f41247c = str3;
        this.f41248d = str4;
        this.f41249e = num;
        this.f41250f = num2;
        this.f41251g = zArr;
    }
}
