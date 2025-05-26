package okhttp3.internal.http2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "<init>", "()V", "Node", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Huffman {

    /* renamed from: a, reason: collision with root package name */
    public static final Huffman f96170a = new Huffman();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f96171b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER, 2042, 1018, 1019, RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN, 40, 41, 42, 7, 43, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, 44, 8, 9, 45, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f96172c = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};

    /* renamed from: d, reason: collision with root package name */
    public static final Node f96173d = new Node();

    static {
        for (int i13 = 0; i13 < 256; i13++) {
            Huffman huffman = f96170a;
            int i14 = f96171b[i13];
            byte b13 = f96172c[i13];
            huffman.getClass();
            a(i13, i14, b13);
        }
    }

    private Huffman() {
    }

    public static void a(int i13, int i14, int i15) {
        Node node = new Node(i13, i15);
        Node node2 = f96173d;
        while (i15 > 8) {
            i15 -= 8;
            int i16 = (i14 >>> i15) & 255;
            Node[] nodeArr = node2.f96174a;
            Intrinsics.f(nodeArr);
            Node node3 = nodeArr[i16];
            if (node3 == null) {
                node3 = new Node();
                nodeArr[i16] = node3;
            }
            node2 = node3;
        }
        int i17 = 8 - i15;
        int i18 = (i14 << i17) & 255;
        Node[] nodeArr2 = node2.f96174a;
        Intrinsics.f(nodeArr2);
        Intrinsics.checkNotNullParameter(nodeArr2, "<this>");
        Arrays.fill(nodeArr2, i18, (1 << i17) + i18, node);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Node {

        /* renamed from: a, reason: collision with root package name */
        public final Node[] f96174a;

        /* renamed from: b, reason: collision with root package name */
        public final int f96175b;

        /* renamed from: c, reason: collision with root package name */
        public final int f96176c;

        public Node() {
            this.f96174a = new Node[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
            this.f96175b = 0;
            this.f96176c = 0;
        }

        public Node(int i13, int i14) {
            this.f96174a = null;
            this.f96175b = i13;
            int i15 = i14 & 7;
            this.f96176c = i15 == 0 ? 8 : i15;
        }
    }
}
