package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class wf0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43249a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43250b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_button_text")
    private String f43251c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("action_button_type")
    private Integer f43252d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("action_title_text")
    private String f43253e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("action_title_type")
    private Integer f43254f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("key")
    private String f43255g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("text_content")
    private List<lf0> f43256h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("audio_url")
    private String f43257i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f43258j;

    public /* synthetic */ wf0(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, List list, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, num, str4, num2, str5, list, str6, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43249a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return Objects.equals(this.f43254f, wf0Var.f43254f) && Objects.equals(this.f43252d, wf0Var.f43252d) && Objects.equals(this.f43249a, wf0Var.f43249a) && Objects.equals(this.f43250b, wf0Var.f43250b) && Objects.equals(this.f43251c, wf0Var.f43251c) && Objects.equals(this.f43253e, wf0Var.f43253e) && Objects.equals(this.f43255g, wf0Var.f43255g) && Objects.equals(this.f43256h, wf0Var.f43256h) && Objects.equals(this.f43257i, wf0Var.f43257i);
    }

    public final int hashCode() {
        return Objects.hash(this.f43249a, this.f43250b, this.f43251c, this.f43252d, this.f43253e, this.f43254f, this.f43255g, this.f43256h, this.f43257i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f43250b;
    }

    public final String q() {
        return this.f43257i;
    }

    public wf0() {
        this.f43258j = new boolean[9];
    }

    private wf0(@NonNull String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, List<lf0> list, String str6, boolean[] zArr) {
        this.f43249a = str;
        this.f43250b = str2;
        this.f43251c = str3;
        this.f43252d = num;
        this.f43253e = str4;
        this.f43254f = num2;
        this.f43255g = str5;
        this.f43256h = list;
        this.f43257i = str6;
        this.f43258j = zArr;
    }
}
