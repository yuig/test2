package h6;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.n4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class y extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f67766b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n4 n4Var) {
        super(null);
        this.f67765a = 1;
        this.f67766b = n4Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13) {
        switch (this.f67765a) {
            case 1:
                n4 n4Var = (n4) this.f67766b;
                synchronized (n4Var.f31550e) {
                    n4Var.f31551f = null;
                    n4Var.f31548c.run();
                }
                synchronized (n4Var) {
                    try {
                        Iterator it = n4Var.f31552g.iterator();
                        if (it.hasNext()) {
                            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                            throw null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            default:
                super.onChange(z13);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Handler handler, int i13) {
        super(handler);
        this.f67765a = i13;
        this.f67766b = obj;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13, Uri uri) {
        int i13 = this.f67765a;
        Object obj = this.f67766b;
        switch (i13) {
            case 0:
                ((z) obj).c();
                return;
            case 1:
            default:
                super.onChange(z13, uri);
                return;
            case 2:
                xk2.v vVar = sw0.y.f115589f;
                ((AtomicBoolean) ((sw0.y) obj).c().f115586d.getValue()).set(true);
                return;
            case 3:
                if (uri.toString().matches(((is1.x) obj).f73654a)) {
                    Cursor cursor = null;
                    try {
                        try {
                            cursor = ((is1.x) obj).f73657d.query(uri, ((is1.x) obj).f73655b, null, null, "date_added DESC");
                            if (cursor != null && cursor.moveToFirst()) {
                                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                                long j13 = cursor.getLong(cursor.getColumnIndexOrThrow("date_added"));
                                long currentTimeMillis = System.currentTimeMillis() / 1000;
                                if (string.contains(((is1.x) obj).f73656c)) {
                                    ((is1.x) obj).getClass();
                                    if (Math.abs(currentTimeMillis - j13) <= 10) {
                                        m60.u.f85943a.d(new is1.w(string));
                                    }
                                }
                            }
                            if (cursor == null) {
                                return;
                            }
                        } catch (Exception e13) {
                            HashSet hashSet = tb0.h.f117076w;
                            tb0.g.f117075a.o("open cursor fail", e13);
                            if (cursor == null) {
                                return;
                            }
                        }
                        cursor.close();
                        return;
                    } catch (Throwable th3) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th3;
                    }
                }
                return;
        }
    }
}
