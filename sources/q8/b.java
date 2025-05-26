package q8;

import a.cb;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f102860a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f102861b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f102862c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f102863d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f102864e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f102865f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f102866g = {32, 40, 48, 56, 64, 80, 96, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, 160, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 320, 384, 448, BitmapUtils.BITMAP_TO_JPEG_SIZE, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f102867h = {69, 87, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f102868i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f102869j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f102870k = {64, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 384, 448, BitmapUtils.BITMAP_TO_JPEG_SIZE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f102871l = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f102872m = {5, 8, 10, 12};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f102873n = {6, 9, 12, 15};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f102874o = {2, 4, 6, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f102875p = {9, 11, 13, 16};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f102876q = {5, 8, 10, 12};

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f102877r = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f102878s = {44100, 48000, 32000};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f102879t = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f102880u = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f102881v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f102882w = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f102883x = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i13, int i14) {
        int i15 = -1;
        for (int i16 = 0; i16 < 13; i16++) {
            if (i13 == f102860a[i16]) {
                i15 = i16;
            }
        }
        int i17 = -1;
        for (int i18 = 0; i18 < 16; i18++) {
            if (i14 == f102861b[i18]) {
                i17 = i18;
            }
        }
        if (i13 == -1 || i17 == -1) {
            throw new IllegalArgumentException(a.a.f("Invalid sample rate or number of channels: ", i13, ", ", i14));
        }
        return b(2, i15, i17);
    }

    public static byte[] b(int i13, int i14, int i15) {
        return new byte[]{(byte) (((i13 << 3) & RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER) | ((i14 >> 1) & 7)), (byte) (((i14 << 7) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) | ((i15 << 3) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL))};
    }

    public static int c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i13 = position; i13 <= limit; i13++) {
            int i14 = d7.n0.f53866a;
            int i15 = byteBuffer.getInt(i13 + 4);
            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                i15 = Integer.reverseBytes(i15);
            }
            if ((i15 & (-2)) == -126718022) {
                return i13 - position;
            }
        }
        return -1;
    }

    public static int d(int i13, int i14) {
        int i15 = i14 / 2;
        if (i13 < 0 || i13 >= 3 || i14 < 0 || i15 >= 19) {
            return -1;
        }
        int i16 = f102863d[i13];
        if (i16 == 44100) {
            return ((i14 % 2) + f102867h[i15]) * 2;
        }
        int i17 = f102866g[i15];
        return i16 == 32000 ? i17 * 6 : i17 * 4;
    }

    public static int e(int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (!((i13 & (-2097152)) == -2097152) || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0 || (i16 = (i13 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i13 >>> 10) & 3) == 3) {
            return -1;
        }
        int i18 = f102878s[i17];
        if (i14 == 2) {
            i18 /= 2;
        } else if (i14 == 0) {
            i18 /= 4;
        }
        int i19 = (i13 >>> 9) & 1;
        if (i15 == 3) {
            return ((((i14 == 3 ? f102879t[i16 - 1] : f102880u[i16 - 1]) * 12) / i18) + i19) * 4;
        }
        int i23 = i14 == 3 ? i15 == 2 ? f102881v[i16 - 1] : f102882w[i16 - 1] : f102883x[i16 - 1];
        int i24 = RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM;
        if (i14 == 3) {
            return cb.B(i23, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, i18, i19);
        }
        if (i15 == 1) {
            i24 = 72;
        }
        return cb.B(i24, i23, i18, i19);
    }

    public static d7.c0 f(byte[] bArr) {
        byte b13 = bArr[0];
        if (b13 == Byte.MAX_VALUE || b13 == 100 || b13 == 64 || b13 == 113) {
            return new d7.c0(bArr, 0, 0);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b14 = copyOf[0];
        if (b14 == -2 || b14 == -1 || b14 == 37 || b14 == -14 || b14 == -24) {
            for (int i13 = 0; i13 < copyOf.length - 1; i13 += 2) {
                byte b15 = copyOf[i13];
                int i14 = i13 + 1;
                copyOf[i13] = copyOf[i14];
                copyOf[i14] = b15;
            }
        }
        d7.c0 c0Var = new d7.c0(copyOf, 0, 0);
        if (copyOf[0] == 31) {
            d7.c0 c0Var2 = new d7.c0(copyOf, 0, 0);
            while (c0Var2.b() >= 16) {
                c0Var2.o(2);
                int g13 = c0Var2.g(14) & 16383;
                int min = Math.min(8 - c0Var.f53795d, 14);
                int i15 = c0Var.f53795d;
                int i16 = (8 - i15) - min;
                byte[] bArr2 = c0Var.f53793b;
                int i17 = c0Var.f53794c;
                byte b16 = (byte) (((65280 >> i15) | ((1 << i16) - 1)) & bArr2[i17]);
                bArr2[i17] = b16;
                int i18 = 14 - min;
                bArr2[i17] = (byte) (b16 | ((g13 >>> i18) << i16));
                int i19 = i17 + 1;
                while (i18 > 8) {
                    c0Var.f53793b[i19] = (byte) (g13 >>> (i18 - 8));
                    i18 -= 8;
                    i19++;
                }
                int i23 = 8 - i18;
                byte[] bArr3 = c0Var.f53793b;
                byte b17 = (byte) (bArr3[i19] & ((1 << i23) - 1));
                bArr3[i19] = b17;
                bArr3[i19] = (byte) (((g13 & ((1 << i18) - 1)) << i23) | b17);
                c0Var.o(14);
                c0Var.a();
            }
        }
        c0Var.k(copyOf.length, copyOf);
        return c0Var;
    }

    public static int g(d7.c0 c0Var) {
        int g13 = c0Var.g(4);
        if (g13 == 15) {
            if (c0Var.b() >= 24) {
                return c0Var.g(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (g13 < 13) {
            return f102860a[g13];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static int h(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f102862c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        return 1536;
    }

    public static c i(d7.c0 c0Var) {
        int i13;
        int d2;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        int g13;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int e13 = c0Var.e();
        c0Var.o(40);
        boolean z13 = c0Var.g(5) > 10;
        c0Var.m(e13);
        int[] iArr = f102865f;
        int[] iArr2 = f102863d;
        int i28 = -1;
        if (z13) {
            c0Var.o(16);
            int g14 = c0Var.g(2);
            if (g14 == 0) {
                i28 = 0;
            } else if (g14 == 1) {
                i28 = 1;
            } else if (g14 == 2) {
                i28 = 2;
            }
            c0Var.o(3);
            d2 = (c0Var.g(11) + 1) * 2;
            int g15 = c0Var.g(2);
            if (g15 == 3) {
                i15 = f102864e[c0Var.g(2)];
                g13 = 3;
                i18 = 6;
            } else {
                g13 = c0Var.g(2);
                int i29 = f102862c[g13];
                i15 = iArr2[g15];
                i18 = i29;
            }
            i17 = i18 * RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            int i33 = (d2 * i15) / (i18 * 32);
            int g16 = c0Var.g(3);
            boolean f13 = c0Var.f();
            i16 = iArr[g16] + (f13 ? 1 : 0);
            c0Var.o(10);
            if (c0Var.f()) {
                c0Var.o(8);
            }
            if (g16 == 0) {
                c0Var.o(5);
                if (c0Var.f()) {
                    c0Var.o(8);
                }
            }
            if (i28 == 1 && c0Var.f()) {
                c0Var.o(16);
            }
            if (c0Var.f()) {
                if (g16 > 2) {
                    c0Var.o(2);
                }
                if ((g16 & 1) == 0 || g16 <= 2) {
                    i24 = 6;
                } else {
                    i24 = 6;
                    c0Var.o(6);
                }
                if ((g16 & 4) != 0) {
                    c0Var.o(i24);
                }
                if (f13 && c0Var.f()) {
                    c0Var.o(5);
                }
                if (i28 == 0) {
                    if (c0Var.f()) {
                        i25 = 6;
                        c0Var.o(6);
                    } else {
                        i25 = 6;
                    }
                    if (g16 == 0 && c0Var.f()) {
                        c0Var.o(i25);
                    }
                    if (c0Var.f()) {
                        c0Var.o(i25);
                    }
                    int g17 = c0Var.g(2);
                    if (g17 == 1) {
                        c0Var.o(5);
                        i27 = 2;
                    } else {
                        if (g17 == 2) {
                            c0Var.o(12);
                        } else if (g17 == 3) {
                            int g18 = c0Var.g(5);
                            if (c0Var.f()) {
                                c0Var.o(5);
                                if (c0Var.f()) {
                                    c0Var.o(4);
                                }
                                if (c0Var.f()) {
                                    c0Var.o(4);
                                }
                                if (c0Var.f()) {
                                    c0Var.o(4);
                                }
                                if (c0Var.f()) {
                                    c0Var.o(4);
                                }
                                if (c0Var.f()) {
                                    c0Var.o(4);
                                }
                                if (c0Var.f()) {
                                    c0Var.o(4);
                                }
                                if (c0Var.f()) {
                                    c0Var.o(4);
                                }
                                if (c0Var.f()) {
                                    if (c0Var.f()) {
                                        c0Var.o(4);
                                    }
                                    if (c0Var.f()) {
                                        c0Var.o(4);
                                    }
                                }
                            }
                            if (c0Var.f()) {
                                c0Var.o(5);
                                if (c0Var.f()) {
                                    c0Var.o(7);
                                    if (c0Var.f()) {
                                        i26 = 8;
                                        c0Var.o(8);
                                        i27 = 2;
                                        c0Var.o((g18 + 2) * i26);
                                        c0Var.c();
                                    }
                                }
                            }
                            i26 = 8;
                            i27 = 2;
                            c0Var.o((g18 + 2) * i26);
                            c0Var.c();
                        }
                        i27 = 2;
                    }
                    if (g16 < i27) {
                        if (c0Var.f()) {
                            c0Var.o(14);
                        }
                        if (g16 == 0 && c0Var.f()) {
                            c0Var.o(14);
                        }
                    }
                    if (c0Var.f()) {
                        if (g13 == 0) {
                            c0Var.o(5);
                        } else {
                            for (int i34 = 0; i34 < i18; i34++) {
                                if (c0Var.f()) {
                                    c0Var.o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c0Var.f()) {
                c0Var.o(5);
                if (g16 == 2) {
                    c0Var.o(4);
                }
                if (g16 >= 6) {
                    c0Var.o(2);
                }
                if (c0Var.f()) {
                    i23 = 8;
                    c0Var.o(8);
                } else {
                    i23 = 8;
                }
                if (g16 == 0 && c0Var.f()) {
                    c0Var.o(i23);
                }
                if (g15 < 3) {
                    c0Var.n();
                }
            }
            if (i28 == 0 && g13 != 3) {
                c0Var.n();
            }
            if (i28 == 2 && (g13 == 3 || c0Var.f())) {
                i19 = 6;
                c0Var.o(6);
            } else {
                i19 = 6;
            }
            str = (c0Var.f() && c0Var.g(i19) == 1 && c0Var.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i33;
        } else {
            c0Var.o(32);
            int g19 = c0Var.g(2);
            String str2 = g19 == 3 ? null : "audio/ac3";
            int g23 = c0Var.g(6);
            i13 = f102866g[g23 / 2] * 1000;
            d2 = d(g19, g23);
            c0Var.o(8);
            int g24 = c0Var.g(3);
            if ((g24 & 1) == 0 || g24 == 1) {
                i14 = 2;
            } else {
                i14 = 2;
                c0Var.o(2);
            }
            if ((g24 & 4) != 0) {
                c0Var.o(i14);
            }
            if (g24 == i14) {
                c0Var.o(i14);
            }
            i15 = g19 < 3 ? iArr2[g19] : -1;
            i16 = iArr[g24] + (c0Var.f() ? 1 : 0);
            i17 = 1536;
            str = str2;
        }
        c cVar = new c();
        cVar.f102888b = str;
        cVar.f102887a = i28;
        cVar.f102890d = i16;
        cVar.f102889c = i15;
        cVar.f102891e = d2;
        cVar.f102892f = i17;
        cVar.f102893g = i13;
        return cVar;
    }

    public static a j(d7.c0 c0Var, boolean z13) {
        int g13 = c0Var.g(5);
        if (g13 == 31) {
            g13 = c0Var.g(6) + 32;
        }
        int g14 = g(c0Var);
        int g15 = c0Var.g(4);
        String d2 = a.a.d("mp4a.40.", g13);
        if (g13 == 5 || g13 == 29) {
            g14 = g(c0Var);
            int g16 = c0Var.g(5);
            if (g16 == 31) {
                g16 = c0Var.g(6) + 32;
            }
            g13 = g16;
            if (g13 == 22) {
                g15 = c0Var.g(4);
            }
        }
        if (z13) {
            if (g13 != 1 && g13 != 2 && g13 != 3 && g13 != 4 && g13 != 6 && g13 != 7 && g13 != 17) {
                switch (g13) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + g13);
                }
            }
            if (c0Var.f()) {
                d7.u.g("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c0Var.f()) {
                c0Var.o(14);
            }
            boolean f13 = c0Var.f();
            if (g15 == 0) {
                throw new UnsupportedOperationException();
            }
            if (g13 == 6 || g13 == 20) {
                c0Var.o(3);
            }
            if (f13) {
                if (g13 == 22) {
                    c0Var.o(16);
                }
                if (g13 == 17 || g13 == 19 || g13 == 20 || g13 == 23) {
                    c0Var.o(3);
                }
                c0Var.o(1);
            }
            switch (g13) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int g17 = c0Var.g(2);
                    if (g17 == 2 || g17 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + g17);
                    }
            }
        }
        int i13 = f102861b[g15];
        if (i13 != -1) {
            return new a(g14, i13, d2);
        }
        throw ParserException.a(null, null);
    }

    public static int k(ByteBuffer byteBuffer) {
        int i13;
        byte b13;
        int i14;
        byte b14;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b15 = byteBuffer.get(position);
        if (b15 != -2) {
            if (b15 == -1) {
                i13 = (byteBuffer.get(position + 4) & 7) << 4;
                b14 = byteBuffer.get(position + 7);
            } else if (b15 != 31) {
                i13 = (byteBuffer.get(position + 4) & 1) << 6;
                b13 = byteBuffer.get(position + 5);
            } else {
                i13 = (byteBuffer.get(position + 5) & 7) << 4;
                b14 = byteBuffer.get(position + 6);
            }
            i14 = b14 & 60;
            return (((i14 >> 2) | i13) + 1) * 32;
        }
        i13 = (byteBuffer.get(position + 5) & 1) << 6;
        b13 = byteBuffer.get(position + 4);
        i14 = b13 & 252;
        return (((i14 >> 2) | i13) + 1) * 32;
    }

    public static int l(int i13) {
        int i14;
        int i15;
        if (!((i13 & (-2097152)) == -2097152) || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0) {
            return -1;
        }
        int i16 = (i13 >>> 12) & 15;
        int i17 = (i13 >>> 10) & 3;
        if (i16 == 0 || i16 == 15 || i17 == 3) {
            return -1;
        }
        if (i15 == 1) {
            return i14 == 3 ? 1152 : 576;
        }
        if (i15 == 2) {
            return 1152;
        }
        if (i15 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static int m(int i13, ByteBuffer byteBuffer) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i13) + ((byteBuffer.get((byteBuffer.position() + i13) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int n(d7.c0 c0Var, int[] iArr) {
        int i13 = 0;
        for (int i14 = 0; i14 < 3 && c0Var.f(); i14++) {
            i13++;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            i15 += 1 << iArr[i16];
        }
        return c0Var.g(iArr[i13]) + i15;
    }
}
