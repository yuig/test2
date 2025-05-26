package tm;

import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f118120a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f118121b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f118122c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f118123d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f118124e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f118125f;

    static {
        boolean z13;
        try {
            Class.forName("java.sql.Date");
            z13 = true;
        } catch (ClassNotFoundException unused) {
            z13 = false;
        }
        f118120a = z13;
        if (z13) {
            f118121b = new g(0, Date.class);
            f118122c = new g(1, Timestamp.class);
            f118123d = b.f118113b;
            f118124e = d.f118115b;
            f118125f = f.f118117b;
            return;
        }
        f118121b = null;
        f118122c = null;
        f118123d = null;
        f118124e = null;
        f118125f = null;
    }
}
