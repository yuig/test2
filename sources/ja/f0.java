package ja;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 implements oa.h, oa.g {

    /* renamed from: i, reason: collision with root package name */
    public static final TreeMap f75207i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f75208a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f75209b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f75210c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f75211d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f75212e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f75213f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f75214g;

    /* renamed from: h, reason: collision with root package name */
    public int f75215h;

    public f0(int i13) {
        this.f75208a = i13;
        int i14 = i13 + 1;
        this.f75214g = new int[i14];
        this.f75210c = new long[i14];
        this.f75211d = new double[i14];
        this.f75212e = new String[i14];
        this.f75213f = new byte[i14][];
    }

    public static final f0 d(int i13, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = f75207i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i13));
            if (ceilingEntry == null) {
                Unit unit = Unit.f80348a;
                f0 f0Var = new f0(i13);
                Intrinsics.checkNotNullParameter(query, "query");
                f0Var.f75209b = query;
                f0Var.f75215h = i13;
                return f0Var;
            }
            treeMap.remove(ceilingEntry.getKey());
            f0 sqliteQuery = (f0) ceilingEntry.getValue();
            sqliteQuery.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            sqliteQuery.f75209b = query;
            sqliteQuery.f75215h = i13;
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @Override // oa.g
    public final void M1(int i13) {
        this.f75214g[i13] = 1;
    }

    @Override // oa.g
    public final void N(int i13, double d2) {
        this.f75214g[i13] = 3;
        this.f75211d[i13] = d2;
    }

    @Override // oa.h
    public final void a(oa.g statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i13 = this.f75215h;
        if (1 > i13) {
            return;
        }
        int i14 = 1;
        while (true) {
            int i15 = this.f75214g[i14];
            if (i15 == 1) {
                statement.M1(i14);
            } else if (i15 == 2) {
                statement.u1(i14, this.f75210c[i14]);
            } else if (i15 == 3) {
                statement.N(i14, this.f75211d[i14]);
            } else if (i15 == 4) {
                String str = this.f75212e[i14];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.c1(i14, str);
            } else if (i15 == 5) {
                byte[] bArr = this.f75213f[i14];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.y1(i14, bArr);
            }
            if (i14 == i13) {
                return;
            } else {
                i14++;
            }
        }
    }

    @Override // oa.h
    public final String c() {
        String str = this.f75209b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // oa.g
    public final void c1(int i13, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f75214g[i13] = 4;
        this.f75212e[i13] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void e() {
        TreeMap treeMap = f75207i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f75208a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i13 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i13;
                }
            }
            Unit unit = Unit.f80348a;
        }
    }

    @Override // oa.g
    public final void u1(int i13, long j13) {
        this.f75214g[i13] = 2;
        this.f75210c[i13] = j13;
    }

    @Override // oa.g
    public final void y1(int i13, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f75214g[i13] = 5;
        this.f75213f[i13] = value;
    }
}
