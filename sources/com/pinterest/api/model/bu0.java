package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class bu0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36204a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36205b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("asset_id")
    private String f36206c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_height")
    private Integer f36207d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image_url")
    private String f36208e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("image_width")
    private Integer f36209f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("item_id")
    private String f36210g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("third_party_badge_type")
    private a f36211h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("title")
    private String f36212i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f36213j;

    /* loaded from: classes3.dex */
    public enum a {
        UNKNOWN(0),
        BRANDING(1);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ bu0(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, a aVar, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, num, str4, num2, str5, aVar, str6, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bu0 bu0Var = (bu0) obj;
        return Objects.equals(this.f36211h, bu0Var.f36211h) && Objects.equals(this.f36209f, bu0Var.f36209f) && Objects.equals(this.f36207d, bu0Var.f36207d) && Objects.equals(this.f36204a, bu0Var.f36204a) && Objects.equals(this.f36205b, bu0Var.f36205b) && Objects.equals(this.f36206c, bu0Var.f36206c) && Objects.equals(this.f36208e, bu0Var.f36208e) && Objects.equals(this.f36210g, bu0Var.f36210g) && Objects.equals(this.f36212i, bu0Var.f36212i);
    }

    public final int hashCode() {
        return Objects.hash(this.f36204a, this.f36205b, this.f36206c, this.f36207d, this.f36208e, this.f36209f, this.f36210g, this.f36211h, this.f36212i);
    }

    public final String j() {
        return this.f36206c;
    }

    public final String k() {
        return this.f36208e;
    }

    public bu0() {
        this.f36213j = new boolean[9];
    }

    private bu0(@NonNull String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, a aVar, String str6, boolean[] zArr) {
        this.f36204a = str;
        this.f36205b = str2;
        this.f36206c = str3;
        this.f36207d = num;
        this.f36208e = str4;
        this.f36209f = num2;
        this.f36210g = str5;
        this.f36211h = aVar;
        this.f36212i = str6;
        this.f36213j = zArr;
    }
}
