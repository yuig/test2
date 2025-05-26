package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    public String f131320a;

    /* renamed from: b, reason: collision with root package name */
    public String f131321b;

    /* renamed from: c, reason: collision with root package name */
    public String f131322c;

    /* renamed from: d, reason: collision with root package name */
    public String f131323d;

    /* renamed from: e, reason: collision with root package name */
    public String f131324e;

    /* renamed from: f, reason: collision with root package name */
    public String f131325f;

    /* renamed from: g, reason: collision with root package name */
    public final int f131326g;

    /* renamed from: h, reason: collision with root package name */
    public String f131327h;

    /* renamed from: i, reason: collision with root package name */
    public String f131328i;

    /* renamed from: j, reason: collision with root package name */
    public String f131329j;

    /* renamed from: k, reason: collision with root package name */
    public String f131330k;

    /* renamed from: l, reason: collision with root package name */
    public String f131331l;

    /* renamed from: m, reason: collision with root package name */
    public String f131332m;

    /* renamed from: n, reason: collision with root package name */
    public String f131333n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f131334o;

    /* renamed from: p, reason: collision with root package name */
    public String f131335p;

    /* renamed from: q, reason: collision with root package name */
    public String f131336q;

    /* renamed from: r, reason: collision with root package name */
    public String f131337r;

    /* renamed from: s, reason: collision with root package name */
    public String f131338s;

    /* renamed from: t, reason: collision with root package name */
    public String f131339t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f131340u;

    public d2(vd0.c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f131320a = "";
        this.f131321b = "";
        this.f131322c = "";
        this.f131323d = "";
        this.f131324e = "";
        this.f131325f = "";
        this.f131327h = "";
        this.f131328i = "";
        this.f131329j = "";
        this.f131330k = "";
        this.f131331l = "";
        this.f131332m = "";
        this.f131333n = "";
        this.f131335p = "";
        this.f131336q = "";
        this.f131337r = "";
        this.f131338s = "";
        this.f131339t = "";
        try {
            this.f131327h = json.o("sdk_client_id", "");
            String o13 = json.o("board_id", "");
            Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
            this.f131320a = o13;
            this.f131321b = json.o("title", "");
            this.f131322c = json.o("description", "");
            this.f131326g = json.j(0, "share_twitter");
            this.f131323d = json.o("source_url", "");
            this.f131324e = json.o("image_url", "");
            this.f131325f = json.o("local_media_uri", "");
            this.f131328i = json.o("method", "");
            this.f131329j = json.o("color", "");
            String o14 = json.o("upload_id", "");
            Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
            this.f131330k = o14;
            this.f131331l = json.o("media_upload_id", "");
            this.f131332m = json.o("section", "");
            this.f131333n = json.o("found_metadata", "");
            Boolean bool = Boolean.FALSE;
            Boolean h10 = json.h("is_auto_pin", bool);
            Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
            this.f131334o = h10.booleanValue();
            this.f131335p = json.o("virtual_try_on_tagged_ids", "");
            this.f131336q = json.o("user_mention_tags", "");
            this.f131337r = json.o("alt_text", "");
            this.f131338s = json.o("session_id", "");
            this.f131339t = json.o("shuffle", "");
            Boolean h13 = json.h("is_shuffle_remixable", bool);
            Intrinsics.checkNotNullExpressionValue(h13, "optBoolean(...)");
            this.f131340u = h13.booleanValue();
        } catch (Exception unused) {
        }
    }

    public final vd0.c a() {
        vd0.c cVar = new vd0.c();
        try {
            cVar.t("sdk_client_id", this.f131327h);
            cVar.t("board_id", this.f131320a);
            cVar.t("title", this.f131321b);
            cVar.t("description", this.f131322c);
            cVar.t("source_url", this.f131323d);
            cVar.t("image_url", this.f131324e);
            cVar.t("local_media_uri", this.f131325f);
            cVar.t("share_twitter", String.valueOf(this.f131326g));
            cVar.t("method", this.f131328i);
            cVar.t("color", this.f131329j);
            cVar.t("upload_id", this.f131330k);
            cVar.t("media_upload_id", this.f131331l);
            cVar.t("section", this.f131332m);
            cVar.t("found_metadata", this.f131333n);
            cVar.s("is_auto_pin", Boolean.valueOf(this.f131334o));
            cVar.t("virtual_try_on_tagged_ids", this.f131335p);
            cVar.t("user_mention_tags", this.f131336q);
            cVar.t("alt_text", this.f131337r);
            cVar.t("session_id", this.f131338s);
            cVar.t("shuffle", this.f131339t);
            cVar.s("is_shuffle_remixable", Boolean.valueOf(this.f131340u));
        } catch (Exception unused) {
        }
        return cVar;
    }

    public d2() {
        this.f131320a = "";
        this.f131321b = "";
        this.f131322c = "";
        this.f131323d = "";
        this.f131324e = "";
        this.f131325f = "";
        this.f131327h = "";
        this.f131328i = "";
        this.f131329j = "";
        this.f131330k = "";
        this.f131331l = "";
        this.f131332m = "";
        this.f131333n = "";
        this.f131335p = "";
        this.f131336q = "";
        this.f131337r = "";
        this.f131338s = "";
        this.f131339t = "";
    }
}
