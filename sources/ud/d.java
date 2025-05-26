package ud;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import f0.h;
import java.io.File;
import java.io.FileNotFoundException;
import nd.l;
import td.b0;
import td.c0;

/* loaded from: classes3.dex */
public final class d implements com.bumptech.glide.load.data.e {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f121909k = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f121910a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f121911b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f121912c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f121913d;

    /* renamed from: e, reason: collision with root package name */
    public final int f121914e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121915f;

    /* renamed from: g, reason: collision with root package name */
    public final l f121916g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f121917h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f121918i;

    /* renamed from: j, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.e f121919j;

    public d(Context context, c0 c0Var, c0 c0Var2, Uri uri, int i13, int i14, l lVar, Class cls) {
        this.f121910a = context.getApplicationContext();
        this.f121911b = c0Var;
        this.f121912c = c0Var2;
        this.f121913d = uri;
        this.f121914e = i13;
        this.f121915f = i14;
        this.f121916g = lVar;
        this.f121917h = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f121917h;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        com.bumptech.glide.load.data.e eVar = this.f121919j;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return nd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f121918i = true;
        com.bumptech.glide.load.data.e eVar = this.f121919j;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final com.bumptech.glide.load.data.e d() {
        boolean isExternalStorageLegacy;
        b0 b13;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f121910a;
        l lVar = this.f121916g;
        int i13 = this.f121915f;
        int i14 = this.f121914e;
        if (isExternalStorageLegacy) {
            Uri uri = this.f121913d;
            try {
                Cursor query = context.getContentResolver().query(uri, f121909k, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            query.close();
                            b13 = this.f121911b.b(file, i14, i13, lVar);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            Uri uri2 = this.f121913d;
            boolean c03 = h.c0(uri2);
            c0 c0Var = this.f121912c;
            if (c03 && uri2.getPathSegments().contains("picker")) {
                b13 = c0Var.b(uri2, i14, i13, lVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                b13 = c0Var.b(uri2, i14, i13, lVar);
            }
        }
        if (b13 != null) {
            return b13.f117374c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        try {
            com.bumptech.glide.load.data.e d2 = d();
            if (d2 == null) {
                dVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.f121913d));
            } else {
                this.f121919j = d2;
                if (this.f121918i) {
                    cancel();
                } else {
                    d2.e(hVar, dVar);
                }
            }
        } catch (FileNotFoundException e13) {
            dVar.d(e13);
        }
    }
}
