package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class fx0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37839a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37840b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_color")
    private String f37841c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("description")
    private String f37842d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("display_name")
    private String f37843e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_viewing_user_subscribed")
    private Boolean f37844f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("large_image_url")
    private String f37845g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("recent_subscribers")
    private List<wy0> f37846h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("small_image_url")
    private String f37847i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("subscriber_count")
    private Integer f37848j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f37849k;

    public /* synthetic */ fx0(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, List list, String str7, Integer num, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, bool, str6, list, str7, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        return Objects.equals(this.f37848j, fx0Var.f37848j) && Objects.equals(this.f37844f, fx0Var.f37844f) && Objects.equals(this.f37839a, fx0Var.f37839a) && Objects.equals(this.f37840b, fx0Var.f37840b) && Objects.equals(this.f37841c, fx0Var.f37841c) && Objects.equals(this.f37842d, fx0Var.f37842d) && Objects.equals(this.f37843e, fx0Var.f37843e) && Objects.equals(this.f37845g, fx0Var.f37845g) && Objects.equals(this.f37846h, fx0Var.f37846h) && Objects.equals(this.f37847i, fx0Var.f37847i);
    }

    public final int hashCode() {
        return Objects.hash(this.f37839a, this.f37840b, this.f37841c, this.f37842d, this.f37843e, this.f37844f, this.f37845g, this.f37846h, this.f37847i, this.f37848j);
    }

    public fx0() {
        this.f37849k = new boolean[10];
    }

    private fx0(@NonNull String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, List<wy0> list, String str7, Integer num, boolean[] zArr) {
        this.f37839a = str;
        this.f37840b = str2;
        this.f37841c = str3;
        this.f37842d = str4;
        this.f37843e = str5;
        this.f37844f = bool;
        this.f37845g = str6;
        this.f37846h = list;
        this.f37847i = str7;
        this.f37848j = num;
        this.f37849k = zArr;
    }
}
