package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f2 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131361d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131362e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131363f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f131364g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131365h;

    /* renamed from: i, reason: collision with root package name */
    public final String f131366i;

    /* renamed from: j, reason: collision with root package name */
    public final String f131367j;

    /* renamed from: k, reason: collision with root package name */
    public final String f131368k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f131369l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f131370m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f131371n;

    /* renamed from: o, reason: collision with root package name */
    public final String f131372o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f131373p;

    /* renamed from: q, reason: collision with root package name */
    public final n00.c f131374q;

    /* renamed from: r, reason: collision with root package name */
    public final String f131375r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f131376s;

    /* renamed from: t, reason: collision with root package name */
    public final String f131377t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(String uid, String boardId, String str, boolean z13, String str2, String str3, String str4, String altText, boolean z14, boolean z15, boolean z16, String str5, boolean z17, n00.c cVar, String str6, Integer num, String str7, int i13) {
        super(uid);
        n00.c cVar2 = (i13 & 8192) != 0 ? null : cVar;
        String str8 = (32768 & i13) != 0 ? null : str6;
        Integer num2 = (65536 & i13) != 0 ? null : num;
        String str9 = (i13 & 131072) == 0 ? str7 : null;
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(altText, "altText");
        this.f131361d = uid;
        this.f131362e = boardId;
        this.f131363f = str;
        this.f131364g = z13;
        this.f131365h = str2;
        this.f131366i = str3;
        this.f131367j = str4;
        this.f131368k = altText;
        this.f131369l = z14;
        this.f131370m = z15;
        this.f131371n = z16;
        this.f131372o = str5;
        this.f131373p = z17;
        this.f131374q = cVar2;
        this.f131375r = str8;
        this.f131376s = num2;
        this.f131377t = str9;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131361d;
    }
}
