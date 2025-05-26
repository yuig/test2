package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ta implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42141a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42142b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("attribution")
    private ls0 f42143c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("frame_height")
    private Integer f42144d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("frame_width")
    private Integer f42145e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("music_url")
    private String f42146f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("timeline")
    private ps0 f42147g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("version")
    private Integer f42148h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("watermark_id")
    private String f42149i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f42150j;

    public /* synthetic */ ta(String str, String str2, ls0 ls0Var, Integer num, Integer num2, String str3, ps0 ps0Var, Integer num3, String str4, boolean[] zArr, int i13) {
        this(str, str2, ls0Var, num, num2, str3, ps0Var, num3, str4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f42141a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ta taVar = (ta) obj;
        return Objects.equals(this.f42148h, taVar.f42148h) && Objects.equals(this.f42145e, taVar.f42145e) && Objects.equals(this.f42144d, taVar.f42144d) && Objects.equals(this.f42141a, taVar.f42141a) && Objects.equals(this.f42142b, taVar.f42142b) && Objects.equals(this.f42143c, taVar.f42143c) && Objects.equals(this.f42146f, taVar.f42146f) && Objects.equals(this.f42147g, taVar.f42147g) && Objects.equals(this.f42149i, taVar.f42149i);
    }

    public final int hashCode() {
        return Objects.hash(this.f42141a, this.f42142b, this.f42143c, this.f42144d, this.f42145e, this.f42146f, this.f42147g, this.f42148h, this.f42149i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42142b;
    }

    public final Integer q() {
        Integer num = this.f42144d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer s() {
        Integer num = this.f42145e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final ps0 u() {
        return this.f42147g;
    }

    public final Integer v() {
        Integer num = this.f42148h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String w() {
        return this.f42149i;
    }

    public ta() {
        this.f42150j = new boolean[9];
    }

    private ta(@NonNull String str, String str2, ls0 ls0Var, Integer num, Integer num2, String str3, @NonNull ps0 ps0Var, Integer num3, String str4, boolean[] zArr) {
        this.f42141a = str;
        this.f42142b = str2;
        this.f42143c = ls0Var;
        this.f42144d = num;
        this.f42145e = num2;
        this.f42146f = str3;
        this.f42147g = ps0Var;
        this.f42148h = num3;
        this.f42149i = str4;
        this.f42150j = zArr;
    }
}
