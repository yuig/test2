package tm;

import java.sql.Timestamp;
import java.util.Date;
import nm.i0;

/* loaded from: classes.dex */
public final class f extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f118117b = new e();

    /* renamed from: a, reason: collision with root package name */
    public final i0 f118118a;

    public f(i0 i0Var) {
        this.f118118a = i0Var;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        Date date = (Date) this.f118118a.c(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        this.f118118a.e(cVar, (Timestamp) obj);
    }
}
