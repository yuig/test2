package m9;

import a.cb;
import android.text.SpannableStringBuilder;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.c0;
import d7.d0;
import d7.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class f extends i {

    /* renamed from: h, reason: collision with root package name */
    public final d0 f86596h = new d0();

    /* renamed from: i, reason: collision with root package name */
    public final c0 f86597i = new c0();

    /* renamed from: j, reason: collision with root package name */
    public int f86598j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final int f86599k;

    /* renamed from: l, reason: collision with root package name */
    public final e[] f86600l;

    /* renamed from: m, reason: collision with root package name */
    public e f86601m;

    /* renamed from: n, reason: collision with root package name */
    public List f86602n;

    /* renamed from: o, reason: collision with root package name */
    public List f86603o;

    /* renamed from: p, reason: collision with root package name */
    public c0 f86604p;

    /* renamed from: q, reason: collision with root package name */
    public int f86605q;

    public f(int i13, List list) {
        this.f86599k = i13 == -1 ? 1 : i13;
        if (list != null) {
            byte[] bArr = d7.f.f53817a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b13 = ((byte[]) list.get(0))[0];
            }
        }
        this.f86600l = new e[8];
        for (int i14 = 0; i14 < 8; i14++) {
            this.f86600l[i14] = new e();
        }
        this.f86601m = this.f86600l[0];
    }

    @Override // m9.i, k7.d
    public final void flush() {
        super.flush();
        this.f86602n = null;
        this.f86603o = null;
        this.f86605q = 0;
        this.f86601m = this.f86600l[0];
        m();
        this.f86604p = null;
    }

    @Override // m9.i
    public final j g() {
        List list = this.f86602n;
        this.f86603o = list;
        list.getClass();
        return new j(list);
    }

    @Override // m9.i
    public final void h(g gVar) {
        ByteBuffer byteBuffer = gVar.f78454e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        d0 d0Var = this.f86596h;
        d0Var.I(limit, array);
        while (d0Var.a() >= 3) {
            int y13 = d0Var.y();
            int i13 = y13 & 3;
            boolean z13 = (y13 & 4) == 4;
            byte y14 = (byte) d0Var.y();
            byte y15 = (byte) d0Var.y();
            if (i13 == 2 || i13 == 3) {
                if (z13) {
                    if (i13 == 3) {
                        k();
                        int i14 = (y14 & 192) >> 6;
                        int i15 = this.f86598j;
                        if (i15 != -1 && i14 != (i15 + 1) % 4) {
                            m();
                            u.g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f86598j + " current=" + i14);
                        }
                        this.f86598j = i14;
                        int i16 = y14 & 63;
                        if (i16 == 0) {
                            i16 = 64;
                        }
                        c0 c0Var = new c0(i14, i16);
                        this.f86604p = c0Var;
                        byte[] bArr = c0Var.f53793b;
                        int i17 = c0Var.f53796e;
                        c0Var.f53796e = i17 + 1;
                        bArr[i17] = y15;
                    } else {
                        bf.b.i(i13 == 2);
                        c0 c0Var2 = this.f86604p;
                        if (c0Var2 == null) {
                            u.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0Var2.f53793b;
                            int i18 = c0Var2.f53796e;
                            bArr2[i18] = y14;
                            c0Var2.f53796e = i18 + 2;
                            bArr2[i18 + 1] = y15;
                        }
                    }
                    c0 c0Var3 = this.f86604p;
                    if (c0Var3.f53796e == (c0Var3.f53795d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // m9.i
    public final boolean j() {
        return this.f86602n != this.f86603o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        int i13;
        int i14;
        boolean z13;
        char c13;
        int i15;
        c0 c0Var = this.f86604p;
        if (c0Var == null) {
            return;
        }
        int i16 = 2;
        if (c0Var.f53796e != (c0Var.f53795d * 2) - 1) {
            u.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f86604p.f53795d * 2) - 1) + ", but current index is " + this.f86604p.f53796e + " (sequence number " + this.f86604p.f53794c + ");");
        }
        c0 c0Var2 = this.f86604p;
        byte[] bArr = c0Var2.f53793b;
        int i17 = c0Var2.f53796e;
        c0 c0Var3 = this.f86597i;
        c0Var3.k(i17, bArr);
        boolean z14 = false;
        while (true) {
            if (c0Var3.b() > 0) {
                int i18 = 3;
                int g13 = c0Var3.g(3);
                int g14 = c0Var3.g(5);
                if (g13 == 7) {
                    c0Var3.o(i16);
                    g13 = c0Var3.g(6);
                    if (g13 < 7) {
                        cb.t("Invalid extended service number: ", g13, "Cea708Decoder");
                    }
                }
                if (g14 == 0) {
                    if (g13 != 0) {
                        u.g("Cea708Decoder", "serviceNumber is non-zero (" + g13 + ") when blockSize is 0");
                    }
                } else if (g13 != this.f86599k) {
                    c0Var3.p(g14);
                } else {
                    int e13 = (g14 * 8) + c0Var3.e();
                    while (c0Var3.e() < e13) {
                        int g15 = c0Var3.g(8);
                        if (g15 != 16) {
                            if (g15 <= 31) {
                                if (g15 != 0) {
                                    if (g15 == i18) {
                                        this.f86602n = l();
                                    } else if (g15 != 8) {
                                        switch (g15) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.f86601m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (g15 < 17 || g15 > 23) {
                                                    if (g15 < 24 || g15 > 31) {
                                                        cb.t("Invalid C0 command: ", g15, "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        u.g("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + g15);
                                                        c0Var3.o(16);
                                                        break;
                                                    }
                                                } else {
                                                    u.g("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + g15);
                                                    c0Var3.o(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f86601m.f86576b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i15 = i16;
                                i13 = i18;
                                i14 = e13;
                            } else if (g15 <= 127) {
                                if (g15 == 127) {
                                    this.f86601m.a((char) 9835);
                                } else {
                                    this.f86601m.a((char) (g15 & 255));
                                }
                                i15 = i16;
                                i13 = i18;
                                i14 = e13;
                                z14 = true;
                            } else {
                                if (g15 <= 159) {
                                    e[] eVarArr = this.f86600l;
                                    switch (g15) {
                                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS /* 129 */:
                                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN /* 130 */:
                                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                                        case RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE /* 132 */:
                                        case RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL /* 133 */:
                                        case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
                                        case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL /* 135 */:
                                            i13 = i18;
                                            i14 = e13;
                                            z13 = true;
                                            int i19 = g15 - 128;
                                            if (this.f86605q != i19) {
                                                this.f86605q = i19;
                                                this.f86601m = eVarArr[i19];
                                                break;
                                            }
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                                            i13 = i18;
                                            i14 = e13;
                                            z13 = true;
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (c0Var3.f()) {
                                                    e eVar = eVarArr[8 - i23];
                                                    eVar.f86575a.clear();
                                                    eVar.f86576b.clear();
                                                    eVar.f86589o = -1;
                                                    eVar.f86590p = -1;
                                                    eVar.f86591q = -1;
                                                    eVar.f86593s = -1;
                                                    eVar.f86595u = 0;
                                                }
                                            }
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE /* 137 */:
                                            i13 = i18;
                                            i14 = e13;
                                            for (int i24 = 1; i24 <= 8; i24++) {
                                                if (c0Var3.f()) {
                                                    eVarArr[8 - i24].f86578d = true;
                                                }
                                            }
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL /* 138 */:
                                            i13 = i18;
                                            i14 = e13;
                                            for (int i25 = 1; i25 <= 8; i25++) {
                                                if (c0Var3.f()) {
                                                    eVarArr[8 - i25].f86578d = false;
                                                }
                                            }
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM /* 139 */:
                                            i13 = i18;
                                            i14 = e13;
                                            for (int i26 = 1; i26 <= 8; i26++) {
                                                if (c0Var3.f()) {
                                                    eVarArr[8 - i26].f86578d = !r1.f86578d;
                                                }
                                            }
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM /* 140 */:
                                            i13 = i18;
                                            i14 = e13;
                                            for (int i27 = 1; i27 <= 8; i27++) {
                                                if (c0Var3.f()) {
                                                    eVarArr[8 - i27].d();
                                                }
                                            }
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN /* 141 */:
                                            i13 = i18;
                                            i14 = e13;
                                            c0Var3.o(8);
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL /* 142 */:
                                            i13 = i18;
                                            i14 = e13;
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE /* 143 */:
                                            i13 = i18;
                                            i14 = e13;
                                            m();
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM /* 144 */:
                                            i14 = e13;
                                            if (!this.f86601m.f86577c) {
                                                c0Var3.o(16);
                                                i13 = 3;
                                                z13 = true;
                                                break;
                                            } else {
                                                c0Var3.g(4);
                                                c0Var3.g(2);
                                                c0Var3.g(2);
                                                boolean f13 = c0Var3.f();
                                                boolean f14 = c0Var3.f();
                                                i13 = 3;
                                                c0Var3.g(3);
                                                c0Var3.g(3);
                                                this.f86601m.e(f13, f14);
                                                z13 = true;
                                            }
                                        case RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED /* 145 */:
                                            i14 = e13;
                                            if (this.f86601m.f86577c) {
                                                int c14 = e.c(c0Var3.g(2), c0Var3.g(2), c0Var3.g(2), c0Var3.g(2));
                                                int c15 = e.c(c0Var3.g(2), c0Var3.g(2), c0Var3.g(2), c0Var3.g(2));
                                                c0Var3.o(2);
                                                e.c(c0Var3.g(2), c0Var3.g(2), c0Var3.g(2), 0);
                                                this.f86601m.f(c14, c15);
                                            } else {
                                                c0Var3.o(24);
                                            }
                                            i13 = 3;
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO /* 146 */:
                                            i14 = e13;
                                            if (this.f86601m.f86577c) {
                                                c0Var3.o(4);
                                                int g16 = c0Var3.g(4);
                                                c0Var3.o(2);
                                                c0Var3.g(6);
                                                e eVar2 = this.f86601m;
                                                if (eVar2.f86595u != g16) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f86595u = g16;
                                            } else {
                                                c0Var3.o(16);
                                            }
                                            i13 = 3;
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY /* 147 */:
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE /* 148 */:
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE /* 149 */:
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY /* 150 */:
                                        default:
                                            cb.t("Invalid C1 command: ", g15, "Cea708Decoder");
                                            i13 = i18;
                                            i14 = e13;
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM /* 151 */:
                                            i14 = e13;
                                            if (this.f86601m.f86577c) {
                                                int c16 = e.c(c0Var3.g(2), c0Var3.g(2), c0Var3.g(2), c0Var3.g(2));
                                                c0Var3.g(2);
                                                e.c(c0Var3.g(2), c0Var3.g(2), c0Var3.g(2), 0);
                                                c0Var3.f();
                                                c0Var3.f();
                                                c0Var3.g(2);
                                                c0Var3.g(2);
                                                int g17 = c0Var3.g(2);
                                                c0Var3.o(8);
                                                e eVar3 = this.f86601m;
                                                eVar3.f86588n = c16;
                                                eVar3.f86585k = g17;
                                            } else {
                                                c0Var3.o(32);
                                            }
                                            i13 = 3;
                                            z13 = true;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM /* 152 */:
                                        case RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM /* 153 */:
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER /* 154 */:
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM /* 156 */:
                                        case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER /* 157 */:
                                        case RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN /* 158 */:
                                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                                            int i28 = g15 - 152;
                                            e eVar4 = eVarArr[i28];
                                            c0Var3.o(i16);
                                            boolean f15 = c0Var3.f();
                                            c0Var3.o(i16);
                                            int g18 = c0Var3.g(i18);
                                            boolean f16 = c0Var3.f();
                                            int g19 = c0Var3.g(7);
                                            int g23 = c0Var3.g(8);
                                            int g24 = c0Var3.g(4);
                                            int g25 = c0Var3.g(4);
                                            c0Var3.o(i16);
                                            c0Var3.o(6);
                                            c0Var3.o(i16);
                                            int g26 = c0Var3.g(3);
                                            i14 = e13;
                                            int g27 = c0Var3.g(3);
                                            eVar4.f86577c = true;
                                            eVar4.f86578d = f15;
                                            eVar4.f86579e = g18;
                                            eVar4.f86580f = f16;
                                            eVar4.f86581g = g19;
                                            eVar4.f86582h = g23;
                                            eVar4.f86583i = g24;
                                            int i29 = g25 + 1;
                                            if (eVar4.f86584j != i29) {
                                                eVar4.f86584j = i29;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f86575a;
                                                    if (arrayList.size() >= eVar4.f86584j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g26 != 0 && eVar4.f86586l != g26) {
                                                eVar4.f86586l = g26;
                                                int i33 = g26 - 1;
                                                int i34 = e.B[i33];
                                                boolean z15 = e.A[i33];
                                                int i35 = e.f86573y[i33];
                                                int i36 = e.f86574z[i33];
                                                int i37 = e.f86572x[i33];
                                                eVar4.f86588n = i34;
                                                eVar4.f86585k = i37;
                                            }
                                            if (g27 != 0 && eVar4.f86587m != g27) {
                                                eVar4.f86587m = g27;
                                                int i38 = g27 - 1;
                                                int i39 = e.D[i38];
                                                int i43 = e.C[i38];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f86570v, e.E[i38]);
                                            }
                                            if (this.f86605q != i28) {
                                                this.f86605q = i28;
                                                this.f86601m = eVarArr[i28];
                                            }
                                            i13 = 3;
                                            z13 = true;
                                            break;
                                    }
                                } else {
                                    i13 = i18;
                                    i14 = e13;
                                    z13 = true;
                                    if (g15 <= 255) {
                                        this.f86601m.a((char) (g15 & 255));
                                    } else {
                                        cb.t("Invalid base command: ", g15, "Cea708Decoder");
                                        i15 = 2;
                                        c13 = 7;
                                    }
                                }
                                z14 = z13;
                                i15 = 2;
                                c13 = 7;
                            }
                            z13 = true;
                            c13 = 7;
                        } else {
                            i13 = i18;
                            i14 = e13;
                            z13 = true;
                            int g28 = c0Var3.g(8);
                            if (g28 <= 31) {
                                c13 = 7;
                                if (g28 > 7) {
                                    if (g28 <= 15) {
                                        c0Var3.o(8);
                                    } else if (g28 <= 23) {
                                        c0Var3.o(16);
                                    } else if (g28 <= 31) {
                                        c0Var3.o(24);
                                    }
                                }
                            } else {
                                c13 = 7;
                                if (g28 <= 127) {
                                    if (g28 == 32) {
                                        this.f86601m.a(' ');
                                    } else if (g28 == 33) {
                                        this.f86601m.a((char) 160);
                                    } else if (g28 == 37) {
                                        this.f86601m.a((char) 8230);
                                    } else if (g28 == 42) {
                                        this.f86601m.a((char) 352);
                                    } else if (g28 == 44) {
                                        this.f86601m.a((char) 338);
                                    } else if (g28 == 63) {
                                        this.f86601m.a((char) 376);
                                    } else if (g28 == 57) {
                                        this.f86601m.a((char) 8482);
                                    } else if (g28 == 58) {
                                        this.f86601m.a((char) 353);
                                    } else if (g28 == 60) {
                                        this.f86601m.a((char) 339);
                                    } else if (g28 != 61) {
                                        switch (g28) {
                                            case 48:
                                                this.f86601m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f86601m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f86601m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f86601m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f86601m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f86601m.a((char) 8226);
                                                break;
                                            default:
                                                switch (g28) {
                                                    case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                                                        this.f86601m.a((char) 8539);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                                                        this.f86601m.a((char) 8540);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                                                        this.f86601m.a((char) 8541);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                                                        this.f86601m.a((char) 8542);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                                                        this.f86601m.a((char) 9474);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL /* 123 */:
                                                        this.f86601m.a((char) 9488);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER /* 124 */:
                                                        this.f86601m.a((char) 9492);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED /* 125 */:
                                                        this.f86601m.a((char) 9472);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL /* 126 */:
                                                        this.f86601m.a((char) 9496);
                                                        break;
                                                    case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK /* 127 */:
                                                        this.f86601m.a((char) 9484);
                                                        break;
                                                    default:
                                                        cb.t("Invalid G2 character: ", g28, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f86601m.a((char) 8480);
                                    }
                                    z14 = true;
                                } else if (g28 > 159) {
                                    i15 = 2;
                                    if (g28 <= 255) {
                                        if (g28 == 160) {
                                            this.f86601m.a((char) 13252);
                                        } else {
                                            cb.t("Invalid G3 character: ", g28, "Cea708Decoder");
                                            this.f86601m.a('_');
                                        }
                                        z14 = true;
                                    } else {
                                        cb.t("Invalid extended command: ", g28, "Cea708Decoder");
                                    }
                                } else if (g28 <= 135) {
                                    c0Var3.o(32);
                                } else if (g28 <= 143) {
                                    c0Var3.o(40);
                                } else if (g28 <= 159) {
                                    i15 = 2;
                                    c0Var3.o(2);
                                    c0Var3.o(c0Var3.g(6) * 8);
                                }
                            }
                            i15 = 2;
                        }
                        i18 = i13;
                        e13 = i14;
                        i16 = i15;
                    }
                }
            }
        }
        if (z14) {
            this.f86602n = l();
        }
        this.f86604p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.f.l():java.util.List");
    }

    public final void m() {
        for (int i13 = 0; i13 < 8; i13++) {
            this.f86600l[i13].d();
        }
    }
}
