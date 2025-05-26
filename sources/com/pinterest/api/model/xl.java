package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class xl {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43735a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43736b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action")
    private k00 f43737c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("disabled")
    private Boolean f43738d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("display")
    private o00 f43739e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_selected")
    private Boolean f43740f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("type")
    private String f43741g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f43742h;

    public /* synthetic */ xl(String str, String str2, k00 k00Var, Boolean bool, o00 o00Var, Boolean bool2, String str3, boolean[] zArr, int i13) {
        this(str, str2, k00Var, bool, o00Var, bool2, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xl xlVar = (xl) obj;
        return Objects.equals(this.f43740f, xlVar.f43740f) && Objects.equals(this.f43738d, xlVar.f43738d) && Objects.equals(this.f43735a, xlVar.f43735a) && Objects.equals(this.f43736b, xlVar.f43736b) && Objects.equals(this.f43737c, xlVar.f43737c) && Objects.equals(this.f43739e, xlVar.f43739e) && Objects.equals(this.f43741g, xlVar.f43741g);
    }

    public final k00 h() {
        return this.f43737c;
    }

    public final int hashCode() {
        return Objects.hash(this.f43735a, this.f43736b, this.f43737c, this.f43738d, this.f43739e, this.f43740f, this.f43741g);
    }

    public final Boolean i() {
        Boolean bool = this.f43738d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final o00 j() {
        return this.f43739e;
    }

    public final Boolean k() {
        Boolean bool = this.f43740f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String l() {
        return this.f43736b;
    }

    public final String m() {
        return this.f43741g;
    }

    public final String n() {
        return this.f43735a;
    }

    public xl() {
        this.f43742h = new boolean[7];
    }

    private xl(@NonNull String str, String str2, k00 k00Var, Boolean bool, o00 o00Var, Boolean bool2, String str3, boolean[] zArr) {
        this.f43735a = str;
        this.f43736b = str2;
        this.f43737c = k00Var;
        this.f43738d = bool;
        this.f43739e = o00Var;
        this.f43740f = bool2;
        this.f43741g = str3;
        this.f43742h = zArr;
    }
}
