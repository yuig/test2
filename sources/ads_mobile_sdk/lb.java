package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public enum lb implements a.w {
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_ENCODE_SIZE_FAIL(1),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_UNKNOWN(3),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NO_SIGNALS(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_ENCRYPTION(7),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_MEMORY(9),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SERVICE(11),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SERVICE(13),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_COLLECTION_TIMEOUT(15),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_COLLECTION_TIMEOUT(17),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_FALLBACK_SIGNALS(19),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_DECRYPT_SIZE_FAIL(2),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_DECRYPT_SIZE_FAIL(4),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_MD5_CHECK_FAIL(8),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(16),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(32),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(64),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(BitmapUtils.BITMAP_TO_JPEG_SIZE),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(1024),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(2048),
    PSN_ENCODE_SIZE_FAIL(4096),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(8192),
    PSN_INITIALIZATION_FAIL(16384),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_GASS_CLIENT_FAIL(32768),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_SIGNALS_TIMEOUT(65536),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_TINK_FAIL(131072);


    /* renamed from: a, reason: collision with root package name */
    public final int f7753a;

    lb(int i13) {
        this.f7753a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f7753a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + lb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7753a + " name=" + name() + '>';
    }
}
