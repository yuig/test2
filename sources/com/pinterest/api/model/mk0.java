package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class mk0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40144a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40145b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("aac_signature")
    private String f40146c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("artist_name")
    private String f40147d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("audio_signature")
    private String f40148e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("audio_url")
    private String f40149f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("description")
    private String f40150g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("duration")
    private Double f40151h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("image_signature")
    private String f40152i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("provider_recording_id")
    private String f40153j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("royalty_free")
    private Boolean f40154k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("title")
    private String f40155l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f40156m;

    public /* synthetic */ mk0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d2, String str8, String str9, Boolean bool, String str10, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, d2, str8, str9, bool, str10, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mk0 mk0Var = (mk0) obj;
        return Objects.equals(this.f40154k, mk0Var.f40154k) && Objects.equals(this.f40151h, mk0Var.f40151h) && Objects.equals(this.f40144a, mk0Var.f40144a) && Objects.equals(this.f40145b, mk0Var.f40145b) && Objects.equals(this.f40146c, mk0Var.f40146c) && Objects.equals(this.f40147d, mk0Var.f40147d) && Objects.equals(this.f40148e, mk0Var.f40148e) && Objects.equals(this.f40149f, mk0Var.f40149f) && Objects.equals(this.f40150g, mk0Var.f40150g) && Objects.equals(this.f40152i, mk0Var.f40152i) && Objects.equals(this.f40153j, mk0Var.f40153j) && Objects.equals(this.f40155l, mk0Var.f40155l);
    }

    public final int hashCode() {
        return Objects.hash(this.f40144a, this.f40145b, this.f40146c, this.f40147d, this.f40148e, this.f40149f, this.f40150g, this.f40151h, this.f40152i, this.f40153j, this.f40154k, this.f40155l);
    }

    public final Boolean m() {
        Boolean bool = this.f40154k;
        return bool == null ? Boolean.FALSE : bool;
    }

    public mk0() {
        this.f40156m = new boolean[12];
    }

    private mk0(@NonNull String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d2, String str8, String str9, Boolean bool, String str10, boolean[] zArr) {
        this.f40144a = str;
        this.f40145b = str2;
        this.f40146c = str3;
        this.f40147d = str4;
        this.f40148e = str5;
        this.f40149f = str6;
        this.f40150g = str7;
        this.f40151h = d2;
        this.f40152i = str8;
        this.f40153j = str9;
        this.f40154k = bool;
        this.f40155l = str10;
        this.f40156m = zArr;
    }
}
