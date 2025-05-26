package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class x50 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("closeup_unified_description")
    private String f43595a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("grid_title")
    private String f43596b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("rich_metadata")
    private oe0 f43597c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43598d;

    public /* synthetic */ x50(String str, String str2, oe0 oe0Var, boolean[] zArr, int i13) {
        this(str, str2, oe0Var, zArr);
    }

    public final String d() {
        return this.f43595a;
    }

    public final String e() {
        return this.f43596b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x50 x50Var = (x50) obj;
        return Objects.equals(this.f43595a, x50Var.f43595a) && Objects.equals(this.f43596b, x50Var.f43596b) && Objects.equals(this.f43597c, x50Var.f43597c);
    }

    public final oe0 f() {
        return this.f43597c;
    }

    public final int hashCode() {
        return Objects.hash(this.f43595a, this.f43596b, this.f43597c);
    }

    public x50() {
        this.f43598d = new boolean[3];
    }

    private x50(String str, String str2, oe0 oe0Var, boolean[] zArr) {
        this.f43595a = str;
        this.f43596b = str2;
        this.f43597c = oe0Var;
        this.f43598d = zArr;
    }
}
