package pa;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends j implements oa.i {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f99373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f99373b = delegate;
    }

    @Override // oa.i
    public final int G() {
        return this.f99373b.executeUpdateDelete();
    }

    @Override // oa.i
    public final long Q0() {
        return this.f99373b.executeInsert();
    }
}
