package c5;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* loaded from: classes3.dex */
public abstract class q {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z13) {
        bigPictureStyle.showBigPictureWhenCollapsed(z13);
    }
}
