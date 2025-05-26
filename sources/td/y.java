package td;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes3.dex */
public final class y implements com.bumptech.glide.load.data.e {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f117450c = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f117451a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f117452b;

    public y(Context context, Uri uri) {
        this.f117451a = context;
        this.f117452b = uri;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return nd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        Cursor query = this.f117451a.getContentResolver().query(this.f117452b, f117450c, null, null, null);
        if (query != null) {
            try {
                r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
            } finally {
                query.close();
            }
        }
        if (!TextUtils.isEmpty(r0)) {
            dVar.f(new File(r0));
            return;
        }
        dVar.d(new FileNotFoundException("Failed to find file path for: " + this.f117452b));
    }
}
