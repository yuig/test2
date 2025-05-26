package c0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import java.io.File;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f24226a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f24227b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f24228c;

    /* renamed from: d, reason: collision with root package name */
    public final ContentValues f24229d;

    /* renamed from: e, reason: collision with root package name */
    public final OutputStream f24230e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f24231f;

    public e0(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, d0 d0Var) {
        this.f24226a = file;
        this.f24227b = contentResolver;
        this.f24228c = uri;
        this.f24229d = contentValues;
        this.f24230e = outputStream;
        this.f24231f = d0Var == null ? new d0() : d0Var;
    }

    public final String toString() {
        return "OutputFileOptions{mFile=" + this.f24226a + ", mContentResolver=" + this.f24227b + ", mSaveCollection=" + this.f24228c + ", mContentValues=" + this.f24229d + ", mOutputStream=" + this.f24230e + ", mMetadata=" + this.f24231f + "}";
    }
}
