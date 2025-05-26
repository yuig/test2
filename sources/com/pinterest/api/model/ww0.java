package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ww0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43408a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("action_button_text")
    private String f43409b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_button_type")
    private Integer f43410c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("action_title_text")
    private String f43411d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("action_title_type")
    private Integer f43412e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("audio_url")
    private String f43413f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("key")
    private String f43414g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("quote")
    private String f43415h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("text_content")
    private List<ax0> f43416i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("type")
    private String f43417j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f43418k;

    public /* synthetic */ ww0(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, List list, String str7, boolean[] zArr, int i13) {
        this(str, str2, num, str3, num2, str4, str5, str6, list, str7, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ww0 ww0Var = (ww0) obj;
        return Objects.equals(this.f43412e, ww0Var.f43412e) && Objects.equals(this.f43410c, ww0Var.f43410c) && Objects.equals(this.f43408a, ww0Var.f43408a) && Objects.equals(this.f43409b, ww0Var.f43409b) && Objects.equals(this.f43411d, ww0Var.f43411d) && Objects.equals(this.f43413f, ww0Var.f43413f) && Objects.equals(this.f43414g, ww0Var.f43414g) && Objects.equals(this.f43415h, ww0Var.f43415h) && Objects.equals(this.f43416i, ww0Var.f43416i) && Objects.equals(this.f43417j, ww0Var.f43417j);
    }

    public final int hashCode() {
        return Objects.hash(this.f43408a, this.f43409b, this.f43410c, this.f43411d, this.f43412e, this.f43413f, this.f43414g, this.f43415h, this.f43416i, this.f43417j);
    }

    public ww0() {
        this.f43418k = new boolean[10];
    }

    private ww0(@NonNull String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, List<ax0> list, String str7, boolean[] zArr) {
        this.f43408a = str;
        this.f43409b = str2;
        this.f43410c = num;
        this.f43411d = str3;
        this.f43412e = num2;
        this.f43413f = str4;
        this.f43414g = str5;
        this.f43415h = str6;
        this.f43416i = list;
        this.f43417j = str7;
        this.f43418k = zArr;
    }
}
