package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ao {

    /* renamed from: a, reason: collision with root package name */
    @om.b("action")
    private dk0 f35817a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("cover_image_url")
    private String f35818b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("dominant_color")
    private String f35819c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35820d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f35821e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("tab_type")
    private String f35822f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35823g;

    public /* synthetic */ ao(dk0 dk0Var, String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(dk0Var, str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ao aoVar = (ao) obj;
        return Objects.equals(this.f35817a, aoVar.f35817a) && Objects.equals(this.f35818b, aoVar.f35818b) && Objects.equals(this.f35819c, aoVar.f35819c) && Objects.equals(this.f35820d, aoVar.f35820d) && Objects.equals(this.f35821e, aoVar.f35821e) && Objects.equals(this.f35822f, aoVar.f35822f);
    }

    public final dk0 g() {
        return this.f35817a;
    }

    public final String h() {
        return this.f35818b;
    }

    public final int hashCode() {
        return Objects.hash(this.f35817a, this.f35818b, this.f35819c, this.f35820d, this.f35821e, this.f35822f);
    }

    public final String i() {
        return this.f35819c;
    }

    public final String j() {
        return this.f35821e;
    }

    public final String k() {
        return this.f35822f;
    }

    public final String l() {
        return this.f35820d;
    }

    public ao() {
        this.f35823g = new boolean[6];
    }

    private ao(dk0 dk0Var, String str, String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, boolean[] zArr) {
        this.f35817a = dk0Var;
        this.f35818b = str;
        this.f35819c = str2;
        this.f35820d = str3;
        this.f35821e = str4;
        this.f35822f = str5;
        this.f35823g = zArr;
    }
}
