package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class AFe1wSDK {
    @NotNull
    public static final JSONArray getMonetizationNetwork(@NotNull List<AFd1fSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<AFd1fSDK> list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFd1fSDK) it.next()).getRevenue());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getRevenue(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
