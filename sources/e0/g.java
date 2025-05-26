package e0;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public abstract class g {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static void d(Window window, boolean z13) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z13 ? systemUiVisibility & (-257) : systemUiVisibility | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
        window.setDecorFitsSystemWindows(z13);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
