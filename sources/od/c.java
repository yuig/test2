package od;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class c implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f94090a;

    /* renamed from: b, reason: collision with root package name */
    public final e f94091b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f94092c;

    public c(Uri uri, e eVar) {
        this.f94090a = uri;
        this.f94091b = eVar;
    }

    public static c d(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.a(context).f29743d.a().d(), dVar, com.bumptech.glide.b.a(context).f29744e, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.f94092c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return nd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(h hVar, com.bumptech.glide.load.data.d dVar) {
        try {
            InputStream f13 = f();
            this.f94092c = f13;
            dVar.f(f13);
        } catch (FileNotFoundException e13) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e13);
            }
            dVar.d(e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004b, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0025: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:68:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: od.c.f():java.io.InputStream");
    }
}
