package wy;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import at1.d;
import h32.f1;
import ir.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nl.b;
import nm.o;
import nm.p;
import nx.d0;
import vy.m;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f131218a;

    /* renamed from: b, reason: collision with root package name */
    public final m f131219b;

    public a(d0 topLevelPinalytics, m analyticsApi) {
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f131218a = topLevelPinalytics;
        this.f131219b = analyticsApi;
    }

    public static void a(a aVar, Context context) {
        int i13 = d.f20439o;
        String packageName = b.e().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String appTrackingCode = context.getString(x0.samsung_maps_tracking_code);
        Intrinsics.checkNotNullExpressionValue(appTrackingCode, "getString(...)");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appTrackingCode, "appTrackingCode");
        HashMap hashMap = new HashMap();
        try {
            Uri parse = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            d0.v(aVar.f131218a, f1.SAMSUNG_PRELOAD_METADATA_ATTEMPT, null, false, 12);
            Cursor query = context.getContentResolver().query(parse, null, packageName, new String[]{appTrackingCode}, null);
            if (query != null) {
                try {
                    query.moveToFirst();
                    int columnCount = query.getColumnCount();
                    for (int i14 = 0; i14 < columnCount; i14++) {
                        String columnName = query.getColumnName(i14);
                        Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
                        String string = query.getString(i14);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        hashMap.put(columnName, string);
                    }
                } finally {
                }
            }
            Unit unit = Unit.f80348a;
            dl2.b.J(query, null);
        } catch (Exception unused) {
        }
        if (hashMap.isEmpty()) {
            hashMap.put("RESULT", "false");
            hashMap.put("REASON", "Perhaps the ContentProvider call was failed.");
        }
        v vVar = new v(3);
        if (!Boolean.parseBoolean((String) hashMap.get("RESULT"))) {
            b(aVar, "samsung_preload_metadata_failure", (String) hashMap.get("REASON"), null, 4);
            aVar.f131218a.U(vVar.generateLoggingContext(), f1.SAMSUNG_PRELOAD_FAILED, null, null, new HashMap(), false);
            return;
        }
        b(aVar, "samsung_preload_metadata_success", null, hashMap, 2);
        HashMap hashMap2 = new HashMap();
        for (String str : hashMap.keySet()) {
            Intrinsics.f(str);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            hashMap2.put(lowerCase, String.valueOf(hashMap.get(str)));
        }
        aVar.f131218a.U(vVar.generateLoggingContext(), f1.SAMSUNG_PRELOAD_METADATA_SUCCESS, null, null, hashMap2, false);
        aVar.f131218a.U(vVar.generateLoggingContext(), f1.SERVICE_ENTRY, null, null, hashMap2, false);
    }

    public static void b(a aVar, String str, String str2, HashMap hashMap, int i13) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            hashMap = null;
        }
        aVar.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("app", hf0.b.a().name());
        ((m60.d) m60.d.a()).b();
        hashMap2.put("app_version", String.valueOf(13198010));
        if (str2 != null) {
            hashMap2.put("error", str2);
        }
        HashMap hashMap3 = new HashMap();
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                Intrinsics.f(str3);
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                hashMap2.put(lowerCase, String.valueOf(hashMap.get(str3)));
                Objects.toString(hashMap.get(str3));
            }
        }
        hashMap3.put("tags", hashMap2);
        o a13 = new p().a();
        HashMap hashMap4 = new HashMap();
        String k13 = a13.k(hashMap3);
        Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        hashMap4.put("aux_data", k13);
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap4);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        aVar.f131219b.k(str, unmodifiableMap);
    }
}
