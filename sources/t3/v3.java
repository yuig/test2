package t3;

import android.view.ActionMode;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final v3 f116236a = new v3();

    public final void a(@NotNull ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(@NotNull View view, @NotNull ActionMode.Callback callback, int i13) {
        return view.startActionMode(callback, i13);
    }
}
