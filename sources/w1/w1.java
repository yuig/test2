package w1;

import android.R;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum w1 {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll);

    private final int stringId;

    w1(int i13) {
        this.stringId = i13;
    }

    @NotNull
    public final String resolvedString(i2.o oVar, int i13) {
        return kh2.a1.D0(this.stringId, oVar);
    }
}
