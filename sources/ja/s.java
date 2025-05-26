package ja;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f75261o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final d0 f75262a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f75263b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f75264c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f75265d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f75266e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f75267f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f75268g;

    /* renamed from: h, reason: collision with root package name */
    public volatile oa.i f75269h;

    /* renamed from: i, reason: collision with root package name */
    public final o f75270i;

    /* renamed from: j, reason: collision with root package name */
    public final tb.l f75271j;

    /* renamed from: k, reason: collision with root package name */
    public final p.g f75272k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f75273l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f75274m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.appcompat.app.v f75275n;

    public s(d0 database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f75262a = database;
        this.f75263b = shadowTablesMap;
        this.f75264c = viewTables;
        this.f75267f = new AtomicBoolean(false);
        this.f75270i = new o(tableNames.length);
        int i13 = 4;
        this.f75271j = new tb.l(database, 4);
        this.f75272k = new p.g();
        this.f75273l = new Object();
        this.f75274m = new Object();
        this.f75265d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i14 = 0; i14 < length; i14++) {
            String str = tableNames[i14];
            Locale locale = Locale.US;
            String l13 = ep.b.l(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f75265d.put(l13, Integer.valueOf(i14));
            String str2 = (String) this.f75263b.get(tableNames[i14]);
            String l14 = str2 != null ? ep.b.l(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)") : null;
            if (l14 != null) {
                l13 = l14;
            }
            strArr[i14] = l13;
        }
        this.f75266e = strArr;
        for (Map.Entry entry : this.f75263b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String l15 = ep.b.l(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f75265d.containsKey(l15)) {
                String l16 = ep.b.l(locale2, "US", (String) entry.getKey(), locale2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f75265d;
                linkedHashMap.put(l16, z0.e(l15, linkedHashMap));
            }
        }
        this.f75275n = new androidx.appcompat.app.v(this, i13);
    }

    public final void a(p observer) {
        q qVar;
        boolean z13;
        d0 d0Var;
        oa.b bVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] e13 = e(observer.f75253a);
        ArrayList arrayList = new ArrayList(e13.length);
        for (String str : e13) {
            LinkedHashMap linkedHashMap = this.f75265d;
            Locale locale = Locale.US;
            Integer num = (Integer) linkedHashMap.get(ep.b.l(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] E0 = CollectionsKt.E0(arrayList);
        q qVar2 = new q(observer, E0, e13);
        synchronized (this.f75272k) {
            qVar = (q) this.f75272k.c(observer, qVar2);
        }
        if (qVar == null) {
            o oVar = this.f75270i;
            int[] tableIds = Arrays.copyOf(E0, E0.length);
            oVar.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (oVar) {
                try {
                    z13 = false;
                    for (int i13 : tableIds) {
                        long[] jArr = oVar.f75249a;
                        long j13 = jArr[i13];
                        jArr[i13] = 1 + j13;
                        if (j13 == 0) {
                            oVar.f75252d = true;
                            z13 = true;
                        }
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z13 && (bVar = (d0Var = this.f75262a).f75178a) != null && bVar.isOpen()) {
                i(d0Var.g().getWritableDatabase());
            }
        }
    }

    public final h0 b(String[] tableNames, tb.v computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        String[] tableNames2 = e(tableNames);
        for (String str : tableNames2) {
            LinkedHashMap linkedHashMap = this.f75265d;
            Locale locale = Locale.US;
            if (!linkedHashMap.containsKey(ep.b.l(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        tb.l lVar = this.f75271j;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(tableNames2, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new h0((d0) lVar.f116986b, lVar, computeFunction, tableNames2);
    }

    public final boolean c() {
        oa.b bVar = this.f75262a.f75178a;
        if (!(bVar != null && bVar.isOpen())) {
            return false;
        }
        if (!this.f75268g) {
            this.f75262a.g().getWritableDatabase();
        }
        if (this.f75268g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void d(p observer) {
        q qVar;
        boolean z13;
        d0 d0Var;
        oa.b bVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f75272k) {
            qVar = (q) this.f75272k.d(observer);
        }
        if (qVar != null) {
            o oVar = this.f75270i;
            int[] iArr = qVar.f75255b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            oVar.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (oVar) {
                try {
                    z13 = false;
                    for (int i13 : tableIds) {
                        long[] jArr = oVar.f75249a;
                        long j13 = jArr[i13];
                        jArr[i13] = j13 - 1;
                        if (j13 == 1) {
                            oVar.f75252d = true;
                            z13 = true;
                        }
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z13 && (bVar = (d0Var = this.f75262a).f75178a) != null && bVar.isOpen()) {
                i(d0Var.g().getWritableDatabase());
            }
        }
    }

    public final String[] e(String[] strArr) {
        yk2.o oVar = new yk2.o();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String l13 = ep.b.l(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            Map map = this.f75264c;
            if (map.containsKey(l13)) {
                Object obj = map.get(ep.b.l(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
                Intrinsics.f(obj);
                oVar.addAll((Collection) obj);
            } else {
                oVar.add(str);
            }
        }
        return (String[]) g1.a(oVar).toArray(new String[0]);
    }

    public final void f() {
        Intrinsics.checkNotNullParameter(null, "autoCloser");
        throw null;
    }

    public final void g(oa.b bVar, int i13) {
        bVar.B("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i13 + ", 0)");
        String str = this.f75266e[i13];
        String[] strArr = f75261o;
        for (int i14 = 0; i14 < 3; i14++) {
            String str2 = strArr[i14];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + n1.h(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i13 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            bVar.B(str3);
        }
    }

    public final void h(oa.b bVar, int i13) {
        String str = this.f75266e[i13];
        String[] strArr = f75261o;
        for (int i14 = 0; i14 < 3; i14++) {
            String str2 = "DROP TRIGGER IF EXISTS " + n1.h(str, strArr[i14]);
            Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
            bVar.B(str2);
        }
    }

    public final void i(oa.b database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.R1()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f75262a.f75186i.readLock();
            Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f75273l) {
                    int[] a13 = this.f75270i.a();
                    if (a13 == null) {
                        return;
                    }
                    Intrinsics.checkNotNullParameter(database, "database");
                    if (database.Z1()) {
                        database.e0();
                    } else {
                        database.x();
                    }
                    try {
                        int length = a13.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = a13[i13];
                            int i16 = i14 + 1;
                            if (i15 == 1) {
                                g(database, i14);
                            } else if (i15 == 2) {
                                h(database, i14);
                            }
                            i13++;
                            i14 = i16;
                        }
                        database.c0();
                        database.p0();
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        database.p0();
                        throw th3;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e13) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e13);
        } catch (IllegalStateException e14) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
        }
    }
}
