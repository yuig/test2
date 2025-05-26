package com.appsflyer.internal;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFa1rSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFa1rSDK;)V", "", "afInfoLog", "()V", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFa1rSDK;", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFb1sSDK {

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFa1rSDK getCurrencyIso4217Code;

    public AFb1sSDK(@NotNull AFa1rSDK aFa1rSDK) {
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        this.getCurrencyIso4217Code = aFa1rSDK;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1zSDK.unregisterClient;
            Object obj = map.get(-1531692324);
            if (obj == null) {
                obj = ((Class) AFa1zSDK.getMediationNetwork(37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 323, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10514))).getDeclaredConstructor(null);
                map.put(-1531692324, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr = {this.getCurrencyIso4217Code};
            Object obj2 = map.get(1361825901);
            if (obj2 == null) {
                obj2 = ((Class) AFa1zSDK.getMediationNetwork((Process.myPid() >> 22) + 36, 324 - View.MeasureSpec.getSize(0), (char) (TextUtils.lastIndexOf("", '0', 0) + 10515))).getMethod("getMediationNetwork", AFa1rSDK.class);
                map.put(1361825901, obj2);
            }
            ((Method) obj2).invoke(newInstance, objArr);
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }
}
