package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class zq implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44403a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44404b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("closeup_image_url")
    private String f44405c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("display_name")
    private String f44406d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("has_color")
    private Boolean f44407e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_color_editable")
    private Boolean f44408f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("should_show_color_picker_after_selection")
    private Boolean f44409g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("sticker_type")
    private Integer f44410h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    @om.b("thumbnail_image_url")
    private String f44411i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f44412j;

    public /* synthetic */ zq(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, bool, bool2, bool3, num, str5, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f44403a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zq zqVar = (zq) obj;
        return Objects.equals(this.f44410h, zqVar.f44410h) && Objects.equals(this.f44409g, zqVar.f44409g) && Objects.equals(this.f44408f, zqVar.f44408f) && Objects.equals(this.f44407e, zqVar.f44407e) && Objects.equals(this.f44403a, zqVar.f44403a) && Objects.equals(this.f44404b, zqVar.f44404b) && Objects.equals(this.f44405c, zqVar.f44405c) && Objects.equals(this.f44406d, zqVar.f44406d) && Objects.equals(this.f44411i, zqVar.f44411i);
    }

    public final int hashCode() {
        return Objects.hash(this.f44403a, this.f44404b, this.f44405c, this.f44406d, this.f44407e, this.f44408f, this.f44409g, this.f44410h, this.f44411i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f44404b;
    }

    public final String q() {
        return this.f44405c;
    }

    public final String s() {
        return this.f44406d;
    }

    public final Boolean u() {
        Boolean bool = this.f44407e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean v() {
        Boolean bool = this.f44408f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean w() {
        Boolean bool = this.f44409g;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer x() {
        Integer num = this.f44410h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String y() {
        return this.f44411i;
    }

    public zq() {
        this.f44412j = new boolean[9];
    }

    private zq(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, Boolean bool, Boolean bool2, Boolean bool3, Integer num, @NonNull String str5, boolean[] zArr) {
        this.f44403a = str;
        this.f44404b = str2;
        this.f44405c = str3;
        this.f44406d = str4;
        this.f44407e = bool;
        this.f44408f = bool2;
        this.f44409g = bool3;
        this.f44410h = num;
        this.f44411i = str5;
        this.f44412j = zArr;
    }
}
