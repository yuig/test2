package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ag0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35726a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f35727b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_button_text")
    private String f35728c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("action_button_type")
    private Integer f35729d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("action_title_text")
    private String f35730e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("action_title_type")
    private Integer f35731f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("key")
    private String f35732g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("text_content")
    private List<lf0> f35733h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("quote")
    private String f35734i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f35735j;

    public /* synthetic */ ag0(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, List list, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, num, str4, num2, str5, list, str6, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f35726a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ag0 ag0Var = (ag0) obj;
        return Objects.equals(this.f35731f, ag0Var.f35731f) && Objects.equals(this.f35729d, ag0Var.f35729d) && Objects.equals(this.f35726a, ag0Var.f35726a) && Objects.equals(this.f35727b, ag0Var.f35727b) && Objects.equals(this.f35728c, ag0Var.f35728c) && Objects.equals(this.f35730e, ag0Var.f35730e) && Objects.equals(this.f35732g, ag0Var.f35732g) && Objects.equals(this.f35733h, ag0Var.f35733h) && Objects.equals(this.f35734i, ag0Var.f35734i);
    }

    public final int hashCode() {
        return Objects.hash(this.f35726a, this.f35727b, this.f35728c, this.f35729d, this.f35730e, this.f35731f, this.f35732g, this.f35733h, this.f35734i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f35727b;
    }

    public final String q() {
        return this.f35734i;
    }

    public ag0() {
        this.f35735j = new boolean[9];
    }

    private ag0(@NonNull String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, List<lf0> list, String str6, boolean[] zArr) {
        this.f35726a = str;
        this.f35727b = str2;
        this.f35728c = str3;
        this.f35729d = num;
        this.f35730e = str4;
        this.f35731f = num2;
        this.f35732g = str5;
        this.f35733h = list;
        this.f35734i = str6;
        this.f35735j = zArr;
    }
}
