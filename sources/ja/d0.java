package ja;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile oa.b f75178a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f75179b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.r f75180c;

    /* renamed from: d, reason: collision with root package name */
    public oa.f f75181d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f75183f;

    /* renamed from: g, reason: collision with root package name */
    public List f75184g;

    /* renamed from: k, reason: collision with root package name */
    public final Map f75188k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f75189l;

    /* renamed from: e, reason: collision with root package name */
    public final s f75182e = d();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f75185h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f75186i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f75187j = new ThreadLocal();

    public d0() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f75188k = synchronizedMap;
        this.f75189l = new LinkedHashMap();
    }

    public static Object s(Class cls, oa.f fVar) {
        if (cls.isInstance(fVar)) {
            return fVar;
        }
        if (fVar instanceof h) {
            return s(cls, ((h) fVar).getDelegate());
        }
        return null;
    }

    public final void a() {
        if (this.f75183f) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public final void b() {
        if (!g().getWritableDatabase().R1() && this.f75187j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        oa.b writableDatabase = g().getWritableDatabase();
        this.f75182e.i(writableDatabase);
        if (writableDatabase.Z1()) {
            writableDatabase.e0();
        } else {
            writableDatabase.x();
        }
    }

    public abstract s d();

    public abstract oa.f e(g gVar);

    public List f(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return q0.f80391a;
    }

    public final oa.f g() {
        oa.f fVar = this.f75181d;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("internalOpenHelper");
        throw null;
    }

    public final Executor h() {
        Executor executor = this.f75179b;
        if (executor != null) {
            return executor;
        }
        Intrinsics.r("internalQueryExecutor");
        throw null;
    }

    public Set i() {
        return s0.f80394a;
    }

    public Map j() {
        return z0.d();
    }

    public final Executor k() {
        androidx.appcompat.app.r rVar = this.f75180c;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.r("internalTransactionExecutor");
        throw null;
    }

    public final Object l(Class klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return this.f75189l.get(klass);
    }

    public final void m() {
        g().getWritableDatabase().p0();
        if (g().getWritableDatabase().R1()) {
            return;
        }
        s sVar = this.f75182e;
        if (sVar.f75267f.compareAndSet(false, true)) {
            sVar.f75262a.h().execute(sVar.f75275n);
        }
    }

    public final void n(oa.b database) {
        Intrinsics.checkNotNullParameter(database, "db");
        s sVar = this.f75182e;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (sVar.f75274m) {
            if (sVar.f75268g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.B("PRAGMA temp_store = MEMORY;");
            database.B("PRAGMA recursive_triggers='ON';");
            database.B("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            sVar.i(database);
            sVar.f75269h = database.i1("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            sVar.f75268g = true;
            Unit unit = Unit.f80348a;
        }
    }

    public final Cursor o(oa.h query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        a();
        b();
        return cancellationSignal != null ? g().getWritableDatabase().T0(query, cancellationSignal) : g().getWritableDatabase().G0(query);
    }

    public final Object p(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        c();
        try {
            Object call = body.call();
            r();
            return call;
        } finally {
            m();
        }
    }

    public final void q(Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        c();
        try {
            body.run();
            r();
        } finally {
            m();
        }
    }

    public final void r() {
        g().getWritableDatabase().c0();
    }
}
