package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class x20 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43540a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43541b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("name")
    private String f43542c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43543d;

    public /* synthetic */ x20(String str, String str2, String str3, boolean[] zArr, int i13) {
        this(str, str2, str3, zArr);
    }

    public final String d() {
        return this.f43542c;
    }

    public final String e() {
        return this.f43540a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x20 x20Var = (x20) obj;
        return Objects.equals(this.f43540a, x20Var.f43540a) && Objects.equals(this.f43541b, x20Var.f43541b) && Objects.equals(this.f43542c, x20Var.f43542c);
    }

    public final int hashCode() {
        return Objects.hash(this.f43540a, this.f43541b, this.f43542c);
    }

    public x20() {
        this.f43543d = new boolean[3];
    }

    private x20(@NonNull String str, String str2, String str3, boolean[] zArr) {
        this.f43540a = str;
        this.f43541b = str2;
        this.f43542c = str3;
        this.f43543d = zArr;
    }
}
