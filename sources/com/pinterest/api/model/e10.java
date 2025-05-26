package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class e10 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37027a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37028b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("height")
    private Double f37029c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("url")
    private String f37030d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("width")
    private Double f37031e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f37032f;

    public /* synthetic */ e10(String str, String str2, Double d2, String str3, Double d13, boolean[] zArr, int i13) {
        this(str, str2, d2, str3, d13, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e10 e10Var = (e10) obj;
        return Objects.equals(this.f37031e, e10Var.f37031e) && Objects.equals(this.f37029c, e10Var.f37029c) && Objects.equals(this.f37027a, e10Var.f37027a) && Objects.equals(this.f37028b, e10Var.f37028b) && Objects.equals(this.f37030d, e10Var.f37030d);
    }

    public final int hashCode() {
        return Objects.hash(this.f37027a, this.f37028b, this.f37029c, this.f37030d, this.f37031e);
    }

    public e10() {
        this.f37032f = new boolean[5];
    }

    private e10(@NonNull String str, String str2, Double d2, String str3, Double d13, boolean[] zArr) {
        this.f37027a = str;
        this.f37028b = str2;
        this.f37029c = d2;
        this.f37030d = str3;
        this.f37031e = d13;
        this.f37032f = zArr;
    }
}
