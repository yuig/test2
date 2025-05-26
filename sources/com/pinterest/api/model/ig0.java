package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ig0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38765a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38766b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("height")
    private Integer f38767c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("preview")
    private String f38768d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("url")
    private String f38769e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("width")
    private Integer f38770f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38771g;

    public /* synthetic */ ig0(String str, String str2, Integer num, String str3, String str4, Integer num2, boolean[] zArr, int i13) {
        this(str, str2, num, str3, str4, num2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        return Objects.equals(this.f38770f, ig0Var.f38770f) && Objects.equals(this.f38767c, ig0Var.f38767c) && Objects.equals(this.f38765a, ig0Var.f38765a) && Objects.equals(this.f38766b, ig0Var.f38766b) && Objects.equals(this.f38768d, ig0Var.f38768d) && Objects.equals(this.f38769e, ig0Var.f38769e);
    }

    public final int hashCode() {
        return Objects.hash(this.f38765a, this.f38766b, this.f38767c, this.f38768d, this.f38769e, this.f38770f);
    }

    public ig0() {
        this.f38771g = new boolean[6];
    }

    private ig0(@NonNull String str, String str2, Integer num, String str3, String str4, Integer num2, boolean[] zArr) {
        this.f38765a = str;
        this.f38766b = str2;
        this.f38767c = num;
        this.f38768d = str3;
        this.f38769e = str4;
        this.f38770f = num2;
        this.f38771g = zArr;
    }
}
