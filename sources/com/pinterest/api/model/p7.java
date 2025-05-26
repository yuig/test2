package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class p7 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40895a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40896b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("data")
    private List<og> f40897c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40898d;

    public /* synthetic */ p7(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    public final List d() {
        return this.f40897c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return Objects.equals(this.f40895a, p7Var.f40895a) && Objects.equals(this.f40896b, p7Var.f40896b) && Objects.equals(this.f40897c, p7Var.f40897c);
    }

    public final int hashCode() {
        return Objects.hash(this.f40895a, this.f40896b, this.f40897c);
    }

    public p7() {
        this.f40898d = new boolean[3];
    }

    private p7(@NonNull String str, String str2, List<og> list, boolean[] zArr) {
        this.f40895a = str;
        this.f40896b = str2;
        this.f40897c = list;
        this.f40898d = zArr;
    }
}
