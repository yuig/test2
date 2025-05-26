package fc;

import android.graphics.Paint;

/* loaded from: classes3.dex */
public final class m extends Paint {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i13) {
        super(1);
        if (i13 != 1) {
            setStyle(Paint.Style.FILL);
        } else {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }
}
