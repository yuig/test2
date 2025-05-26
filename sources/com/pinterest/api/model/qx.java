package com.pinterest.api.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class qx implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("id")
    private String f41394a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("news_type")
    private tx f41395b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("category")
    private String f41396c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("display_mode")
    private dh f41397d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("detail_header")
    private String f41398e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("last_updated_at")
    private Date f41399f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("header_icon_image_url")
    private String f41400g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("header_icon_object_ids")
    private String f41401h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("header_small_overlay_icon_image_url")
    private String f41402i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("header_small_overlay_icon_image_url_dark")
    private String f41403j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("subscribable_object_ids")
    private String f41404k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("content_text")
    private String f41405l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("header_text")
    private String f41406m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("title_text")
    private String f41407n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("sub_header_text")
    private String f41408o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("content_item_count")
    private Integer f41409p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("override_click_url")
    private String f41410q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("unique_action_object_count")
    private Integer f41411r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("encoded_display_mode")
    private Integer f41412s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("unread")
    private Boolean f41413t;

    /* renamed from: u, reason: collision with root package name */
    public List f41414u;

    /* renamed from: v, reason: collision with root package name */
    public List f41415v;

    /* renamed from: w, reason: collision with root package name */
    public List f41416w;

    /* renamed from: x, reason: collision with root package name */
    public Map f41417x;

    public qx() {
    }

    public static qx A() {
        qx qxVar = new qx();
        qxVar.f41394a = UUID.randomUUID().toString();
        qxVar.f41397d = dh.DISPLAY_MODE_EMPTY_ITEM;
        return qxVar;
    }

    public static qx B(String str) {
        qx qxVar = new qx();
        qxVar.f41394a = str;
        return qxVar;
    }

    public static qx C(String str) {
        qx qxVar = new qx();
        qxVar.f41394a = UUID.randomUUID().toString();
        qxVar.f41406m = str;
        qxVar.f41397d = dh.DISPLAY_MODE_SECTION_TITLE;
        return qxVar;
    }

    public final void D(dh dhVar) {
        this.f41397d = dhVar;
    }

    public final void E() {
        this.f41413t = Boolean.FALSE;
    }

    public final Integer a() {
        Integer num = this.f41409p;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    @Override // dl1.s
    public final String b() {
        return this.f41394a;
    }

    public final String c() {
        return this.f41405l;
    }

    public final String e() {
        return this.f41398e;
    }

    public final dh g() {
        dh dhVar = this.f41397d;
        return dhVar == null ? dh.DISPLAY_MODE_BASIC : dhVar;
    }

    public final Integer h() {
        Integer num = this.f41412s;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String j() {
        return this.f41400g;
    }

    public final String k() {
        return this.f41401h;
    }

    public final String l() {
        return this.f41402i;
    }

    public final String n() {
        return this.f41403j;
    }

    public final String q() {
        return this.f41406m;
    }

    public final Date s() {
        return this.f41399f;
    }

    public final tx u() {
        tx txVar = this.f41395b;
        return txVar == null ? tx.SYSTEM_RECOMMENDATION : txVar;
    }

    public final String v() {
        return this.f41410q;
    }

    public final String w() {
        return this.f41404k;
    }

    public final String x() {
        return this.f41407n;
    }

    public final Boolean y() {
        Boolean bool = this.f41413t;
        return Boolean.valueOf(bool == null ? false : bool.booleanValue());
    }

    public final boolean z() {
        dh dhVar = this.f41397d;
        return dhVar == dh.DISPLAY_MODE_TOP_PICK_PIN || dhVar == dh.DISPLAY_MODE_TOP_PICK_BOARD || dhVar == dh.DISPLAY_MODE_TOP_PICK_SEARCH;
    }

    public qx(Long l13) {
    }
}
