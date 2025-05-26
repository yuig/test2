package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public abstract class b0 {
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            q5.v0.k(textView, (Build.VERSION.SDK_INT >= 31 ? new q5.c(clipData, 3) : new q5.e(clipData, 3)).build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th3) {
            textView.endBatchEdit();
            throw th3;
        }
    }

    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        q5.v0.k(view, (Build.VERSION.SDK_INT >= 31 ? new q5.c(clipData, 3) : new q5.e(clipData, 3)).build());
        return true;
    }
}
