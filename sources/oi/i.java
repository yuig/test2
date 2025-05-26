package oi;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzmh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i extends y6 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f94827f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f94828g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f94829h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f94830i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f94831j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f94832k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f94833l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f94834m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f94835n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f94836o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    public final k f94837d;

    /* renamed from: e, reason: collision with root package name */
    public final c0.x0 f94838e;

    public i(a7 a7Var) {
        super(a7Var);
        this.f94838e = new c0.x0(zzb());
        this.f94837d = new k(this, zza(), "google_app_measurement.db", 0);
    }

    public static void J(ContentValues contentValues, Object obj) {
        com.bumptech.glide.d.o("value");
        com.bumptech.glide.d.t(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final long A(String str, String[] strArr, long j13) {
        Cursor cursor = null;
        try {
            try {
                cursor = w().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j13;
                }
                long j14 = cursor.getLong(0);
                cursor.close();
                return j14;
            } catch (SQLiteException e13) {
                zzj().f95268f.a(str, e13, "Database error");
                throw e13;
            }
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final Object B(Cursor cursor, int i13) {
        int type = cursor.getType(i13);
        if (type == 0) {
            zzj().f95268f.c("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i13));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i13));
        }
        if (type == 3) {
            return cursor.getString(i13);
        }
        if (type == 4) {
            zzj().f95268f.c("Loaded invalid blob type value, ignoring it");
            return null;
        }
        y3 zzj = zzj();
        zzj.f95268f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String C(long r5) {
        /*
            r4 = this;
            r4.p()
            r4.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.w()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r1 != 0) goto L35
            oi.y3 r6 = r4.zzj()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            oi.a4 r6 = r6.f95276n     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.c(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r5.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r5
            goto L52
        L33:
            r6 = move-exception
            goto L41
        L35:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r5.close()
            return r6
        L3d:
            r6 = move-exception
            goto L52
        L3f:
            r6 = move-exception
            r5 = r0
        L41:
            oi.y3 r1 = r4.zzj()     // Catch: java.lang.Throwable -> L30
            oi.a4 r1 = r1.f95268f     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r6, r2)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L51
            r5.close()
        L51:
            return r0
        L52:
            if (r0 == 0) goto L57
            r0.close()
        L57:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.C(long):java.lang.String");
    }

    public final String D(String str, String str2, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = w().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return str2;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e13) {
                zzj().f95268f.a(str, e13, "Database error");
                throw e13;
            }
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final List E(int i13, int i14, String str) {
        byte[] Z;
        long j13;
        long j14;
        p();
        t();
        int i15 = 1;
        com.bumptech.glide.d.j(i13 > 0);
        com.bumptech.glide.d.j(i14 > 0);
        com.bumptech.glide.d.o(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = w().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i13));
                try {
                    if (!query.moveToFirst()) {
                        List emptyList = Collections.emptyList();
                        query.close();
                        return emptyList;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i16 = 0;
                    while (true) {
                        long j15 = query.getLong(0);
                        try {
                            Z = q().Z(query.getBlob(i15));
                        } catch (IOException e13) {
                            zzj().f95268f.a(y3.v(str), e13, "Failed to unzip queued bundle. appId");
                        }
                        if (!arrayList.isEmpty() && Z.length + i16 > i14) {
                            break;
                        }
                        try {
                            com.google.android.gms.internal.measurement.p3 p3Var = (com.google.android.gms.internal.measurement.p3) c7.B(com.google.android.gms.internal.measurement.q3.U1(), Z);
                            r8.a();
                            if (l().x(null, s.N0) && !arrayList.isEmpty()) {
                                com.google.android.gms.internal.measurement.q3 q3Var = (com.google.android.gms.internal.measurement.q3) ((Pair) arrayList.get(0)).first;
                                com.google.android.gms.internal.measurement.q3 q3Var2 = (com.google.android.gms.internal.measurement.q3) p3Var.b();
                                if (!q3Var.F().equals(q3Var2.F()) || !q3Var.E().equals(q3Var2.E()) || q3Var.V() != q3Var2.V() || !q3Var.G().equals(q3Var2.G())) {
                                    break;
                                }
                                Iterator it = q3Var.T().iterator();
                                while (true) {
                                    j13 = -1;
                                    if (!it.hasNext()) {
                                        j14 = -1;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.y3 y3Var = (com.google.android.gms.internal.measurement.y3) it.next();
                                    if ("_npa".equals(y3Var.E())) {
                                        j14 = y3Var.A();
                                        break;
                                    }
                                }
                                Iterator it2 = q3Var2.T().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.y3 y3Var2 = (com.google.android.gms.internal.measurement.y3) it2.next();
                                    if ("_npa".equals(y3Var2.E())) {
                                        j13 = y3Var2.A();
                                        break;
                                    }
                                }
                                if (j14 != j13) {
                                    break;
                                }
                            }
                            if (!query.isNull(2)) {
                                int i17 = query.getInt(2);
                                p3Var.g();
                                com.google.android.gms.internal.measurement.q3.t((com.google.android.gms.internal.measurement.q3) p3Var.f31718b, i17);
                            }
                            i16 += Z.length;
                            arrayList.add(Pair.create((com.google.android.gms.internal.measurement.q3) p3Var.b(), Long.valueOf(j15)));
                        } catch (IOException e14) {
                            zzj().f95268f.a(y3.v(str), e14, "Failed to merge queued bundle. appId");
                        }
                        if (!query.moveToNext() || i16 > i14) {
                            break;
                        }
                        i15 = 1;
                    }
                    query.close();
                    return arrayList;
                } catch (SQLiteException e15) {
                    e = e15;
                    cursor = query;
                    zzj().f95268f.a(y3.v(str), e, "Error querying bundles. appId");
                    List emptyList2 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList2;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e16) {
                e = e16;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final List F(String str, String str2, String str3) {
        com.bumptech.glide.d.o(str);
        p();
        t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb3 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb3.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb3.append(" and name glob ?");
        }
        return G(sb3.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        zzj().f95268f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List G(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.G(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final j H(long j13, String str, long j14, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        com.bumptech.glide.d.o(str);
        p();
        t();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase w13 = w();
                Cursor query = w13.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzj().f95271i.b(y3.v(str), "Not updating daily counts, app is not known. appId");
                    query.close();
                    return jVar;
                }
                if (query.getLong(0) == j13) {
                    jVar.f94867b = query.getLong(1);
                    jVar.f94866a = query.getLong(2);
                    jVar.f94868c = query.getLong(3);
                    jVar.f94869d = query.getLong(4);
                    jVar.f94870e = query.getLong(5);
                }
                if (z13) {
                    jVar.f94867b += j14;
                }
                if (z14) {
                    jVar.f94866a += j14;
                }
                if (z15) {
                    jVar.f94868c += j14;
                }
                if (z16) {
                    jVar.f94869d += j14;
                }
                if (z17) {
                    jVar.f94870e += j14;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j13));
                contentValues.put("daily_public_events_count", Long.valueOf(jVar.f94866a));
                contentValues.put("daily_events_count", Long.valueOf(jVar.f94867b));
                contentValues.put("daily_conversions_count", Long.valueOf(jVar.f94868c));
                contentValues.put("daily_error_events_count", Long.valueOf(jVar.f94869d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f94870e));
                w13.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return jVar;
            } catch (SQLiteException e13) {
                zzj().f95268f.a(y3.v(str), e13, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return jVar;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final void I(ContentValues contentValues) {
        try {
            SQLiteDatabase w13 = w();
            if (contentValues.getAsString("app_id") == null) {
                zzj().f95270h.b(y3.v("app_id"), "Value of the primary key is not set.");
            } else if (w13.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && w13.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzj().f95268f.a(y3.v("consent_settings"), y3.v("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e13) {
            zzj().f95268f.d("Error storing into table. key", y3.v("consent_settings"), y3.v("app_id"), e13);
        }
    }

    public final void K(com.google.android.gms.internal.measurement.q3 q3Var, boolean z13) {
        p();
        t();
        com.bumptech.glide.d.o(q3Var.W1());
        if (!q3Var.p0()) {
            throw new IllegalStateException();
        }
        l0();
        ((oh.b) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (q3Var.A1() < currentTimeMillis - e.A() || q3Var.A1() > e.A() + currentTimeMillis) {
            y3 zzj = zzj();
            zzj.f95271i.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", y3.v(q3Var.W1()), Long.valueOf(currentTimeMillis), Long.valueOf(q3Var.A1()));
        }
        try {
            byte[] X = q().X(q3Var.c());
            y3 zzj2 = zzj();
            zzj2.f95276n.b(Integer.valueOf(X.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", q3Var.W1());
            contentValues.put("bundle_end_timestamp", Long.valueOf(q3Var.A1()));
            contentValues.put("data", X);
            contentValues.put("has_realtime", Integer.valueOf(z13 ? 1 : 0));
            if (q3Var.w0()) {
                contentValues.put("retry_count", Integer.valueOf(q3Var.Z0()));
            }
            try {
                if (w().insert("queue", null, contentValues) == -1) {
                    zzj().f95268f.b(y3.v(q3Var.W1()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e13) {
                y3 zzj3 = zzj();
                zzj3.f95268f.a(y3.v(q3Var.W1()), e13, "Error storing bundle. appId");
            }
        } catch (IOException e14) {
            y3 zzj4 = zzj();
            zzj4.f95268f.a(y3.v(q3Var.W1()), e14, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void L(String str, zzmh zzmhVar) {
        p();
        t();
        com.bumptech.glide.d.o(str);
        ((oh.b) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long A = currentTimeMillis - e.A();
        long j13 = zzmhVar.f32035g;
        if (j13 < A || j13 > e.A() + currentTimeMillis) {
            y3 zzj = zzj();
            zzj.f95271i.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", y3.v(str), Long.valueOf(currentTimeMillis), Long.valueOf(j13));
        }
        zzj().f95276n.c("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmhVar.f32034f);
        contentValues.put("source", Integer.valueOf(zzmhVar.f32036h));
        contentValues.put("timestamp_millis", Long.valueOf(j13));
        try {
            if (w().insert("trigger_uris", null, contentValues) == -1) {
                zzj().f95268f.b(y3.v(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e13) {
            y3 zzj2 = zzj();
            zzj2.f95268f.a(y3.v(str), e13, "Error storing trigger URI. appId");
        }
    }

    public final void M(String str, Long l13, long j13, com.google.android.gms.internal.measurement.h3 h3Var) {
        p();
        t();
        com.bumptech.glide.d.t(h3Var);
        com.bumptech.glide.d.o(str);
        byte[] c13 = h3Var.c();
        y3 zzj = zzj();
        zzj.f95276n.a(m().c(str), Integer.valueOf(c13.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l13);
        contentValues.put("children_to_process", Long.valueOf(j13));
        contentValues.put("main_event", c13);
        try {
            if (w().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzj().f95268f.b(y3.v(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e13) {
            y3 zzj2 = zzj();
            zzj2.f95268f.a(y3.v(str), e13, "Error storing complex main event. appId");
        }
    }

    public final void N(String str, String str2) {
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.o(str2);
        p();
        t();
        try {
            w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e13) {
            y3 zzj = zzj();
            zzj.f95268f.d("Error deleting conditional property", y3.v(str), m().g(str2), e13);
        }
    }

    public final void O(List list) {
        p();
        t();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (zza().getDatabasePath("google_app_measurement.db").exists()) {
            String k13 = a.a.k("(", TextUtils.join(",", list), ")");
            if (X("SELECT COUNT(1) FROM queue WHERE rowid IN " + k13 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().f95271i.c("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                w().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + k13 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e13) {
                zzj().f95268f.b(e13, "Error incrementing retry count. error");
            }
        }
    }

    public final void P(q qVar) {
        com.bumptech.glide.d.t(qVar);
        p();
        t();
        ContentValues contentValues = new ContentValues();
        String str = qVar.f95045a;
        contentValues.put("app_id", str);
        contentValues.put("name", qVar.f95046b);
        contentValues.put("lifetime_count", Long.valueOf(qVar.f95047c));
        contentValues.put("current_bundle_count", Long.valueOf(qVar.f95048d));
        contentValues.put("last_fire_timestamp", Long.valueOf(qVar.f95050f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(qVar.f95051g));
        contentValues.put("last_bundled_day", qVar.f95052h);
        contentValues.put("last_sampled_complex_event_id", qVar.f95053i);
        contentValues.put("last_sampling_rate", qVar.f95054j);
        contentValues.put("current_session_count", Long.valueOf(qVar.f95049e));
        Boolean bool = qVar.f95055k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzj().f95268f.b(y3.v(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e13) {
            zzj().f95268f.a(y3.v(str), e13, "Error storing event aggregates. appId");
        }
    }

    public final void Q(p4 p4Var) {
        p();
        t();
        String M = p4Var.M();
        com.bumptech.glide.d.t(M);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", M);
        contentValues.put("app_instance_id", p4Var.N());
        contentValues.put("gmp_app_id", p4Var.f());
        u4 u4Var = p4Var.f95011a;
        o4 o4Var = u4Var.f95206j;
        u4.d(o4Var);
        o4Var.p();
        contentValues.put("resettable_device_id_hash", p4Var.f95015e);
        o4 o4Var2 = u4Var.f95206j;
        u4.d(o4Var2);
        o4Var2.p();
        contentValues.put("last_bundle_index", Long.valueOf(p4Var.f95017g));
        o4 o4Var3 = u4Var.f95206j;
        u4.d(o4Var3);
        o4Var3.p();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(p4Var.f95018h));
        o4 o4Var4 = u4Var.f95206j;
        u4.d(o4Var4);
        o4Var4.p();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(p4Var.f95019i));
        contentValues.put("app_version", p4Var.d());
        o4 o4Var5 = u4Var.f95206j;
        u4.d(o4Var5);
        o4Var5.p();
        contentValues.put("app_store", p4Var.f95022l);
        o4 o4Var6 = u4Var.f95206j;
        u4.d(o4Var6);
        o4Var6.p();
        contentValues.put("gmp_version", Long.valueOf(p4Var.f95023m));
        o4 o4Var7 = u4Var.f95206j;
        u4.d(o4Var7);
        o4Var7.p();
        contentValues.put("dev_cert_hash", Long.valueOf(p4Var.f95024n));
        o4 o4Var8 = u4Var.f95206j;
        u4.d(o4Var8);
        o4Var8.p();
        contentValues.put("measurement_enabled", Boolean.valueOf(p4Var.f95025o));
        o4 o4Var9 = u4Var.f95206j;
        u4.d(o4Var9);
        o4Var9.p();
        contentValues.put("day", Long.valueOf(p4Var.B));
        o4 o4Var10 = u4Var.f95206j;
        u4.d(o4Var10);
        o4Var10.p();
        contentValues.put("daily_public_events_count", Long.valueOf(p4Var.C));
        u4.d(o4Var10);
        o4Var10.p();
        contentValues.put("daily_events_count", Long.valueOf(p4Var.D));
        u4.d(o4Var10);
        o4Var10.p();
        contentValues.put("daily_conversions_count", Long.valueOf(p4Var.E));
        o4 o4Var11 = u4Var.f95206j;
        u4.d(o4Var11);
        o4Var11.p();
        contentValues.put("config_fetched_time", Long.valueOf(p4Var.f95010J));
        o4 o4Var12 = u4Var.f95206j;
        u4.d(o4Var12);
        o4Var12.p();
        contentValues.put("failed_config_fetch_time", Long.valueOf(p4Var.K));
        contentValues.put("app_version_int", Long.valueOf(p4Var.l()));
        contentValues.put("firebase_instance_id", p4Var.e());
        u4.d(o4Var10);
        o4Var10.p();
        contentValues.put("daily_error_events_count", Long.valueOf(p4Var.F));
        u4.d(o4Var10);
        o4Var10.p();
        contentValues.put("daily_realtime_events_count", Long.valueOf(p4Var.G));
        u4.d(o4Var10);
        o4Var10.p();
        contentValues.put("health_monitor_sample", p4Var.H);
        o4 o4Var13 = u4Var.f95206j;
        u4.d(o4Var13);
        o4Var13.p();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(p4Var.g()));
        contentValues.put("admob_app_id", p4Var.K());
        contentValues.put("dynamite_version", Long.valueOf(p4Var.C()));
        o4 o4Var14 = u4Var.f95206j;
        u4.d(o4Var14);
        o4Var14.p();
        contentValues.put("session_stitching_token", p4Var.f95031u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(p4Var.h()));
        o4 o4Var15 = u4Var.f95206j;
        u4.d(o4Var15);
        o4Var15.p();
        contentValues.put("target_os_version", Long.valueOf(p4Var.f95033w));
        o4 o4Var16 = u4Var.f95206j;
        u4.d(o4Var16);
        o4Var16.p();
        contentValues.put("session_stitching_token_hash", Long.valueOf(p4Var.f95034x));
        ia.a();
        if (l().x(M, s.C0)) {
            o4 o4Var17 = u4Var.f95206j;
            u4.d(o4Var17);
            o4Var17.p();
            contentValues.put("ad_services_version", Integer.valueOf(p4Var.f95035y));
            o4 o4Var18 = u4Var.f95206j;
            u4.d(o4Var18);
            o4Var18.p();
            contentValues.put("attribution_eligibility_status", Long.valueOf(p4Var.A));
        }
        m8.a();
        if (l().x(M, s.O0)) {
            o4 o4Var19 = u4Var.f95206j;
            u4.d(o4Var19);
            o4Var19.p();
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(p4Var.f95036z));
        }
        o4 o4Var20 = u4Var.f95206j;
        u4.d(o4Var20);
        o4Var20.p();
        ArrayList arrayList = p4Var.f95030t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                zzj().f95271i.b(M, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((v8) s8.f31639b.get()).getClass();
        if (l().x(null, s.f95116o0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        r8.a();
        if (l().x(M, s.J0)) {
            contentValues.put("npa_metadata_value", p4Var.J());
        }
        try {
            SQLiteDatabase w13 = w();
            if (w13.update("apps", contentValues, "app_id = ?", new String[]{M}) == 0 && w13.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().f95268f.b(y3.v(M), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e13) {
            zzj().f95268f.a(y3.v(M), e13, "Error storing app. appId");
        }
    }

    public final boolean R(zzad zzadVar) {
        p();
        t();
        String str = zzadVar.f32017f;
        com.bumptech.glide.d.t(str);
        if (e0(str, zzadVar.f32019h.f32038g) == null && X("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzadVar.f32018g);
        contentValues.put("name", zzadVar.f32019h.f32038g);
        Object e13 = zzadVar.f32019h.e();
        com.bumptech.glide.d.t(e13);
        J(contentValues, e13);
        contentValues.put("active", Boolean.valueOf(zzadVar.f32021j));
        contentValues.put("trigger_event_name", zzadVar.f32022k);
        contentValues.put("trigger_timeout", Long.valueOf(zzadVar.f32024m));
        o();
        contentValues.put("timed_out_event", f7.d0(zzadVar.f32023l));
        contentValues.put("creation_timestamp", Long.valueOf(zzadVar.f32020i));
        o();
        contentValues.put("triggered_event", f7.d0(zzadVar.f32025n));
        contentValues.put("triggered_timestamp", Long.valueOf(zzadVar.f32019h.f32039h));
        contentValues.put("time_to_live", Long.valueOf(zzadVar.f32026o));
        o();
        contentValues.put("expired_event", f7.d0(zzadVar.f32027p));
        try {
            if (w().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f95268f.b(y3.v(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e14) {
            y3 zzj = zzj();
            zzj.f95268f.a(y3.v(str), e14, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean S(String str, int i13, com.google.android.gms.internal.measurement.u1 u1Var) {
        t();
        p();
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.t(u1Var);
        if (u1Var.y().isEmpty()) {
            zzj().f95271i.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", y3.v(str), Integer.valueOf(i13), String.valueOf(u1Var.E() ? Integer.valueOf(u1Var.v()) : null));
            return false;
        }
        byte[] c13 = u1Var.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i13));
        contentValues.put("filter_id", u1Var.E() ? Integer.valueOf(u1Var.v()) : null);
        contentValues.put("event_name", u1Var.y());
        contentValues.put("session_scoped", u1Var.F() ? Boolean.valueOf(u1Var.C()) : null);
        contentValues.put("data", c13);
        try {
            if (w().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f95268f.b(y3.v(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e13) {
            zzj().f95268f.a(y3.v(str), e13, "Error storing event filter. appId");
            return false;
        }
    }

    public final boolean T(String str, int i13, com.google.android.gms.internal.measurement.c2 c2Var) {
        t();
        p();
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.t(c2Var);
        if (c2Var.v().isEmpty()) {
            zzj().f95271i.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", y3.v(str), Integer.valueOf(i13), String.valueOf(c2Var.z() ? Integer.valueOf(c2Var.r()) : null));
            return false;
        }
        byte[] c13 = c2Var.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i13));
        contentValues.put("filter_id", c2Var.z() ? Integer.valueOf(c2Var.r()) : null);
        contentValues.put("property_name", c2Var.v());
        contentValues.put("session_scoped", c2Var.A() ? Boolean.valueOf(c2Var.y()) : null);
        contentValues.put("data", c13);
        try {
            if (w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f95268f.b(y3.v(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e13) {
            zzj().f95268f.a(y3.v(str), e13, "Error storing property filter. appId");
            return false;
        }
    }

    public final boolean U(n nVar, long j13, boolean z13) {
        p();
        t();
        Object obj = nVar.f94959d;
        String str = (String) obj;
        com.bumptech.glide.d.o(str);
        c7 q13 = q();
        com.google.android.gms.internal.measurement.g3 E = com.google.android.gms.internal.measurement.h3.E();
        long j14 = nVar.f94958c;
        E.g();
        com.google.android.gms.internal.measurement.h3.B(j14, (com.google.android.gms.internal.measurement.h3) E.f31718b);
        zzbb zzbbVar = (zzbb) nVar.f94962g;
        zzbbVar.getClass();
        androidx.datastore.preferences.protobuf.a2 a2Var = new androidx.datastore.preferences.protobuf.a2(zzbbVar);
        while (a2Var.hasNext()) {
            String str2 = (String) a2Var.next();
            com.google.android.gms.internal.measurement.k3 F = com.google.android.gms.internal.measurement.l3.F();
            F.j(str2);
            Object obj2 = ((zzbb) nVar.f94962g).f32029f.get(str2);
            com.bumptech.glide.d.t(obj2);
            q13.N(F, obj2);
            E.i(F);
        }
        byte[] c13 = ((com.google.android.gms.internal.measurement.h3) E.b()).c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", (String) nVar.f94960e);
        contentValues.put("timestamp", Long.valueOf(nVar.f94957b));
        contentValues.put("metadata_fingerprint", Long.valueOf(j13));
        contentValues.put("data", c13);
        contentValues.put("realtime", Integer.valueOf(z13 ? 1 : 0));
        try {
            if (w().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().f95268f.b(y3.v((String) obj), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e13) {
            y3 zzj = zzj();
            zzj.f95268f.a(y3.v(str), e13, "Error storing raw event. appId");
            return false;
        }
    }

    public final boolean V(g7 g7Var) {
        p();
        t();
        String str = g7Var.f94797a;
        String str2 = g7Var.f94799c;
        g7 e03 = e0(str, str2);
        String str3 = g7Var.f94798b;
        if (e03 == null) {
            if (f7.u0(str2)) {
                if (X("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(l().u(str, s.G), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && X("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(g7Var.f94800d));
        J(contentValues, g7Var.f94801e);
        try {
            if (w().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f95268f.b(y3.v(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e13) {
            zzj().f95268f.a(y3.v(str), e13, "Error storing user property. appId");
            return true;
        }
    }

    public final long W(String str) {
        long A;
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.o("first_open_count");
        p();
        t();
        SQLiteDatabase w13 = w();
        w13.beginTransaction();
        long j13 = 0;
        try {
            try {
                A = A("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (A == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (w13.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().f95268f.a(y3.v(str), "first_open_count", "Failed to insert column (got -1). appId");
                        return -1L;
                    }
                    A = 0;
                }
            } catch (SQLiteException e13) {
                e = e13;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + A));
                if (w13.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    zzj().f95268f.a(y3.v(str), "first_open_count", "Failed to update column (got 0). appId");
                    return -1L;
                }
                w13.setTransactionSuccessful();
                return A;
            } catch (SQLiteException e14) {
                long j14 = A;
                e = e14;
                j13 = j14;
                zzj().f95268f.d("Error inserting column. appId", y3.v(str), "first_open_count", e);
                w13.endTransaction();
                return j13;
            }
        } finally {
            w13.endTransaction();
        }
    }

    public final long X(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = w().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j13 = rawQuery.getLong(0);
                rawQuery.close();
                return j13;
            } catch (SQLiteException e13) {
                zzj().f95268f.a(str, e13, "Database error");
                throw e13;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                cursor.close();
            }
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        zzj().f95268f.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List Y(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.Y(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void Z(String str, ArrayList arrayList) {
        com.bumptech.glide.d.o(str);
        t();
        p();
        SQLiteDatabase w13 = w();
        try {
            long X = X("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, l().u(str, s.F)));
            if (X <= max) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                Integer num = (Integer) arrayList.get(i13);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            w13.delete("audience_filter_values", a.a.k("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a.a.k("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)});
        } catch (SQLiteException e13) {
            zzj().f95268f.a(y3.v(str), e13, "Database error querying filters. appId");
        }
    }

    public final long a0(String str) {
        com.bumptech.glide.d.o(str);
        return A("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzad b0(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.b0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzad");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oi.q c0(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.c0(java.lang.String, java.lang.String):oi.q");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023c A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x025d A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029c A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e4 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0318 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034e A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038b A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TRY_LEAVE, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022d A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:13:0x0112, B:15:0x016f, B:19:0x0180, B:22:0x01ca, B:24:0x01f9, B:28:0x0203, B:31:0x0214, B:34:0x0231, B:36:0x023c, B:37:0x024e, B:39:0x025d, B:41:0x0285, B:43:0x029c, B:45:0x02a4, B:48:0x02ad, B:51:0x02be, B:54:0x02c3, B:56:0x02e4, B:59:0x02fb, B:61:0x0309, B:63:0x0318, B:65:0x0320, B:68:0x0329, B:71:0x033a, B:74:0x033f, B:76:0x034e, B:79:0x0365, B:80:0x0358, B:83:0x0361, B:85:0x037b, B:87:0x038b, B:91:0x0269, B:92:0x022d, B:95:0x01c5, B:99:0x03af), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oi.p4 d0(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.d0(java.lang.String):oi.p4");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oi.g7 e0(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.bumptech.glide.d.o(r14)
            com.bumptech.glide.d.o(r15)
            r13.p()
            r13.t()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.w()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r9 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.Object r9 = r13.B(r2, r11)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            if (r9 != 0) goto L4a
            r2.close()
            return r1
        L4a:
            java.lang.String r5 = r2.getString(r12)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            oi.g7 r0 = new oi.g7     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            if (r3 == 0) goto L71
            oi.y3 r3 = r13.zzj()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            oi.a4 r3 = r3.f95268f     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            oi.c4 r5 = oi.y3.v(r14)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            r3.b(r5, r4)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            goto L71
        L6c:
            r0 = move-exception
            r1 = r2
            goto L96
        L6f:
            r0 = move-exception
            goto L79
        L71:
            r2.close()
            return r0
        L75:
            r0 = move-exception
            goto L96
        L77:
            r0 = move-exception
            r2 = r1
        L79:
            oi.y3 r3 = r13.zzj()     // Catch: java.lang.Throwable -> L6c
            oi.a4 r3 = r3.f95268f     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "Error querying user property. appId"
            oi.c4 r5 = oi.y3.v(r14)     // Catch: java.lang.Throwable -> L6c
            oi.x3 r6 = r13.m()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.g(r15)     // Catch: java.lang.Throwable -> L6c
            r3.d(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L95
            r2.close()
        L95:
            return r1
        L96:
            if (r1 == 0) goto L9b
            r1.close()
        L9b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.e0(java.lang.String, java.lang.String):oi.g7");
    }

    public final Map f0(String str, String str2) {
        t();
        p();
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.o(str2);
        g1.g gVar = new g1.g(0);
        Cursor cursor = null;
        try {
            try {
                Cursor query = w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.u1 u1Var = (com.google.android.gms.internal.measurement.u1) ((com.google.android.gms.internal.measurement.t1) c7.B(com.google.android.gms.internal.measurement.u1.w(), query.getBlob(1))).b();
                        int i13 = query.getInt(0);
                        List list = (List) gVar.get(Integer.valueOf(i13));
                        if (list == null) {
                            list = new ArrayList();
                            gVar.put(Integer.valueOf(i13), list);
                        }
                        list.add(u1Var);
                    } catch (IOException e13) {
                        zzj().f95268f.a(y3.v(str), e13, "Failed to merge filter. appId");
                    }
                } while (query.moveToNext());
                query.close();
                return gVar;
            } catch (SQLiteException e14) {
                zzj().f95268f.a(y3.v(str), e14, "Database error querying filters. appId");
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final Map g0(String str, String str2) {
        t();
        p();
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.o(str2);
        g1.g gVar = new g1.g(0);
        Cursor cursor = null;
        try {
            try {
                Cursor query = w().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.c2 c2Var = (com.google.android.gms.internal.measurement.c2) ((com.google.android.gms.internal.measurement.b2) c7.B(com.google.android.gms.internal.measurement.c2.u(), query.getBlob(1))).b();
                        int i13 = query.getInt(0);
                        List list = (List) gVar.get(Integer.valueOf(i13));
                        if (list == null) {
                            list = new ArrayList();
                            gVar.put(Integer.valueOf(i13), list);
                        }
                        list.add(c2Var);
                    } catch (IOException e13) {
                        zzj().f95268f.a(y3.v(str), e13, "Failed to merge filter");
                    }
                } while (query.moveToNext());
                query.close();
                return gVar;
            } catch (SQLiteException e14) {
                zzj().f95268f.a(y3.v(str), e14, "Database error querying filters. appId");
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final void h0(String str, String str2) {
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.o(str2);
        p();
        t();
        try {
            w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e13) {
            y3 zzj = zzj();
            zzj.f95268f.d("Error deleting user property. appId", y3.v(str), m().g(str2), e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List i0(java.lang.String r16) {
        /*
            r15 = this;
            com.bumptech.glide.d.o(r16)
            r15.p()
            r15.t()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.w()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L46
            r1.close()
            return r0
        L46:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L52
            java.lang.String r2 = ""
        L52:
            r5 = r2
            goto L5a
        L54:
            r0 = move-exception
            r2 = r15
            goto La7
        L57:
            r0 = move-exception
            r2 = r15
            goto L8e
        L5a:
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r2 = r15
            java.lang.Object r9 = r15.B(r1, r14)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            if (r9 != 0) goto L79
            oi.y3 r3 = r15.zzj()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            oi.a4 r3 = r3.f95268f     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            oi.c4 r5 = oi.y3.v(r16)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r3.b(r5, r4)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            goto L84
        L75:
            r0 = move-exception
            goto La7
        L77:
            r0 = move-exception
            goto L8e
        L79:
            oi.g7 r10 = new oi.g7     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r0.add(r10)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
        L84:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            if (r3 != 0) goto L46
            r1.close()
            return r0
        L8e:
            oi.y3 r3 = r15.zzj()     // Catch: java.lang.Throwable -> L75
            oi.a4 r3 = r3.f95268f     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying user properties. appId"
            oi.c4 r5 = oi.y3.v(r16)     // Catch: java.lang.Throwable -> L75
            r3.a(r5, r0, r4)     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto La6
            r1.close()
        La6:
            return r0
        La7:
            if (r1 == 0) goto Lac
            r1.close()
        Lac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.i0(java.lang.String):java.util.List");
    }

    public final void j0() {
        t();
        w().beginTransaction();
    }

    public final void k0() {
        t();
        w().endTransaction();
    }

    public final void l0() {
        p();
        t();
        if (zza().getDatabasePath("google_app_measurement.db").exists()) {
            a7 a7Var = this.f95249b;
            long a13 = a7Var.f94663i.f94973e.a();
            ((oh.b) zzb()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a13) > ((Long) s.f95135y.a(null)).longValue()) {
                a7Var.f94663i.f94973e.b(elapsedRealtime);
                p();
                t();
                if (zza().getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase w13 = w();
                    ((oh.b) zzb()).getClass();
                    int delete = w13.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(e.A())});
                    if (delete > 0) {
                        y3 zzj = zzj();
                        zzj.f95276n.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void m0() {
        t();
        w().setTransactionSuccessful();
    }

    @Override // oi.y6
    public final boolean v() {
        return false;
    }

    public final SQLiteDatabase w() {
        p();
        try {
            return this.f94837d.getWritableDatabase();
        } catch (SQLiteException e13) {
            zzj().f95271i.b(e13, "Error opening database");
            throw e13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            oi.y3 r3 = r6.zzj()     // Catch: java.lang.Throwable -> L1a
            oi.a4 r3 = r3.f95268f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.x():java.lang.String");
    }

    public final long y(com.google.android.gms.internal.measurement.q3 q3Var) {
        p();
        t();
        com.bumptech.glide.d.o(q3Var.W1());
        byte[] c13 = q3Var.c();
        long x13 = q().x(c13);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", q3Var.W1());
        contentValues.put("metadata_fingerprint", Long.valueOf(x13));
        contentValues.put("metadata", c13);
        try {
            w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return x13;
        } catch (SQLiteException e13) {
            y3 zzj = zzj();
            zzj.f95268f.a(y3.v(q3Var.W1()), e13, "Error storing raw event metadata. appId");
            throw e13;
        }
    }

    public final long z(String str) {
        com.bumptech.glide.d.o(str);
        p();
        t();
        try {
            return w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, l().u(str, s.f95119q))))});
        } catch (SQLiteException e13) {
            zzj().f95268f.a(y3.v(str), e13, "Error deleting over the limit events. appId");
            return 0L;
        }
    }
}
