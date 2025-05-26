package od;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f94086b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f94087a;

    public a(ContentResolver contentResolver) {
        this.f94087a = contentResolver;
    }

    @Override // od.d
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f94087a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f94086b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
