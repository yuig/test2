package d7;

import a.cb;
import android.util.Pair;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Locale;
import java.util.regex.Pattern;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f53817a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f53818b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f53819c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i13, int i14, int i15) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    public static String b(int i13, int i14, int i15, int i16, boolean z13, int[] iArr) {
        Object[] objArr = new Object[5];
        objArr[0] = f53818b[i13];
        objArr[1] = Integer.valueOf(i14);
        objArr[2] = Integer.valueOf(i15);
        objArr[3] = Character.valueOf(z13 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i16);
        int i17 = n0.f53866a;
        StringBuilder sb3 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i18 = 0; i18 < length; i18++) {
            sb3.append(String.format(".%02X", Integer.valueOf(iArr[i18])));
        }
        return sb3.toString();
    }

    public static Pair c(String str, String[] strArr, a7.j jVar) {
        int i13;
        int i14 = 4;
        if (strArr.length < 4) {
            cb.u("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                cb.t("Unknown AV1 profile: ", parseInt, "CodecSpecificDataUtil");
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                cb.t("Unknown AV1 bit depth: ", parseInt3, "CodecSpecificDataUtil");
                return null;
            }
            int i15 = parseInt3 == 8 ? 1 : (jVar == null || !(jVar.f1085d != null || (i13 = jVar.f1084c) == 7 || i13 == 6)) ? 2 : 4096;
            switch (parseInt2) {
                case 0:
                    i14 = 1;
                    break;
                case 1:
                    i14 = 2;
                    break;
                case 2:
                    break;
                case 3:
                    i14 = 8;
                    break;
                case 4:
                    i14 = 16;
                    break;
                case 5:
                    i14 = 32;
                    break;
                case 6:
                    i14 = 64;
                    break;
                case 7:
                    i14 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                case 8:
                    i14 = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    break;
                case 9:
                    i14 = BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    break;
                case 10:
                    i14 = 1024;
                    break;
                case 11:
                    i14 = 2048;
                    break;
                case 12:
                    i14 = 4096;
                    break;
                case 13:
                    i14 = 8192;
                    break;
                case 14:
                    i14 = 16384;
                    break;
                case 15:
                    i14 = 32768;
                    break;
                case 16:
                    i14 = 65536;
                    break;
                case 17:
                    i14 = 131072;
                    break;
                case 18:
                    i14 = 262144;
                    break;
                case 19:
                    i14 = 524288;
                    break;
                case 20:
                    i14 = 1048576;
                    break;
                case 21:
                    i14 = 2097152;
                    break;
                case 22:
                    i14 = 4194304;
                    break;
                case 23:
                    i14 = 8388608;
                    break;
                default:
                    i14 = -1;
                    break;
            }
            if (i14 != -1) {
                return new Pair(Integer.valueOf(i15), Integer.valueOf(i14));
            }
            cb.t("Unknown AV1 level: ", parseInt2, "CodecSpecificDataUtil");
            return null;
        } catch (NumberFormatException unused) {
            cb.u("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
    }

    public static Pair d(String str, String[] strArr) {
        int parseInt;
        int parseInt2;
        int i13 = 2;
        if (strArr.length < 2) {
            cb.u("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        int i14 = 1;
        try {
            if (strArr[1].length() == 6) {
                parseInt = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt2 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    u.g("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2]);
            }
            if (parseInt == 66) {
                i13 = 1;
            } else if (parseInt != 77) {
                i13 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4;
            }
            if (i13 == -1) {
                cb.t("Unknown AVC profile: ", parseInt, "CodecSpecificDataUtil");
                return null;
            }
            switch (parseInt2) {
                case 10:
                    break;
                case 11:
                    i14 = 4;
                    break;
                case 12:
                    i14 = 8;
                    break;
                case 13:
                    i14 = 16;
                    break;
                default:
                    switch (parseInt2) {
                        case 20:
                            i14 = 32;
                            break;
                        case 21:
                            i14 = 64;
                            break;
                        case 22:
                            i14 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                            break;
                        default:
                            switch (parseInt2) {
                                case 30:
                                    i14 = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                    break;
                                case 31:
                                    i14 = BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                    break;
                                case 32:
                                    i14 = 1024;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 40:
                                            i14 = 2048;
                                            break;
                                        case 41:
                                            i14 = 4096;
                                            break;
                                        case 42:
                                            i14 = 8192;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 50:
                                                    i14 = 16384;
                                                    break;
                                                case 51:
                                                    i14 = 32768;
                                                    break;
                                                case 52:
                                                    i14 = 65536;
                                                    break;
                                                default:
                                                    i14 = -1;
                                                    break;
                                            }
                                    }
                            }
                    }
            }
            if (i14 != -1) {
                return new Pair(Integer.valueOf(i13), Integer.valueOf(i14));
            }
            cb.t("Unknown AVC level: ", parseInt2, "CodecSpecificDataUtil");
            return null;
        } catch (NumberFormatException unused) {
            cb.u("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair e(java.lang.String r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.f.e(java.lang.String, java.lang.String[]):android.util.Pair");
    }

    public static Pair f(String str, String[] strArr) {
        Pair pair = new Pair(1, 1);
        if (strArr.length < 3) {
            cb.u("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
            return pair;
        }
        try {
            return new Pair(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            cb.u("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
            return pair;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair g(java.lang.String r9, java.lang.String[] r10, a7.j r11) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.f.g(java.lang.String, java.lang.String[], a7.j):android.util.Pair");
    }

    public static Pair h(String str, String[] strArr) {
        if (strArr.length < 3) {
            cb.u("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        int i13 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int i14 = parseInt != 0 ? parseInt != 1 ? parseInt != 2 ? parseInt != 3 ? -1 : 8 : 4 : 2 : 1;
            if (i14 == -1) {
                cb.t("Unknown VP9 profile: ", parseInt, "CodecSpecificDataUtil");
                return null;
            }
            if (parseInt2 != 10) {
                if (parseInt2 == 11) {
                    i13 = 2;
                } else if (parseInt2 == 20) {
                    i13 = 4;
                } else if (parseInt2 == 21) {
                    i13 = 8;
                } else if (parseInt2 == 30) {
                    i13 = 16;
                } else if (parseInt2 == 31) {
                    i13 = 32;
                } else if (parseInt2 == 40) {
                    i13 = 64;
                } else if (parseInt2 == 41) {
                    i13 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                } else if (parseInt2 == 50) {
                    i13 = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                } else if (parseInt2 != 51) {
                    switch (parseInt2) {
                        case 60:
                            i13 = 2048;
                            break;
                        case 61:
                            i13 = 4096;
                            break;
                        case 62:
                            i13 = 8192;
                            break;
                        default:
                            i13 = -1;
                            break;
                    }
                } else {
                    i13 = BitmapUtils.BITMAP_TO_JPEG_SIZE;
                }
            }
            if (i13 != -1) {
                return new Pair(Integer.valueOf(i14), Integer.valueOf(i13));
            }
            cb.t("Unknown VP9 level: ", parseInt2, "CodecSpecificDataUtil");
            return null;
        } catch (NumberFormatException unused) {
            cb.u("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
    }
}
