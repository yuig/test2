package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFa1lSDK {
    private StringBuilder AFAdRevenueData = new StringBuilder();
    private final List<AFa1zSDK> getMonetizationNetwork = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    public enum AFa1zSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private AFa1zSDK getCurrencyIso4217Code() {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFa1hSDK("Nesting problem");
        }
        return (AFa1zSDK) ep.b.i(this.getMonetizationNetwork, 1);
    }

    private void getMonetizationNetwork() {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.EMPTY_ARRAY) {
            AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
            this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK);
        } else {
            if (currencyIso4217Code == AFa1zSDK.NONEMPTY_ARRAY) {
                this.AFAdRevenueData.append(',');
                return;
            }
            if (currencyIso4217Code != AFa1zSDK.DANGLING_KEY) {
                if (currencyIso4217Code != AFa1zSDK.NULL) {
                    throw new AFa1hSDK("Nesting problem");
                }
            } else {
                this.AFAdRevenueData.append(":");
                AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
                this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK2);
            }
        }
    }

    public final AFa1lSDK AFAdRevenueData(Object obj) {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFa1hSDK("Nesting problem");
        }
        if (!((Class) com.appsflyer.internal.AFa1zSDK.getMediationNetwork(35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 58997))).isInstance(obj)) {
            if (obj instanceof AFa1jSDK) {
                ((AFa1jSDK) obj).getMonetizationNetwork(this);
                return this;
            }
            getMonetizationNetwork();
            if (obj == null || (obj instanceof Boolean) || obj == AFa1jSDK.getMonetizationNetwork) {
                this.AFAdRevenueData.append(obj);
            } else if (obj instanceof Number) {
                this.AFAdRevenueData.append(AFa1jSDK.AFAdRevenueData((Number) obj));
            } else {
                getRevenue(obj.toString());
            }
            return this;
        }
        try {
            Object[] objArr = {this};
            Map map = com.appsflyer.internal.AFa1zSDK.unregisterClient;
            Object obj2 = map.get(1010192068);
            if (obj2 == null) {
                obj2 = ((Class) com.appsflyer.internal.AFa1zSDK.getMediationNetwork(36 - ((Process.getThreadPriority(0) + 20) >> 6), 163 - View.MeasureSpec.getSize(0), (char) (58996 - Color.red(0)))).getDeclaredMethod("getMonetizationNetwork", AFa1lSDK.class);
                map.put(1010192068, obj2);
            }
            ((Method) obj2).invoke(obj, objArr);
            return this;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public final AFa1lSDK getRevenue(AFa1zSDK aFa1zSDK, String str) {
        if (this.getMonetizationNetwork.isEmpty() && this.AFAdRevenueData.length() > 0) {
            throw new AFa1hSDK("Nesting problem: multiple top-level roots");
        }
        getMonetizationNetwork();
        this.getMonetizationNetwork.add(aFa1zSDK);
        this.AFAdRevenueData.append(str);
        return this;
    }

    public final String toString() {
        if (this.AFAdRevenueData.length() == 0) {
            return null;
        }
        return this.AFAdRevenueData.toString();
    }

    public final AFa1lSDK getRevenue(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code != aFa1zSDK2 && currencyIso4217Code != aFa1zSDK) {
            throw new AFa1hSDK("Nesting problem");
        }
        this.getMonetizationNetwork.remove(r2.size() - 1);
        this.AFAdRevenueData.append(str);
        return this;
    }

    public final void getRevenue(String str) {
        this.AFAdRevenueData.append("\"");
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = str.charAt(i13);
            if (charAt == '\f') {
                this.AFAdRevenueData.append("\\f");
            } else if (charAt == '\r') {
                this.AFAdRevenueData.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        this.AFAdRevenueData.append("\\b");
                        break;
                    case '\t':
                        this.AFAdRevenueData.append("\\t");
                        break;
                    case '\n':
                        this.AFAdRevenueData.append("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            this.AFAdRevenueData.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            this.AFAdRevenueData.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb3 = this.AFAdRevenueData;
                sb3.append('\\');
                sb3.append(charAt);
            }
        }
        this.AFAdRevenueData.append("\"");
    }

    public final void getRevenue() {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.NONEMPTY_OBJECT) {
            this.AFAdRevenueData.append(',');
        } else if (currencyIso4217Code != AFa1zSDK.EMPTY_OBJECT) {
            throw new AFa1hSDK("Nesting problem");
        }
        AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
        this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK);
    }
}
