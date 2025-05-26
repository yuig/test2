package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class e5 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37178a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37179b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("pin_click")
    private q3 f37180c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f37181d;

    public /* synthetic */ e5(String str, String str2, q3 q3Var, boolean[] zArr, int i13) {
        this(str, str2, q3Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return Objects.equals(this.f37178a, e5Var.f37178a) && Objects.equals(this.f37179b, e5Var.f37179b) && Objects.equals(this.f37180c, e5Var.f37180c);
    }

    public final int hashCode() {
        return Objects.hash(this.f37178a, this.f37179b, this.f37180c);
    }

    public e5() {
        this.f37181d = new boolean[3];
    }

    private e5(@NonNull String str, String str2, q3 q3Var, boolean[] zArr) {
        this.f37178a = str;
        this.f37179b = str2;
        this.f37180c = q3Var;
        this.f37181d = zArr;
    }
}
