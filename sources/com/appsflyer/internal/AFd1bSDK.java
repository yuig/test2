package com.appsflyer.internal;

import android.os.Build;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1dSDK;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1bSDK implements AFd1dSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;
    private static int hashCode;

    @NotNull
    private final xk2.k AFAdRevenueData;

    @NotNull
    private final xk2.k areAllFieldsValid;

    @NotNull
    private final String component1;
    private AFd1dSDK.AFa1zSDK component2;

    @NotNull
    private final xk2.k component3;

    @NotNull
    private final xk2.k component4;

    @NotNull
    private final xk2.k getCurrencyIso4217Code;

    @NotNull
    private final xk2.k getMediationNetwork;

    @NotNull
    private AFd1gSDK getMonetizationNetwork;

    @NotNull
    private final xk2.k getRevenue;
    private static char[] copydefault = {28953, 17708, 6480, 60794, 41355};
    private static long copy = 7119658375323600222L;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1eSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1eSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$1 */
    public static final class AnonymousClass1 extends s implements Function0<AFd1eSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFAdRevenueData */
        public final AFd1eSDK invoke() {
            AFd1oSDK AFInAppEventType = AFd1bSDK.getMonetizationNetwork(AFd1bSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return new AFd1eSDK(AFInAppEventType);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFe1zSDK;", "getMonetizationNetwork", "()Lcom/appsflyer/internal/AFe1zSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$10 */
    public static final class AnonymousClass10 extends s implements Function0<AFe1zSDK> {
        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getMonetizationNetwork */
        public final AFe1zSDK invoke() {
            AFd1bSDK aFd1bSDK = AFd1bSDK.this;
            return new AFe1zSDK((AFd1cSDK) AFd1bSDK.AFAdRevenueData(new Object[]{aFd1bSDK}, 1033501900, -1033501896, System.identityHashCode(aFd1bSDK)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFg1vSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFg1vSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$2 */
    public static final class AnonymousClass2 extends s implements Function0<AFg1vSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFAdRevenueData */
        public final AFg1vSDK invoke() {
            AFg1vSDK component3 = AFd1bSDK.getMonetizationNetwork(AFd1bSDK.this).component3();
            Intrinsics.checkNotNullExpressionValue(component3, "");
            return component3;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1nSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1nSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$3 */
    public static final class AnonymousClass3 extends s implements Function0<AFd1nSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue */
        public final AFd1nSDK invoke() {
            AFd1nSDK monetizationNetwork = AFd1bSDK.getMonetizationNetwork(AFd1bSDK.this).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$4 */
    public static final class AnonymousClass4 extends s implements Function0<ExecutorService> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getCurrencyIso4217Code */
        public final ExecutorService invoke() {
            ExecutorService mediationNetwork = AFd1bSDK.getMonetizationNetwork(AFd1bSDK.this).getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            return mediationNetwork;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1pSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1pSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$5 */
    public static final class AnonymousClass5 extends s implements Function0<AFd1pSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue */
        public final AFd1pSDK invoke() {
            AFd1pSDK component2 = AFd1bSDK.getMonetizationNetwork(AFd1bSDK.this).component2();
            Intrinsics.checkNotNullExpressionValue(component2, "");
            return component2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFg1qSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFg1qSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$7 */
    public static final class AnonymousClass7 extends s implements Function0<AFg1qSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue */
        public final AFg1qSDK invoke() {
            AFg1qSDK AFKeystoreWrapper = AFd1bSDK.getMonetizationNetwork(AFd1bSDK.this).AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
            return AFKeystoreWrapper;
        }
    }

    public AFd1bSDK(@NotNull AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.getMonetizationNetwork = aFd1gSDK;
        this.getCurrencyIso4217Code = xk2.m.b(new AnonymousClass2());
        this.getRevenue = xk2.m.b(new AnonymousClass3());
        this.getMediationNetwork = xk2.m.b(new AnonymousClass5());
        this.AFAdRevenueData = xk2.m.b(new AnonymousClass7());
        this.component3 = xk2.m.b(new AnonymousClass4());
        this.component1 = "6.16.0";
        this.areAllFieldsValid = xk2.m.b(new AnonymousClass1());
        this.component4 = xk2.m.b(new AnonymousClass10());
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i13, int i14, int i15) {
        int i16 = ~i15;
        int i17 = ~i14;
        int i18 = (((~(i13 | i14 | i15)) | (~(i16 | i17)) | (~((~i13) | i17))) * 757) + ((~(i17 | i13 | i15)) * 1514) + ((i13 | i16) * (-757)) + (i14 * (-756)) + (i13 * 758);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? getRevenue(objArr) : getMediationNetwork(objArr) : AFAdRevenueData(objArr) : getMonetizationNetwork(objArr) : getCurrencyIso4217Code(objArr);
    }

    @NotNull
    private AFd1aSDK areAllFieldsValid() {
        int i13 = hashCode + 27;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return (AFd1aSDK) this.component4.getValue();
        }
        throw null;
    }

    private final ExecutorService component1() {
        ExecutorService executorService;
        int i13 = hashCode + 1;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            executorService = (ExecutorService) this.component3.getValue();
            int i14 = 54 / 0;
        } else {
            executorService = (ExecutorService) this.component3.getValue();
        }
        hashCode = (equals + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return executorService;
    }

    private final AFg1qSDK component2() {
        hashCode = (equals + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFg1qSDK aFg1qSDK = (AFg1qSDK) this.AFAdRevenueData.getValue();
        hashCode = (equals + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return aFg1qSDK;
    }

    private final AFi1wSDK component3() {
        AFi1qSDK aFi1qSDK = AFAdRevenueData().getMediationNetwork.getMonetizationNetwork;
        if (aFi1qSDK != null) {
            int i13 = hashCode;
            equals = (i13 + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            AFi1xSDK aFi1xSDK = aFi1qSDK.getMediationNetwork;
            if (aFi1xSDK != null) {
                equals = (i13 + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return aFi1xSDK.getMonetizationNetwork;
            }
        }
        int i14 = hashCode + 55;
        equals = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 == 0) {
            int i15 = 67 / 0;
        }
        return null;
    }

    private final AFd1pSDK component4() {
        return (AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this));
    }

    private final void copy() {
        String str;
        AFi1wSDK component3 = component3();
        if (component3 != null) {
            hashCode = (equals + 5) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (!getCurrencyIso4217Code(component3)) {
                AFh1rSDK.v$default(AFLogger.INSTANCE, AFh1sSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                int i13 = equals + 21;
                hashCode = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i14 = hashCode + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
            equals = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 == 0) {
                AFg1qSDK component2 = component2();
                str = (String) AFg1qSDK.AFAdRevenueData(new Object[]{component2}, 1235496603, -1235496602, System.identityHashCode(component2));
                int i15 = 91 / 0;
                if (str == null) {
                    return;
                }
            } else {
                AFg1qSDK component22 = component2();
                str = (String) AFg1qSDK.AFAdRevenueData(new Object[]{component22}, 1235496603, -1235496602, System.identityHashCode(component22));
                if (str == null) {
                    return;
                }
            }
            String jSONObject = new JSONObject(AFAdRevenueData(getMediationNetwork(component3), ((AFd1cSDK) AFAdRevenueData(new Object[]{this}, 1033501900, -1033501896, System.identityHashCode(this))).getMonetizationNetwork())).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            Intrinsics.checkNotNullExpressionValue(str, "");
            AFAdRevenueData(new Object[]{this, jSONObject, str}, -206929965, 206929968, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        if (r9 != null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r9 = kotlin.text.StringsKt.toIntOrNull(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r9 = r9.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0177, code lost:
    
        if (r0.intValue() != (-1)) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e7, code lost:
    
        if (r9 != null) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0031, B:12:0x0063, B:14:0x006b, B:17:0x0074, B:19:0x0077, B:20:0x0207, B:22:0x020b, B:24:0x0211, B:25:0x0215, B:30:0x009d, B:32:0x00a5, B:34:0x00b1, B:36:0x00c3, B:38:0x00cc, B:40:0x00d7, B:45:0x00e9, B:47:0x00ef, B:48:0x00f5, B:50:0x0101, B:52:0x010f, B:54:0x0115, B:55:0x011b, B:57:0x0127, B:59:0x012d, B:61:0x0133, B:62:0x0139, B:63:0x013c, B:64:0x0142, B:66:0x0148, B:68:0x014c, B:69:0x015a, B:71:0x0160, B:73:0x0164, B:75:0x016a, B:77:0x017b, B:79:0x0195, B:81:0x01c1, B:82:0x01e3, B:83:0x0173, B:90:0x00e2, B:91:0x00e3, B:43:0x00dd), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127 A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0031, B:12:0x0063, B:14:0x006b, B:17:0x0074, B:19:0x0077, B:20:0x0207, B:22:0x020b, B:24:0x0211, B:25:0x0215, B:30:0x009d, B:32:0x00a5, B:34:0x00b1, B:36:0x00c3, B:38:0x00cc, B:40:0x00d7, B:45:0x00e9, B:47:0x00ef, B:48:0x00f5, B:50:0x0101, B:52:0x010f, B:54:0x0115, B:55:0x011b, B:57:0x0127, B:59:0x012d, B:61:0x0133, B:62:0x0139, B:63:0x013c, B:64:0x0142, B:66:0x0148, B:68:0x014c, B:69:0x015a, B:71:0x0160, B:73:0x0164, B:75:0x016a, B:77:0x017b, B:79:0x0195, B:81:0x01c1, B:82:0x01e3, B:83:0x0173, B:90:0x00e2, B:91:0x00e3, B:43:0x00dd), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0031, B:12:0x0063, B:14:0x006b, B:17:0x0074, B:19:0x0077, B:20:0x0207, B:22:0x020b, B:24:0x0211, B:25:0x0215, B:30:0x009d, B:32:0x00a5, B:34:0x00b1, B:36:0x00c3, B:38:0x00cc, B:40:0x00d7, B:45:0x00e9, B:47:0x00ef, B:48:0x00f5, B:50:0x0101, B:52:0x010f, B:54:0x0115, B:55:0x011b, B:57:0x0127, B:59:0x012d, B:61:0x0133, B:62:0x0139, B:63:0x013c, B:64:0x0142, B:66:0x0148, B:68:0x014c, B:69:0x015a, B:71:0x0160, B:73:0x0164, B:75:0x016a, B:77:0x017b, B:79:0x0195, B:81:0x01c1, B:82:0x01e3, B:83:0x0173, B:90:0x00e2, B:91:0x00e3, B:43:0x00dd), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0031, B:12:0x0063, B:14:0x006b, B:17:0x0074, B:19:0x0077, B:20:0x0207, B:22:0x020b, B:24:0x0211, B:25:0x0215, B:30:0x009d, B:32:0x00a5, B:34:0x00b1, B:36:0x00c3, B:38:0x00cc, B:40:0x00d7, B:45:0x00e9, B:47:0x00ef, B:48:0x00f5, B:50:0x0101, B:52:0x010f, B:54:0x0115, B:55:0x011b, B:57:0x0127, B:59:0x012d, B:61:0x0133, B:62:0x0139, B:63:0x013c, B:64:0x0142, B:66:0x0148, B:68:0x014c, B:69:0x015a, B:71:0x0160, B:73:0x0164, B:75:0x016a, B:77:0x017b, B:79:0x0195, B:81:0x01c1, B:82:0x01e3, B:83:0x0173, B:90:0x00e2, B:91:0x00e3, B:43:0x00dd), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195 A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0031, B:12:0x0063, B:14:0x006b, B:17:0x0074, B:19:0x0077, B:20:0x0207, B:22:0x020b, B:24:0x0211, B:25:0x0215, B:30:0x009d, B:32:0x00a5, B:34:0x00b1, B:36:0x00c3, B:38:0x00cc, B:40:0x00d7, B:45:0x00e9, B:47:0x00ef, B:48:0x00f5, B:50:0x0101, B:52:0x010f, B:54:0x0115, B:55:0x011b, B:57:0x0127, B:59:0x012d, B:61:0x0133, B:62:0x0139, B:63:0x013c, B:64:0x0142, B:66:0x0148, B:68:0x014c, B:69:0x015a, B:71:0x0160, B:73:0x0164, B:75:0x016a, B:77:0x017b, B:79:0x0195, B:81:0x01c1, B:82:0x01e3, B:83:0x0173, B:90:0x00e2, B:91:0x00e3, B:43:0x00dd), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173 A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0031, B:12:0x0063, B:14:0x006b, B:17:0x0074, B:19:0x0077, B:20:0x0207, B:22:0x020b, B:24:0x0211, B:25:0x0215, B:30:0x009d, B:32:0x00a5, B:34:0x00b1, B:36:0x00c3, B:38:0x00cc, B:40:0x00d7, B:45:0x00e9, B:47:0x00ef, B:48:0x00f5, B:50:0x0101, B:52:0x010f, B:54:0x0115, B:55:0x011b, B:57:0x0127, B:59:0x012d, B:61:0x0133, B:62:0x0139, B:63:0x013c, B:64:0x0142, B:66:0x0148, B:68:0x014c, B:69:0x015a, B:71:0x0160, B:73:0x0164, B:75:0x016a, B:77:0x017b, B:79:0x0195, B:81:0x01c1, B:82:0x01e3, B:83:0x0173, B:90:0x00e2, B:91:0x00e3, B:43:0x00dd), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void copydefault() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1bSDK.copydefault():void");
    }

    private final synchronized void equals() {
        boolean z13;
        try {
            AFi1wSDK component3 = component3();
            if (component3 != null) {
                hashCode = (equals + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (component3.getMonetizationNetwork == -1) {
                    ((AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this))).getCurrencyIso4217Code("af_send_exc_to_server_window");
                } else if (((AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    getRevenue(component3);
                }
                z13 = AFAdRevenueData(component3);
            } else {
                z13 = false;
            }
            AFd1dSDK.AFa1zSDK aFa1zSDK = this.component2;
            if (aFa1zSDK != null) {
                int i13 = hashCode + 63;
                equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 != 0) {
                    aFa1zSDK.onConfigurationChanged(z13);
                } else {
                    aFa1zSDK.onConfigurationChanged(z13);
                    throw null;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1bSDK aFd1bSDK = (AFd1bSDK) objArr[0];
        int i13 = equals + 79;
        hashCode = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        AFd1pSDK aFd1pSDK = (AFd1pSDK) aFd1bSDK.getMediationNetwork.getValue();
        if (i14 != 0) {
            throw null;
        }
        int i15 = hashCode + RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
        equals = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1bSDK aFd1bSDK = (AFd1bSDK) objArr[0];
        equals = (hashCode + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFd1cSDK aFd1cSDK = (AFd1cSDK) aFd1bSDK.areAllFieldsValid.getValue();
        int i13 = equals + 67;
        hashCode = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return aFd1cSDK;
        }
        throw null;
    }

    public static final /* synthetic */ AFd1gSDK getMonetizationNetwork(AFd1bSDK aFd1bSDK) {
        int i13 = hashCode + 81;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        AFd1gSDK aFd1gSDK = aFd1bSDK.getMonetizationNetwork;
        if (i14 == 0) {
            int i15 = 21 / 0;
        }
        return aFd1gSDK;
    }

    private final AFd1nSDK getRevenue() {
        hashCode = (equals + 31) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFd1nSDK aFd1nSDK = (AFd1nSDK) this.getRevenue.getValue();
        int i13 = hashCode + 41;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return aFd1nSDK;
        }
        throw null;
    }

    private final AFg1vSDK AFAdRevenueData() {
        int i13 = hashCode + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return (AFg1vSDK) this.getCurrencyIso4217Code.getValue();
        }
        throw null;
    }

    private static void a(int i13, int i14, char c13, Object[] objArr) {
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i13];
        aFk1hSDK.getMediationNetwork = 0;
        while (true) {
            int i15 = aFk1hSDK.getMediationNetwork;
            if (i15 >= i13) {
                break;
            }
            $11 = ($10 + 99) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            jArr[i15] = (((char) (copydefault[i14 + i15] ^ (-2156929640463306373L))) ^ (i15 * ((-2156929640463306373L) ^ copy))) ^ c13;
            aFk1hSDK.getMediationNetwork = i15 + 1;
        }
        char[] cArr = new char[i13];
        aFk1hSDK.getMediationNetwork = 0;
        while (true) {
            int i16 = aFk1hSDK.getMediationNetwork;
            if (i16 >= i13) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = ($11 + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            $10 = i17;
            cArr[i16] = (char) jArr[i16];
            aFk1hSDK.getMediationNetwork = i16 + 1;
            $11 = (i17 + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    public static final void getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) {
        hashCode = (equals + 41) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        aFd1bSDK.copydefault();
        int i13 = equals + 87;
        hashCode = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            int i14 = 56 / 0;
        }
    }

    public static final void getMediationNetwork(AFd1bSDK aFd1bSDK) {
        int i13 = hashCode + 97;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1bSDK, "");
            aFd1bSDK.copy();
        } else {
            Intrinsics.checkNotNullParameter(aFd1bSDK, "");
            aFd1bSDK.copy();
            throw null;
        }
    }

    public static final void getMonetizationNetwork(AFd1bSDK aFd1bSDK, Throwable th3, String str) {
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        Intrinsics.checkNotNullParameter(th3, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFi1wSDK component3 = aFd1bSDK.component3();
        if (component3 == null || !aFd1bSDK.AFAdRevenueData(component3)) {
            return;
        }
        equals = (hashCode + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        ((AFd1cSDK) AFAdRevenueData(new Object[]{aFd1bSDK}, 1033501900, -1033501896, System.identityHashCode(aFd1bSDK))).AFAdRevenueData(th3, str);
        hashCode = (equals + 25) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        final int i13 = 0;
        final AFd1bSDK aFd1bSDK = (AFd1bSDK) objArr[0];
        final int i14 = 1;
        final Throwable th3 = (Throwable) objArr[1];
        final String str = (String) objArr[2];
        int i15 = equals + 63;
        hashCode = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th3, "");
            Intrinsics.checkNotNullParameter(str, "");
            aFd1bSDK.component1().execute(new Runnable(aFd1bSDK) { // from class: com.appsflyer.internal.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AFd1bSDK f29108b;

                {
                    this.f29108b = aFd1bSDK;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i16 = i14;
                    AFd1bSDK.getMonetizationNetwork(this.f29108b, th3, str);
                }
            });
            int i16 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(th3, "");
            Intrinsics.checkNotNullParameter(str, "");
            aFd1bSDK.component1().execute(new Runnable(aFd1bSDK) { // from class: com.appsflyer.internal.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AFd1bSDK f29108b;

                {
                    this.f29108b = aFd1bSDK;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i162 = i13;
                    AFd1bSDK.getMonetizationNetwork(this.f29108b, th3, str);
                }
            });
        }
        equals = (hashCode + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return null;
    }

    private static Map<String, Object> AFAdRevenueData(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        hashCode = (equals + 27) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Map<String, Object> g13 = z0.g(new Pair("deviceInfo", map), new Pair("excs", AFe1wSDK.getMonetizationNetwork(list)));
        equals = (hashCode + 25) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return g13;
    }

    @Override // com.appsflyer.internal.AFd1dSDK
    public final void getCurrencyIso4217Code() {
        equals = (hashCode + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        component1().execute(new f(this, 0));
        hashCode = (equals + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.internal.AFd1dSDK
    public final void getMonetizationNetwork(AFd1dSDK.AFa1zSDK aFa1zSDK) {
        equals = (hashCode + 17) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.component2 = aFa1zSDK;
        component1().execute(new f(this, 2));
        int i13 = equals + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
        hashCode = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static Object AFAdRevenueData(Object[] objArr) {
        AFd1bSDK aFd1bSDK = (AFd1bSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        equals = (hashCode + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1bSDK.areAllFieldsValid().getMonetizationNetwork(bytes, y0.b(new Pair("Authorization", AFb1mSDK.getRevenue(str, str2))), 2000);
        int i13 = hashCode + 75;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final Map<String, String> getMediationNetwork(AFi1wSDK aFi1wSDK) {
        Object[] objArr = new Object[1];
        a(5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.getMaxKeyCode() >> 16, (char) Gravity.getAbsoluteGravity(0, 0), objArr);
        Pair pair = new Pair(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = new Pair("model", Build.MODEL);
        Pair pair3 = new Pair("app_id", getRevenue().getRevenue.getMonetizationNetwork.getPackageName());
        Pair pair4 = new Pair("p_ex", new AFb1cSDK().getMonetizationNetwork());
        Pair pair5 = new Pair("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = new Pair("sdk", this.component1);
        AFd1nSDK revenue = getRevenue();
        Map<String, String> g13 = z0.g(pair, pair2, pair3, pair4, pair5, pair6, new Pair("uid", AFb1iSDK.getMediationNetwork(revenue.getRevenue, revenue.getCurrencyIso4217Code)), new Pair("exc_config", aFi1wSDK.getMonetizationNetwork()));
        hashCode = (equals + 17) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return g13;
    }

    public static final void getRevenue(AFd1bSDK aFd1bSDK) {
        int i13 = hashCode + 47;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1bSDK, "");
            aFd1bSDK.equals();
        } else {
            Intrinsics.checkNotNullParameter(aFd1bSDK, "");
            aFd1bSDK.equals();
            throw null;
        }
    }

    private final boolean getCurrencyIso4217Code(AFi1wSDK aFi1wSDK) {
        int AFAdRevenueData;
        hashCode = (equals + 47) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = ((AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFi1wSDK.AFAdRevenueData < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            hashCode = (equals + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return false;
        }
        if (mediationNetwork != -1 && mediationNetwork >= currentTimeMillis && (AFAdRevenueData = ((AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_min", -1)) != -1) {
            int i13 = equals + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
            hashCode = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                ((AFd1cSDK) AFAdRevenueData(new Object[]{this}, 1033501900, -1033501896, System.identityHashCode(this))).AFAdRevenueData();
                throw null;
            }
            if (((AFd1cSDK) AFAdRevenueData(new Object[]{this}, 1033501900, -1033501896, System.identityHashCode(this))).AFAdRevenueData() >= AFAdRevenueData) {
                return getMonetizationNetwork(aFi1wSDK);
            }
        }
        return false;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1bSDK aFd1bSDK = (AFd1bSDK) objArr[0];
        hashCode = (equals + 75) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        aFd1bSDK.component1().execute(new f(aFd1bSDK, 1));
        int i13 = equals + RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
        hashCode = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final boolean getMonetizationNetwork(AFi1wSDK aFi1wSDK) {
        new AFe1vSDK();
        String str = this.component1;
        String str2 = aFi1wSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFe1vSDK.getCurrencyIso4217Code(str, str2);
        int i13 = hashCode + 85;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 10 / 0;
        }
        return currencyIso4217Code;
    }

    private final void getRevenue(AFi1wSDK aFi1wSDK) {
        int i13;
        AFd1pSDK aFd1pSDK;
        int i14 = equals + 5;
        hashCode = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            i13 = aFi1wSDK.getRevenue;
            long currentTimeMillis = System.currentTimeMillis() & TimeUnit.DAYS.toMillis(aFi1wSDK.getMonetizationNetwork);
            aFd1pSDK = (AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this));
            aFd1pSDK.getMonetizationNetwork("af_send_exc_to_server_window", currentTimeMillis);
        } else {
            i13 = aFi1wSDK.getRevenue;
            long millis = TimeUnit.DAYS.toMillis(aFi1wSDK.getMonetizationNetwork) + System.currentTimeMillis();
            aFd1pSDK = (AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this));
            aFd1pSDK.getMonetizationNetwork("af_send_exc_to_server_window", millis);
        }
        aFd1pSDK.getMonetizationNetwork("af_send_exc_min", i13);
    }

    private final boolean AFAdRevenueData(AFi1wSDK aFi1wSDK) {
        hashCode = (equals + 23) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = ((AFd1pSDK) AFAdRevenueData(new Object[]{this}, -1900684897, 1900684898, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFi1wSDK.AFAdRevenueData >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && mediationNetwork != -1) {
            equals = (hashCode + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (mediationNetwork >= currentTimeMillis) {
                return getMonetizationNetwork(aFi1wSDK);
            }
        }
        return false;
    }

    private final void getMonetizationNetwork(String str, String str2) {
        AFAdRevenueData(new Object[]{this, str, str2}, -206929965, 206929968, System.identityHashCode(this));
    }

    @NotNull
    public final AFd1cSDK getMonetizationNetwork() {
        return (AFd1cSDK) AFAdRevenueData(new Object[]{this}, 1033501900, -1033501896, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1dSDK
    public final void getMediationNetwork() {
        AFAdRevenueData(new Object[]{this}, 2077848305, -2077848303, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1dSDK
    public final void getMediationNetwork(@NotNull Throwable th3, @NotNull String str) {
        AFAdRevenueData(new Object[]{this, th3, str}, -192991965, 192991965, System.identityHashCode(this));
    }
}
