package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class hl implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38473a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38474b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("bottom_padding")
    private Integer f38475c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("font_size")
    private Integer f38476d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("font_weight")
    private Integer f38477e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("left_padding")
    private Integer f38478f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("right_padding")
    private Integer f38479g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("text_alignment")
    private Integer f38480h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f38481i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("top_padding")
    private Integer f38482j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f38483k;

    public /* synthetic */ hl(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, Integer num7, boolean[] zArr, int i13) {
        this(str, str2, num, num2, num3, num4, num5, num6, str3, num7, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f38473a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hl hlVar = (hl) obj;
        return Objects.equals(this.f38482j, hlVar.f38482j) && Objects.equals(this.f38480h, hlVar.f38480h) && Objects.equals(this.f38479g, hlVar.f38479g) && Objects.equals(this.f38478f, hlVar.f38478f) && Objects.equals(this.f38477e, hlVar.f38477e) && Objects.equals(this.f38476d, hlVar.f38476d) && Objects.equals(this.f38475c, hlVar.f38475c) && Objects.equals(this.f38473a, hlVar.f38473a) && Objects.equals(this.f38474b, hlVar.f38474b) && Objects.equals(this.f38481i, hlVar.f38481i);
    }

    public final int hashCode() {
        return Objects.hash(this.f38473a, this.f38474b, this.f38475c, this.f38476d, this.f38477e, this.f38478f, this.f38479g, this.f38480h, this.f38481i, this.f38482j);
    }

    @Override // dl1.s
    public final String o() {
        return this.f38474b;
    }

    public final String s() {
        return this.f38481i;
    }

    public hl() {
        this.f38483k = new boolean[10];
    }

    private hl(@NonNull String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, @NonNull String str3, Integer num7, boolean[] zArr) {
        this.f38473a = str;
        this.f38474b = str2;
        this.f38475c = num;
        this.f38476d = num2;
        this.f38477e = num3;
        this.f38478f = num4;
        this.f38479g = num5;
        this.f38480h = num6;
        this.f38481i = str3;
        this.f38482j = num7;
        this.f38483k = zArr;
    }
}
