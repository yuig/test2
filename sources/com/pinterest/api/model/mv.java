package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class mv implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40226a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40227b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("board")
    private v7 f40228c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("conversation")
    private ue f40229d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("created_at")
    private Date f40230e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("deleted_by")
    private Integer f40231f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("event_type")
    private a f40232g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("event_users")
    private List<wy0> f40233h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("is_pending")
    private Boolean f40234i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("message_context")
    private b f40235j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("message_type")
    private c f40236k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("pin")
    private f30 f40237l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("pins")
    private List<f30> f40238m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("reactions")
    private Map<String, String> f40239n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("sender")
    private wy0 f40240o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("text")
    private String f40241p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("thread")
    private cf f40242q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("user")
    private wy0 f40243r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("user_did_it_data")
    private az0 f40244s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f40245t;

    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        PIN_DELETE,
        INVITE_ACCEPT,
        COMMENT,
        INVITE,
        COLLABORATOR_SUGGEST,
        COLLABORATOR_APPROVE
    }

    /* loaded from: classes3.dex */
    public enum b {
        STANDARD,
        SHARED_PIN_CONTEXT,
        GIF_PIN_DRAWER_CONTEXT
    }

    /* loaded from: classes3.dex */
    public enum c {
        NONE(-1),
        MESSAGE(0),
        EVENT(3),
        SHARED_PIN_CONTEXT(4),
        REACTION_SYSTEM_MESSAGE(5),
        BOARD_INVITE_SENT_SYSTEM_MESSAGE(6),
        BOARD_INVITE_ACCEPTED_SYSTEM_MESSAGE(7),
        BOARD_NEW_PINS_SYSTEM_MESSAGE(8),
        EXTERNAL_SHARE_SYSTEM_MESSAGE(9);

        private final int value;

        c(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ mv(String str, String str2, v7 v7Var, ue ueVar, Date date, Integer num, a aVar, List list, Boolean bool, b bVar, c cVar, f30 f30Var, List list2, Map map, wy0 wy0Var, String str3, cf cfVar, wy0 wy0Var2, az0 az0Var, boolean[] zArr, int i13) {
        this(str, str2, v7Var, ueVar, date, num, aVar, list, bool, bVar, cVar, f30Var, list2, map, wy0Var, str3, cfVar, wy0Var2, az0Var, zArr);
    }

    public static lv C() {
        return new lv(0);
    }

    public final v7 D() {
        return this.f40228c;
    }

    public final Date E() {
        return this.f40230e;
    }

    public final Integer F() {
        Integer num = this.f40231f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean G() {
        Boolean bool = this.f40234i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final c H() {
        return this.f40236k;
    }

    public final f30 I() {
        return this.f40237l;
    }

    public final List J() {
        return this.f40238m;
    }

    public final Map K() {
        return this.f40239n;
    }

    public final wy0 L() {
        return this.f40240o;
    }

    public final String M() {
        return this.f40241p;
    }

    public final cf N() {
        return this.f40242q;
    }

    public final wy0 O() {
        return this.f40243r;
    }

    public final az0 P() {
        return this.f40244s;
    }

    public final lv Q() {
        return new lv(this, 0);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f40226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mv mvVar = (mv) obj;
        return Objects.equals(this.f40236k, mvVar.f40236k) && Objects.equals(this.f40235j, mvVar.f40235j) && Objects.equals(this.f40234i, mvVar.f40234i) && Objects.equals(this.f40232g, mvVar.f40232g) && Objects.equals(this.f40231f, mvVar.f40231f) && Objects.equals(this.f40226a, mvVar.f40226a) && Objects.equals(this.f40227b, mvVar.f40227b) && Objects.equals(this.f40228c, mvVar.f40228c) && Objects.equals(this.f40229d, mvVar.f40229d) && Objects.equals(this.f40230e, mvVar.f40230e) && Objects.equals(this.f40233h, mvVar.f40233h) && Objects.equals(this.f40237l, mvVar.f40237l) && Objects.equals(this.f40238m, mvVar.f40238m) && Objects.equals(this.f40239n, mvVar.f40239n) && Objects.equals(this.f40240o, mvVar.f40240o) && Objects.equals(this.f40241p, mvVar.f40241p) && Objects.equals(this.f40242q, mvVar.f40242q) && Objects.equals(this.f40243r, mvVar.f40243r) && Objects.equals(this.f40244s, mvVar.f40244s);
    }

    public final int hashCode() {
        return Objects.hash(this.f40226a, this.f40227b, this.f40228c, this.f40229d, this.f40230e, this.f40231f, this.f40232g, this.f40233h, this.f40234i, this.f40235j, this.f40236k, this.f40237l, this.f40238m, this.f40239n, this.f40240o, this.f40241p, this.f40242q, this.f40243r, this.f40244s);
    }

    @Override // dl1.s
    public final String o() {
        return this.f40227b;
    }

    public mv() {
        this.f40245t = new boolean[19];
    }

    private mv(@NonNull String str, String str2, v7 v7Var, ue ueVar, Date date, Integer num, a aVar, List<wy0> list, Boolean bool, b bVar, c cVar, f30 f30Var, List<f30> list2, Map<String, String> map, wy0 wy0Var, String str3, cf cfVar, wy0 wy0Var2, az0 az0Var, boolean[] zArr) {
        this.f40226a = str;
        this.f40227b = str2;
        this.f40228c = v7Var;
        this.f40229d = ueVar;
        this.f40230e = date;
        this.f40231f = num;
        this.f40232g = aVar;
        this.f40233h = list;
        this.f40234i = bool;
        this.f40235j = bVar;
        this.f40236k = cVar;
        this.f40237l = f30Var;
        this.f40238m = list2;
        this.f40239n = map;
        this.f40240o = wy0Var;
        this.f40241p = str3;
        this.f40242q = cfVar;
        this.f40243r = wy0Var2;
        this.f40244s = az0Var;
        this.f40245t = zArr;
    }
}
