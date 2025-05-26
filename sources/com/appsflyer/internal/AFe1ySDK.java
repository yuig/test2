package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFe1ySDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "getMonetizationNetwork", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1ySDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends s implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 getMediationNetwork = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at " + stackTraceElement;
        }
    }

    @NotNull
    private static String AFAdRevenueData(@NotNull Throwable th3) {
        Intrinsics.checkNotNullParameter(th3, "");
        Intrinsics.checkNotNullParameter(th3, "");
        Intrinsics.checkNotNullParameter(th3, "");
        StackTraceElement[] stackTrace = th3.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!z.p(className, "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th3 + "\n" + CollectionsKt.Z(arrayList, "\n", null, null, 0, null, AnonymousClass5.getMediationNetwork, 30);
        Intrinsics.checkNotNullParameter(str, "");
        return AFe1uSDK.getRevenue(str, "SHA-256");
    }

    @NotNull
    public static final AFd1fSDK getCurrencyIso4217Code(@NotNull Throwable th3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(th3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th3, "");
        String name = th3.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return new AFd1fSDK(a.a.D(name, ": ", str), AFAdRevenueData(th3), xk2.f.b(th3), 0, 8, null);
    }
}
