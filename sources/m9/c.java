package m9;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends i {

    /* renamed from: i, reason: collision with root package name */
    public final int f86550i;

    /* renamed from: j, reason: collision with root package name */
    public final int f86551j;

    /* renamed from: k, reason: collision with root package name */
    public final int f86552k;

    /* renamed from: o, reason: collision with root package name */
    public List f86556o;

    /* renamed from: p, reason: collision with root package name */
    public List f86557p;

    /* renamed from: q, reason: collision with root package name */
    public int f86558q;

    /* renamed from: r, reason: collision with root package name */
    public int f86559r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f86560s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f86561t;

    /* renamed from: u, reason: collision with root package name */
    public byte f86562u;

    /* renamed from: v, reason: collision with root package name */
    public byte f86563v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f86565x;

    /* renamed from: y, reason: collision with root package name */
    public long f86566y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f86548z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL, 93, RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM, RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM, 250, 97, 98, 99, 100, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER, RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER, RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM, 9632};
    public static final int[] D = {RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO, 8482, RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM, 9834, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, 32, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM, RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS, RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP, RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE};
    public static final int[] E = {RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY, 201, RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER, RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER, RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, 8216, RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER, 42, 39, 8212, RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT, 8480, 8226, 8220, 8221, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO, 200, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER, RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY, RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER, RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP, RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO, RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD};
    public static final int[] F = {RecyclerViewTypes.VIEW_TYPE_USER, RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR, RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER, RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM, RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION, RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, 92, 94, 95, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE, RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER, RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER, RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING, 9474, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO, RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO, RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final d0 f86549h = new d0();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f86554m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public b f86555n = new b(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f86564w = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f86553l = 16000000;

    public c(String str, int i13) {
        this.f86550i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i13 == 1) {
            this.f86552k = 0;
            this.f86551j = 0;
        } else if (i13 == 2) {
            this.f86552k = 1;
            this.f86551j = 0;
        } else if (i13 == 3) {
            this.f86552k = 0;
            this.f86551j = 1;
        } else if (i13 != 4) {
            u.g("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f86552k = 0;
            this.f86551j = 0;
        } else {
            this.f86552k = 1;
            this.f86551j = 1;
        }
        m(0);
        l();
        this.f86565x = true;
        this.f86566y = -9223372036854775807L;
    }

    @Override // m9.i, k7.d
    public final void a() {
    }

    @Override // m9.i, k7.d
    public final void flush() {
        super.flush();
        this.f86556o = null;
        this.f86557p = null;
        m(0);
        this.f86559r = 4;
        this.f86555n.f86547h = 4;
        l();
        this.f86560s = false;
        this.f86561t = false;
        this.f86562u = (byte) 0;
        this.f86563v = (byte) 0;
        this.f86564w = 0;
        this.f86565x = true;
        this.f86566y = -9223372036854775807L;
    }

    @Override // m9.i
    public final j g() {
        List list = this.f86556o;
        this.f86557p = list;
        list.getClass();
        return new j(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // m9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(m9.g r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.c.h(m9.g):void");
    }

    @Override // m9.i, k7.d
    /* renamed from: i */
    public final l9.i c() {
        l9.i iVar;
        l9.i c13 = super.c();
        if (c13 != null) {
            return c13;
        }
        long j13 = this.f86553l;
        if (j13 == -9223372036854775807L) {
            return null;
        }
        long j14 = this.f86566y;
        if (j14 == -9223372036854775807L || this.f86612e - j14 < j13 || (iVar = (l9.i) this.f86609b.pollFirst()) == null) {
            return null;
        }
        this.f86556o = Collections.emptyList();
        this.f86566y = -9223372036854775807L;
        j g13 = g();
        long j15 = this.f86612e;
        iVar.f78460c = j15;
        iVar.f82316e = g13;
        iVar.f82317f = j15;
        return iVar;
    }

    @Override // m9.i
    public final boolean j() {
        return this.f86556o != this.f86557p;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.f86554m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i13 = 2;
        for (int i14 = 0; i14 < size; i14++) {
            c7.b c13 = ((b) arrayList.get(i14)).c(Integer.MIN_VALUE);
            arrayList2.add(c13);
            if (c13 != null) {
                i13 = Math.min(i13, c13.f26692i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            c7.b bVar = (c7.b) arrayList2.get(i15);
            if (bVar != null) {
                if (bVar.f26692i != i13) {
                    bVar = ((b) arrayList.get(i15)).c(i13);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void l() {
        b bVar = this.f86555n;
        bVar.f86546g = this.f86558q;
        bVar.f86540a.clear();
        bVar.f86541b.clear();
        bVar.f86542c.setLength(0);
        bVar.f86543d = 15;
        bVar.f86544e = 0;
        bVar.f86545f = 0;
        ArrayList arrayList = this.f86554m;
        arrayList.clear();
        arrayList.add(this.f86555n);
    }

    public final void m(int i13) {
        int i14 = this.f86558q;
        if (i14 == i13) {
            return;
        }
        this.f86558q = i13;
        if (i13 != 3) {
            l();
            if (i14 == 3 || i13 == 1 || i13 == 0) {
                this.f86556o = Collections.emptyList();
                return;
            }
            return;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList = this.f86554m;
            if (i15 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i15)).f86546g = i13;
            i15++;
        }
    }
}
