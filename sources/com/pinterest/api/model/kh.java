package com.pinterest.api.model;

/* loaded from: classes.dex */
public class kh {

    @om.b("pin_display_options")
    private ti A;

    @om.b("display_view_state")
    private Integer B;

    @om.b("module_header_alignment")
    private Integer C;

    @om.b("board_display_options")
    private di D;

    @om.b("explore_article_display_options")
    private oh E;

    /* renamed from: a, reason: collision with root package name */
    @om.b("show_follow_buttons")
    private Boolean f39447a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("tap_only")
    private Boolean f39448b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_button_location")
    private Integer f39449c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("secondary_button_text")
    private String f39450d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("experiment_group")
    private String f39451e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("image_only")
    private Boolean f39452f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("header_hidden")
    private Boolean f39453g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("show_top_divider")
    private Boolean f39454h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("show_bottom_divider")
    private Boolean f39455i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("is_large_article")
    private Boolean f39456j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("has_condensed_header")
    private Boolean f39457k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("banner_aspect_ratio")
    private Float f39458l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("title_text_color")
    private String f39459m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("subtitle_text_color")
    private String f39460n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("num_columns_requested")
    private Integer f39461o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("identifier_icon_name")
    private Integer f39462p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("corner_radius")
    private Integer f39463q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("container_grid_span")
    private Integer f39464r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("header_display")
    private fj f39465s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("content_display")
    private xi f39466t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("footer_display")
    private bj f39467u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("shopping_grid_display")
    private vi f39468v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("item_view_rep_style")
    private pi f39469w;

    /* renamed from: x, reason: collision with root package name */
    @om.b("tiles_grid_layout")
    private jj f39470x;

    /* renamed from: y, reason: collision with root package name */
    @om.b("hide_ui_in_stream")
    private Boolean f39471y;

    /* renamed from: z, reason: collision with root package name */
    @om.b("hide_education_in_stream")
    private Boolean f39472z;

    public final di a() {
        return this.D;
    }

    public final z32.j0 b() {
        Integer num = this.f39464r;
        return num == null ? z32.j0.NONE : z32.j0.findByValue(num.intValue());
    }

    public final xi c() {
        return this.f39466t;
    }

    public final z32.s0 d() {
        Integer num = this.f39463q;
        if (num == null) {
            return null;
        }
        return z32.s0.findByValue(num.intValue());
    }

    public final z32.c e() {
        Integer num = this.B;
        return num == null ? z32.c.EXPANDED : z32.c.findByValue(num.intValue());
    }

    public final oh f() {
        return this.E;
    }

    public final bj g() {
        return this.f39467u;
    }

    public final fj h() {
        return this.f39465s;
    }

    public final Integer i() {
        return this.f39462p;
    }

    public final pi j() {
        return this.f39469w;
    }

    public final z32.i k() {
        Integer num = this.C;
        return num == null ? z32.i.VERTICAL : z32.i.findByValue(num.intValue());
    }

    public final Integer l() {
        return this.f39461o;
    }

    public final ti m() {
        return this.A;
    }

    public final vi n() {
        return this.f39468v;
    }

    public final Boolean o() {
        Boolean bool = this.f39455i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean p() {
        Boolean bool = this.f39454h;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final jj q() {
        return this.f39470x;
    }

    public final void r(fj fjVar) {
        this.f39465s = fjVar;
    }
}
