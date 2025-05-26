package is1;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class y extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb0.p f73659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f73660b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tb0.p pVar, z zVar) {
        super(null);
        this.f73659a = pVar;
        this.f73660b = zVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13, Uri uri) {
        if (z.f73661d.e(String.valueOf(uri))) {
            z zVar = this.f73660b;
            Cursor cursor = null;
            try {
                if (uri != null) {
                    try {
                        ContentResolver contentResolver = zVar.f73665b;
                        if (contentResolver != null) {
                            cursor = contentResolver.query(uri, z.f73662e, null, null, z.f73663f);
                        }
                    } catch (Exception e13) {
                        HashSet hashSet = tb0.h.f117076w;
                        tb0.g.f117075a.q(e13, "open cursor fail", this.f73659a);
                        if (cursor == null) {
                            return;
                        }
                    }
                }
                if (cursor != null && cursor.moveToFirst()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                    long j13 = cursor.getLong(cursor.getColumnIndexOrThrow("date_added"));
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Intrinsics.f(string);
                    if (StringsKt.E(string, zVar.f73664a, false) && Math.abs(currentTimeMillis - j13) <= 10) {
                        m60.u.f85943a.d(new w(string));
                    }
                }
                if (cursor == null) {
                    return;
                }
                cursor.close();
            } catch (Throwable th3) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th3;
            }
        }
    }
}
