package com.pinterest.api.model;

import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public class wz {

    /* renamed from: a, reason: collision with root package name */
    @om.b("amazon_3p_percentage_off")
    private String f43502a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("availability")
    private a f43503b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("condition")
    private b f43504c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("id")
    private String f43505d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("in_stock")
    private Boolean f43506e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("max_price")
    private String f43507f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("min_price")
    private String f43508g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("percentage_off")
    private String f43509h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("price")
    private String f43510i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("sale_end_date")
    private Date f43511j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("sale_start_date")
    private Date f43512k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("standard_price")
    private String f43513l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f43514m;

    public enum a {
        DEFAULT(0),
        IN_STOCK(1),
        OUT_OF_STOCK(2),
        PREORDER(3),
        UNKNOWN(4);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum b {
        NEW(1),
        USED(2),
        REFURBISHED(3);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ wz(String str, a aVar, b bVar, String str2, Boolean bool, String str3, String str4, String str5, String str6, Date date, Date date2, String str7, boolean[] zArr, int i13) {
        this(str, aVar, bVar, str2, bool, str3, str4, str5, str6, date, date2, str7, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wz wzVar = (wz) obj;
        return Objects.equals(this.f43506e, wzVar.f43506e) && Objects.equals(this.f43504c, wzVar.f43504c) && Objects.equals(this.f43503b, wzVar.f43503b) && Objects.equals(this.f43502a, wzVar.f43502a) && Objects.equals(this.f43505d, wzVar.f43505d) && Objects.equals(this.f43507f, wzVar.f43507f) && Objects.equals(this.f43508g, wzVar.f43508g) && Objects.equals(this.f43509h, wzVar.f43509h) && Objects.equals(this.f43510i, wzVar.f43510i) && Objects.equals(this.f43511j, wzVar.f43511j) && Objects.equals(this.f43512k, wzVar.f43512k) && Objects.equals(this.f43513l, wzVar.f43513l);
    }

    public final int hashCode() {
        return Objects.hash(this.f43502a, this.f43503b, this.f43504c, this.f43505d, this.f43506e, this.f43507f, this.f43508g, this.f43509h, this.f43510i, this.f43511j, this.f43512k, this.f43513l);
    }

    public final a m() {
        return this.f43503b;
    }

    public final Boolean n() {
        Boolean bool = this.f43506e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String o() {
        return this.f43507f;
    }

    public final String p() {
        return this.f43508g;
    }

    public final String q() {
        return this.f43509h;
    }

    public final String r() {
        return this.f43510i;
    }

    public final String s() {
        return this.f43513l;
    }

    public wz() {
        this.f43514m = new boolean[12];
    }

    private wz(String str, a aVar, b bVar, String str2, Boolean bool, String str3, String str4, String str5, String str6, Date date, Date date2, String str7, boolean[] zArr) {
        this.f43502a = str;
        this.f43503b = aVar;
        this.f43504c = bVar;
        this.f43505d = str2;
        this.f43506e = bool;
        this.f43507f = str3;
        this.f43508g = str4;
        this.f43509h = str5;
        this.f43510i = str6;
        this.f43511j = date;
        this.f43512k = date2;
        this.f43513l = str7;
        this.f43514m = zArr;
    }
}
