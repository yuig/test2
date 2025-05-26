package po;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;

/* loaded from: classes3.dex */
public final class e extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
    }
}
