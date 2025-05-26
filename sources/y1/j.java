package y1;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import kh2.n3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class j {
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull a3.d dVar) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = ku1.d.d().setEditorBounds(n3.N0(dVar));
        handwritingBounds = editorBounds.setHandwritingBounds(n3.N0(dVar));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
