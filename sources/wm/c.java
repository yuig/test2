package wm;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f130219b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f130220c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f130221d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f130222e;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f130223a;

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
        f130221d = iArr;
        iArr[0][32] = 1;
        for (int i13 = 65; i13 <= 90; i13++) {
            f130221d[0][i13] = i13 - 63;
        }
        f130221d[1][32] = 1;
        for (int i14 = 97; i14 <= 122; i14++) {
            f130221d[1][i14] = i14 - 95;
        }
        f130221d[2][32] = 1;
        for (int i15 = 48; i15 <= 57; i15++) {
            f130221d[2][i15] = i15 - 46;
        }
        int[] iArr2 = f130221d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK};
        int i16 = 0;
        for (int i17 = 28; i16 < i17; i17 = 28) {
            f130221d[3][iArr3[i16]] = i16;
            i16++;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED};
        for (int i18 = 0; i18 < 31; i18++) {
            int i19 = iArr4[i18];
            if (i19 > 0) {
                f130221d[4][i19] = i18;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f130222e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f130222e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public c(byte[] bArr) {
        this.f130223a = bArr;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(eVar);
                    break;
                }
                e eVar2 = (e) it2.next();
                if (eVar2.c(eVar)) {
                    break;
                }
                if (eVar.c(eVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }
}
