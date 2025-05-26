package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ua0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42486a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42487b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("primary_action_text")
    private String f42488c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("title")
    private String f42489d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42490e;

    public /* synthetic */ ua0(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f42488c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return Objects.equals(this.f42486a, ua0Var.f42486a) && Objects.equals(this.f42487b, ua0Var.f42487b) && Objects.equals(this.f42488c, ua0Var.f42488c) && Objects.equals(this.f42489d, ua0Var.f42489d);
    }

    public final String f() {
        return this.f42489d;
    }

    public final int hashCode() {
        return Objects.hash(this.f42486a, this.f42487b, this.f42488c, this.f42489d);
    }

    public ua0() {
        this.f42490e = new boolean[4];
    }

    private ua0(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f42486a = str;
        this.f42487b = str2;
        this.f42488c = str3;
        this.f42489d = str4;
        this.f42490e = zArr;
    }
}
