package od;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f94088b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f94089a;

    public b(ContentResolver contentResolver) {
        this.f94089a = contentResolver;
    }

    @Override // od.d
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f94089a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f94088b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
