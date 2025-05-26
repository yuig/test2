package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class vv0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43002a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43003b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("color")
    private String f43004c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("font_name")
    private String f43005d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("font_size")
    private Integer f43006e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("prefilled_value")
    private String f43007f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43008g;

    public /* synthetic */ vv0(String str, String str2, String str3, String str4, Integer num, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, num, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vv0 vv0Var = (vv0) obj;
        return Objects.equals(this.f43006e, vv0Var.f43006e) && Objects.equals(this.f43002a, vv0Var.f43002a) && Objects.equals(this.f43003b, vv0Var.f43003b) && Objects.equals(this.f43004c, vv0Var.f43004c) && Objects.equals(this.f43005d, vv0Var.f43005d) && Objects.equals(this.f43007f, vv0Var.f43007f);
    }

    public final String g() {
        return this.f43004c;
    }

    public final String h() {
        return this.f43005d;
    }

    public final int hashCode() {
        return Objects.hash(this.f43002a, this.f43003b, this.f43004c, this.f43005d, this.f43006e, this.f43007f);
    }

    public final Integer i() {
        Integer num = this.f43006e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String j() {
        return this.f43007f;
    }

    public vv0() {
        this.f43008g = new boolean[6];
    }

    private vv0(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, Integer num, String str5, boolean[] zArr) {
        this.f43002a = str;
        this.f43003b = str2;
        this.f43004c = str3;
        this.f43005d = str4;
        this.f43006e = num;
        this.f43007f = str5;
        this.f43008g = zArr;
    }
}
