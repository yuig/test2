package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class k extends zm2.q {

    /* renamed from: J, reason: collision with root package name */
    public static final k f118347J;
    public static final a K = new a(3);
    public int A;
    public List B;
    public List C;
    public int D;
    public y0 E;
    public List F;
    public f1 G;
    public byte H;
    public int I;

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118348b;

    /* renamed from: c, reason: collision with root package name */
    public int f118349c;

    /* renamed from: d, reason: collision with root package name */
    public int f118350d;

    /* renamed from: e, reason: collision with root package name */
    public int f118351e;

    /* renamed from: f, reason: collision with root package name */
    public int f118352f;

    /* renamed from: g, reason: collision with root package name */
    public List f118353g;

    /* renamed from: h, reason: collision with root package name */
    public List f118354h;

    /* renamed from: i, reason: collision with root package name */
    public List f118355i;

    /* renamed from: j, reason: collision with root package name */
    public int f118356j;

    /* renamed from: k, reason: collision with root package name */
    public List f118357k;

    /* renamed from: l, reason: collision with root package name */
    public int f118358l;

    /* renamed from: m, reason: collision with root package name */
    public List f118359m;

    /* renamed from: n, reason: collision with root package name */
    public List f118360n;

    /* renamed from: o, reason: collision with root package name */
    public int f118361o;

    /* renamed from: p, reason: collision with root package name */
    public List f118362p;

    /* renamed from: q, reason: collision with root package name */
    public List f118363q;

    /* renamed from: r, reason: collision with root package name */
    public List f118364r;

    /* renamed from: s, reason: collision with root package name */
    public List f118365s;

    /* renamed from: t, reason: collision with root package name */
    public List f118366t;

    /* renamed from: u, reason: collision with root package name */
    public List f118367u;

    /* renamed from: v, reason: collision with root package name */
    public int f118368v;

    /* renamed from: w, reason: collision with root package name */
    public int f118369w;

    /* renamed from: x, reason: collision with root package name */
    public s0 f118370x;

    /* renamed from: y, reason: collision with root package name */
    public int f118371y;

    /* renamed from: z, reason: collision with root package name */
    public List f118372z;

    static {
        k kVar = new k();
        f118347J = kVar;
        kVar.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public k(zm2.h hVar, zm2.k kVar) {
        boolean z13;
        n nVar;
        this.f118356j = -1;
        this.f118358l = -1;
        this.f118361o = -1;
        this.f118368v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        v();
        zm2.f l13 = zm2.g.l();
        zm2.i u13 = zm2.i.u(l13, 1);
        boolean z14 = false;
        char c13 = 0;
        while (true) {
            ?? r53 = 524288;
            if (z14) {
                if (((c13 == true ? 1 : 0) & 32) == 32) {
                    this.f118355i = Collections.unmodifiableList(this.f118355i);
                }
                if (((c13 == true ? 1 : 0) & 8) == 8) {
                    this.f118353g = Collections.unmodifiableList(this.f118353g);
                }
                if (((c13 == true ? 1 : 0) & 16) == 16) {
                    this.f118354h = Collections.unmodifiableList(this.f118354h);
                }
                if (((c13 == true ? 1 : 0) & 64) == 64) {
                    this.f118357k = Collections.unmodifiableList(this.f118357k);
                }
                if (((c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
                    this.f118362p = Collections.unmodifiableList(this.f118362p);
                }
                if (((c13 == true ? 1 : 0) & 1024) == 1024) {
                    this.f118363q = Collections.unmodifiableList(this.f118363q);
                }
                if (((c13 == true ? 1 : 0) & 2048) == 2048) {
                    this.f118364r = Collections.unmodifiableList(this.f118364r);
                }
                if (((c13 == true ? 1 : 0) & 4096) == 4096) {
                    this.f118365s = Collections.unmodifiableList(this.f118365s);
                }
                if (((c13 == true ? 1 : 0) & 8192) == 8192) {
                    this.f118366t = Collections.unmodifiableList(this.f118366t);
                }
                if (((c13 == true ? 1 : 0) & 16384) == 16384) {
                    this.f118367u = Collections.unmodifiableList(this.f118367u);
                }
                if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
                    this.f118359m = Collections.unmodifiableList(this.f118359m);
                }
                if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                    this.f118360n = Collections.unmodifiableList(this.f118360n);
                }
                if (((c13 == true ? 1 : 0) & 262144) == 262144) {
                    this.f118372z = Collections.unmodifiableList(this.f118372z);
                }
                if (((c13 == true ? 1 : 0) & 524288) == 524288) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if (((c13 == true ? 1 : 0) & 1048576) == 1048576) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if (((c13 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f118348b = l13.d();
                    throw th3;
                }
                this.f118348b = l13.d();
                l();
                return;
            }
            try {
                try {
                    try {
                        int o13 = hVar.o();
                        b bVar = null;
                        switch (o13) {
                            case 0:
                                z13 = true;
                                z14 = true;
                                c13 = c13;
                            case 8:
                                z13 = true;
                                this.f118349c |= 1;
                                this.f118350d = hVar.e();
                                c13 = c13;
                            case 16:
                                int i13 = (c13 == true ? 1 : 0) & 32;
                                char c14 = c13;
                                if (i13 != 32) {
                                    this.f118355i = new ArrayList();
                                    c14 = (c13 == true ? 1 : 0) | ' ';
                                }
                                this.f118355i.add(Integer.valueOf(hVar.e()));
                                c13 = c14;
                                z13 = true;
                                c13 = c13;
                            case 18:
                                int c15 = hVar.c(hVar.j());
                                int i14 = (c13 == true ? 1 : 0) & 32;
                                char c16 = c13;
                                if (i14 != 32) {
                                    c16 = c13;
                                    if (hVar.a() > 0) {
                                        this.f118355i = new ArrayList();
                                        c16 = (c13 == true ? 1 : 0) | ' ';
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.f118355i.add(Integer.valueOf(hVar.e()));
                                }
                                hVar.b(c15);
                                c13 = c16;
                                z13 = true;
                                c13 = c13;
                            case 24:
                                this.f118349c |= 2;
                                this.f118351e = hVar.e();
                                c13 = c13;
                                z13 = true;
                                c13 = c13;
                            case 32:
                                this.f118349c |= 4;
                                this.f118352f = hVar.e();
                                c13 = c13;
                                z13 = true;
                                c13 = c13;
                            case 42:
                                int i15 = (c13 == true ? 1 : 0) & 8;
                                char c17 = c13;
                                if (i15 != 8) {
                                    this.f118353g = new ArrayList();
                                    c17 = (c13 == true ? 1 : 0) | '\b';
                                }
                                this.f118353g.add(hVar.f(x0.f118530n, kVar));
                                c13 = c17;
                                z13 = true;
                                c13 = c13;
                            case 50:
                                int i16 = (c13 == true ? 1 : 0) & 16;
                                char c18 = c13;
                                if (i16 != 16) {
                                    this.f118354h = new ArrayList();
                                    c18 = (c13 == true ? 1 : 0) | 16;
                                }
                                this.f118354h.add(hVar.f(s0.f118451u, kVar));
                                c13 = c18;
                                z13 = true;
                                c13 = c13;
                            case 56:
                                int i17 = (c13 == true ? 1 : 0) & 64;
                                char c19 = c13;
                                if (i17 != 64) {
                                    this.f118357k = new ArrayList();
                                    c19 = (c13 == true ? 1 : 0) | '@';
                                }
                                this.f118357k.add(Integer.valueOf(hVar.e()));
                                c13 = c19;
                                z13 = true;
                                c13 = c13;
                            case 58:
                                int c23 = hVar.c(hVar.j());
                                int i18 = (c13 == true ? 1 : 0) & 64;
                                char c24 = c13;
                                if (i18 != 64) {
                                    c24 = c13;
                                    if (hVar.a() > 0) {
                                        this.f118357k = new ArrayList();
                                        c24 = (c13 == true ? 1 : 0) | '@';
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.f118357k.add(Integer.valueOf(hVar.e()));
                                }
                                hVar.b(c23);
                                c13 = c24;
                                z13 = true;
                                c13 = c13;
                            case 66:
                                int i19 = (c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                char c25 = c13;
                                if (i19 != 512) {
                                    this.f118362p = new ArrayList();
                                    c25 = (c13 == true ? 1 : 0) | 512;
                                }
                                this.f118362p.add(hVar.f(m.f118387j, kVar));
                                c13 = c25;
                                z13 = true;
                                c13 = c13;
                            case 74:
                                int i23 = (c13 == true ? 1 : 0) & 1024;
                                char c26 = c13;
                                if (i23 != 1024) {
                                    this.f118363q = new ArrayList();
                                    c26 = (c13 == true ? 1 : 0) | 1024;
                                }
                                this.f118363q.add(hVar.f(a0.f118143v, kVar));
                                c13 = c26;
                                z13 = true;
                                c13 = c13;
                            case 82:
                                int i24 = (c13 == true ? 1 : 0) & 2048;
                                char c27 = c13;
                                if (i24 != 2048) {
                                    this.f118364r = new ArrayList();
                                    c27 = (c13 == true ? 1 : 0) | 2048;
                                }
                                this.f118364r.add(hVar.f(i0.f118323v, kVar));
                                c13 = c27;
                                z13 = true;
                                c13 = c13;
                            case 90:
                                int i25 = (c13 == true ? 1 : 0) & 4096;
                                char c28 = c13;
                                if (i25 != 4096) {
                                    this.f118365s = new ArrayList();
                                    c28 = (c13 == true ? 1 : 0) | 4096;
                                }
                                this.f118365s.add(hVar.f(u0.f118493p, kVar));
                                c13 = c28;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                                int i26 = (c13 == true ? 1 : 0) & 8192;
                                char c29 = c13;
                                if (i26 != 8192) {
                                    this.f118366t = new ArrayList();
                                    c29 = (c13 == true ? 1 : 0) | 8192;
                                }
                                this.f118366t.add(hVar.f(v.f118508h, kVar));
                                c13 = c29;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                                int i27 = (c13 == true ? 1 : 0) & 16384;
                                char c33 = c13;
                                if (i27 != 16384) {
                                    this.f118367u = new ArrayList();
                                    c33 = (c13 == true ? 1 : 0) | 16384;
                                }
                                this.f118367u.add(Integer.valueOf(hVar.e()));
                                c13 = c33;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                                int c34 = hVar.c(hVar.j());
                                int i28 = (c13 == true ? 1 : 0) & 16384;
                                char c35 = c13;
                                if (i28 != 16384) {
                                    c35 = c13;
                                    if (hVar.a() > 0) {
                                        this.f118367u = new ArrayList();
                                        c35 = (c13 == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.f118367u.add(Integer.valueOf(hVar.e()));
                                }
                                hVar.b(c34);
                                c13 = c35;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                                this.f118349c |= 8;
                                this.f118369w = hVar.e();
                                c13 = c13;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                                r0 c36 = (this.f118349c & 16) == 16 ? this.f118370x.c() : null;
                                s0 s0Var = (s0) hVar.f(s0.f118451u, kVar);
                                this.f118370x = s0Var;
                                if (c36 != null) {
                                    c36.l(s0Var);
                                    this.f118370x = c36.k();
                                }
                                this.f118349c |= 16;
                                c13 = c13;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                                this.f118349c |= 32;
                                this.f118371y = hVar.e();
                                c13 = c13;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER /* 162 */:
                                int i29 = (c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                                char c37 = c13;
                                if (i29 != 128) {
                                    this.f118359m = new ArrayList();
                                    c37 = (c13 == true ? 1 : 0) | 128;
                                }
                                this.f118359m.add(hVar.f(s0.f118451u, kVar));
                                c13 = c37;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION /* 168 */:
                                int i33 = (c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                char c38 = c13;
                                if (i33 != 256) {
                                    this.f118360n = new ArrayList();
                                    c38 = (c13 == true ? 1 : 0) | 256;
                                }
                                this.f118360n.add(Integer.valueOf(hVar.e()));
                                c13 = c38;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                                int c39 = hVar.c(hVar.j());
                                int i34 = (c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                char c43 = c13;
                                if (i34 != 256) {
                                    c43 = c13;
                                    if (hVar.a() > 0) {
                                        this.f118360n = new ArrayList();
                                        c43 = (c13 == true ? 1 : 0) | 256;
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.f118360n.add(Integer.valueOf(hVar.e()));
                                }
                                hVar.b(c39);
                                c13 = c43;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                                int i35 = (c13 == true ? 1 : 0) & 262144;
                                char c44 = c13;
                                if (i35 != 262144) {
                                    this.f118372z = new ArrayList();
                                    c44 = (c13 == true ? 1 : 0) | 0;
                                }
                                this.f118372z.add(Integer.valueOf(hVar.e()));
                                c13 = c44;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD /* 178 */:
                                int c45 = hVar.c(hVar.j());
                                int i36 = (c13 == true ? 1 : 0) & 262144;
                                char c46 = c13;
                                if (i36 != 262144) {
                                    c46 = c13;
                                    if (hVar.a() > 0) {
                                        this.f118372z = new ArrayList();
                                        c46 = (c13 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.f118372z.add(Integer.valueOf(hVar.e()));
                                }
                                hVar.b(c45);
                                c13 = c46;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
                                int i37 = (c13 == true ? 1 : 0) & 524288;
                                char c47 = c13;
                                if (i37 != 524288) {
                                    this.B = new ArrayList();
                                    c47 = (c13 == true ? 1 : 0) | 0;
                                }
                                this.B.add(hVar.f(s0.f118451u, kVar));
                                c13 = c47;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY /* 192 */:
                                int i38 = (c13 == true ? 1 : 0) & 1048576;
                                char c48 = c13;
                                if (i38 != 1048576) {
                                    this.C = new ArrayList();
                                    c48 = (c13 == true ? 1 : 0) | 0;
                                }
                                this.C.add(Integer.valueOf(hVar.e()));
                                c13 = c48;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL /* 194 */:
                                int c49 = hVar.c(hVar.j());
                                int i39 = (c13 == true ? 1 : 0) & 1048576;
                                char c53 = c13;
                                if (i39 != 1048576) {
                                    c53 = c13;
                                    if (hVar.a() > 0) {
                                        this.C = new ArrayList();
                                        c53 = (c13 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.C.add(Integer.valueOf(hVar.e()));
                                }
                                hVar.b(c49);
                                c13 = c53;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM /* 242 */:
                                if ((this.f118349c & 64) == 64) {
                                    y0 y0Var = this.E;
                                    y0Var.getClass();
                                    bVar = y0.i(y0Var);
                                }
                                b bVar2 = bVar;
                                y0 y0Var2 = (y0) hVar.f(y0.f118556h, kVar);
                                this.E = y0Var2;
                                if (bVar2 != null) {
                                    bVar2.k(y0Var2);
                                    this.E = bVar2.i();
                                }
                                this.f118349c |= 64;
                                c13 = c13;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                                int i43 = (c13 == true ? 1 : 0) & 4194304;
                                char c54 = c13;
                                if (i43 != 4194304) {
                                    this.F = new ArrayList();
                                    c54 = (c13 == true ? 1 : 0) | 0;
                                }
                                this.F.add(Integer.valueOf(hVar.e()));
                                c13 = c54;
                                z13 = true;
                                c13 = c13;
                            case 250:
                                int c55 = hVar.c(hVar.j());
                                int i44 = (c13 == true ? 1 : 0) & 4194304;
                                char c56 = c13;
                                if (i44 != 4194304) {
                                    c56 = c13;
                                    if (hVar.a() > 0) {
                                        this.F = new ArrayList();
                                        c56 = (c13 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.F.add(Integer.valueOf(hVar.e()));
                                }
                                hVar.b(c55);
                                c13 = c56;
                                z13 = true;
                                c13 = c13;
                            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
                                if ((this.f118349c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
                                    f1 f1Var = this.G;
                                    f1Var.getClass();
                                    nVar = new n(2);
                                    nVar.o(f1Var);
                                } else {
                                    nVar = null;
                                }
                                f1 f1Var2 = (f1) hVar.f(f1.f118258f, kVar);
                                this.G = f1Var2;
                                if (nVar != null) {
                                    nVar.o(f1Var2);
                                    this.G = nVar.k();
                                }
                                this.f118349c |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                                c13 = c13;
                                z13 = true;
                                c13 = c13;
                            default:
                                r53 = n(hVar, u13, kVar, o13);
                                c13 = c13;
                                if (r53 == 0) {
                                    z14 = true;
                                    c13 = c13;
                                }
                                z13 = true;
                                c13 = c13;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f80460a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e14) {
                    e14.f80460a = this;
                    throw e14;
                }
            } catch (Throwable th4) {
                if (((c13 == true ? 1 : 0) & 32) == 32) {
                    this.f118355i = Collections.unmodifiableList(this.f118355i);
                }
                if (((c13 == true ? 1 : 0) & 8) == 8) {
                    this.f118353g = Collections.unmodifiableList(this.f118353g);
                }
                if (((c13 == true ? 1 : 0) & 16) == 16) {
                    this.f118354h = Collections.unmodifiableList(this.f118354h);
                }
                if (((c13 == true ? 1 : 0) & 64) == 64) {
                    this.f118357k = Collections.unmodifiableList(this.f118357k);
                }
                if (((c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
                    this.f118362p = Collections.unmodifiableList(this.f118362p);
                }
                if (((c13 == true ? 1 : 0) & 1024) == 1024) {
                    this.f118363q = Collections.unmodifiableList(this.f118363q);
                }
                if (((c13 == true ? 1 : 0) & 2048) == 2048) {
                    this.f118364r = Collections.unmodifiableList(this.f118364r);
                }
                if (((c13 == true ? 1 : 0) & 4096) == 4096) {
                    this.f118365s = Collections.unmodifiableList(this.f118365s);
                }
                if (((c13 == true ? 1 : 0) & 8192) == 8192) {
                    this.f118366t = Collections.unmodifiableList(this.f118366t);
                }
                if (((c13 == true ? 1 : 0) & 16384) == 16384) {
                    this.f118367u = Collections.unmodifiableList(this.f118367u);
                }
                if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
                    this.f118359m = Collections.unmodifiableList(this.f118359m);
                }
                if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                    this.f118360n = Collections.unmodifiableList(this.f118360n);
                }
                if (((c13 == true ? 1 : 0) & 262144) == 262144) {
                    this.f118372z = Collections.unmodifiableList(this.f118372z);
                }
                if (((c13 == true ? 1 : 0) & r53) == r53) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if (((c13 == true ? 1 : 0) & 1048576) == 1048576) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if (((c13 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                try {
                    u13.t();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.f118348b = l13.d();
                    throw th5;
                }
                this.f118348b = l13.d();
                l();
                throw th4;
            }
        }
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.I;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118349c & 1) == 1 ? zm2.i.f(1, this.f118350d) : 0;
        int i14 = 0;
        for (int i15 = 0; i15 < this.f118355i.size(); i15++) {
            i14 += zm2.i.g(((Integer) this.f118355i.get(i15)).intValue());
        }
        int i16 = f13 + i14;
        if (!this.f118355i.isEmpty()) {
            i16 = i16 + 1 + zm2.i.g(i14);
        }
        this.f118356j = i14;
        if ((this.f118349c & 2) == 2) {
            i16 += zm2.i.f(3, this.f118351e);
        }
        if ((this.f118349c & 4) == 4) {
            i16 += zm2.i.f(4, this.f118352f);
        }
        for (int i17 = 0; i17 < this.f118353g.size(); i17++) {
            i16 += zm2.i.i(5, (zm2.c) this.f118353g.get(i17));
        }
        for (int i18 = 0; i18 < this.f118354h.size(); i18++) {
            i16 += zm2.i.i(6, (zm2.c) this.f118354h.get(i18));
        }
        int i19 = 0;
        for (int i23 = 0; i23 < this.f118357k.size(); i23++) {
            i19 += zm2.i.g(((Integer) this.f118357k.get(i23)).intValue());
        }
        int i24 = i16 + i19;
        if (!this.f118357k.isEmpty()) {
            i24 = i24 + 1 + zm2.i.g(i19);
        }
        this.f118358l = i19;
        for (int i25 = 0; i25 < this.f118362p.size(); i25++) {
            i24 += zm2.i.i(8, (zm2.c) this.f118362p.get(i25));
        }
        for (int i26 = 0; i26 < this.f118363q.size(); i26++) {
            i24 += zm2.i.i(9, (zm2.c) this.f118363q.get(i26));
        }
        for (int i27 = 0; i27 < this.f118364r.size(); i27++) {
            i24 += zm2.i.i(10, (zm2.c) this.f118364r.get(i27));
        }
        for (int i28 = 0; i28 < this.f118365s.size(); i28++) {
            i24 += zm2.i.i(11, (zm2.c) this.f118365s.get(i28));
        }
        for (int i29 = 0; i29 < this.f118366t.size(); i29++) {
            i24 += zm2.i.i(13, (zm2.c) this.f118366t.get(i29));
        }
        int i33 = 0;
        for (int i34 = 0; i34 < this.f118367u.size(); i34++) {
            i33 += zm2.i.g(((Integer) this.f118367u.get(i34)).intValue());
        }
        int i35 = i24 + i33;
        if (!this.f118367u.isEmpty()) {
            i35 = i35 + 2 + zm2.i.g(i33);
        }
        this.f118368v = i33;
        if ((this.f118349c & 8) == 8) {
            i35 += zm2.i.f(17, this.f118369w);
        }
        if ((this.f118349c & 16) == 16) {
            i35 += zm2.i.i(18, this.f118370x);
        }
        if ((this.f118349c & 32) == 32) {
            i35 += zm2.i.f(19, this.f118371y);
        }
        for (int i36 = 0; i36 < this.f118359m.size(); i36++) {
            i35 += zm2.i.i(20, (zm2.c) this.f118359m.get(i36));
        }
        int i37 = 0;
        for (int i38 = 0; i38 < this.f118360n.size(); i38++) {
            i37 += zm2.i.g(((Integer) this.f118360n.get(i38)).intValue());
        }
        int i39 = i35 + i37;
        if (!this.f118360n.isEmpty()) {
            i39 = i39 + 2 + zm2.i.g(i37);
        }
        this.f118361o = i37;
        int i43 = 0;
        for (int i44 = 0; i44 < this.f118372z.size(); i44++) {
            i43 += zm2.i.g(((Integer) this.f118372z.get(i44)).intValue());
        }
        int i45 = i39 + i43;
        if (!this.f118372z.isEmpty()) {
            i45 = i45 + 2 + zm2.i.g(i43);
        }
        this.A = i43;
        for (int i46 = 0; i46 < this.B.size(); i46++) {
            i45 += zm2.i.i(23, (zm2.c) this.B.get(i46));
        }
        int i47 = 0;
        for (int i48 = 0; i48 < this.C.size(); i48++) {
            i47 += zm2.i.g(((Integer) this.C.get(i48)).intValue());
        }
        int i49 = i45 + i47;
        if (!this.C.isEmpty()) {
            i49 = i49 + 2 + zm2.i.g(i47);
        }
        this.D = i47;
        if ((this.f118349c & 64) == 64) {
            i49 += zm2.i.i(30, this.E);
        }
        int i53 = 0;
        for (int i54 = 0; i54 < this.F.size(); i54++) {
            i53 += zm2.i.g(((Integer) this.F.get(i54)).intValue());
        }
        int size = (this.F.size() * 2) + i49 + i53;
        if ((this.f118349c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            size += zm2.i.i(32, this.G);
        }
        int size2 = this.f118348b.size() + i() + size;
        this.I = size2;
        return size2;
    }

    @Override // zm2.c
    public final zm2.b b() {
        i k13;
        k13 = i.k();
        return k13;
    }

    @Override // zm2.c
    public final zm2.b c() {
        i k13 = i.k();
        k13.l(this);
        return k13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118349c & 1) == 1) {
            iVar.F(1, this.f118350d);
        }
        if (this.f118355i.size() > 0) {
            iVar.P(18);
            iVar.P(this.f118356j);
        }
        for (int i13 = 0; i13 < this.f118355i.size(); i13++) {
            iVar.G(((Integer) this.f118355i.get(i13)).intValue());
        }
        if ((this.f118349c & 2) == 2) {
            iVar.F(3, this.f118351e);
        }
        if ((this.f118349c & 4) == 4) {
            iVar.F(4, this.f118352f);
        }
        for (int i14 = 0; i14 < this.f118353g.size(); i14++) {
            iVar.I(5, (zm2.c) this.f118353g.get(i14));
        }
        for (int i15 = 0; i15 < this.f118354h.size(); i15++) {
            iVar.I(6, (zm2.c) this.f118354h.get(i15));
        }
        if (this.f118357k.size() > 0) {
            iVar.P(58);
            iVar.P(this.f118358l);
        }
        for (int i16 = 0; i16 < this.f118357k.size(); i16++) {
            iVar.G(((Integer) this.f118357k.get(i16)).intValue());
        }
        for (int i17 = 0; i17 < this.f118362p.size(); i17++) {
            iVar.I(8, (zm2.c) this.f118362p.get(i17));
        }
        for (int i18 = 0; i18 < this.f118363q.size(); i18++) {
            iVar.I(9, (zm2.c) this.f118363q.get(i18));
        }
        for (int i19 = 0; i19 < this.f118364r.size(); i19++) {
            iVar.I(10, (zm2.c) this.f118364r.get(i19));
        }
        for (int i23 = 0; i23 < this.f118365s.size(); i23++) {
            iVar.I(11, (zm2.c) this.f118365s.get(i23));
        }
        for (int i24 = 0; i24 < this.f118366t.size(); i24++) {
            iVar.I(13, (zm2.c) this.f118366t.get(i24));
        }
        if (this.f118367u.size() > 0) {
            iVar.P(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
            iVar.P(this.f118368v);
        }
        for (int i25 = 0; i25 < this.f118367u.size(); i25++) {
            iVar.G(((Integer) this.f118367u.get(i25)).intValue());
        }
        if ((this.f118349c & 8) == 8) {
            iVar.F(17, this.f118369w);
        }
        if ((this.f118349c & 16) == 16) {
            iVar.I(18, this.f118370x);
        }
        if ((this.f118349c & 32) == 32) {
            iVar.F(19, this.f118371y);
        }
        for (int i26 = 0; i26 < this.f118359m.size(); i26++) {
            iVar.I(20, (zm2.c) this.f118359m.get(i26));
        }
        if (this.f118360n.size() > 0) {
            iVar.P(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE);
            iVar.P(this.f118361o);
        }
        for (int i27 = 0; i27 < this.f118360n.size(); i27++) {
            iVar.G(((Integer) this.f118360n.get(i27)).intValue());
        }
        if (this.f118372z.size() > 0) {
            iVar.P(RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD);
            iVar.P(this.A);
        }
        for (int i28 = 0; i28 < this.f118372z.size(); i28++) {
            iVar.G(((Integer) this.f118372z.get(i28)).intValue());
        }
        for (int i29 = 0; i29 < this.B.size(); i29++) {
            iVar.I(23, (zm2.c) this.B.get(i29));
        }
        if (this.C.size() > 0) {
            iVar.P(RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL);
            iVar.P(this.D);
        }
        for (int i33 = 0; i33 < this.C.size(); i33++) {
            iVar.G(((Integer) this.C.get(i33)).intValue());
        }
        if ((this.f118349c & 64) == 64) {
            iVar.I(30, this.E);
        }
        for (int i34 = 0; i34 < this.F.size(); i34++) {
            iVar.F(31, ((Integer) this.F.get(i34)).intValue());
        }
        if ((this.f118349c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            iVar.I(32, this.G);
        }
        m13.f(19000, iVar);
        iVar.L(this.f118348b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118347J;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.H;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118349c & 2) != 2) {
            this.H = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f118353g.size(); i13++) {
            if (!((x0) this.f118353g.get(i13)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f118354h.size(); i14++) {
            if (!((s0) this.f118354h.get(i14)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f118359m.size(); i15++) {
            if (!p(i15).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f118362p.size(); i16++) {
            if (!((m) this.f118362p.get(i16)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f118363q.size(); i17++) {
            if (!((a0) this.f118363q.get(i17)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f118364r.size(); i18++) {
            if (!((i0) this.f118364r.get(i18)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f118365s.size(); i19++) {
            if (!s(i19).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i23 = 0; i23 < this.f118366t.size(); i23++) {
            if (!((v) this.f118366t.get(i23)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if ((this.f118349c & 16) == 16 && !q().isInitialized()) {
            this.H = (byte) 0;
            return false;
        }
        for (int i24 = 0; i24 < this.B.size(); i24++) {
            if (!r(i24).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if ((this.f118349c & 64) == 64 && !this.E.isInitialized()) {
            this.H = (byte) 0;
            return false;
        }
        if (h()) {
            this.H = (byte) 1;
            return true;
        }
        this.H = (byte) 0;
        return false;
    }

    public final s0 p(int i13) {
        return (s0) this.f118359m.get(i13);
    }

    public final s0 q() {
        return this.f118370x;
    }

    public final s0 r(int i13) {
        return (s0) this.B.get(i13);
    }

    public final u0 s(int i13) {
        return (u0) this.f118365s.get(i13);
    }

    public final boolean t() {
        return (this.f118349c & 8) == 8;
    }

    public final boolean u() {
        return (this.f118349c & 32) == 32;
    }

    public final void v() {
        this.f118350d = 6;
        this.f118351e = 0;
        this.f118352f = 0;
        this.f118353g = Collections.emptyList();
        this.f118354h = Collections.emptyList();
        this.f118355i = Collections.emptyList();
        this.f118357k = Collections.emptyList();
        this.f118359m = Collections.emptyList();
        this.f118360n = Collections.emptyList();
        this.f118362p = Collections.emptyList();
        this.f118363q = Collections.emptyList();
        this.f118364r = Collections.emptyList();
        this.f118365s = Collections.emptyList();
        this.f118366t = Collections.emptyList();
        this.f118367u = Collections.emptyList();
        this.f118369w = 0;
        this.f118370x = s0.f118450t;
        this.f118371y = 0;
        this.f118372z = Collections.emptyList();
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        this.E = y0.f118555g;
        this.F = Collections.emptyList();
        this.G = f1.f118257e;
    }

    public k(zm2.p pVar) {
        super(pVar);
        this.f118356j = -1;
        this.f118358l = -1;
        this.f118361o = -1;
        this.f118368v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f118348b = pVar.f142242a;
    }

    public k() {
        this.f118356j = -1;
        this.f118358l = -1;
        this.f118361o = -1;
        this.f118368v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f118348b = zm2.g.f142207a;
    }
}
