package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class cz {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36573a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36574b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("close_button_text")
    private String f36575c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("description")
    private tm f36576d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("title")
    private String f36577e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36578f;

    public /* synthetic */ cz(String str, String str2, String str3, tm tmVar, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, tmVar, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cz czVar = (cz) obj;
        return Objects.equals(this.f36573a, czVar.f36573a) && Objects.equals(this.f36574b, czVar.f36574b) && Objects.equals(this.f36575c, czVar.f36575c) && Objects.equals(this.f36576d, czVar.f36576d) && Objects.equals(this.f36577e, czVar.f36577e);
    }

    public final String f() {
        return this.f36575c;
    }

    public final String g() {
        return this.f36577e;
    }

    public final int hashCode() {
        return Objects.hash(this.f36573a, this.f36574b, this.f36575c, this.f36576d, this.f36577e);
    }

    public cz() {
        this.f36578f = new boolean[5];
    }

    private cz(@NonNull String str, String str2, String str3, tm tmVar, String str4, boolean[] zArr) {
        this.f36573a = str;
        this.f36574b = str2;
        this.f36575c = str3;
        this.f36576d = tmVar;
        this.f36577e = str4;
        this.f36578f = zArr;
    }
}
