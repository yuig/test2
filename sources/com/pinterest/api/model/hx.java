package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class hx {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("artist")
    private String f38554a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("is_embedded")
    private Boolean f38555b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("isrc")
    private String f38556c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("provider_recording_id")
    private String f38557d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("thumbnail_image_url")
    private String f38558e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f38559f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38560g;

    public /* synthetic */ hx(String str, Boolean bool, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, bool, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hx hxVar = (hx) obj;
        return Objects.equals(this.f38555b, hxVar.f38555b) && Objects.equals(this.f38554a, hxVar.f38554a) && Objects.equals(this.f38556c, hxVar.f38556c) && Objects.equals(this.f38557d, hxVar.f38557d) && Objects.equals(this.f38558e, hxVar.f38558e) && Objects.equals(this.f38559f, hxVar.f38559f);
    }

    public final String g() {
        return this.f38554a;
    }

    public final Boolean h() {
        Boolean bool = this.f38555b;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final int hashCode() {
        return Objects.hash(this.f38554a, this.f38555b, this.f38556c, this.f38557d, this.f38558e, this.f38559f);
    }

    public final String i() {
        return this.f38556c;
    }

    public final String j() {
        return this.f38557d;
    }

    public final String k() {
        return this.f38558e;
    }

    public final String l() {
        return this.f38559f;
    }

    public hx() {
        this.f38560g = new boolean[6];
    }

    private hx(@NonNull String str, Boolean bool, String str2, String str3, String str4, @NonNull String str5, boolean[] zArr) {
        this.f38554a = str;
        this.f38555b = bool;
        this.f38556c = str2;
        this.f38557d = str3;
        this.f38558e = str4;
        this.f38559f = str5;
        this.f38560g = zArr;
    }
}
