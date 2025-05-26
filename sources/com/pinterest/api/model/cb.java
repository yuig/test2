package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class cb {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36338a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36339b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("is_merchant")
    private Boolean f36340c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("name")
    private String f36341d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("user_id")
    private String f36342e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36343f;

    public /* synthetic */ cb(String str, String str2, Boolean bool, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, bool, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cb cbVar = (cb) obj;
        return Objects.equals(this.f36340c, cbVar.f36340c) && Objects.equals(this.f36338a, cbVar.f36338a) && Objects.equals(this.f36339b, cbVar.f36339b) && Objects.equals(this.f36341d, cbVar.f36341d) && Objects.equals(this.f36342e, cbVar.f36342e);
    }

    public final Boolean f() {
        Boolean bool = this.f36340c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String g() {
        return this.f36341d;
    }

    public final int hashCode() {
        return Objects.hash(this.f36338a, this.f36339b, this.f36340c, this.f36341d, this.f36342e);
    }

    public cb() {
        this.f36343f = new boolean[5];
    }

    private cb(@NonNull String str, String str2, Boolean bool, String str3, String str4, boolean[] zArr) {
        this.f36338a = str;
        this.f36339b = str2;
        this.f36340c = bool;
        this.f36341d = str3;
        this.f36342e = str4;
        this.f36343f = zArr;
    }
}
