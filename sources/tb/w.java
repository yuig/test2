package tb;

import android.database.Cursor;
import ja.f0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f117046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f117047b;

    public w(y yVar, f0 f0Var) {
        this.f117047b = yVar;
        this.f117046a = f0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean bool;
        Cursor m03 = d7.b.m0(this.f117047b.f117050a, this.f117046a, false);
        try {
            if (m03.moveToFirst()) {
                bool = Boolean.valueOf(m03.getInt(0) != 0);
            } else {
                bool = Boolean.FALSE;
            }
            m03.close();
            return bool;
        } catch (Throwable th3) {
            m03.close();
            throw th3;
        }
    }

    public final void finalize() {
        this.f117046a.e();
    }
}
