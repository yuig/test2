package pa;

import android.content.Context;
import androidx.activity.a0;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class i implements oa.f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f99365a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99366b;

    /* renamed from: c, reason: collision with root package name */
    public final oa.c f99367c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f99368d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99369e;

    /* renamed from: f, reason: collision with root package name */
    public final v f99370f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99371g;

    public i(Context context, String str, oa.c callback, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f99365a = context;
        this.f99366b = str;
        this.f99367c = callback;
        this.f99368d = z13;
        this.f99369e = z14;
        this.f99370f = m.b(new a0(this, 24));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f99370f;
        if (vVar.isInitialized()) {
            ((h) vVar.getValue()).close();
        }
    }

    @Override // oa.f
    public final oa.b getWritableDatabase() {
        return ((h) this.f99370f.getValue()).a(true);
    }

    @Override // oa.f
    public final void setWriteAheadLoggingEnabled(boolean z13) {
        v vVar = this.f99370f;
        if (vVar.isInitialized()) {
            h sQLiteOpenHelper = (h) vVar.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z13);
        }
        this.f99371g = z13;
    }
}
