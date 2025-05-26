package m;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class p {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i13) {
        callback.onProvideKeyboardShortcuts(list, menu, i13);
    }
}
