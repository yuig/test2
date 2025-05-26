package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class eq implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37320a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37321b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("artist_name")
    private String f37322c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("audio_url")
    private String f37323d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("description")
    private String f37324e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("duration")
    private Double f37325f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("provider_recording_id")
    private String f37326g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("royalty_free")
    private Boolean f37327h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    @om.b("thumbnail_image_url")
    private String f37328i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f37329j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("type")
    private String f37330k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f37331l;

    public /* synthetic */ eq(String str, String str2, String str3, String str4, String str5, Double d2, String str6, Boolean bool, String str7, String str8, String str9, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, d2, str6, bool, str7, str8, str9, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f37320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eq eqVar = (eq) obj;
        return Objects.equals(this.f37327h, eqVar.f37327h) && Objects.equals(this.f37325f, eqVar.f37325f) && Objects.equals(this.f37320a, eqVar.f37320a) && Objects.equals(this.f37321b, eqVar.f37321b) && Objects.equals(this.f37322c, eqVar.f37322c) && Objects.equals(this.f37323d, eqVar.f37323d) && Objects.equals(this.f37324e, eqVar.f37324e) && Objects.equals(this.f37326g, eqVar.f37326g) && Objects.equals(this.f37328i, eqVar.f37328i) && Objects.equals(this.f37329j, eqVar.f37329j) && Objects.equals(this.f37330k, eqVar.f37330k);
    }

    public final int hashCode() {
        return Objects.hash(this.f37320a, this.f37321b, this.f37322c, this.f37323d, this.f37324e, this.f37325f, this.f37326g, this.f37327h, this.f37328i, this.f37329j, this.f37330k);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37321b;
    }

    public final Double u() {
        Double d2 = this.f37325f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean v() {
        Boolean bool = this.f37327h;
        return bool == null ? Boolean.FALSE : bool;
    }

    public eq() {
        this.f37331l = new boolean[11];
    }

    private eq(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, Double d2, String str6, Boolean bool, @NonNull String str7, @NonNull String str8, String str9, boolean[] zArr) {
        this.f37320a = str;
        this.f37321b = str2;
        this.f37322c = str3;
        this.f37323d = str4;
        this.f37324e = str5;
        this.f37325f = d2;
        this.f37326g = str6;
        this.f37327h = bool;
        this.f37328i = str7;
        this.f37329j = str8;
        this.f37330k = str9;
        this.f37331l = zArr;
    }
}
